package br.com.solisto.systemMonitor.spring.services;

import br.com.solisto.systemMonitor.spring.entity.NetWorkManagement;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NetWorkManagementService {
//    @Autowired
//    private NetWorkManagementRepository repository;

    public List<NetWorkManagement> getAll() {
        return null; //repository.findAll();
    }

    public void save(NetWorkManagement entity) {

//        repository.save(entity);
    }
}

