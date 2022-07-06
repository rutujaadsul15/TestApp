package com.vishal;


import javax.annotation.Generated;

@Entity
@Table(name = "EMPLOYEE")
public class Employee {
    @Id
    @GeneratedSequece(Sequence)
    private String id;

    @OneToMany()
    @CascadeBy()
    private List<Address> address;

}
