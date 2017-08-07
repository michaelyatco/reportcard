package com.example.android.reportcard;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Create an ArrayList of Grade objects
        ArrayList<Grade> grades = new ArrayList<Grade>();
        grades.add(new Grade("Algebra", "94"));
        grades.add(new Grade("World History", "87"));
        grades.add(new Grade("Spanish I", "85"));
        grades.add(new Grade("Computer Science", "100"));
        grades.add(new Grade("English I", "75"));
        grades.add(new Grade("Earth Science", "65"));

        GradeAdapter gradeAdapter = new GradeAdapter(this, grades);

        ListView listView = (ListView) findViewById(R.id.listview_grade);
        listView.setAdapter(gradeAdapter);
    }
}
