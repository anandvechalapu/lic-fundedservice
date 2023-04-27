package com.lic.epgs.commission.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.Commission;
import com.lic.epgs.commission.service.CommissionQuestionMasterService;
import com.lic.epgs.commission.service.CommissionService;

@RestController
@RequestMapping("/commission")
public class CommissionController {

  @Autowired
  private CommissionService commissionService;

  @Autowired
  private CommissionQuestionMasterService commissionQuestionMasterService;

  @GetMapping("/{commissionId}/{role}")
  public ResponseEntity<Commission> getCommissionByCommissionIdAndRole(@PathVariable Long commissionId, @PathVariable String role) {
    Commission commission = commissionService.findByCommissionIdAndRole(commissionId, role);
    return new ResponseEntity<>(commission, HttpStatus.OK);
  }

  @PutMapping("/{commissionId}/{role}")
  public void updateCommissionStatusAndWorkflowStatusByCommissionIdAndRole(@PathVariable Long commissionId, @PathVariable String role, String status, String workflowStatus) {
    commissionService.updateCommissionStatusAndWorkflowStatusByCommissionIdAndRole(commissionId, role, status, workflowStatus);
  }

  @PostMapping("/{commissionId}/{role}")
  public void setModifiedByAndModifiedOnByCommissionIdAndRole(@PathVariable Long commissionId, @PathVariable String role, String modifiedBy, Date modifiedOn) {
    commissionService.setModifiedByAndModifiedOnByCommissionIdAndRole(commissionId, role, modifiedBy, modifiedOn);
  }

  @PostMapping("/question")
  public ResponseEntity<CommonCommissionDto> saveQuestionMaster(@RequestBody CommissionQuestionMasterDto commissionQuestionMasterDto) {
    CommonCommissionDto commonCommissionDto = commissionQuestionMasterService.saveQuestionMaster(commissionQuestionMasterDto);
    return new ResponseEntity<>(commonCommissionDto, HttpStatus.OK);
  }

}