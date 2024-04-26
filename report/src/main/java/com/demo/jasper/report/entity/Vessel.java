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
@Table(name = "vessel")

public class Vessel {
    @Id
    private  Long vesselid;
    private String vesselname;
    private String vesselimonumber;


}
