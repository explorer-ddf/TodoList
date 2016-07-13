package com.tmall.todolist.tasks;

import android.support.annotation.NonNull;

import com.tmall.todolist.data.Task;
import com.tmall.todolist.data.source.TasksRepository;
import com.tmall.todolist.util.Preconditions;

/**
 * Created by ddf on 16/7/12.
 */
public class TasksPresenter implements TasksContract.Presenter {

    private final TasksRepository mTasksRepository;

    private final TasksContract.View mTasksView;

    private TasksFilterType mCurrentFiltering = TasksFilterType.ALL_TASKS;

    public TasksPresenter(@NonNull TasksRepository tasksRepository, @NonNull TasksContract.View tasksView) {
        mTasksRepository = Preconditions.checkNotNull(tasksRepository, "tasksRepository cannot be null");
        mTasksView = Preconditions.checkNotNull(tasksView, "tasksView cannot be null");

        mTasksView.setPresenter(this);
    }

    @Override
    public void start() {

    }

    @Override
    public void result(int requestCode, int resultCode) {

    }

    @Override
    public void loadTasks(boolean forceUpdate) {

    }

    @Override
    public void addNewTask() {

    }

    @Override
    public void openTaskDetails(@NonNull Task requestedTask) {

    }

    @Override
    public void completeTask(@NonNull Task completedTask) {

    }

    @Override
    public void activateTask(@NonNull Task activeTask) {

    }

    @Override
    public void clearCompletedTasks() {

    }

    @Override
    public void setFiltering(TasksFilterType requestType) {

    }

    @Override
    public TasksFilterType getFiltering() {
        return null;
    }
}
