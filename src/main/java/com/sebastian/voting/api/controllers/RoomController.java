package com.sebastian.voting.api.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sebastian.voting.api.dto.RoomRequest;
import com.sebastian.voting.api.dto.RoomResponse;
import com.sebastian.voting.api.services.RoomService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController()
@RequestMapping("/api/room")
public class RoomController {
    @Autowired
    private RoomService room;

    @PostMapping("")
    public RoomResponse saveRoom(@Valid @RequestBody RoomRequest newRoom) {
        return room.createRoom(newRoom);
    }
}
