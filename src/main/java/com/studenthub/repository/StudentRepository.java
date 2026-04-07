package com.studenthub.repository;

import com.studenthub.model.Student;

import java.util.List;

public interface StudentRepository {
    List<Student> filterBySearchAndFaculty(String search, String faculty);

    List<Student> sort(List<Student> source, String sortBy);
}
