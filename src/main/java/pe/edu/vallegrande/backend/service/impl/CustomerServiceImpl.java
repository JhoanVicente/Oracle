package pe.edu.vallegrande.backend.service.impl;

import pe.edu.vallegrande.backend.model.Customer;
import pe.edu.vallegrande.backend.repository.CustomerRepository;
import pe.edu.vallegrande.backend.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import lombok.extern.slf4j.Slf4j;
import java.util.List;
import java.util.Optional;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customer> getAll() {
        log.info("Listando Datos");
        return customerRepository.findAll();
    }

    @Override
    public Optional<Customer> findById(Long id) {
        log.info("Listando Datos por ID: " + id);
        return customerRepository.findById(id);
    }

    @Override
    public Customer save(Customer customer) {
        log.info("Registro Datos: " + customer.toString());
        customer.setState("A");
        return customerRepository.save(customer);
    }

}
