package com.example.demo.rep;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import com.example.demo.entity.Pay;



public interface PayRepository extends JpaRepository<Pay, Integer>, JpaSpecificationExecutor<Pay> {

}
