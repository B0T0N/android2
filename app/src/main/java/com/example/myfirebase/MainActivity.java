package com.example.myfirebase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.net.HttpCookie;
import java.time.LocalDateTime;

public class MainActivity extends AppCompatActivity {

    private LocalDateTime LocalDateTimedatetime;

    @Override
    protected <DatabaseErrorerror> void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef= database.getReference("message");
        myRef.setValue("Hola Mundo Android, desde el Tec de Chiná");

        DatabaseReference myRef2 = database.getReference("message1");
        myRef2.setValue("ITChiná the best");

        DatabaseReference myRef3 = database.getReference("messages").child("Hugo");
        myRef3.setValue("Saludos Hugo");

        DatabaseReference myRef4 = database.getReference("messages").child("Paco");
        myRef4.setValue("Saludos Paco");

        LocalDateTimedatetime = LocalDateTime.now();
        DatabaseReference myRef5 = database.getReference("email").child("Para");
        myRef5.setValue("Hugo Lopez");
        DatabaseReference myRef6 = database.getReference("email").child("De");
        myRef6.setValue("ITChiná");
        DatabaseReference myRef7 = database.getReference("email").child("Asunto");
        myRef7.setValue("Probando Android con FireBase, cool !!!");
        DatabaseReference myRef8 = database.getReference("email").child("Fecha");



    }
}