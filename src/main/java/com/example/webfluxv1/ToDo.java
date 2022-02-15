package com.example.webfluxv1;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ToDo {
    String id;
    String description;
    LocalDateTime created;
    LocalDateTime modified;
    boolean completed;

    public ToDo() {
        this.id = UUID.randomUUID().toString();
        this.created = LocalDateTime.now();
        this.modified = LocalDateTime.now();
    }

    public ToDo(String description) {
        this();
        this.description = description;
    }

    public ToDo(String description,
                boolean completed) {
        this();
        this.description = description;
        this.completed = completed;
    }
}
