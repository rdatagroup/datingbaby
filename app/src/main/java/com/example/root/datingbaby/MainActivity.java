package com.example.root.datingbaby;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

   List<member> lstMember;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstMember = new ArrayList<>();
        lstMember.add(new member("The Vegitarian","Email","Phone","Location","age","like",R.drawable.joan));
        lstMember.add(new member("The Pupo","Email","Phone","Location","age","like",R.drawable.jose));
        lstMember.add(new member("The loner","Email","Phone","Location","age","like",R.drawable.love));
        lstMember.add(new member("The Meat","Email","Phone","Location","age","like",R.drawable.phoina));
        lstMember.add(new member("the hotie","Email","Phone","Location","age","like",R.drawable.joan));
        lstMember.add(new member("my loo","Email","Phone","Location","age","like",R.drawable.heart1));
        lstMember.add(new member("pie","Email","Phone","Location","age","like",R.drawable.heart2));
        lstMember.add(new member("gladpo","Email","Phone","Location","age","like",R.drawable.glad));
        lstMember.add(new member("orker","Email","Phone","Location","age","like",R.drawable.aniath));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recycle_member);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstMember);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);

    }
}
