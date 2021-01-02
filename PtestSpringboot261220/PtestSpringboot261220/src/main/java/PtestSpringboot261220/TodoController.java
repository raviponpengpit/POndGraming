package PtestSpringboot261220;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.*;

@RestController

public class TodoController {

    private List<Todo> todos = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();


    public TodoController() {
        todos.add(new Todo(1, "GG12"));
        todos.add(new Todo(2, "GGWP"));
        todos.add(new Todo(3, "GGEZ1"));

    }

    @GetMapping("/todo") //path way
    public List<Todo> getTodos() {
        return todos;
    }

    @GetMapping("/todo/{id}/") //path way //getpath variable ("/todo/{id}/{id2}/{id3}")
    public Todo getTodosById(@PathVariable long id) {

        return todos.stream().filter(result -> result.getId() == id).findFirst().orElseThrow(() -> new TodoNotFoundException(id));
    }

    @GetMapping("/todo/search") //path way // query string
    public String getTodosByName(@RequestParam(defaultValue = "cat") String name) {

        return "search:" + name;
    }

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/todo")
    public void addTodo(@RequestBody Todo todo) {
        todos.add(new Todo(counter.getAndIncrement(), todo.getName()));
    }

    @PutMapping("/todo/{id}") //get part
    public void editTodo(@RequestBody Todo todo, @PathVariable long id) {
        todos.stream().filter(result -> result.getId() == id).findFirst().ifPresentOrElse(result -> {
            result.setName(todo.getName());
        }, () -> {
        }); //เช็คว่าเท่ากันเปล่าถ้าเท่ากันดึงค่ามันออกมา check two varible if equal pull varible ถ้ามีข้อมูลจะส่งกลับมา result -> {update} ถ้าไม่มีข้อมูล () -> {}
    }

    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/todo/{id}") //get part
    public void deleteodo(@PathVariable long id) {
        todos.stream().filter(result -> result.getId() == id).findFirst().ifPresentOrElse(result -> {
            todos.remove(result);
        }, () -> {
            throw new TodoNotFoundException(id);
        });
    }
}
