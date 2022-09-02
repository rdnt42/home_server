package com.marowak.server.entity

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

/**
 * Created with IntelliJ IDEA.
 * User: marowak
 * Date: 02.09.2022
 * Time: 23:02
 */
@Table("room_states")
data class RoomState(
        @Id val id: Int? = null,
        val temperature: Double,
        val humidity: Double
)