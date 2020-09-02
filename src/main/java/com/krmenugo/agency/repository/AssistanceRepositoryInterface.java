package com.krmenugo.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.agency.model.Assistance;

@Repository
public interface AssistanceRepositoryInterface extends JpaRepository<Assistance, Integer>{

}
