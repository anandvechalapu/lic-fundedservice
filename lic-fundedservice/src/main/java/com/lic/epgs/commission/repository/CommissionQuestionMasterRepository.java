package com.lic.epgs.commission.repository;

import com.lic.epgs.commission.dto.CommissionQuestionMasterDto;
import com.lic.epgs.commission.dto.CommonCommissionDto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommissionQuestionMasterRepository extends JpaRepository<CommissionQuestionMasterDto, Long> {

	public CommonCommissionDto saveQuestionMaster(CommissionQuestionMasterDto commissionQuestionMasterDto);

}