package com.eventstec.api.controller

import com.eventstec.api.request.EventRequest
import com.eventstec.api.response.ResponseRequest
import com.eventstec.api.services.EventoService
import org.springframework.http.HttpHeaders
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestHeader

class EventController (
    private val eventoService: EventoService
){
    @PostMapping("/create")
    fun create(
        @RequestBody eventRequest: EventRequest,
        @RequestHeader headers: HttpHeaders
    ) : ResponseRequest<Any> {
        return ResponseRequest(eventoService.createEvent(eventRequest, headers))
    }
}