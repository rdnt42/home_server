package com.marowak.server.service

import com.marowak.server.entity.RoomState
import reactor.core.publisher.Mono

/**
 * Created with IntelliJ IDEA.
 * User: marowak
 * Date: 02.09.2022
 * Time: 22:33
 */
interface RoomStateService {
    fun updateCurrentState(): Mono<RoomState>
}