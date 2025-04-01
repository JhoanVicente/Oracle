package pe.edu.vallegrande.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.backend.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    
}
