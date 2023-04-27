package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommissionQuestionMasterDto;
import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.repository.CommissionQuestionMasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommissionQuestionMasterService {

	@Autowired
	private CommissionQuestionMasterRepository commissionQuestionMasterRepository;

	public CommonCommissionDto saveQuestionMaster(CommissionQuestionMasterDto commissionQuestionMasterDto) {
		return commissionQuestionMasterRepository.saveQuestionMaster(commissionQuestionMasterDto);
	}

}