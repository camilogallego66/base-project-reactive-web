package com.example.baseproject.app.master.repository;

import com.example.baseproject.app.master.entity.Master;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MasterRepository extends ReactiveCrudRepository<Master, Long> {
}
