package com.eventstec.api.domain.address

import com.eventstec.api.domain.event.Event
import jakarta.persistence.*

@Entity
@Table(name = Address.Companion.CONFIG.TABLE, schema = Address.Companion.CONFIG.SCHEMA)
data class Address (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,

    val city: String? = null,

    val uf: String? = null,

    @ManyToOne
    @JoinColumn(name = "event_id")
    val event: Event? = null
) : java.io.Serializable{
    companion object {
        object CONFIG {
            const val SCHEMA = "PUBLIC"
            const val TABLE = "ADDRESS"
        }
    }
}