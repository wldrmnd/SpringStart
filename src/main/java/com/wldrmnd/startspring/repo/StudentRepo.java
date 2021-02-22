package com.wldrmnd.startspring.repo;

import com.wldrmnd.startspring.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepo {

    private List<Student> students;

    public List<Student> getAll() {
        students = new ArrayList<>() {{
            new Student("Egor", 10, 1L);
            new Student("Женя", 11, 2L);
            new Student("Misha", 12, 3L);
            new Student("Pasha", 13, 4L);
        }};
        students.add(new Student("Egor", 10, 1L));
        return students;
    }
}
