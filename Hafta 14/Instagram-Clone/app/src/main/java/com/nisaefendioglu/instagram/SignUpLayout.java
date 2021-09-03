package com.nisaefendioglu.instagram;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;


public class SignUpLayout extends AppCompatActivity {

    ImageView logo;
    Button loginButtonFacebook,signUp,loginPageButton;
    EditText email,fullName,userName,userPassword;

    FirebaseDatabase firebaseDatabase;
    FirebaseAuth firebaseAuth;
    DatabaseReference databaseReference;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup_layout);

        logo = findViewById(R.id.logo);
        loginButtonFacebook = findViewById(R.id.loginButtonFacebook);
        signUp = findViewById(R.id.signUp);
        loginPageButton = findViewById(R.id.loginPageButton);
        email = findViewById(R.id.email);
        fullName = findViewById(R.id.fullName);
        userName = findViewById(R.id.userName);
        userPassword = findViewById(R.id.userPassword);


        firebaseDatabase = FirebaseDatabase.getInstance();
        databaseReference = firebaseDatabase.getReference();


        signUp.setOnClickListener(view -> {
            String mail = email.getText().toString();
            String fullname = fullName.getText().toString();
            String username = userName.getText().toString();
            String password = userPassword.getText().toString();


            userAdd(mail,fullname,username,password);

        });




    }

    public void userAdd(final String mail, final String fullname, final String username, final String password){
        databaseReference.child("Users").child(username).child("UserName").child(mail).child("E-mail").child(fullname).child("FullName").child(password).child("Password").setValue(username).addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful()){
                    Intent intent = new Intent(SignUpLayout.this, HomePageActivity.class);
                    intent.putExtra("UserName" , username);
                    intent.putExtra("E-mail", mail);
                    intent.putExtra("FullName" , fullname);
                    intent.putExtra("Password" , password);
                    startActivity(intent);
                }
            }
        });
    }

    public void loginOnClick(View view){
        Intent intent = new Intent(SignUpLayout.this, LoginActivity.class);
        startActivity(intent);
    }

}
