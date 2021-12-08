package com.omd.myapp.model;

import lombok.*;

import javax.persistence.*;

@Entity
/** @Data [Equals to::: @ToString, @EqualsAndHashCode, @Getter on all fields, @Setter on all non-final fields, and @RequiredArgsConstructor]**/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Table(name = "EMPLOYEE_DETAILS")
public class Employee {
    @Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long employeeId;
    @Column(name="employee_name")
    private String employeeName;
    @Column(name="employee_address")
    private String employeeAddress;
    @Column(name="project_name")
    private String employeeProjectName;
}
