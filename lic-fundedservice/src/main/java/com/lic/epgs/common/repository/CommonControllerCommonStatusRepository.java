@Repository
public interface CommonControllerCommonStatusRepository extends JpaRepository<CommonControllerCommonStatus, Long> {
 
    List<CommonControllerCommonStatus> findByIsActive(Boolean isActive);
    
    List<CommonControllerCommonStatus> findByIdAndIsActive(Long id, Boolean isActive);
    
    List<CommonControllerCommonStatus> findByCodeAndIsActive(String code, Boolean isActive);
    
    List<CommonControllerCommonStatus> findByTypeAndIsActive(String type, Boolean isActive);
    
    List<CommonControllerCommonStatus> findByDescriptionAndIsActive(String description, Boolean isActive);
    
    List<CommonControllerCommonStatus> findByDescription1AndIsActive(String description1, Boolean isActive);
    
    List<CommonControllerCommonStatus> findByNameAndIsActive(String name, Boolean isActive);
    
    List<CommonControllerCommonStatus> findByIsActiveOrderByTypeAsc(Boolean isActive);
    
    List<CommonControllerCommonStatus> findByIsActiveOrderByNameDesc(Boolean isActive);
}