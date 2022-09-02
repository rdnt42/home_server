package com.marowak.server.repository

import com.marowak.server.entity.RoomState
import org.springframework.data.repository.reactive.ReactiveCrudRepository

/**
 * Created with IntelliJ IDEA.
 * User: marowak
 * Date: 02.09.2022
 * Time: 22:02
 */
interface RoomStateRepository: ReactiveCrudRepository<RoomState, Int>