package com.tmall.todolist.tasks;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

import com.tmall.todolist.Injection;
import com.tmall.todolist.R;
import com.tmall.todolist.util.ActivityUtils;

import butterknife.BindView;
import butterknife.ButterKnife;

public class TasksActivity extends AppCompatActivity {
    private static final String CURRENT_FILTERING_KEY = "CURRENT_FILTERING_KEY";

    @BindView(R.id.drawer_layout)
    DrawerLayout mDrawerLayout;

    private TasksPresenter mTasksPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tasks);
        ButterKnife.bind(this);

        initView();

        TasksFragment tasksFragment = (TasksFragment) getSupportFragmentManager().findFragmentById(R.id.contentFrame);
        if (tasksFragment == null) {
            tasksFragment = TasksFragment.newInstance();
            ActivityUtils.addFragmentToActivity(getSupportFragmentManager(), tasksFragment, R.id.contentFrame);
        }

        mTasksPresenter = new TasksPresenter(Injection.provideTasksRepository(getApplicationContext()), tasksFragment);

        // FIXME: 恢复状态
        if (savedInstanceState != null) {
            TasksFilterType currentFiltering = (TasksFilterType) savedInstanceState.getSerializable(CURRENT_FILTERING_KEY);
            mTasksPresenter.setFiltering(currentFiltering);
        }
    }

    // FIXME: 保存状态
    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putSerializable(CURRENT_FILTERING_KEY, mTasksPresenter.getFiltering());
        super.onSaveInstanceState(outState);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);// FIXME: 需要与xml中的android:layout_gravity值保持一致
                return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void initView() {
        // Set up the toolbar.
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setHomeAsUpIndicator(R.drawable.ic_menu);
        actionBar.setDisplayHomeAsUpEnabled(true);

        // Set up the navigation drawer.
        NavigationView navigationView = (NavigationView) findViewById(R.id.tasks_nav_view);
        if (navigationView != null) {
            navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(MenuItem item) {
                    switch (item.getItemId()) {
                        case R.id.menu_item_todolist:
                            break;
                        case R.id.menu_item_statistics:
                            break;
                        default:
                            break;
                    }
                    item.setChecked(true);
                    mDrawerLayout.closeDrawers();
                    return true;
                }
            });
        }
    }
}
