package com.tmall.todolist.tasks;

import com.tmall.todolist.BasePresenter;
import com.tmall.todolist.BaseView;

/**
 * Created by ddf on 16/7/12.
 */
public interface TasksContract {

    interface View extends BaseView<Presenter> {

    }

    interface Presenter extends BasePresenter {
    }
}
