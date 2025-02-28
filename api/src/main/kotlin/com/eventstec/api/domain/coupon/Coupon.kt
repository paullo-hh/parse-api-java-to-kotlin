package com.eventstec.api.domain.coupon

import com.eventstec.api.domain.event.Event
import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import java.util.*

@Entity
@Table(name = "coupon")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
class Coupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = -1

    val valid: Date? = null

    val discount: Int? = null

    val code: String? = null

    @ManyToOne
    @JoinColumn(name = "event_id")
    val event: Event? = null
}