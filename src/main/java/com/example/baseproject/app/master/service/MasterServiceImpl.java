package com.example.baseproject.app.master.service;

import com.example.baseproject.app.master.dto.MasterDTO;
import com.example.baseproject.app.master.mapper.MasterMapper;
import com.example.baseproject.app.master.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.List;

@Service
public class MasterServiceImpl implements  MasterService {

    @Autowired
    private MasterRepository masterRepository;
    @Autowired
    private MasterMapper masterMapper;
    @Override
    public Mono<MasterDTO> getById(Long id) {
        return masterRepository.findById(id).map(master -> masterMapper.modelToDto(master));
    }
    @Override
    public Mono<List<MasterDTO>> getAll() {
        return masterRepository.findAll().collectList().map(masters -> masterMapper.modelToList(masters));
    }
    @Override
    public Mono<MasterDTO> save(MasterDTO masterDTO) {
        return masterRepository.save(masterMapper.dtoToModel(masterDTO)).map(master -> masterMapper.modelToDto(master));
    }
}
