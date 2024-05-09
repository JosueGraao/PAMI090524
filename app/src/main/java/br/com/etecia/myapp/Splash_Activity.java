package br.com.etecia.myapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class Splash_Activity extends AppCompatActivity {
    //Declarando a variável global do tipo componente
    Button btnAbrirLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.splash_layout);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //Apresentar a variável java para a variável xml
        btnAbrirLogin = findViewById(R.id.btnSplash);

        //Criar uma ação /evento para o componente (Button)
        btnAbrirLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Instanciando o intent com o contexto e a janela a ser aberta
                Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                //abrir outra janela com o método startActivity
                startActivity(intent);
                //fechando a janela atual
                finish();
            }
        });
    }
}