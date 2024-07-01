package com.example.Kotlin_Spring_boot.controller

import com.example.Kotlin_Spring_boot.entity.User
import com.example.Kotlin_Spring_boot.service.UserService
import lombok.RequiredArgsConstructor
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user-api/v1")
@RequiredArgsConstructor

class UserController (val userService: UserService) {
    @GetMapping("/users")
    fun findALlUsers(): List<User>{
        return userService.findAllUsers()
    }

    @PostMapping("/users")
    fun addNewUser(@RequestBody user: User): ResponseEntity<User> {
        val createdUser = userService.addNewUser(user)
        return ResponseEntity(createdUser, HttpStatus.CREATED)
    }
}