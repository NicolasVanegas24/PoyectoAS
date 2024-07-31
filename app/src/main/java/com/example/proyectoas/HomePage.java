package com.example.proyectoas;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.content.Intent;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class HomePage extends AppCompatActivity {

    private TextView companyNameTextView;
    private TextView welcomeMessageTextView;
    private TextView offersSectionTitle;
    private TextView[] offerTextViews; // Array para manejar los anuncios

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);

        // Inicializa los TextViews
        companyNameTextView = findViewById(R.id.companyNameTextView);
        welcomeMessageTextView = findViewById(R.id.welcomeMessageTextView);
        offersSectionTitle = findViewById(R.id.offersSectionTitle);

        // Configuración de los textos
        companyNameTextView.setText("DBR Company");
        welcomeMessageTextView.setText("Conectamos a las personas con el mundo y resolvemos tus problemas técnicos al instante.");
        offersSectionTitle.setText("Anuncios y Ofertas");

        // Configuración de anuncios en el contenedor
        LinearLayout offersContainer = findViewById(R.id.offersContainer);
        for (int i = 0; i < offersContainer.getChildCount(); i++) {
            View child = offersContainer.getChildAt(i);
            if (child instanceof TextView) {
                TextView offerTextView = (TextView) child;

            }
        }

        // Configuración del botón de cerrar sesión
        Button logoutButton = findViewById(R.id.logoutButton);
        logoutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Cierra sesión y regresa a MainActivity
                Intent intent = new Intent(HomePage.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }
}





