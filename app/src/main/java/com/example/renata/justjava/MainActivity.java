package com.example.renata.justjava;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Metodo para click no botao
     */
    public void submitOrder(View view){
        display(1);
    }
    /**
     * Este metodo mostra o valor da quantidade na tela
     */
    private void display(int number){
        TextView qtdTextView = (TextView) findViewById(R.id.qtd_text_view);
        qtdTextView.setText("" + number);
    }
}
