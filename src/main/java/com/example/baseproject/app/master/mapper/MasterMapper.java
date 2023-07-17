package com.example.baseproject.app.master.mapper;

import com.example.baseproject.app.master.dto.MasterDTO;
import com.example.baseproject.app.master.entity.Master;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MasterMapper {
    MasterDTO modelToDto(Master master);

    Master dtoToModel(MasterDTO master);
    List<MasterDTO> modelToList(List<Master> sourceFlux);
    
}
