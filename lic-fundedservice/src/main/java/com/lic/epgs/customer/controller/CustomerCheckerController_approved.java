@RestController
@RequestMapping("/customerchecker/approved")
public class CustomerCheckerController_approved {

    @Autowired
    private CustomerCheckerController_approvedService customerCheckerController_approvedService;

    @PostMapping("/approve")
    public ResponseEntity<CustomerChecker> approveCustomerDetails(@RequestBody CustomerChecker customer) {
        CustomerChecker approvedCustomer = customerCheckerController_approvedService.approveCustomerDetails(customer);
        return ResponseEntity.ok(approvedCustomer);
    }

    @PutMapping("/update")
    public ResponseEntity<CustomerChecker> updateCustomerDetails(@RequestBody CustomerChecker customer) {
        CustomerChecker updatedCustomer = customerCheckerController_approvedService.updateCustomerDetails(customer);
        return ResponseEntity.ok(updatedCustomer);
    }

    @GetMapping("/getErrorMessage")
    public ResponseEntity<String> getErrorMessageForInvalidCustomerDetails() {
        String errorMessage = customerCheckerController_approvedService.getErrorMessageForInvalidCustomerDetails();
        return ResponseEntity.ok(errorMessage);
    }

    @GetMapping("/generateUniqueId")
    public ResponseEntity<UUID> generateNewUniqueID() {
        UUID uniqueId = customerCheckerController_approvedService.generateNewUniqueID();
        return ResponseEntity.ok(uniqueId);
    }

    @PutMapping("/updateOldStatus")
    public ResponseEntity<CustomerChecker> updateOldCustomerStatus(@RequestBody CustomerChecker customer) {
        CustomerChecker updatedOldCustomer = customerCheckerController_approvedService.updateOldCustomerStatus(customer);
        return ResponseEntity.ok(updatedOldCustomer);
    }

    @PutMapping("/saveAndUpdateAddress")
    public ResponseEntity<CustomerChecker> saveAndUpdateCustomerAddressAndContactDetails(@RequestBody CustomerChecker customer) {
        CustomerChecker updatedCustomerAddress = customerCheckerController_approvedService.saveAndUpdateCustomerAddressAndContactDetails(customer);
        return ResponseEntity.ok(updatedCustomerAddress);
    }

    @PutMapping("/saveAndUpdateMigration")
    public ResponseEntity<CustomerChecker> saveAndUpdateCustomerMigrationData(@RequestBody CustomerChecker customer) {
        CustomerChecker updatedMigrationData = customerCheckerController_approvedService.saveAndUpdateCustomerMigrationData(customer);
        return ResponseEntity.ok(updatedMigrationData);
    }

}