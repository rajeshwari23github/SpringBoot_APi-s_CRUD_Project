package com.insurance.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.insurance.model.Insurance;
import com.insurance.repository.InsuranceRepository;

@ExtendWith(SpringExtension.class)
@AutoConfigureMockMvc
@SpringBootTest
public class InsuranceServiceImplTest {
	@InjectMocks
InsuranceServiceImpl  insuranceServiceImpl;
	@Mock
	InsuranceRepository insuranceRepository;
	@Test
	public void saveInsurenceInfo() {
		Insurance insurance = new Insurance();
		insurance.setUserId(1);
		insurance.setInsuranceholderName("rajeshwari");
		insurance.setInsuranceType("Life Insurance");
		insurance.setInsurancePeriod("2years");
		insurance.setAmount(10000);
		insurance.setCity("Malkapur");
		insurance.setEmail("ranunarkhede2302@gmail.com");
		insurance.setMobnumber("8080618493");
		when(insuranceRepository.save(insurance)).thenReturn(insurance);
		assertEquals(insurance,insuranceServiceImpl.saveInsurenceInfo(insurance));
	}
}
