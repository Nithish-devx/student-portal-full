package com.example.demo3.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo3.model.Plans;

public interface ActivityRepository extends JpaRepository<Plans,Integer>{

}
