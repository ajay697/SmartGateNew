package com.example.www.smartgate;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.www.smartgate.Fragments.ActivityFragment;
import com.example.www.smartgate.Fragments.CommunityFragments;
import com.example.www.smartgate.Fragments.HouseholdFragment;
import com.example.www.smartgate.Fragments.ProfileFragment;
import com.example.www.smartgate.Fragments.QuickActionsFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {


    private Toolbar mActionBar;
    private ImageButton mAddButton;
    private TextView toolbarTitleTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mActionBar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(mActionBar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        toolbarTitleTextView =(TextView)findViewById(R.id.toolbar_title_textView);


        mAddButton = (ImageButton)findViewById(R.id.ic_add_button);

        BottomNavigationView mBottomNavigationView = (BottomNavigationView)findViewById(R.id.bottom_nav_bar);
        mBottomNavigationView.setOnNavigationItemSelectedListener(mNavigationItemSelectedListener);

        toolbarTitleTextView.setGravity(Gravity.CENTER);
        toolbarTitleTextView.setText(R.string.fragments_title);
        loadFragment(new ActivityFragment());
    }
    private BottomNavigationView.OnNavigationItemSelectedListener mNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {
        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
            Fragment mFragment;
            switch (menuItem.getItemId()){
                case R.id.item_activity:
                    toolbarTitleTextView.setText(R.string.fragments_title);
                    toolbarTitleTextView.setGravity(Gravity.CENTER);
                    mFragment = new ActivityFragment();
                    loadFragment(mFragment);
                    return true;
                case R.id.item_community:
                    toolbarTitleTextView.setText(R.string.fragments_title);
                    toolbarTitleTextView.setGravity(Gravity.CENTER);
                    mFragment = new CommunityFragments();
                    loadFragment(mFragment);
                    return true;
                case R.id.item_household:
                    toolbarTitleTextView.setText(R.string.fragments_title);
                    toolbarTitleTextView.setGravity(Gravity.CENTER);
                    mFragment = new HouseholdFragment();
                    loadFragment(mFragment);
                    return true;
                case R.id.item_profile:
                    toolbarTitleTextView.setText(R.string.fragments_title);
                    toolbarTitleTextView.setGravity(Gravity.CENTER);
                    mFragment = new ProfileFragment();
                    loadFragment(mFragment);
                    return true;

            }
            return false;
        }
    };

    public void onAddButtonClicked(View view){
        toolbarTitleTextView.setText("Quick Actions");
        toolbarTitleTextView.setTextColor(getResources().getColor(R.color.profile_text_color));
        toolbarTitleTextView.setGravity(Gravity.CENTER);
        Fragment mFragment = new QuickActionsFragment();
        loadFragment(mFragment);
    }
    private void loadFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.fragment_container,fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }

}
