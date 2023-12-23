package com.example.studentsregistrar;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import com.example.studentsregistrar.repository.StudentRepository;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

import java.io.FileReader;
import java.io.IOException;

public class StudentsInitializer implements InitializingBean {

    private StudentRepository studentRepo;

    @Value("${app.students.default-file-path}")
    private String path;

    @Autowired
    private void setStudentRepo(StudentRepository studentRepository) {
        this.studentRepo = studentRepository;
    }

    @Override
    public void afterPropertiesSet() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(path));
            String[] values;
            while ((values = csvReader.readNext()) != null) {
                studentRepo.add(createStudent(values[0]));
            }
        } catch (IOException | CsvValidationException ex) {
            ex.printStackTrace();
        }
    }

    private Student createStudent(String values) {
        String[] studentFields = values.split(";");
        return new Student(studentFields[0], studentFields[1], Integer.parseInt(studentFields[2]));
    }
}