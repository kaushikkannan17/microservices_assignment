package com.example.microservices_assignment1;

import javax.persistence.*;

@Entity
@Table(name = "STUDENT_DETAILS")
public class StudentDetail {
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

    @Column(name = "AGE")
    private Integer age;

    @Lob
    @Column(name = "PARENT_NAME")
    private String parentName;

    @Lob
    @Column(name = "ADDRESS")
    private String address;

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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}