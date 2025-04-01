package pe.edu.vallegrande.backend.rest;

import pe.edu.vallegrande.backend.model.Customer;
import pe.edu.vallegrande.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/v1/api/customer")
@Tag(name = "Customer API", description = "API for Customer management")
public class CustomerRest {

    private final CustomerService customerService;

    @Autowired
    public CustomerRest(CustomerService customerService) {
        this.customerService = customerService;
    }
    
    @GetMapping
    @Operation(summary = "Get All Customer", description = "Get All Customer")
    public List<Customer> getAll(){
        return customerService.getAll();
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get Customer By ID", description = "Get Customer By ID")
    public Optional<Customer> findById(@PathVariable Long id) {
        return customerService.findById(id);
    }

    @PostMapping("/save")
    @Operation(summary = "Save Customer", description = "Save Customer")
    public Customer save(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

}
