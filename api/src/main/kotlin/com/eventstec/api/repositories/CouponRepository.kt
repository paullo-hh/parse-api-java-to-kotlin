package com.eventstec.api.repositories

import com.eventstec.api.domain.event.Event
import org.springframework.data.jpa.repository.JpaRepository

interface CouponRepository : JpaRepository<Event, Long>{
}