package com.learn.first_web_app.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rfis")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class RFI {

    @Id
    private Long id; // Removed @GeneratedValue

    private String subject;
    private String question;
    private String status;

    @Column(name = "company_id")
    private Integer companyId;
}
