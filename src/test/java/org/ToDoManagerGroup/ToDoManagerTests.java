package org.ToDoManagerGroup;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ToDoManagerTests {

    ToDoManager todos = new ToDoManager();

    SimpleTask simpleTask = new SimpleTask(5, "Позвонить родителям");

    String[] subtasks = { "Молоко", "Яйца", "Хлеб" };
    Epic epic = new Epic(55, subtasks);

    Meeting meeting = new Meeting(
            555,
            "Выкатка 3й версии приложения",
            "Приложение НетоБанка",
            "Во вторник после обеда"
    );

    @Test
    public void shouldAddThreeTasksOfDifferentType() {

        ToDoManager todos = new ToDoManager();

        todos.add( simpleTask );
        todos.add( epic );
        todos.add( meeting );

        Task[] exp = { simpleTask, epic, meeting };
        Task[] act = todos.findAll();
        Assertions.assertArrayEquals( exp, act );
    }

    @Test
    public void testMatches() {

        todos.add( simpleTask );
        todos.add( epic );
        todos.add( meeting );

        boolean exp = true;
        boolean act = simpleTask.matches("Позвонить родителям");

        Assertions.assertEquals( exp, act );


    }

    @Test
    public void testSearch() {

        todos.add( simpleTask );
        todos.add( epic );
        todos.add( meeting );

        Task[] exp = {simpleTask};
        Task[] act = todos.search("Позвонить родителям");

        Assertions.assertArrayEquals( exp, act );
    }
}
