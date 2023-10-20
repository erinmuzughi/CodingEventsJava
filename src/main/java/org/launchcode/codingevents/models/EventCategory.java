package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class EventCategory {

    @Id
    @GeneratedValue
    private int id;
    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() {}

    public int getId() {
        return id;
    }
    @NotBlank(message = "Category name is required")
    @Size(min = 5, max = 50, message = "Category Name must be between 5 and 50 characters")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EventCategory that = (EventCategory) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

