package com.wldrmnd.startspring.entity;

import java.io.Serializable;

public class Student implements Serializable {

    private String name;
    private Integer age;
    private Long id;

    public Student(String name, Integer age, Long id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Long getId() {
        return id;
    }
}
