package com.wldrmnd.startspring.service;

import com.wldrmnd.startspring.entity.Student;
import com.wldrmnd.startspring.repo.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    private StudentRepo repo;

    public ArrayList<Student> getAll() {
        return (ArrayList<Student>) repo.getAll();
    }
}
