package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lic.epgs.commission.model.CommissionNotes;

@Repository
public interface CommissionNotesRepository extends JpaRepository<CommissionNotes, Long> {
	
	public CommissionNotes saveOrUpdateCommissionNotes(CommissionNotes commissionNotes);
	
	public CommissionNotes findByCommissionId(Long commissionId);
	
	public void deleteByCommissionId(Long commissionId);

}