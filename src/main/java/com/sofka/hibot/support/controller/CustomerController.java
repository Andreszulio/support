package com.sofka.hibot.support.controller;


import com.sofka.hibot.support.domain.model.Customer;
import com.sofka.hibot.support.domain.useCase.CustomerUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/customer")
@CrossOrigin(origins =  "*")
public class CustomerController {

    @Autowired
    private CustomerUseCase customerUseCase;


    @PostMapping
    public Mono<Customer> createCustomer(@RequestBody Customer customer){
        return customerUseCase.createCustomer(customer);
    }

    @GetMapping
    public Flux<Customer> getCustomer() {
        return customerUseCase.getCustomer();
    }

    @GetMapping("/{customerId}")
    public Mono<Customer> getCustomerById(String customerId) {
        return customerUseCase.getCustomerById(customerId);
    }
}