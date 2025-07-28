package com.passtrack.fullstack_backend.repository;

import com.passtrack.fullstack_backend.model.CustomerInquiry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerInquiryRepository extends JpaRepository <CustomerInquiry, Long> {
    CustomerInquiry findCustomerInquiryById(Long id);
}
