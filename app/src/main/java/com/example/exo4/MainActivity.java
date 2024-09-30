package com.example.exo4;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText t1, t2, t3, t4, t5;
    private Button envoyer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Lier les éléments du layout aux variables
        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        envoyer = findViewById(R.id.envoyer);

        // Gestionnaire d'événement pour le bouton "Envoyer"
        envoyer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Récupérer les données saisies dans les EditTexts
                String nomPrenom = t1.getText().toString();
                String email = t2.getText().toString();
                String phone = t3.getText().toString();
                String adresse = t4.getText().toString();
                String ville = t5.getText().toString();

                // Créer un Intent pour passer à MainActivity2
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                // Ajouter les données au Intent
                intent.putExtra("nomPrenom", nomPrenom);
                intent.putExtra("email", email);
                intent.putExtra("phone", phone);
                intent.putExtra("adresse", adresse);
                intent.putExtra("ville", ville);

                // Démarrer la seconde activité
                startActivity(intent);
            }
        });
    }
}
