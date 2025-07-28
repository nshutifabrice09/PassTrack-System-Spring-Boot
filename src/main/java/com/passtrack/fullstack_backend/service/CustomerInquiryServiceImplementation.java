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
        return customerInquiryRepository.findAll();
    }

    @Override
    public CustomerInquiry getCustomerInquiryById(Long id) {
        return customerInquiryRepository.findCustomerInquiryById(id);
    }

    @Override
    public CustomerInquiry save(CustomerInquiry customerInquiry) {
        return customerInquiryRepository.save(customerInquiry);
    }

    @Override
    public CustomerInquiry update(Long id, CustomerInquiry customerInquiry) {
        CustomerInquiry existCustomerInquiry = customerInquiryRepository.findCustomerInquiryById(id);
        if(existCustomerInquiry != null){
            existCustomerInquiry.setPassengerName(customerInquiry.getPassengerName());
            existCustomerInquiry.setContactChannel(customerInquiry.getContactChannel());
            existCustomerInquiry.setInquiryContent(customerInquiry.getInquiryContent());
            existCustomerInquiry.setSubmittedAt(customerInquiry.getSubmittedAt());
            existCustomerInquiry.setStatus(customerInquiry.getStatus());
            return customerInquiryRepository.save(existCustomerInquiry);
        }
        return null;
    }

    @Override
    public void delete(Long id) {
        customerInquiryRepository.deleteById(id);
    }
}
