package com.tmall.todolist.util;


import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by ddf on 16/7/13.
 */
public class ListUtil {

    public static <T> ArrayList<T> newArrayList(Collection<T> values) {
        if (values != null) {
            return new ArrayList<T>(values);
        }

        return null;
    }
}
