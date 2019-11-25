package com.example.demo.serviceImp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.Mechanism;
import com.example.demo.rep.MechanismRep;
import com.example.demo.service.Mechanismservice;

public class MechanismImp implements Mechanismservice{
@Autowired
private MechanismRep mrep;
	@Override
	public List<Mechanism> selectmname(Integer m_id) {
		// TODO Auto-generated method stub
		return mrep.selectmname(m_id);
	}

}
