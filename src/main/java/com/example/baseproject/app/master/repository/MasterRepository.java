package com.example.baseproject.app.master.repository;

import com.example.baseproject.app.master.entity.Master;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

import java.util.List;

@Repository
public interface MasterRepository extends ReactiveCrudRepository<Master, Long> {
    Flux<Master> findMastersByMasterCategoryOrderByDescription(String masterCategory);
}
