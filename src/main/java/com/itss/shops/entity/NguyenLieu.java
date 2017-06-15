package com.itss.shops.entity;
// Generated Jun 14, 2017 9:21:02 AM by Hibernate Tools 5.2.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import com.itss.shops.common.entity.BaseEntity;
/**
 * NguyenLieu generated by hbm2java
 */
@Entity
@Table(name = "NguyenLieu", catalog = "Coffee")
public class NguyenLieu extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2584815483708580448L;
	private Integer nguyenLieuId;
	private int soLuong;
	private String donVi;
	private String ten;
	private Date lastUpdate;

	public NguyenLieu() {
	}

	public NguyenLieu(int soLuong, String donVi, String ten, Date lastUpdate) {
		this.soLuong = soLuong;
		this.donVi = donVi;
		this.ten = ten;
		this.lastUpdate = lastUpdate;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "NguyenLieuID", unique = true, nullable = false)
	public Integer getNguyenLieuId() {
		return this.nguyenLieuId;
	}

	public void setNguyenLieuId(Integer nguyenLieuId) {
		this.nguyenLieuId = nguyenLieuId;
	}

	@Column(name = "SoLuong", nullable = false)
	public int getSoLuong() {
		return this.soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	@Column(name = "DonVi", nullable = false, length = 50)
	public String getDonVi() {
		return this.donVi;
	}

	public void setDonVi(String donVi) {
		this.donVi = donVi;
	}

	@Column(name = "Ten", nullable = false)
	public String getTen() {
		return this.ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "LastUpdate", nullable = false, length = 10)
	public Date getLastUpdate() {
		return this.lastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

}
