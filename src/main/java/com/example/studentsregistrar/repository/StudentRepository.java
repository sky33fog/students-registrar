package com.example.studentsregistrar.repository;

import com.example.studentsregistrar.Student;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class StudentRepository implements ProjectRepository<Student> {

    private final Map<UUID,Student> studentsList = new HashMap<>();

    @Override
    public void add(Student object) {
        studentsList.put(object.getId(), object);
    }

    @Override
    public List<Student> getAll() {
        return new ArrayList<>(studentsList.values());
    }

    @Override
    public boolean removeItem(UUID object) {
        if(studentsList.containsKey(object)) {
            studentsList.remove(object);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void clearAll() {
        studentsList.clear();
    }
}
