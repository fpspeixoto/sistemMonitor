package br.com.solisto.systemMonitor.spring.mapper;

import br.com.solisto.systemMonitor.spring.dto.NetWorkManagementDto;
import br.com.solisto.systemMonitor.spring.entity.NetWorkManagement;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.web.bind.annotation.Mapping;

@Mapper(componentModel = "spring")
public interface NetWorkManagementMapper {
    NetWorkManagementMapper INSTANCE = Mappers.getMapper(NetWorkManagementMapper.class);


    static NetWorkManagement toEntity(NetWorkManagementDto dto) {
        return NetWorkManagement.builder()
                .cardBrandId(dto.getCardBrandId())
                .networkStatus(dto.getNetworkStatus())
                .lastDateTimeUpdate(dto.getLastDateTimeUpdate())
                .build();
    }
    static NetWorkManagementDto toDto(NetWorkManagement entity){
        return NetWorkManagementDto.builder()
                .cardBrandId(entity.getCardBrandId())
                .networkStatus(entity.getNetworkStatus())
                .lastDateTimeUpdate(entity.getLastDateTimeUpdate())
                .build();
    };
}