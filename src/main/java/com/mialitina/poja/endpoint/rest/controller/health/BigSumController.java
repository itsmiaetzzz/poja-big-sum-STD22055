package com.mialitina.poja.endpoint.rest.controller.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import java.math.BigInteger;

@RestController
public class BigSumController {

    @GetMapping("/big-sum")
    public String calculateBigSum(
            @RequestParam(name = "a") String a,
            @RequestParam(name = "b") String b) {


        BigInteger bigA = new BigInteger(a);
        BigInteger bigB = new BigInteger(b);


        BigInteger result = bigA.add(bigB);

        return "Sum: " + result.toString();
    }
}

