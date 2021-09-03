package com.nisaefendioglu.instagram;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class LoginActivity extends AppCompatActivity {

    ImageView instagramLogo;
    EditText userName,userPassword;
    Button loginButton,loginButtonFacebook,forgetPassword,signUp;
    TextView errorMessage;

    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_layout);

        instagramLogo = findViewById(R.id.instagramLogo);
        userName = findViewById(R.id.userName);
        userPassword = findViewById(R.id.userPassword);
        loginButton = findViewById(R.id.loginButton);
        loginButtonFacebook = findViewById(R.id.loginButtonFacebook);
        forgetPassword = findViewById(R.id.forgetPassword);
        signUp = findViewById(R.id.signUp);
        errorMessage = findViewById(R.id.errorMessage);


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();

        loginButton.setOnClickListener(view -> {
            String username = userName.getText().toString();
            String password = userPassword.getText().toString();

            firebaseAuth.signInWithEmailAndPassword(username,password).addOnCompleteListener(LoginActivity.this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()){
                        startActivity(new Intent(LoginActivity.this, HomePageActivity.class));
                    }

                    else {
                        errorMessage.setText("Kullanıcı ya da şifre yanlış");
                        Log.e("isim ya da şifre hatası", task.getException().getMessage());
                    }
                }
            });


        });



    }

}
