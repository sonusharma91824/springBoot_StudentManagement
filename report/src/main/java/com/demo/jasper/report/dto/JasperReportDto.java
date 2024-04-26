package com.demo.jasper.report.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class JasperReportDto {
    private Long id ;
    private String principalAddress;
    private String portcall;
    private String arrivalTime;
    private String purposeOfCall;
    private String currency;
    private String bank;
    private String address;
    private String accountNumber;
    private String accountName;
    private String iban;
    private String swiftCode;
    private String remuneration;
    private String funding;
    private String resolution;
    private String clauses;

}
