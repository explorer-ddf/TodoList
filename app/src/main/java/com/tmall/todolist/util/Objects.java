package com.tmall.todolist.util;

import java.util.Arrays;

/**
 * Created by ddf on 16/7/13.
 */
public class Objects {
    public static boolean equal(Object a, Object b) {
        return a == b || (a != null && a.equals(b));
    }

    public static int hashCode(Object... objects) {
        return Arrays.hashCode(objects);
    }
}
