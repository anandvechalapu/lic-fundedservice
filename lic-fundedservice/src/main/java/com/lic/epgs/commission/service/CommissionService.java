package com.lic.epgs.commission.service;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.repository.CommissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommissionService {

    @Autowired
    private CommissionRepository commissionRepository;

    public CommonCommissionDto markInactive(Long id){
        commissionRepository.markInactive(id);
        return new CommonCommissionDto("success", "Commission question marked inactive successfully");
    }

    public CommonCommissionDto markActive(Long id){
        commissionRepository.markActive(id);
        return new CommonCommissionDto("success", "Commission question marked active successfully");
    }

    public CommissionQuestionDetailsTempEntity getActive(Long id){
        return commissionRepository.getActive(id);
    }

    public CommissionQuestionDetailsTempEntity getInactive(Long id){
        return commissionRepository.getInactive(id);
    }

    public List<CommissionQuestionDetailsTempEntity> getAllActive(){
        return commissionRepository.getAllActive();
    }

    public List<CommissionQuestionDetailsTempEntity> getAllInactive(){
        return commissionRepository.getAllInactive();
    }

    public CommonCommissionDto saveCommissionQuestionDetails(List<CommissionQuestionDetailsDto> commissionQuestionDetailsDtos){
        return commissionRepository.saveCommissionQuestionDetails(commissionQuestionDetailsDtos);
    }

}