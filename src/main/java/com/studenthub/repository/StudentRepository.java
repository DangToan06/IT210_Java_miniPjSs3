package com.studenthub.repository;
<<<<<<< HEAD
import org.example.studenthub.model.Student;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentRepository {
    private final List<Student> students;
    public StudentRepository() {
        students = List.of(
                new Student(1,"SV001","Nguyen Van C","CNTT",2021,3.8,"STUDYING"),
                new Student(2,"SV002","Nguyen Van A","CNTT",2020,3.9,"GRADUATED"),
                new Student(3,"SV003","Tran Thi B","ATTT",2022,3.2,"STUDYING"),
                new Student(4,"SV004","Pham Van C","DTVT",2019,2.9,"SUSPENDED")
        );
    }
    public List<Student> findAll() {
        return students;
    }
    public Student findById(int id) {
        return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
=======

import com.studenthub.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> filterBySearchAndFaculty(String search, String faculty);

    List<Student> sort(List<Student> source, String sortBy);
>>>>>>> 6553a36fd0e03ea831806d50f48d44618d86c10d
}
