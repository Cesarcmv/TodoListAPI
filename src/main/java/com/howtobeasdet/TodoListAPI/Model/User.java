package com.howtobeasdet.TodoListAPI.Model;

import javax.persistence.*;

@Entity
@Table(schema = "TasksCrud")
public class User {
    @Id
    @GeneratedValue()
    private long id;
    @Column
    private String title;
    @Column
    private String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
