@Service
public class CustomerCheckerController_approvedService {

    private final CustomerCheckerController_approvedRepository customerCheckerRepository;

    public CustomerCheckerController_approvedService(CustomerCheckerController_approvedRepository customerCheckerRepository) {
        this.customerCheckerRepository = customerCheckerRepository;
    }

    public CustomerChecker approveCustomerDetails(CustomerChecker customer) {
        return customerCheckerRepository.approveCustomerDetails(customer);
    }

    public CustomerChecker updateCustomerDetails(CustomerChecker customer) {
        return customerCheckerRepository.updateCustomerDetails(customer);
    }

    public String getErrorMessageForInvalidCustomerDetails() {
        return customerCheckerRepository.getErrorMessageForInvalidCustomerDetails();
    }

    public UUID generateNewUniqueID() {
        return customerCheckerRepository.generateNewUniqueID();
    }

    public CustomerChecker updateOldCustomerStatus(CustomerChecker customer) {
        return customerCheckerRepository.updateOldCustomerStatus(customer);
    }

    public CustomerChecker saveAndUpdateCustomerAddressAndContactDetails(CustomerChecker customer) {
        return customerCheckerRepository.saveAndUpdateCustomerAddressAndContactDetails(customer);
    }

    public CustomerChecker saveAndUpdateCustomerMigrationData(CustomerChecker customer) {
        return customerCheckerRepository.saveAndUpdateCustomerMigrationData(customer);
    }
}