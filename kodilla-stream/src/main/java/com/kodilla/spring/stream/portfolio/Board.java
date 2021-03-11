package com.kodilla.spring.stream.portfolio;

import java.util.ArrayList;
import java.util.List;

public final class Board {
    private final List<TaskList> taskLists = new ArrayList<>();
    private final String name;

    public Board (final String name) {
        this.name = name;
    }
    public void addTaskList(TaskList taskList) {
        taskLists.add(taskList);
    }
    public boolean removeTaskLists(TaskList taskList){
        return taskLists.remove(taskList);
    }
    public List<TaskList> getTaskLists() {
        return new ArrayList<>(taskLists);
    }
    public String getName(){
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Board board = (Board) o;

        if (taskLists != null ? !taskLists.equals(board.taskLists) : board.taskLists != null) return false;
        return name != null ? name.equals(board.name) : board.name == null;
    }
}