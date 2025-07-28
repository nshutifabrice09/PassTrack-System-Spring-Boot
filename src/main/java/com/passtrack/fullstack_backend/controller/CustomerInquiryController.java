package com.passtrack.fullstack_backend.controller;

import com.passtrack.fullstack_backend.service.CustomerInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("http://localhost:3000")
public class CustomerInquiryController {

    private final CustomerInquiryService customerInquiryService;

    @Autowired
    public CustomerInquiryController(CustomerInquiryService customerInquiryService) {
        this.customerInquiryService = customerInquiryService;
    }
}
