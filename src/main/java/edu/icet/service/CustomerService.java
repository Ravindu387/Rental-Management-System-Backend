package edu.icet.service;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;

import java.util.Optional;

public interface CustomerService {
    void addCustomer(Customer customer);
    Optional<CustomerEntity> searchCustomer(Integer id);
    void updateCustomer(Customer customer);
    void deleteCustomer(Integer id);
}
