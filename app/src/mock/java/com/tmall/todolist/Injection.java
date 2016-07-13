package com.tmall.todolist;

import android.content.Context;
import android.support.annotation.NonNull;

import com.tmall.todolist.data.FakeTasksRemoteDataSource;
import com.tmall.todolist.data.source.TasksRepository;
import com.tmall.todolist.data.source.local.TasksLocalDataSource;
import com.tmall.todolist.util.Preconditions;

/**
 * Created by ddf on 16/7/13.
 */
public class Injection {

    public static TasksRepository provideTasksRepository(@NonNull Context context) {
        Preconditions.checkNotNull(context);
        return TasksRepository.getInstance(FakeTasksRemoteDataSource.getInstance(),
                TasksLocalDataSource.getInstance(context));
    }
}
