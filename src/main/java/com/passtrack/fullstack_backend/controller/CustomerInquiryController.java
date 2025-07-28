package com.passtrack.fullstack_backend.controller;

import com.passtrack.fullstack_backend.model.CustomerInquiry;
import com.passtrack.fullstack_backend.service.CustomerInquiryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class CustomerInquiryController {

    private final CustomerInquiryService customerInquiryService;

    @Autowired
    public CustomerInquiryController(CustomerInquiryService customerInquiryService) {
        this.customerInquiryService = customerInquiryService;
    }

    @PostMapping("/customerInquiry")
    public CustomerInquiry save(@RequestBody CustomerInquiry customerInquiry){
        return customerInquiryService.save(customerInquiry);
    }

    @GetMapping("/customerInquiries")
    public List<CustomerInquiry> customerInquiryList(){
        return customerInquiryService.getAllCustomerInquiries();
    }

    @GetMapping("/customerInquiry/{id}")
    public CustomerInquiry getCustomerInquiry(@PathVariable("id") Long id){
        return customerInquiryService.getCustomerInquiryById(id);
    }
}
