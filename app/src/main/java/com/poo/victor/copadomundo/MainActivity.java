package com.poo.victor.copadomundo;

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

    public void alterarPlacar(View view){

        int botao = view.getId();
        TextView textView = (TextView) findViewById(R.id.textViewPlacar1);
        TextView textView2 = (TextView) findViewById(R.id.textViewPlacar2);
        String valorPlacar1 = textView.getText().toString();
        String valorPlacar2 = textView2.getText().toString();
        int i = Integer.parseInt(valorPlacar1);
        int k = Integer.parseInt(valorPlacar2);


        switch(botao){
            case R.id.botaoNegTeam1:
                if(i!=0) {
                    i--;
                    textView.setText("" + i);
                }
                break;

            case R.id.botaoPosTeam1:
                i++;
                textView.setText(""+i);
                break;


            case R.id.botaoNegTeam2:
                if(i!=0) {
                    k--;
                    textView2.setText("" + k);
                }
                break;
            case R.id.botaoPosTeam2:
                k++;
                textView2.setText(""+k);
                break;
        }

    }
}
