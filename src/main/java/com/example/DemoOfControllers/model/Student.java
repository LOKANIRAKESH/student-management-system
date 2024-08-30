package com.example.DemoOfControllers.model;
import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
@Entity
public class Student{
    @JsonProperty
    @Id
    private int stuid;
    @JsonProperty
    private String name;
    @JsonProperty
    private int age;
    @JsonProperty
    private String dep;
    @JsonProperty
    private String college;

    public void setName(String name) {
        this.name = name;
    }

    public void setDep(String dep) {
        this.dep = dep;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String name() {
        return name;
    }


    public int age() {
        return age;
    }



    public String dep() {
        return dep;
    }


    public String college() {
        return college;
    }

    public int stuid() {
        return stuid;
    }
    public void setStuid(int stuid) {
        this.stuid = stuid;
    }
}
