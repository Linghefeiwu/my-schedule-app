package com.example.scheduleapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CalendarView calendarView;
    Button buttonAddSchedule;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calendarView = findViewById(R.id.calendarView);
        buttonAddSchedule = findViewById(R.id.buttonAddSchedule);

        calendarView.setOnDateChangeListener((view, year, month, dayOfMonth) -> {
            String date = dayOfMonth + "/" + (month + 1) + "/" + year;
            Toast.makeText(MainActivity.this, "Selected Date: " + date, Toast.LENGTH_SHORT).show();
        });

        buttonAddSchedule.setOnClickListener(v -> {
            Toast.makeText(MainActivity.this, "Add Schedule Clicked (Not Implemented)", Toast.LENGTH_SHORT).show();
            // Here you would typically open a new activity or dialog to add a schedule
        });
    }
}

