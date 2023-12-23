package com.example.studentsregistrar.repository;

import java.util.List;
import java.util.UUID;

public interface ProjectRepository <T> {

    void add(T object);

    List<T> getAll();

    boolean removeItem(UUID object);

    void clearAll();
}
