package com.example.studentsregistrar.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StudentAddEventListener {

    @EventListener
    public void listen(StudentAddEvent event) {
        System.out.println(event.getStudent());
    }
}