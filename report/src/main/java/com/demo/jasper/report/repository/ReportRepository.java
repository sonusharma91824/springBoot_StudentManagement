package com.demo.jasper.report.repository;

import com.demo.jasper.report.entity.Port;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReportRepository extends JpaRepository<Port,Long> {
}
