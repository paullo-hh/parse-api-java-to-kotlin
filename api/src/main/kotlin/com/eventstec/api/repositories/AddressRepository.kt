package com.eventstec.api.repositories

import com.eventstec.api.domain.address.Address
import org.springframework.data.jpa.repository.JpaRepository

interface AddressRepository : JpaRepository<Address, Long> {
}