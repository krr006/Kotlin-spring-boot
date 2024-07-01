package com.example.Kotlin_Spring_boot.repository

import com.example.Kotlin_Spring_boot.entity.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long>  {
}