
package com.Springbootmvc.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.DecimalMax;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eid;

    @NotBlank(message = "Employee name is required")
    @Pattern(regexp = "(?i)^Pavan$",
             message = "Only Pavan is allowed")
    private String ename;

    @DecimalMin(value = "5000.0",
            message = "Minimum salary is 5000")

@DecimalMax(value = "75000.0",
            message = "Maximum salary is 75000")

private double sal;
}
