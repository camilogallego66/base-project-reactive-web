package com.example.baseproject.app.master.dto;

import lombok.Data;
import org.springframework.lang.NonNull;

@Data
public class MasterDTO {
    private Long id;
    @NonNull
    private String masterCode;
    @NonNull
    private String description;
    @NonNull
    private String masterCategory;
}
