package com.example.microservices_assignment1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
public class StudentDetailsController {

    @Autowired
    StudentDetailRepository studentDetailRepository;

    @GetMapping("/fetchDetails")
    public List<StudentDetail> fetchStudentDetails(){
        return studentDetailRepository.findAll();
    }

    @GetMapping("/fetchSingleStudent")
    public Optional<StudentDetail> fetchSingleStudent(@RequestParam("id") Integer Id){
        return studentDetailRepository.findById(Id);
    }

    @PostMapping("/addStudent")
    public ResponseEntity<String> createStudentData(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age, @RequestParam("class") Integer standard, @RequestParam("section") String section, @RequestParam("parentName") String parentName, @RequestParam("address") String address){
        StudentDetail studentDetail = new StudentDetail();
        studentDetail.setId(id);
        studentDetail.setAge(age);
        studentDetail.setStandard(standard);
        studentDetail.setSection(section);
        studentDetail.setName(name);
        studentDetail.setParentName(parentName);
        studentDetail.setAddress(address);
        studentDetailRepository.save(studentDetail);

        return new ResponseEntity<>("New Student Data Included", HttpStatus.OK);
    }

    @GetMapping("/deleteStudent")
    public ResponseEntity<String> deleteStudentData(@RequestParam("id") Integer id){
        studentDetailRepository.deleteById(id);
        return new ResponseEntity<>("Deleted Student Data Successfully", HttpStatus.OK);
    }

    @PostMapping("/updateStudent")
    public ResponseEntity<String> updateStudentData(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("age") Integer age, @RequestParam("class") Integer standard, @RequestParam("section") String section, @RequestParam("parentName") String parentName, @RequestParam("address") String address){
        StudentDetail studentDetail = new StudentDetail();
        studentDetail.setId(id);
        studentDetail.setAge(age);
        studentDetail.setStandard(standard);
        studentDetail.setSection(section);
        studentDetail.setName(name);
        studentDetail.setParentName(parentName);
        studentDetail.setAddress(address);
        studentDetailRepository.save(studentDetail);

        return new ResponseEntity<>("Updated Student Data Successfully", HttpStatus.OK);
    }
}
