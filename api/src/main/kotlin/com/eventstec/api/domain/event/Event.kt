package com.eventstec.api.domain.event

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = Event.Companion.CONFIG.TABLE, schema = Event.Companion.CONFIG.SCHEMA)
data class Event(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long? = null,

    val title: String = "",

    val description: String = "",

    val imgUrl: String = "",

    val eventUrl: String = "",

    val remote: Boolean = false,

    val date: Date = Date(),

    val city: String = "",

    val uf: String = ""
) : java.io.Serializable{
    companion object {
        object CONFIG {
            const val SCHEMA = "PUBLIC"
            const val TABLE = "EVENT"
        }
    }
}
