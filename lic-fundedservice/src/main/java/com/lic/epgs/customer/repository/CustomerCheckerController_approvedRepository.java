import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import com.lic.epgs.customer.model.CustomerChecker;

@Repository
public interface CustomerCheckerController_approvedRepository extends JpaRepository<CustomerChecker, UUID> {
    
    // Method to approve customer details
    CustomerChecker approveCustomerDetails(CustomerChecker customer);

    // Method to update customer details in the system 
    CustomerChecker updateCustomerDetails(CustomerChecker customer);

    // Method to return an error message for invalid customer details 
    String getErrorMessageForInvalidCustomerDetails();

    // Method to generate and use new customer's unique ID
    UUID generateNewUniqueID();

    // Method to update old customer's status
    CustomerChecker updateOldCustomerStatus(CustomerChecker customer);

    // Method to save and update customer's address and contact details
    CustomerChecker saveAndUpdateCustomerAddressAndContactDetails(CustomerChecker customer);

    // Method to save and update customer's migration-related data
    CustomerChecker saveAndUpdateCustomerMigrationData(CustomerChecker customer);
}