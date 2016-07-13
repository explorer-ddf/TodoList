package com.tmall.todolist.util;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by ddf on 16/7/13.
 */
public class ActivityUtils {

    public static void addFragmentToActivity(@NonNull FragmentManager fm, @NonNull Fragment fragment, int containerViewId) {
        FragmentTransaction transaction = fm.beginTransaction();
        transaction.add(containerViewId, fragment);
        transaction.commit();
    }
}
