package org.ToDoManagerGroup;


public class Meeting extends Task {

    protected String meetingTheme;
    protected String meetingProject;
    protected String meetingdate;

    public Meeting( int id, String theme, String project, String date ) {

        super( id );
        this.meetingTheme = theme;
        this.meetingProject = project;
        this.meetingdate = date;
    }

    @Override
    public boolean matches(String query) { // Переопределяем родительский метод matches. Проверяем, есть ли тема встречи или проект в переданном значении.
        if (meetingTheme.contains(query)) {
            return true;
        }
        if (meetingProject.contains(query)) {
            return true;
        }
        return false;
    }

    public String getMeetingTheme() {
        return meetingTheme;
    }

    public String getMeetingProject() {
        return meetingProject;
    }

    public String getMeetingdate() {
        return meetingdate;
    }
}
