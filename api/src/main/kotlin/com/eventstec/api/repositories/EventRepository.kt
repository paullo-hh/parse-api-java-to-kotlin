package com.eventstec.api.repositories

import com.eventstec.api.domain.event.Event
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import kotlin.math.E

interface EventRepository : JpaRepository<Event, Long> {
    //fun getNewId(): Long
}