package com.project.lnfoffice.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {

    @GetMapping("/dashboard")
    public String getAdminDashboard() {
        return "Добро пожаловать в админ-панель!";
    }

    @DeleteMapping("/items/{id}")
    public String deleteItem(@PathVariable Long id) {
        // Здесь будет логика удаления предмета
        return "Предмет с ID " + id + " удален (заглушка)";
    }

    @PostMapping("/claims/{id}/approve")
    public String approveClaim(@PathVariable Long id) {
        // Тут логика одобрения заявки
        return "Заявка с ID " + id + " одобрена (заглушка)";
    }
}
