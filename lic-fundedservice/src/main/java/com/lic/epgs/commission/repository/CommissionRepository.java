package com.lic.epgs.commission.repository;

import com.lic.epgs.commission.dto.CommonCommissionDto;
import com.lic.epgs.commission.dto.CommissionQuestionDetailsDto;
import com.lic.epgs.commission.entity.CommissionQuestionDetailsTempEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface CommissionRepository extends JpaRepository<CommissionQuestionDetailsTempEntity, Long> {

    @Transactional
    @Modifying
    @Query("update CommissionQuestionDetailsTempEntity c set c.inactive = true where c.inactive = false and c.id = :id")
    void markInactive(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("update CommissionQuestionDetailsTempEntity c set c.inactive = false where c.inactive = true and c.id = :id")
    void markActive(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("select c from CommissionQuestionDetailsTempEntity c where c.inactive = false and c.id = :id")
    CommissionQuestionDetailsTempEntity getActive(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("select c from CommissionQuestionDetailsTempEntity c where c.inactive = true and c.id = :id")
    CommissionQuestionDetailsTempEntity getInactive(@Param("id") Long id);

    @Transactional
    @Modifying
    @Query("select c from CommissionQuestionDetailsTempEntity c where c.inactive = false")
    List<CommissionQuestionDetailsTempEntity> getAllActive();

    @Transactional
    @Modifying
    @Query("select c from CommissionQuestionDetailsTempEntity c where c.inactive = true")
    List<CommissionQuestionDetailsTempEntity> getAllInactive();

    // Method to save commission question details to the database by providing a list of CommissionQuestionDetailsDto
    CommonCommissionDto saveCommissionQuestionDetails(List<CommissionQuestionDetailsDto> commissionQuestionDetailsDtos);

}