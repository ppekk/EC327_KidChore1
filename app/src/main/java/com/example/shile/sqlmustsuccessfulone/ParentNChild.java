package com.example.shile.sqlmustsuccessfulone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ParentNChild extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.parent_nchild);
    }


    public void parentScreen(View view) {
        Intent i = new Intent(getApplicationContext(),ParentChore.class);
        startActivity(i);
        setContentView(R.layout.activity_parent_chore);
    }


    public void childScreen(View view) {
        Intent i = new Intent(getApplicationContext(),ChildChore.class);
        startActivity(i);
        setContentView(R.layout.activity_child_chore);
    }


}
