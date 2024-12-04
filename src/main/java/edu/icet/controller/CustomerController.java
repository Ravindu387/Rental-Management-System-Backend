package edu.icet.controller;

import edu.icet.dto.Customer;
import edu.icet.entity.CustomerEntity;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
@RequiredArgsConstructor
@CrossOrigin
public class CustomerController {
    @Autowired
    private final CustomerService service;

    @PostMapping("/add")
    public void addCustomer(@RequestBody Customer customer){
        service.addCustomer(customer);
    }
    @GetMapping("/search/{id}")
    public Optional<CustomerEntity> searchCustomer(@PathVariable Integer id){
        return service.searchCustomer(id);
    }
    @PutMapping("/update")
    public void updateCustomer(@RequestBody Customer customer){
        service.updateCustomer(customer);
    }
    @DeleteMapping("/delete/{id}")
    public void deleteCustomer(@PathVariable Integer id){
        service.deleteCustomer(id);
    }
}
