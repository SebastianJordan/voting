package com.sebastian.voting.api.services;

import java.util.Date;
import java.util.Random;
import org.springframework.stereotype.Service;

import com.sebastian.voting.api.dto.RoomRequest;
import com.sebastian.voting.api.dto.RoomResponse;
import com.sebastian.voting.api.models.RoomModel;
import com.sebastian.voting.api.repository.RoomRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class RoomService {
    private RoomRepository room;

    public RoomResponse createRoom(RoomRequest newRoom) {
        RoomModel createdRoom = this.room.save(RoomModel.builder()
                .name(newRoom.getName())
                .code(new Random().nextInt(1000, 5000))
                .comment(newRoom.getComment())
                .created(new Date())
                .build());
        return RoomResponse.builder()
                .name(createdRoom.getName())
                .code(createdRoom.getCode())
                .build();
    }
}
