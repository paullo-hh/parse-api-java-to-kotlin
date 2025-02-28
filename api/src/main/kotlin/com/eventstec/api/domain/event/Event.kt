package com.eventstec.api.domain.event

import jakarta.persistence.*
import lombok.AllArgsConstructor
import lombok.Getter
import lombok.NoArgsConstructor
import lombok.Setter
import org.hibernate.annotations.DynamicInsert
import org.hibernate.annotations.DynamicUpdate
import org.hibernate.annotations.UuidGenerator
import java.util.*

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "event")
class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @UuidGenerator
    val id: Long = -1

    val title: String = ""

    val descripcion: String = ""

    val imgUrl: String = ""

    val eventUrl: String = ""

    val remote: Boolean = false

    val date: Date = Date()
}
