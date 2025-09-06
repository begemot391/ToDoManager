package org.ToDoManagerGroup;


public class Epic extends Task {

    protected String[] subtasks;

    public Epic( int id, String[] subtasks ) {

        super( id );
        this.subtasks = subtasks;
    }

    public String[] getSubtasks() {

        return subtasks;
    }

    @Override
    public boolean matches( String query ) {

        String[] tasksForSearch = getSubtasks();

        for ( String subtask : tasksForSearch ) {
            if (subtask.contains(query) ) {
                return true;
            }
        }
        return false;
    }
}
