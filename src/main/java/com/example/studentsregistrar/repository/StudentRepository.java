package com.example.studentsregistrar.repository;

import com.example.studentsregistrar.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository {

    private final Map<UUID,Student> studentsList = new HashMap<>();

    public void add(Student object) {
        studentsList.put(object.getId(), object);
    }

    public List<Student> getAll() {
        return new ArrayList<>(studentsList.values());
    }

    public boolean removeItem(UUID object) {
        if(studentsList.containsKey(object)) {
            studentsList.remove(object);
            return true;
        } else {
            return false;
        }
    }

    public void clearAll() {
        studentsList.clear();
    }
}