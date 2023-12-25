package com.example.studentsregistrar;

import com.example.studentsregistrar.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.UUID;

@ShellComponent
@RequiredArgsConstructor
public class RegistrarShell {

    private final ApplicationEventPublisher publisher;

    private StudentRepository studentRepo;

    @Autowired
    private void setStudentRepository(StudentRepository studentRepository) {
        this.studentRepo = studentRepository;
    }

    @ShellMethod
    public void add(@ShellOption(value = "fn") String firstName,
                    @ShellOption(value = "ln") String lastName,
                    int age) {
        Student student = new Student(firstName, lastName, age);
        studentRepo.add(student);
        publisher.publishEvent(student);
    }

    @ShellMethod(key = "show")
    public void showAll() {
        studentRepo.getAll().forEach(System.out::println);
    }

    @ShellMethod
    public void remove(UUID id) {
        if(studentRepo.removeItem(id)) {
            publisher.publishEvent(id);
        }
    }

    @ShellMethod(key = "cla")
    public void removeAll() {
        studentRepo.clearAll();
    }
}
