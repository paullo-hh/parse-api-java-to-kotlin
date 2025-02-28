package com.eventstec.api.domain.address

import com.eventstec.api.domain.event.Event
import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter

@Table(name = "address")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    val id: Long = 0

    val city: String? = null

    val uf: String? = null

    @ManyToOne
    @JoinColumn(name = "event_id")
    val event: Event? = null
}