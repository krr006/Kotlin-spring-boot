package com.example.Kotlin_Spring_boot.controller

import com.example.Kotlin_Spring_boot.kafka.KafkaProducer
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/user-api/v1")
class Controller(val kafkaProducer: KafkaProducer) {
    @PostMapping("/kafka/send")
    fun send(@RequestBody message : String): String{
        kafkaProducer.sendMessage(message)
        return "Success";
    }
}