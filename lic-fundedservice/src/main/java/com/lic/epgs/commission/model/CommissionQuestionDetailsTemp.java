package com.lic.epgs.commission.model;

import javax.persistence.*;

@Entity
@Table(name = "commission_question_details_temp")
public class CommissionQuestionDetailsTemp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "inactive")
    private boolean inactive;

    @Column(name = "question_id")
    private Long questionId;

    @Column(name = "commission_type_id")
    private Long commissionTypeId;

    @Column(name = "commission_value")
    private double commissionValue;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isInactive() {
        return inactive;
    }

    public void setInactive(boolean inactive) {
        this.inactive = inactive;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getCommissionTypeId() {
        return commissionTypeId;
    }

    public void setCommissionTypeId(Long commissionTypeId) {
        this.commissionTypeId = commissionTypeId;
    }

    public double getCommissionValue() {
        return commissionValue;
    }

    public void setCommissionValue(double commissionValue) {
        this.commissionValue = commissionValue;
    }
}