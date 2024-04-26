package com.demo.jasper.report.service;
import com.demo.jasper.report.dto.JasperReportDto;
import net.sf.jasperreports.engine.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.sql.DataSource;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
@Service
public class PageFirstService {
@Autowired
private JasperReportDto reportDto;
        @Autowired
        private DataSource dataSource;

        public byte[] generateReport(JasperReportDto jasperReportDto) throws JRException, SQLException, IOException {
            File file = new File("page1.jrxml"); // Path to your JRXML file
            JasperReport jasperReport = JasperCompileManager.compileReport(file.getAbsolutePath());

            Map<String, Object> parameters = new HashMap<>();
            parameters.put("id", jasperReportDto.getId());
            parameters.put("principalAddress", jasperReportDto.getPrincipalAddress());
            parameters.put("portcall", jasperReportDto.getPortcall());
            parameters.put("arrivalTime", jasperReportDto.getArrivalTime());
            parameters.put("purposeOfCall", jasperReportDto.getPurposeOfCall());
            parameters.put("currency", jasperReportDto.getCurrency());
            parameters.put("bank", jasperReportDto.getBank());
            parameters.put("address", jasperReportDto.getAddress());
            parameters.put("accountNumber", jasperReportDto.getAccountNumber());
            parameters.put("accountName", jasperReportDto.getAccountName());
            parameters.put("iban", jasperReportDto.getIban());
            parameters.put("swiftCode", jasperReportDto.getSwiftCode());
            parameters.put("remuneration", jasperReportDto.getRemuneration());
            parameters.put("funding", jasperReportDto.getFunding());
            parameters.put("resolution", jasperReportDto.getResolution());
            parameters.put("clauses", jasperReportDto.getClauses());

            try (Connection connection = dataSource.getConnection()) {
                JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, connection);
                return JasperExportManager.exportReportToPdf(jasperPrint);
            }
        }}

