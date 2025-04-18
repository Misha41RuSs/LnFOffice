package com.project.lnfoffice.Controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/api")
public class FormController {

    public static class FormData {
        public String fullname;
        public String phone;
    }

    @PostMapping("/form")
    public void handleForm(@RequestBody FormData formData) {
        System.out.println("Получено: ФИО = " + formData.fullname + ", Телефон = " + formData.phone);
    }
}
