package com.sebastian.voting.api.models;

import java.util.Date;
import io.micrometer.common.lang.Nullable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Data;

@Entity
@Builder
@Data
public class RoomModel { 
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idRoom;
    @NotBlank
    private String name;
    @Nullable
    private String comment;
    @Min(1000)
    @Max(5000)
    private int code;
    private Date created;
}
