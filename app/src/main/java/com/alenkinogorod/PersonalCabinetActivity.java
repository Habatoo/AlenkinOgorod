package com.alenkinogorod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PersonalCabinetActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_cabinet);
    }

    public void onClickNotes(View view) {
        Intent intent = new Intent(this, NoteActivity.class);
        startActivity(intent);
    }

    public void onClickWiki(View view) {
        Intent intent = new Intent(this, WikiActivity.class);
        startActivity(intent);
    }

    public void onClickOurSite(View view) {
        Intent intent = new Intent(this, OurSiteActivity.class);
        startActivity(intent);
    }

    public void onClickCalendar(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
}