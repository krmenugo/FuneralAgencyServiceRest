package com.krmenugo.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.agency.model.TypeAssistance;

@Repository
public interface TypeAssistanceRepositoryInterface extends JpaRepository<TypeAssistance, Integer> {

}
