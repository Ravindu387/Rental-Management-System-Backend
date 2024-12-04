package edu.icet.service.impl;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.repository.CustomerRepository;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {
    private final CustomerRepository repository;
    private final ModelMapper mapper;

    @Override
    public void addCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public Optional<CustomerEntity> searchCustomer(Integer id) {
        return repository.findById(id);
    }

    @Override
    public void updateCustomer(Customer customer) {
        repository.save(mapper.map(customer, CustomerEntity.class));
    }

    @Override
    public void deleteCustomer(Integer id) {
        repository.deleteById(id);
    }
}
