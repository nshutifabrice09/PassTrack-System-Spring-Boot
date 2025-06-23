package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.CustomerInquiry;
import com.passtrack.fullstack_backend.repository.CustomerInquiryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerInquiryServiceImplementation implements CustomerInquiryService{
    private final CustomerInquiryRepository customerInquiryRepository;

    @Autowired
    public CustomerInquiryServiceImplementation(CustomerInquiryRepository customerInquiryRepository) {
        this.customerInquiryRepository = customerInquiryRepository;
    }


    @Override
    public List<CustomerInquiry> getAllCustomerInquiries() {
        return null;
    }

    @Override
    public CustomerInquiry getCustomerInquiryById(Long id) {
        return null;
    }

    @Override
    public CustomerInquiry save(CustomerInquiry customerInquiry) {
        return null;
    }

    @Override
    public CustomerInquiry update(Long id, CustomerInquiry customerInquiry) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
