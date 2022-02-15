package com.example.webfluxv1;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.Arrays;

public class ToDoRepository {

    public  Flux<ToDo> toDoFlux =
            Flux.fromIterable(Arrays.asList(
                    new ToDo("Do homework"),
                    new ToDo("Workout every day", true),
                    new ToDo("Make dinner tonight"),
                    new ToDo("Clean my room", true)
            ));

    public Mono<ToDo> findById(String id) {
        return Mono.from(
                toDoFlux.filter(toDo -> toDo.getId().equals(id))
        );
    }

    public Flux<ToDo> findAll() {
        return toDoFlux;
    }
}
