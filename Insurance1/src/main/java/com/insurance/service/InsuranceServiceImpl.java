package com.insurance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.model.Insurance;
import com.insurance.repository.InsuranceRepository;
@Service
public class InsuranceServiceImpl implements InsuranceService{
	@Autowired
   private InsuranceRepository insuranceRepository;

@Override
	public Insurance saveInsurenceInfo(Insurance insurance) {
		Insurance insurance1= insuranceRepository.save(insurance);
		return insurance1 ;
	}

//@Override
//public Insurance getInsuranceDataByid(Integer id) {
//	Insurance insurance= insuranceRepository.findById(id);
//	return insurance;
//}
//
//@Override
//public void deleteInsuranceData(Integer id) {
//	insuranceRepository.deleteById(id);
//}
//
//@Override
//public List<Insurance> fetchAllInsuranceData() {
//	List<Insurance> list = (List<Insurance>) insuranceRepository.findAll();
//	return list;
//}
//	
}
