package com.lic.epgs.commission.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.CommonCommissionDto;
import com.lic.epgs.commission.repository.CommissionDetailsRepository;

@Service
public class CommonCommissionService {
	
	@Autowired
	private CommissionDetailsRepository commissionDetailsRepository;
	
	public Optional<CommonCommissionDto> getCommissionDetailsById(Long id) {
		return commissionDetailsRepository.findById(id);
	}
	
	public CommonCommissionDto save(CommonCommissionDto commissionDetails) {
		return commissionDetailsRepository.save(commissionDetails);
	}

}