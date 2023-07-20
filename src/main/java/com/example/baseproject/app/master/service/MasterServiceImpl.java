package com.example.baseproject.app.master.service;

import com.example.baseproject.app.master.dto.MasterDTO;
import com.example.baseproject.app.master.entity.Master;
import com.example.baseproject.app.master.mapper.MasterMapper;
import com.example.baseproject.app.master.repository.MasterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
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
    public Mono<Master> save(Master masterDTO) {
        return masterRepository.save(masterDTO);
    }

    @Override
    public Flux<MasterDTO> getByCategory(String category) {
        return masterRepository.findMastersByMasterCategoryOrderByDescription(category)
                .map(masters -> masterMapper.modelToDto(masters));
    }
}
