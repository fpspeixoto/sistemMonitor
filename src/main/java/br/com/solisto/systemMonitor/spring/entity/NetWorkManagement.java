package br.com.solisto.systemMonitor.spring.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Table(name = "dto.NetWorkManagement")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NetWorkManagement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cardBrandId;
    private int linkId;
    private String linkDescription;
    private int authorizerId;
    private String networkStatus;
    private LocalDateTime lastDateTimeUpdate;
}