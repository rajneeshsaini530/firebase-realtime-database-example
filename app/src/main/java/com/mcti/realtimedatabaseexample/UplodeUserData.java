package com.mcti.realtimedatabaseexample;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class UplodeUserData extends AppCompatActivity {

    private EditText name,email,mobile,city;
    private Button submit;
    private FirebaseDatabase firebaseDatabase;
    private DatabaseReference databaseReference;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uplode_user_data);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        mobile = findViewById(R.id.mobile);
        city = findViewById(R.id.city);
        submit = findViewById(R.id.submit);


        firebaseDatabase = FirebaseDatabase.getInstance();

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userName = name.getText().toString();
                String userEmail = email.getText().toString();
                String userMobile = mobile.getText().toString();
                String userCity = city.getText().toString();

                databaseReference = firebaseDatabase.getReference("user").child("user1");
                databaseReference.child("Name").setValue(userName);
                databaseReference.child("Email").setValue(userEmail);
                databaseReference.child("Mobile").setValue(userMobile);
                databaseReference.child("City").setValue(userCity);

            }
        });


    }

    public void retrieve(View view) {

        startActivity(new Intent(this,FatchData.class));
    }
}
