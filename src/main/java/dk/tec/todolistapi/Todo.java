package dk.tec.todolistapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Todo {

//    public Todo(String title) {
//        Title = title;
//
//    }
//
//    public Todo(String title, String description, int coins) {
//        Title = title;
//        Description = description;
//        Coins = coins;
//
//    }
//
//    public Todo(
//                String title,
//                String description,
//                int coins,
//                String imageFile,
//                LocalDateTime plannedStartTime,
//                LocalDateTime plannedEndTime,
//                int ticksSpend,
//                TodoType typeOfTask,
//                Priority priority,
//                List<Todo> todoItemBlockers,
//                boolean isCompleted,
//                boolean isRepeatable)
//    {
//        PlannedEndTime = plannedEndTime;
//        PriorityType = priority;
//        Title = title;
//        Description = description;
//        Coins = coins;
//        ImageFile = imageFile;
//        PlannedStartTime = plannedStartTime;
//        this.ticksSpend = ticksSpend;
//        TypeOfTask = typeOfTask;
//        TodoItemBlockers = todoItemBlockers;
//        IsCompleted = isCompleted;
//        IsRepeatable = isRepeatable;
//    }

//    private UUID Id = UUID.randomUUID();
    @Id
    @GeneratedValue
    private int Id;
    private String Title;
    private String Description;
    private int Coins;
    private String ImageFile;
    private LocalDateTime PlannedStartTime;
    private LocalDateTime PlannedEndTime;
    private int ticksSpend;
    private TodoType TypeOfTask;
    @OneToMany
    private List<Todo> TodoItemBlockers;
    private boolean IsCompleted = false;
    private boolean IsRepeatable = false;
    private Priority PriorityType;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public int getCoins() {
        return Coins;
    }

    public void setCoins(int coins) {
        Coins = coins;
    }

    public String getImageFile() {
        return ImageFile;
    }

    public void setImageFile(String imageFile) {
        ImageFile = imageFile;
    }

    public LocalDateTime getPlannedStartTime() {
        return PlannedStartTime;
    }

    public void setPlannedStartTime(LocalDateTime plannedStartTime) {
        PlannedStartTime = plannedStartTime;
    }

    public LocalDateTime getPlannedEndTime() {
        return PlannedEndTime;
    }

    public void setPlannedEndTime(LocalDateTime plannedEndTime) {
        PlannedEndTime = plannedEndTime;
    }

    public int getTicksSpend() {
        return ticksSpend;
    }

    public void setTicksSpend(int ticksSpend) {
        this.ticksSpend = ticksSpend;
    }

    public TodoType getTypeOfTask() {
        return TypeOfTask;
    }

    public void setTypeOfTask(TodoType typeOfTask) {
        TypeOfTask = typeOfTask;
    }

    public List<Todo> getTodoItemBlockers() {
        return TodoItemBlockers;
    }

    public void setTodoItemBlockers(List<Todo> todoItemBlockers) {
        TodoItemBlockers = todoItemBlockers;
    }

    public boolean isCompleted() {
        return IsCompleted;
    }

    public void setCompleted(boolean completed) {
        IsCompleted = completed;
    }

    public boolean isRepeatable() {
        return IsRepeatable;
    }

    public void setRepeatable(boolean repeatable) {
        IsRepeatable = repeatable;
    }

    public Priority getPriority() {
        return PriorityType;
    }

    public void setPriority(Priority priority) {
        PriorityType = priority;
    }
}
