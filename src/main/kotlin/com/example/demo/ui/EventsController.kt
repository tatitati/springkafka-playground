package com.example.demo.ui

import com.example.demo.domain.LibraryEvent
import com.example.demo.producer.LibraryEventProducer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController


@RestController
class EventsController{

    @Autowired
    lateinit var libraryEventConsumer: LibraryEventConsumer

}
