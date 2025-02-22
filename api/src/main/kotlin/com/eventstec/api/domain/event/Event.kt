package com.eventstec.api.domain.event

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Table(name = "event")
@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @UuidGenerator
    private var id: Long = 0

    private var title: String = ""

    private var descripcion: String = ""

    private var imgUrl: String = ""

    private var eventUrl: String = ""

    private var remote: Boolean = false

    private var date: Date = Date()
}
