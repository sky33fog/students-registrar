package com.example.studentsregistrar.listener;

import com.example.studentsregistrar.Student;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentAddEventListener {

    @EventListener
    public void listen(Student student) {
        System.out.println(student);
    }
}