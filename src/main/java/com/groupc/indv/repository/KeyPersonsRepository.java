package com.groupc.indv.repository;

import com.groupc.indv.model.KeyPersons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KeyPersonsRepository extends JpaRepository<KeyPersons, Long> {
}