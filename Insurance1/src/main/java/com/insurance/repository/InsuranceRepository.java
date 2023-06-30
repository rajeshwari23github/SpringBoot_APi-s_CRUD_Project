package com.insurance.repository; 

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.insurance.model.Insurance;
@Repository
public interface InsuranceRepository extends JpaRepository<Insurance, Integer>{

}
//public interface InsuranceRepository extends CrudRepository<Insurance, Serializable>{
//	public Insurance findById(Integer id);
//}