package com.ta.backend.dao;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ta.backend.entity.Labourer;

@Repository
@Transactional
public interface LabourerDao extends JpaRepository<Labourer, Integer> {

}

