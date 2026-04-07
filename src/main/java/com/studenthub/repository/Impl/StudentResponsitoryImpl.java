package com.studenthub.repository.Impl;

import com.studenthub.model.Student;
import com.studenthub.repository.StudentRepository;

import java.util.List;

public class StudentResponsitoryImpl implements StudentRepository {
    @Override
    public List<Student> filterBySearchAndFaculty(String search, String faculty) {
        String normalizedSearch = search == null ? "" : search.trim().toLowerCase();
        String normalizedFaculty = faculty == null ? "" : faculty.trim();

        return students.stream()
                .filter(student -> normalizedSearch.isBlank() || student.getFullName().toLowerCase().contains(normalizedSearch))
                .filter(student -> normalizedFaculty.isBlank() || student.getFaculty().equalsIgnoreCase(normalizedFaculty))
                .toList();
    }

    @Override
    public List<Student> sort(List<Student> source, String sortBy) {
        List<Student> sorted = new ArrayList<>(source);
        if ("name".equalsIgnoreCase(sortBy)) {
            sorted.sort(Comparator.comparing(Student::getFullName, String::compareToIgnoreCase));
        } else if ("gpa".equalsIgnoreCase(sortBy)) {
            sorted.sort(Comparator.comparingDouble(Student::getGpa).reversed());
        }
        return sorted;
    }
}
