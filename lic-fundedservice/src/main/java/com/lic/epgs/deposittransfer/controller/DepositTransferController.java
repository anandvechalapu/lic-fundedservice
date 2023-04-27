package com.lic.epgs.deposittransfer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lic.epgs.deposittransfer.entity.DepositTransferNotes;
import com.lic.epgs.deposittransfer.service.DepositTransferController_getExistingDepositNotesService;

@RestController
@RequestMapping("/depositTransfer")
public class DepositTransferController {

    @Autowired
    DepositTransferController_getExistingDepositNotesService depositTransferService;

    @GetMapping("/{transferId}")
    public ResponseEntity<List<DepositTransferNotes>> getExistingDepositNotes(@PathVariable String transferId) {
        List<DepositTransferNotes> notes = depositTransferService.getExistingDepositNotes(transferId);
        return new ResponseEntity<List<DepositTransferNotes>>(notes, HttpStatus.OK);
    }
}