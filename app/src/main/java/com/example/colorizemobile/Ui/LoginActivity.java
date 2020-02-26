package com.example.colorizemobile.Ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.colorizemobile.Fragment.LoginFragment;
import com.example.colorizemobile.Fragment.RegisterFragment;
import com.example.colorizemobile.R;
import com.example.colorizemobile.Utils.SectionsPageAdapter;
import com.google.android.material.tabs.TabLayout;

public class LoginActivity extends AppCompatActivity {

    private SectionsPageAdapter mSectionsPageAdapter;
    private ViewPager mViewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mSectionsPageAdapter = new SectionsPageAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        setupViewPager(mViewPager);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

    }

    private void setupViewPager(ViewPager viewPager) {
        SectionsPageAdapter adapter = new SectionsPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new LoginFragment(), "Login");
        adapter.addFragment(new RegisterFragment(), "Register");
        viewPager.setAdapter(adapter);
    }
}
