package com.example.baseproject.utils;

import reactor.core.publisher.Mono;

import java.util.List;

public interface BaseService<D, I> {
    Mono<D> getById(I id);
    Mono<List<D>> getAll();
    Mono<D> save(D dto);


}
