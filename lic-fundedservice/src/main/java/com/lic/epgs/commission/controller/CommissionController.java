package com.lic.epgs.commission.controller;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import com.lic.epgs.commission.service.CommissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/commission")
public class CommissionController {

    @Autowired
    private CommissionService commissionService;

    @PutMapping("/inactive/{id}")
    public CommonCommissionDto markInactive(@PathVariable Long id) {
        return commissionService.markInactive(id);
    }

    @PutMapping("/active/{id}")
    public CommonCommissionDto markActive(@PathVariable Long id) {
        return commissionService.markActive(id);
    }

    @GetMapping("/active/{id}")
    public CommissionQuestionDetailsTempEntity getActive(@PathVariable Long id) {
        return commissionService.getActive(id);
    }

    @GetMapping("/inactive/{id}")
    public CommissionQuestionDetailsTempEntity getInactive(@PathVariable Long id) {
        return commissionService.getInactive(id);
    }

    @GetMapping("/active")
    public List<CommissionQuestionDetailsTempEntity> getAllActive() {
        return commissionService.getAllActive();
    }

    @GetMapping("/inactive")
    public List<CommissionQuestionDetailsTempEntity> getAllInactive() {
        return commissionService.getAllInactive();
    }

    @PostMapping("/save")
    public CommonCommissionDto saveCommissionQuestionDetails(@RequestBody List<CommissionQuestionDetailsDto> commissionQuestionDetailsDtos) {
        return commissionService.saveCommissionQuestionDetails(commissionQuestionDetailsDtos);
    }
}