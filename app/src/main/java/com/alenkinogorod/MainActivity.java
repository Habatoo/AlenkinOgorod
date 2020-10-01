package com.alenkinogorod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName;
    private EditText editTextPassword;

    private Button buttonName;

    String name;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextName = findViewById(R.id.editTextLogin);
        editTextPassword = findViewById(R.id.editTextPassword);

        
    }

    public void onClickEnter(View view) {

        name = editTextName.getText().toString().trim();
        password = editTextPassword.getText().toString().trim();

        if (!name.isEmpty() && !password.isEmpty()) {
            Intent intent = new Intent(this, EnterActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("password", password);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Bce поля должны быть заполнены!", Toast.LENGTH_SHORT).show();
        }

    }

    /**
     * Go to register page method
     * Input data are username, email and password
     * @param view
     */
    public void onClickRegister(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        startActivity(intent);
    }

    public void onClickGuestEnter(View view) {
        String name = "Guest";
        String password = "password";

        Intent intent = new Intent(this, EnterActivity.class);
        intent.putExtra("name", name);
        intent.putExtra("password", password);
        startActivity(intent);
    }
}