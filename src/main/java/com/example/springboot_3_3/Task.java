package com.example.springboot_3_3;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity

public class Task {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskname() {
        return name;
    }

    public void setTaskname(String taskname) {
        this.name = taskname;
    }

    public String getDuedate() {
        return date;
    }

    public void setDate(String duedate) {
        this.date = date;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @NotNull
    @Size(min = 10)
    private String name;

    @NotNull
    @Size(min = 10)
    private String date;

    @NotNull
    @Size(min = 4)
    private String priority;

}
