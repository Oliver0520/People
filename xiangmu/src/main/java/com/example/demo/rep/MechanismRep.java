package com.example.demo.rep;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Mechanism;

public interface MechanismRep extends JpaRepository<Mechanism, Integer>{
	@Modifying
	@Query(value="select m_name from mechanism where m_id=?")
	List<Mechanism> selectmname(Integer m_id);

}
