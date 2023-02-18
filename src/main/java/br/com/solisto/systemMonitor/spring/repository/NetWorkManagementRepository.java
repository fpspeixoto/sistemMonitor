package br.com.solisto.systemMonitor.spring.repository;

import br.com.solisto.systemMonitor.spring.entity.NetWorkManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetWorkManagementRepository extends JpaRepository<NetWorkManagement, Long> {
}