package com.eventstec.api.services

import com.eventstec.api.domain.event.Event
import com.eventstec.api.repositories.EventRepository
import com.eventstec.api.request.EventRequest
import org.springframework.http.HttpHeaders
import org.springframework.stereotype.Service
import org.springframework.web.multipart.MultipartFile

@Service
class EventoService (
    private val eventRepository: EventRepository
){
    fun createEvent(eventRequest: EventRequest, headers: HttpHeaders){
        var isNewEvent = false
        var id : Long? = eventRequest.id
        var imgUrl: String? = null

/*        if (id == null) {
            isNewEvent = true
            id = eventRepository.getNewId()
        }*/

        if (eventRequest.image != null) {
            imgUrl = uploadImg(eventRequest.image)
        }

        var newEvent = Event(
            id = id,
            title = eventRequest.title,
            description = eventRequest.description,
            imgUrl = imgUrl ?: "",
            eventUrl = eventRequest.eventUrl,
            remote = eventRequest.remote,
            date = eventRequest.date,
            city = eventRequest.city,
            uf = eventRequest.uf
        )

        eventRepository.save(newEvent)
    }

    fun uploadImg(image: MultipartFile): String {
        return "url_da_imagem_armazenada"
    }
}