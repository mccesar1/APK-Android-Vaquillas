package com.example.agroplus;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        String message = intent.getStringExtra("numero");
        String message2 = intent.getStringExtra("toro");

        String message3 = intent.getStringExtra("toro2");
        String message4 = intent.getStringExtra("toro3");
        String message5 = intent.getStringExtra("toro4");

        String corral = intent.getStringExtra("CORR");
        String del = intent.getStringExtra("DEL");
        String leche = intent.getStringExtra("LECH");
        String lechp = intent.getStringExtra("LECHP");
        String fcel = intent.getStringExtra("FCEL");
        String vins = intent.getStringExtra("VINS");
        String lact = intent.getStringExtra("LACT");
        String rpro = intent.getStringExtra("RPRO");
        String dcc = intent.getStringExtra("DCC");
        String tecn = intent.getStringExtra("TECN");
//        String message6 = intent.getStringExtra("toro5");
//        String message7 = intent.getStringExtra("toro6");
//        String message8 = intent.getStringExtra("toro7");
        //
        //String message9 = intent.getStringExtra("toro8");





//////DATOS///////////////////////////////////////////////////////////
        TextView txtCorr = findViewById(R.id.txtCorr);
        txtCorr.setText(corral);
        TextView txtDel = findViewById(R.id.txtDel);
        txtDel.setText(del);
        TextView txtLech = findViewById(R.id.txtLech);
        txtLech.setText(leche);
        TextView txtLechp = findViewById(R.id.txtLechp);
        txtLechp.setText(lechp);
        TextView txtFcel = findViewById(R.id.txtFcel);
        txtFcel.setText(fcel);
        TextView txtVins = findViewById(R.id.txtVins);
        txtVins.setText(vins);
        TextView txtLact = findViewById(R.id.txtLact);
        txtLact.setText(lact);
        TextView txtRpro = findViewById(R.id.txtRpro);
        txtRpro.setText(rpro);
        TextView txtDcc = findViewById(R.id.txtDcc);
        txtDcc.setText(dcc);
        TextView txtTecn = findViewById(R.id.txtTecn);
        txtTecn.setText(tecn);

//////TORO Y CODIGO///////////////////////////////////////////////////////////
        TextView txtT2 = findViewById(R.id.txtT2);
        txtT2.setText(message3);
//        TextView textView = findViewById(R.id.textView8);
//        textView.setText(message3);
//        TextView textView9 = findViewById(R.id.textView9);
//        textView9.setText(message6);
        TextView textView10 = findViewById(R.id.textView10);
        textView10.setText(message4);
//        TextView textView11 = findViewById(R.id.textView11);
//        textView11.setText(message8);
        TextView textView12 = findViewById(R.id.textView12);
        textView12.setText(message5);
        //TextView textView4 = findViewById(R.id.textView44);
        //textView4.setText(message9);
/////numero de vaca///////////////////////////////////////////////////////////
        TextView txtNumVaca = findViewById(R.id.txtNumVaca);
        txtNumVaca.setText(message);
        TextView txtT1 = findViewById(R.id.txtT1);
        txtT1.setText(message2);


        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity();
            }
        });


    }

    public void openActivity() {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);

    }

}