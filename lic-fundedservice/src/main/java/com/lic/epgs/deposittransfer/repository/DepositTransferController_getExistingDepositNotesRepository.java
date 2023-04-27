package com.lic.epgs.deposittransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.lic.epgs.deposittransfer.entity.DepositTransferNotes;

public interface DepositTransferController_getExistingDepositNotesRepository extends JpaRepository<DepositTransferNotes, Long>{

    @Query("SELECT t FROM DepositTransferNotes t WHERE t.transferId = ?1 AND t.isActive = 1 ORDER BY t.transferId DESC")
    public List<DepositTransferNotes> findByTransferId(String transferId);

}