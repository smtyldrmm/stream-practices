package com.cydeo.stream_practice.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Department {

    private Long id;
    private String departmentName;
    private Employee manager;
    private Location location;

    @Override
    public String toString() {
        return "{" + id + ", " + departmentName + ", " + manager.getId() + ", " + location.getId() + "}";
    }

}
