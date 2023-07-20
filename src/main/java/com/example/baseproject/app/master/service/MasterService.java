package com.example.baseproject.app.master.service;

import com.example.baseproject.app.master.dto.MasterDTO;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

public interface MasterService{
    Mono<MasterDTO> getById(Long id);
    Mono<List<MasterDTO>> getAll();
    Mono<MasterDTO> save(MasterDTO dto);
    Flux<MasterDTO> getByCategory(String category);

}
