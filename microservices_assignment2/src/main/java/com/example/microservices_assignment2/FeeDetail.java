package com.example.microservices_assignment2;

import javax.persistence.*;

@Entity
@Table(name = "FEE_DETAILS")
public class FeeDetail {
    @Id
    @Column(name = "ID", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "NAME")
    private String name;

    @Column(name = "STANDARD")
    private Integer standard;

    @Lob
    @Column(name = "SECTION")
    private String section;

    @Column(name = "FEES")
    private Integer fees;

    @Lob
    @Column(name = "PAYMENT_STATUS")
    private String paymentStatus;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStandard() {
        return standard;
    }

    public void setStandard(Integer standard) {
        this.standard = standard;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }

    public Integer getFees() {
        return fees;
    }

    public void setFees(Integer fees) {
        this.fees = fees;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

}