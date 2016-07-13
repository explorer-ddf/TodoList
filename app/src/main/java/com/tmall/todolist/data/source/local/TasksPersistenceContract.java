package com.tmall.todolist.data.source.local;

import android.provider.BaseColumns;

/**
 * Created by ddf on 16/7/13.
 */
public final class TasksPersistenceContract {

    public TasksPersistenceContract() {
    }

    public static abstract class TaskEntry implements BaseColumns {
        public static final String TABLE_NAME = "task";
        public static final String COLUMN_NAME_ENTRY_ID = "entryid";
        public static final String COLUMN_NAME_TITLE = "title";
        public static final String COLUMN_NAME_DESCRIPTION = "description";
        public static final String COLUMN_NAME_COMPLETED = "completed";
    }
}
