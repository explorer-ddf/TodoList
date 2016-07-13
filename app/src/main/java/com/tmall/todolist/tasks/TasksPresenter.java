package com.tmall.todolist.tasks;

/**
 * Created by ddf on 16/7/12.
 */
public class TasksPresenter implements TasksContract.Presenter {

    private final TasksContract.View mTasksView;

    public TasksPresenter(TasksContract.View view) {
        mTasksView = view;
    }

    @Override
    public void start() {

    }
}
