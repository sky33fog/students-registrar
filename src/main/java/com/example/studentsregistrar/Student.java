package com.example.studentsregistrar;

import lombok.Getter;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
public class Student {

    private UUID id;

    private String firstName;

    private String lastName;

    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.id = UUID.randomUUID();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + age + " " + id;
    }
}
