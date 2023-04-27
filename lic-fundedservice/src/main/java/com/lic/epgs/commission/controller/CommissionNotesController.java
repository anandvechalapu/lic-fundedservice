package com.lic.epgs.commission.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.commission.model.CommissionNotes;
import com.lic.epgs.commission.service.CommissionNotesService;

@RestController
@RequestMapping("/commissionNotes")
public class CommissionNotesController {
	
	@Autowired
	private CommissionNotesService commissionNotesService;
	
	@GetMapping("/getByCommissionId/{commissionId}")
    public Optional<CommissionNotes> getByCommissionId(@PathVariable Long commissionId) {
        return commissionNotesService.findByCommissionId(commissionId);
    }
	
	@PostMapping("/saveOrUpdate")
	public CommissionNotes saveOrUpdate(@RequestBody CommissionNotes commissionNotes) {
		return commissionNotesService.saveOrUpdateCommissionNotes(commissionNotes);
	}
	
	@GetMapping("/all")
	public List<CommissionNotes> getAll(){
		return commissionNotesService.getAllCommissionNotes();
	}
	
	@DeleteMapping("/delete/{commissionId}")
	public void deleteByCommissionId(@PathVariable Long commissionId) {
		commissionNotesService.deleteByCommissionId(commissionId);
	}

}