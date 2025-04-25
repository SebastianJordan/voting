package com.sebastian.voting.api.dto;

import io.micrometer.common.lang.Nullable;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;


@Builder
@AllArgsConstructor
@Data
public class RoomRequest {
    @NotBlank(message = "name is required")
    private String name;
    @Nullable
    private String comment;
}
