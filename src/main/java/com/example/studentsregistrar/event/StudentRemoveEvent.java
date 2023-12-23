package com.example.studentsregistrar.event;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;
import java.util.UUID;

@Getter
public class StudentRemoveEvent extends ApplicationEvent {

    UUID removedId;

    public StudentRemoveEvent(Object source, UUID id) {
        super(source);
        this.removedId = id;
    }
}