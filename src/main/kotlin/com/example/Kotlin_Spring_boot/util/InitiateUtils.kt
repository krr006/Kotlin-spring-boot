package com.example.Kotlin_Spring_boot.util

import com.example.Kotlin_Spring_boot.entity.Role
import com.example.Kotlin_Spring_boot.entity.User
import com.example.Kotlin_Spring_boot.service.UserService
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Service


@Service
class InitiateUtils (private val userService: UserService) : CommandLineRunner {

    override fun run(vararg args: String?) {
        userService.addNewUser(
           User(
               role = Role.TEAM_LEAD,
               firstName = "leadfn",
               lastName = "leadln"
           )
        )

        userService.addNewUser(
            User(
                firstName = "adminfn",
                lastName = "adminln",
                role = Role.ADMIN
            )
        )

        userService.addNewUser(
            User(
                firstName = "devfn",
                lastName = "devln",
                role = Role.DEVELOPER
            )
        )

        userService.addNewUser(
            User(
                firstName = "testerfn",
                lastName = "testerln",
                role = Role.TESTER
            )
        )

        userService.addNewUser(
            User(
                firstName = "analystfn",
                lastName = "analystln",
                role = Role.SYSTEM_ANALYST
            )
        )
    }
}