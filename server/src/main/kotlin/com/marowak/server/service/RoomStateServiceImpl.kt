package com.marowak.server.service

import com.marowak.server.entity.RoomState
import com.marowak.server.repository.RoomStateRepository
import com.marowak.server.response.RoomStateResponse
import com.marowak.server.service.api.MockRoomStateApiService
import org.springframework.stereotype.Service
import reactor.core.publisher.Mono


@Service
class RoomStateServiceImpl constructor(
        private val mockRoomStateApiService: MockRoomStateApiService,
        private val roomStateRepository: RoomStateRepository)
    : RoomStateService {


    override fun updateCurrentState(): Mono<RoomState> {
        val response = mockRoomStateApiService.getRoomState()
        val roomState = getRoomState(response)

        return roomStateRepository.save(roomState)
    }

    private fun getRoomState(response: RoomStateResponse): RoomState {
        return RoomState(roomTemperature = response.temperature, roomHumidity = response.humidity)
    }
}