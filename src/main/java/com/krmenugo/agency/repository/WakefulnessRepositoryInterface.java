package com.krmenugo.agency.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krmenugo.agency.model.Wakefulness;

@Repository
public interface WakefulnessRepositoryInterface extends JpaRepository<Wakefulness, Integer> {

}
