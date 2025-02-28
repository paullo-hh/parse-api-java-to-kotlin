package com.eventstec.api.domain.coupon

import com.eventstec.api.domain.event.Event
import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = Coupon.Companion.CONFIG.TABLE, schema = Coupon.Companion.CONFIG.SCHEMA)
data class Coupon (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1,

    val valid: Date? = null,

    val discount: Int? = null,

    val code: String? = null,

    @ManyToOne
    @JoinColumn(name = "event_id")
    val event: Event? = null
) : java.io.Serializable {
    companion object {
        object CONFIG {
            const val SCHEMA = "PUBLIC"
            const val TABLE = "COUPON"
        }
    }
}