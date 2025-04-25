package com.sebastian.voting.api.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class RoomResponse {
    private String name;
    private int code;
}
