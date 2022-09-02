package com.marowak.server.service.api

import com.marowak.server.response.RoomStateResponse
import org.springframework.stereotype.Service
import kotlin.random.Random

/**
 * Created with IntelliJ IDEA.
 * User: marowak
 * Date: 02.09.2022
 * Time: 22:40
 */
@Service
class MockRoomStateApiService {
    fun getRoomState(): RoomStateResponse {
        val random = Random

        return RoomStateResponse(random.nextDouble(30.0), random.nextDouble(100.0))
    }
}