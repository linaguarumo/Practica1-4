package com.linalgs.practica14;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private String  res1,res2,res3,res4, res,toleranc;
    private double n1,n2,n3,resultado;
    private Spinner sCifra1, sCifra2, sCifraM, sCifraT;
    private TextView tResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sCifra1 = (Spinner) findViewById(R.id.sCifra1);
        sCifra2 = (Spinner) findViewById(R.id.sCifra2);
        sCifraM = (Spinner) findViewById(R.id.sCifraM);
        sCifraT = (Spinner) findViewById(R.id.sCifraT);
        tResultado = (TextView) findViewById(R.id.tResultado);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.cifra1, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCifra1.setAdapter(adapter);
        sCifra1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                res1=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
                R.array.cifra2, android.R.layout.simple_spinner_item);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCifra2.setAdapter(adapter2);
        sCifra2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                res2=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
                R.array.cifraM, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCifraM.setAdapter(adapter3);
        sCifraM.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                res3=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
                R.array.cifraT, android.R.layout.simple_spinner_item);
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sCifraT.setAdapter(adapter4);
        sCifraT.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                res4=adapterView.getItemAtPosition(i).toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }

    public void Resultado(View view){
        if(res1.equals("Negro")){
            res1="0";}
        if(res2.equals("Negro")){
            res2="0";}

        if(res1.equals("Marrón")){
            res1="1";}
        if(res2.equals("Marrón")){
            res2="1";}

        if(res1.equals("Rojo")){
            res1="2";}
        if(res2.equals("Rojo")){
            res2="2";}

        if(res1.equals("Naranja")){
            res1="3";}
        if(res2.equals("Naranja")){
            res2="3";}

        if(res1.equals("Amarillo")){
            res1="4";}
        if(res2.equals("Amarillo")){
            res2="4";}

        if(res1.equals("Verde")){
            res1="5";}
        if(res2.equals("Verde")){
            res2="5";}

        if(res1.equals("Azul")){
            res1="6";}
        if(res2.equals("Azul")){
            res2="6";}

        if(res1.equals("Purpura")){
            res1="7";}
        if(res2.equals("Purpura")){
            res2="7";}

        if(res1.equals("Gris")){
            res1="8";}
        if(res2.equals("Gris")){
            res2="8";}

        if(res1.equals("Blanco")){
            res1="9";}
        if(res2.equals("Blanco")){
            res2="9";}

        res=res1+res2;
        resultado=Double.parseDouble(res);

        if(res4.equals("Marrón")){
            toleranc=" +/- 1%";}
        if(res4.equals("Rojo")){
            toleranc=" +/- 2%";}
        if(res4.equals("Dorado")){
            toleranc=" +/- 5%";}
        if(res4.equals("Plateado")){
            toleranc=" +/- 10%";}

        if(res3.equals("Negro")){
            resultado=resultado*1;
            tResultado.setText(String.valueOf(resultado)+"Ohm"+toleranc);}
        if(res3.equals("Marrón")){
            resultado=resultado*10;
            tResultado.setText(String.valueOf(resultado)+"Ohm"+toleranc);}
        if(res3.equals("Rojo")){
            resultado=resultado/10;
            tResultado.setText(String.valueOf(resultado)+"k Ohm"+toleranc);}
        if(res3.equals("Naranja")){
            tResultado.setText(String.valueOf(resultado)+"k Ohm"+toleranc);}
        if(res3.equals("Amarillo")){
            resultado=resultado*10;
            tResultado.setText(String.valueOf(resultado)+"k Ohm"+toleranc);}
        if(res3.equals("Verde")){
            resultado=resultado/10;
            tResultado.setText(String.valueOf(resultado)+"M Ohm"+toleranc);}
        if(res3.equals("Azul")){
            tResultado.setText(String.valueOf(resultado)+"M Ohm"+toleranc);}
        if(res3.equals("Purpura")){
            resultado=resultado*10;
            tResultado.setText(String.valueOf(resultado)+"M Ohm"+toleranc);}
        if(res3.equals("Gris")){
            resultado=resultado/10;
            tResultado.setText(String.valueOf(resultado)+" G Ohm"+toleranc);}
        if(res3.equals("Blanco")){
            tResultado.setText(String.valueOf(resultado)+" G Ohm"+toleranc);;}




    }




}
