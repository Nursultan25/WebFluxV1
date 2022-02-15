package com.example.webfluxv1;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@AllArgsConstructor
public class ToDoController {

    private ToDoRepository repository;

    @GetMapping("/todo/{id}")
    public Mono<ToDo> findById(@PathVariable String id) {
        return this.repository.findById(id);
    }

    @GetMapping("/todo")
    public Flux<ToDo> getToDos() {
        return this.repository.findAll();
    }
}
