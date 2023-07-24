package com.example.microservices_assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class paymentController {

    @Autowired
     FeeDetailRepository feeDetailRepository;

    @Autowired
    PaymentStatusDetailRepository paymentStatusDetailRepository;

    @GetMapping("/fetchFeeDetails")
    public Optional<FeeDetail> fetchFeeDetails(@RequestParam("id") Integer Id){
        return feeDetailRepository.findById(Id);
    }

    @PostMapping("/payFees")
    public ResponseEntity<String> payStudentFees(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("amntPaid") Integer amntPaid, @RequestParam("class") Integer standard, @RequestParam("section") String section, @RequestParam("paymentDate") String paymentDate){
        PaymentStatusDetail paymentStatusDetail = new PaymentStatusDetail();
        paymentStatusDetail.setId(id);
        paymentStatusDetail.setStandard(standard);
        paymentStatusDetail.setSection(section);
        paymentStatusDetail.setName(name);
        paymentStatusDetail.setAmntPaid(amntPaid);
        paymentStatusDetail.setPaymentDate(paymentDate);
        paymentStatusDetailRepository.save(paymentStatusDetail);

        return new ResponseEntity<>("New Payment Data Included", HttpStatus.OK);
    }

    @PostMapping("/updateFeeDetails")
    public ResponseEntity<String> updateStudentFees(@RequestParam("id") Integer id, @RequestParam("name") String name, @RequestParam("fees") Integer fees, @RequestParam("class") Integer standard, @RequestParam("section") String section, @RequestParam("paymentStatus") String paymentStatus){
        PaymentStatusDetail paymentStatusDetail = new PaymentStatusDetail();
        FeeDetail feeDetail = new FeeDetail();
        feeDetail.setId(id);
        feeDetail.setStandard(standard);
        feeDetail.setSection(section);
        feeDetail.setName(name);
        feeDetail.setFees(fees);
        feeDetail.setPaymentStatus(paymentStatus);
        feeDetailRepository.save(feeDetail);

        return new ResponseEntity<>("Updated Payment Data Successfully", HttpStatus.OK);
    }



}
