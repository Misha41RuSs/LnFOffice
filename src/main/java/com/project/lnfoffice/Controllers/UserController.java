package com.project.lnfoffice.Controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @PostMapping("/register")
    public String registerUser(@RequestBody String userJson) {
        // Тут будет логика регистрации
        return "Регистрация прошла успешно (заглушка)";
    }

    @GetMapping("/profile")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String getUserProfile() {
        // Возвращаем профиль текущего пользователя
        return "Профиль пользователя (заглушка)";
    }

    @PutMapping("/profile")
    @PreAuthorize("hasAnyRole('USER', 'ADMIN')")
    public String updateUserProfile(@RequestBody String updatedInfo) {
        // Обновление данных пользователя
        return "Профиль обновлён (заглушка)";
    }
}