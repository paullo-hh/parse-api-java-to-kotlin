package com.eventstec.api.request

import org.springframework.web.multipart.MultipartFile
import java.util.*

data class EventRequest(
    val id: Long? = null,
    val title: String = "",
    val description: String = "",
    val image: MultipartFile? = null,
    val eventUrl: String = "",
    val remote: Boolean = false,
    val date: Date = Date(),
    val city: String = "",
    val uf: String = ""
)