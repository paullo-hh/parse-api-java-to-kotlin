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
    private var id: Long = 0

    private var valid: Date? = null

    private var discount: Int? = null

    private var code: String? = null

    @ManyToOne
    @JoinColumn(name = "event_id")
    private var event: Event? = null
}