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
@Table(name = "info")
public class Info {
   @Id
    private long id ;
    private String date;
    private String principaladdress;
    private String portcall;
    private String arrivaltime;
    private String purposeofcall;

}
