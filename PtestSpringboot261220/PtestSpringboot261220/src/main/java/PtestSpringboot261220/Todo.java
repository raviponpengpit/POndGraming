package PtestSpringboot261220;

public class Todo {

    private long id;
    private String name;

    public Todo() {

    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Todo(long id, String name) {
        this.id = id;
        this.name = name;
    }
}
