package com.insup.junitpractice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public List<Integer> getData(){
        List<Integer> data = new ArrayList<>();
        for(int i=0; i<100; i++){
            data.add(i);
        }

        return data;
    }



}
