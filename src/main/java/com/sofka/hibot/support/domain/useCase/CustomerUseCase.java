package com.sofka.hibot.support.domain.useCase;

import com.sofka.hibot.support.domain.model.Customer;
import com.sofka.hibot.support.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class CustomerUseCase {

    @Autowired
    private CustomerRepository customerRepository;

    public Mono<Customer> createCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Mono<Customer> getCustomerById(String customerId){
        return customerRepository.findById(customerId);
    }

    public Flux<Customer> getCustomer(){
        return customerRepository.findAll();
    }

}
