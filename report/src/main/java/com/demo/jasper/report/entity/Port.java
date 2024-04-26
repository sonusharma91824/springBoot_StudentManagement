package com.demo.jasper.report.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="port")
public class Port{
    @Id
    private long id ;
    private String principaladdress;
    private String portcall;
    private String arrivaltime;
    private String purposeofcall;
    private String currency;
    private String bank;
    private String address;
    private String accountnumber;
    private String accountname;
    private String iban;
    private String swiftcode;
    private String remuneration;
    private String funding;
    private String resolution;
    private String clauses;

}
