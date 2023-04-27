package com.lic.epgs.commission.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.commission.model.CommissionNotes;
import com.lic.epgs.commission.repository.CommissionNotesRepository;

@Service
public class CommissionNotesService {

	@Autowired
	CommissionNotesRepository commissionNotesRepository;

	public Optional<CommissionNotes> findByCommissionId(Long commissionId) {
		return commissionNotesRepository.findByCommissionId(commissionId);
	}

	public CommissionNotes saveOrUpdateCommissionNotes(CommissionNotes commissionNotes) {
		return commissionNotesRepository.saveOrUpdateCommissionNotes(commissionNotes);
	}

	public List<CommissionNotes> getAllCommissionNotes() {
		return commissionNotesRepository.findAll();
	}

	public void deleteByCommissionId(Long commissionId) {
		commissionNotesRepository.deleteByCommissionId(commissionId);
	}

}