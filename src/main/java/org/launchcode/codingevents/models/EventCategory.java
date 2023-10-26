package org.launchcode.codingevents.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.Objects;

@Entity
public class EventCategory extends AbstractEntity{


    private String name;

    public EventCategory(String name) {
        this.name = name;
    }

    public EventCategory() {}


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


}

