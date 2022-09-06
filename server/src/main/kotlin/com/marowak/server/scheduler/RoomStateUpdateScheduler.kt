package com.marowak.server.scheduler

import com.marowak.server.service.RoomStateService
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

/**
 * Created with IntelliJ IDEA.
 * User: marowak
 * Date: 02.09.2022
 * Time: 23:11
 */
@Service
class RoomStateUpdateScheduler constructor(private val roomStateService: RoomStateService){

    @Scheduled(fixedDelay = 60000)
    fun updateRoomState() {
        roomStateService.updateCurrentState()
            .subscribe(System.out::println)
    }
}