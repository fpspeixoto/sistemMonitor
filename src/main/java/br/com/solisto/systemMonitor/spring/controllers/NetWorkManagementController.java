package br.com.solisto.systemMonitor.spring.controllers;

import br.com.solisto.systemMonitor.spring.dto.NetWorkManagementDto;
import br.com.solisto.systemMonitor.spring.entity.NetWorkManagement;
import br.com.solisto.systemMonitor.spring.mapper.NetWorkManagementMapper;
import br.com.solisto.systemMonitor.spring.services.NetWorkManagementService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/networkmanagement")
@CrossOrigin(origins = "*")
@AllArgsConstructor
public class NetWorkManagementController {
    @Autowired
    private NetWorkManagementService service;

    @GetMapping
    public ResponseEntity<List<NetWorkManagementDto>> getAll() {

        List<NetWorkManagement> entities = service.getAll();
        return ResponseEntity.ok(entities.stream()
                .map(NetWorkManagementMapper::toDto)
                .collect(Collectors.toList()));
    }

    @GetMapping("gettest")
    public ResponseEntity<String> getTest() {


        return ResponseEntity.ok("TESTE DEU CERTO");
    }

    @PutMapping
    public void update(@RequestBody NetWorkManagementDto dto) {
        NetWorkManagement entity = NetWorkManagementMapper.toEntity(dto);
        service.save(entity);
    }
}
