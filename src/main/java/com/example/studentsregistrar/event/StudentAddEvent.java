package com.example.studentsregistrar.event;

import com.example.studentsregistrar.Student;
import lombok.Getter;
import org.springframework.context.ApplicationEvent;

@Getter
public class StudentAddEvent extends ApplicationEvent { // попробовать без extands

    Student student;

    public StudentAddEvent(Object source, Student student) {
        super(source); // Передаваемый объект super()должен быть объектом, на котором изначально произошло событие, или объектом, с которым это событие связано
        this.student = student;
    }
}