package com.passtrack.fullstack_backend.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer_inquiries")
public class CustomerInquiry {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String passengerName;
    private String contactChannel;
    private String inquiryContent;
    private LocalDateTime submittedAt;

    private String status; // pending, resolved
}
