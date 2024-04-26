package com.demo.jasper.report.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "agent")
public class Agent {
    @Id
    private Long agentid;
    private String currency;
    private String bank;
    private String address;
    private String accountnumber;
    private String accountname;
    private String iban;
    private String swiftcode;
}
