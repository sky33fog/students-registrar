package com.example.studentsregistrar.event;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;


@Component
public class StudentRemoveEventListener {

    @EventListener
    public void listen(StudentRemoveEvent event) {
        System.out.println("Removed record with id: " + event.removedId);
    }
}