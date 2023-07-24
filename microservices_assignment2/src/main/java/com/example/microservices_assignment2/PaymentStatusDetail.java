package com.example.microservices_assignment2;

import javax.persistence.*;

@Entity
@Table(name = "PAYMENT_STATUS_DETAILS")
public class PaymentStatusDetail {
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

    @Column(name = "AMNT_PAID")
    private Integer amntPaid;

    @Lob
    @Column(name = "PAYMENT_DATE")
    private String paymentDate;

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

    public Integer getAmntPaid() {
        return amntPaid;
    }

    public void setAmntPaid(Integer amntPaid) {
        this.amntPaid = amntPaid;
    }

    public String getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(String paymentDate) {
        this.paymentDate = paymentDate;
    }

}