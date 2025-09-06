package org.ToDoManagerGroup;

public class ToDoManager {

    private Task[] tasks = new Task[0];

    private Task[] addToTaskList( Task[] currentTaskList, Task newTask) {

        Task[] tmpList = new Task[currentTaskList.length + 1];

        for ( int i = 0; i < currentTaskList.length; i++ ) {
            tmpList[i] = currentTaskList[i];
        }

        tmpList[tmpList.length - 1 ] = newTask;
        currentTaskList = tmpList;

        return currentTaskList;

    }

    public void add( Task task ) {
        tasks = addToTaskList( tasks, task );
    }

    public Task[] findAll() {

        return tasks;
    }

    public Task[] search(String query) {
        Task[] result = new Task[0]; // массив для ответа
        for (Task task : tasks) { // перебираем все задачи
            if (task.matches(query)) { // если задача подходит под запрос
                result = addToTaskList(result, task); // добавляем её в массив ответа
            }
        }
        return result;
    }
}
