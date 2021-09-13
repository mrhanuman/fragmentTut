package com.example.fragmenttut;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

import com.example.fragmenttut.Fragment.FirstFragment;
import com.example.fragmenttut.Fragment.SecondFragment;


public class MainActivity extends AppCompatActivity {
    Button btn1, btn2;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.button);
        btn2 = findViewById(R.id.button2);
        linearLayout = findViewById(R.id.linearlayout);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FirstFragment firstFragment = new FirstFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, firstFragment);
                transaction.commit();
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SecondFragment secondFragment = new SecondFragment();
                FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
                transaction.replace(R.id.linearlayout, secondFragment);
                transaction.commit();

            }
        });

    }
}