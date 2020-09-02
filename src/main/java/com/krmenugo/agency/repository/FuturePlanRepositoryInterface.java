package com.krmenugo.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.agency.model.FuturePlan;

@Repository
public interface FuturePlanRepositoryInterface extends JpaRepository<FuturePlan, Integer> {

}
