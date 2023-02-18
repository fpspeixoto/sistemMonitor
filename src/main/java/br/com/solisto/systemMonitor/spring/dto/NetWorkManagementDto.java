package br.com.solisto.systemMonitor.spring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NetWorkManagementDto {
    private int cardBrandId;
    private String cardBrandName;
    private String networkStatus;
    private LocalDateTime lastDateTimeUpdate;
}