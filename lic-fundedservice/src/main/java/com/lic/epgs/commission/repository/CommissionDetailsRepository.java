import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lic.epgs.commission.model.CommonCommissionDto;

public interface CommissionDetailsRepository extends JpaRepository<CommonCommissionDto, Long> {
    Optional<CommonCommissionDto> findById(Long id);
    CommonCommissionDto save(CommonCommissionDto commissionDetails);
}