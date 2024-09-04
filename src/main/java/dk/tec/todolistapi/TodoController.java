package dk.tec.todolistapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/todo")
public class TodoController {

//    @Autowired
    TodoItemRepository repository;

    public TodoController(TodoItemRepository repository) {
        this.repository = repository;
    }

    @PostMapping()
    public void createTodo (@RequestBody Todo todo){
        repository.save(todo);
    }

    @GetMapping()
    public List<Todo> getAllTodo(){
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public Todo getTodoById(@PathVariable int id){
        return repository.findById(id).get();
    }

    @PutMapping()
    public void updateTodo(@RequestBody Todo todo){
        repository.save(todo);
    }

    @DeleteMapping("/{id}")
    public void deleteTodo(@PathVariable int id){
        repository.deleteById(id);
    }
}
