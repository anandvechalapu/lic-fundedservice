package com.lic.epgs.deposittransfer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lic.epgs.deposittransfer.entity.DepositTransferNotes;
import com.lic.epgs.deposittransfer.repository.DepositTransferController_getExistingDepositNotesRepository;

@Service
public class DepositTransferController_getExistingDepositNotesService {

    @Autowired
    DepositTransferController_getExistingDepositNotesRepository depositTransferRepository;

    public List<DepositTransferNotes> getExistingDepositNotes(String transferId) {
        return depositTransferRepository.findByTransferId(transferId);
    }
}