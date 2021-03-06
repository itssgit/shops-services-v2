package com.itss.shops.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.itss.shops.common.entity.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

import static javax.persistence.GenerationType.IDENTITY;

@Entity
@Table(name = "role")
@Getter
@Setter
public class Role extends BaseEntity {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Account> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Account> accounts) {
        this.accounts = accounts;
    }

    /**
     *
     */
    private static final long serialVersionUID = 7376816132041259371L;

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private Integer id;

    @Column(name = "name", length = 45)
    private String name;

    @Column(name = "description")
    private String description;

    @JsonIgnore
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
    private List<Account> accounts = new ArrayList<>();

}
