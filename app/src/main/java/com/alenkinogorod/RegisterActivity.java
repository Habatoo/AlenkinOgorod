package com.alenkinogorod;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextRegisterName;
    private EditText editTextRegisterEmail;
    private EditText editTextRegisterPassword;

    String name;
    String email;
    String password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        editTextRegisterName = findViewById(R.id.editTextRegisterName);
        editTextRegisterEmail = findViewById(R.id.editTextRegisterEmail);
        editTextRegisterPassword = findViewById(R.id.editTextRegisterPassword);
    }

    public void onClickRegisterUser(View view) {

        name = editTextRegisterName.getText().toString().trim();
        email = editTextRegisterEmail.getText().toString().trim();
        password = editTextRegisterPassword.getText().toString().trim();

        if (!name.isEmpty() && !password.isEmpty() && !email.isEmpty()) {
            Intent intent = new Intent(this, PersonalCabinetActivity.class);
            intent.putExtra("name", name);
            intent.putExtra("email", email);
            intent.putExtra("password", password);
            startActivity(intent);
        } else {
            Toast.makeText(this, "Bce поля должны быть заполнены!", Toast.LENGTH_SHORT).show();
        }
    }
}