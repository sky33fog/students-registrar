package com.example.studentsregistrar;

import lombok.Getter;

import java.util.UUID;

@Getter
public final class Student {

    private final UUID id;

    private final String firstName;

    private final String lastName;

    private final int age;

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