package com.example.exo4;

import android.os.Bundle;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    private EditText e1, e2, e3, e4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Lier les éléments du layout aux variables
        e1 = findViewById(R.id.e1);
        e2 = findViewById(R.id.e2);
        e3 = findViewById(R.id.e3);
        e4 = findViewById(R.id.e4);

        // Récupérer les données envoyées par MainActivity
        String nomPrenom = getIntent().getStringExtra("nomPrenom");
        String email = getIntent().getStringExtra("email");
        String phone = getIntent().getStringExtra("phone");
        String adresse = getIntent().getStringExtra("adresse");
        String ville = getIntent().getStringExtra("ville");

        // Afficher les données dans les EditTexts de MainActivity2
        e1.setText(nomPrenom);
        e2.setText(email);
        e3.setText(phone);
        e4.setText(adresse + ", " + ville);
    }
}
