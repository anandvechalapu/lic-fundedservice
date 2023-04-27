package com.lic.epgs.commission.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.repository.CommissionRepository;

@Service
public class CommissionService {

  @Autowired
  private CommissionRepository commissionRepository;

  public Commission findByCommissionIdAndRole(Long commissionId, String role) {
    return commissionRepository.findByCommissionIdAndRole(commissionId, role);
  }

  public void updateCommissionStatusAndWorkflowStatusByCommissionIdAndRole(Long commissionId, String role, String status, String workflowStatus) {
    commissionRepository.updateCommissionStatusAndWorkflowStatusByCommissionIdAndRole(commissionId, role, status, workflowStatus);
  }

  public void setModifiedByAndModifiedOnByCommissionIdAndRole(Long commissionId, String role, String modifiedBy, Date modifiedOn) {
    commissionRepository.setModifiedByAndModifiedOnByCommissionIdAndRole(commissionId, role, modifiedBy, modifiedOn);
  }

}