package com.lic.epgs.deposittransfer.model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "DepositTransferNotes")
public class DepositTransferNotes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(name = "transfer_id")
    private String transferId;

    @Column(name = "note_contents")
    private String noteContents;

    @Column(name = "created_by")
    private String createdBy;

    @Column(name = "notes_by")
    private String notesBy;

    @Column(name = "created_on")
    private Date createdOn;

    @Column(name = "is_active")
    private Boolean isActive;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTransferId() {
        return transferId;
    }

    public void setTransferId(String transferId) {
        this.transferId = transferId;
    }

    public String getNoteContents() {
        return noteContents;
    }

    public void setNoteContents(String noteContents) {
        this.noteContents = noteContents;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    public String getNotesBy() {
        return notesBy;
    }

    public void setNotesBy(String notesBy) {
        this.notesBy = notesBy;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}