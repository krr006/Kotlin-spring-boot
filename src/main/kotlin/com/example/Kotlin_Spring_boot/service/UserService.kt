package com.example.Kotlin_Spring_boot.service

import com.example.Kotlin_Spring_boot.entity.User
import com.example.Kotlin_Spring_boot.repository.UserRepository
import org.springframework.stereotype.Service




@Service
class UserService(val userRepository: UserRepository) {

    fun findAllUsers(): List<User>{
        return userRepository.findAll()
    }

    fun addNewUser(user: User): User{
        return userRepository.save(user)
    }
}