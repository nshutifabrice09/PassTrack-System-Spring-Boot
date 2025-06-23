package com.passtrack.fullstack_backend.service;

import com.passtrack.fullstack_backend.model.CustomerInquiry;

import java.util.List;

public interface CustomerInquiryService {
    List<CustomerInquiry> getAllCustomerInquiries();
    CustomerInquiry getCustomerInquiryById(Long id);
    CustomerInquiry save(CustomerInquiry customerInquiry);
    CustomerInquiry update(Long id, CustomerInquiry customerInquiry);
    void delete(Long id);
}
