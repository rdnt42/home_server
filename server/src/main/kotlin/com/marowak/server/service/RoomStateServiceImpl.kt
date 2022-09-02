package com.marowak.server.service

import com.marowak.server.entity.RoomState
import com.marowak.server.repository.RoomStateRepository
import com.marowak.server.response.RoomStateResponse
import com.marowak.server.service.api.MockRoomStateApiService
import org.springframework.stereotype.Service

@Service
class RoomStateServiceImpl constructor(
        private val mockRoomStateApiService: MockRoomStateApiService,
        private val roomStateRepository: RoomStateRepository)
    : RoomStateService {


    override fun updateCurrentState() {
        val response = mockRoomStateApiService.getRoomState()
        val roomState = getRoomState(response)

        roomStateRepository.save(roomState)
    }

    private fun getRoomState(response: RoomStateResponse): RoomState {
        return RoomState(temperature = response.temperature, humidity = response.humidity)
    }
}