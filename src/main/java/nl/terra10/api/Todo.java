package nl.terra10.api;

import java.util.Objects;

public class Todo {
    private int id;
    private String option;

    public Todo() {
    }

    public Todo(int id, String option) {
        this.id = id;
        this.option = option;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Todo)) return false;
        Todo todo = (Todo) o;
        return getId() == todo.getId() &&
                Objects.equals(getOption(), todo.getOption());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getOption());
    }
}


/*
Create a model file: Tod-java with 2 properties: "id" and "option". No magic here, its a POJO with the following requirements:
Includes a no-arg constructor
Includes a constructor for both id and option
Has getters and setters for both id and option
Has an overridden "public boolean equals(Object obj)" method as well as an overridden "public int hashCode()" method. (tip: use Objects.equals and Objects.hash)
 */