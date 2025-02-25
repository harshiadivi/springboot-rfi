package com.learn.first_web_app.model;
import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
@Table(name = "rfis")
public class RFI {

    @Id
    private Long id;
    private String subject;
    private String question;
    private String status;

    // Default constructor (Required by JPA)
    public RFI() {}

    // Parameterized Constructor
    public RFI(Long id, String subject, String question, String status) {
        this.id = id;
        this.subject = subject;
        this.question = question;
        this.status = status;
    }

    // Getters and Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }

    public String getQuestion() { return question; }
    public void setQuestion(String question) { this.question = question; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
