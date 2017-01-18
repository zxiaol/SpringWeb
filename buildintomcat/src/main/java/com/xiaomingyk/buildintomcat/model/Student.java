package com.xiaomingyk.buildintomcat.model;

/**
 * Created by My on 1/12/2017.
 */
public class Student {

    private String name;
    private Integer id;
    private Integer age;

    public void setId(Integer id) {

        this.id = id;
    }

    public Integer getId() {

        return id;
    }

    public void setAge(Integer age) {

        this.age = age;
    }

    public Integer getAge() {

        return age;

    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }
}
