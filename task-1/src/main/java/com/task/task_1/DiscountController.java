package com.task.task_1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DiscountController {

    @GetMapping("/discount")
    public double calculateDiscount(@RequestParam double amount) {
        if (amount > 200) {
            return amount * 0.9;
        }

        return amount;
    }
}
