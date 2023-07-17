package com.example.baseproject.app.master.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Table("MASTER")
public class Master {
    @Id
    private Long id;
    @Column
    private String masterCode;
    @Column
    private String description;
    @Column
    private String masterCategory;
}
