package com.example.studentsregistrar.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class StudentRemoveEventListener {

    @EventListener
    public void listen(UUID id) {
        System.out.println("Removed record with id: " + id);
    }
}