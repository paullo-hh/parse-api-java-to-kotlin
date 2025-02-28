package com.eventstec.api.domain.address

import com.eventstec.api.domain.event.Event
import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.NoArgsConstructor
import java.util.UUID

@Table(name = "address")
@Entity
@AllArgsConstructor
@NoArgsConstructor
class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: Long = 0

    private var city: String? = null

    private var uf: String? = null

    @ManyToOne
    @JoinColumn(name = "event_id")
    private var event: Event? = null
}