package com.example.Kotlin_Spring_boot.entity

import jakarta.persistence.*


@Entity
@Table(name = "app_user")
data class User(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,

    var firstName: String = "",
    var lastName: String = "",

    @Enumerated(EnumType.STRING)
    var role: Role = Role.DEFAULT
)