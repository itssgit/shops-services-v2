package com.itss.shops.repository;

import com.itss.shops.entity.Ban;
import com.querydsl.core.types.Predicate;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;

public interface BanRepository extends JpaRepository<Ban, Integer>, QueryDslPredicateExecutor<Ban> {

    public Page<Ban> findAll(Predicate where, Pageable pageRequest);

}
