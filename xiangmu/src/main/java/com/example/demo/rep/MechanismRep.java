package com.example.demo.rep;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Mechanism;

public interface MechanismRep extends JpaRepository<Mechanism, Integer>{
	

}
