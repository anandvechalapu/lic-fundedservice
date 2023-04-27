package com.lic.epgs.commission.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.lic.epgs.commission.model.Commission;

public interface CommissionRepository extends JpaRepository<Commission, Long> {
    Commission findByCommissionIdAndRole(Long commissionId, String role);

    void updateCommissionStatusAndWorkflowStatusByCommissionIdAndRole(Long commissionId, String role, String status, String workflowStatus);

    void setModifiedByAndModifiedOnByCommissionIdAndRole(Long commissionId, String role, String modifiedBy, String modifiedOn);

}