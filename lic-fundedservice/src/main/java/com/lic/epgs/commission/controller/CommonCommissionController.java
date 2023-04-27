package com.lic.epgs.commission.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.CommonCommissionDto;
import com.lic.epgs.commission.service.CommonCommissionService;

@RestController
@RequestMapping("/commission")
public class CommonCommissionController {
	
	@Autowired
	private CommonCommissionService commonCommissionService;
	
	@GetMapping("/{id}")
	public Optional<CommonCommissionDto> getCommissionDetailsById(@PathVariable Long id) {
		return commonCommissionService.getCommissionDetailsById(id);
	}
	
	@PostMapping
	public CommonCommissionDto save(@RequestBody CommonCommissionDto commissionDetails) {
		return commonCommissionService.save(commissionDetails);
	}

}