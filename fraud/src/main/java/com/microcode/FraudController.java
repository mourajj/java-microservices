package com.microcode;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/fraud-check")
public class FraudController {

    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(@PathVariable("customerId") Integer customerId{
       boolean isFraudulentCustomer =  fraudCheckService
               .isFraudulentCustomer(customerId);
       return new FraudCheckResponse(isFraudulentCustomer);
    }
}
