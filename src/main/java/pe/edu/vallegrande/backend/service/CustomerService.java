package pe.edu.vallegrande.backend.service;

import pe.edu.vallegrande.backend.model.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAll();

    Optional<Customer> findById(Long id);

    Customer save(Customer customer);
    
}
