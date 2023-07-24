package com.ibm.practica.spital.DTO;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Pacient {

    private String firstName;
    private String lastName;
    private int age;
// Specializarea
    private String issue;
    private String pacientID;

}
