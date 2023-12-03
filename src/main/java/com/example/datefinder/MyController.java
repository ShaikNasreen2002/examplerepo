package com.example.datefinder;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;  //ccbp submit JSBCP7JD6Y 
//https://github.com/ShaikNasreen2002/examplerepo.git
//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
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class MyController {
    @GetMapping("/")
    public String dateFind() {
        LocalDate obj = LocalDate.now();
        LocalDate after100days = obj.plusDays(100);
        DateTimeFormatter patt = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String str = after100days.format(patt);
        return str;
    }
}
