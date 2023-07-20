package com.example.baseproject.app.master.controller;

import com.example.baseproject.app.master.dto.MasterDTO;
import com.example.baseproject.app.master.service.MasterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.List;

@RestController
public class MasterController {

    @Autowired
    MasterService masterService;

    @GetMapping("/master")
    public Mono<List<MasterDTO>> getAll() {
        return masterService.getAll();
    }

    @GetMapping("/master/{id}")
    public Mono<MasterDTO> getById(@PathVariable Long id) {
        return masterService.getById(id);
    }

    @GetMapping("/master/masterCategory/{category}")
    public Flux<MasterDTO> getById(@PathVariable String category) {
        return masterService.getByCategory(category);
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/master")
    public Mono<MasterDTO> save(@Validated @RequestBody final MasterDTO masterDTO) {
        return masterService.save(masterDTO);
    }
}
