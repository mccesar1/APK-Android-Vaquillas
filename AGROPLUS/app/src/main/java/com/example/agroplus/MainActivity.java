package com.example.agroplus;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClickVCS(View view) {
        // Button btnVCS = findViewById(R.id.btnVCS);
        TextView txtDatos = findViewById(R.id.txtDatos);
        txtDatos.setText("VACAS");



    }

    public void onClickVQS(View view) {
        // Button btnVQS = findViewById(R.id.btnVQS);

        TextView txtDatos = findViewById(R.id.txtDatos);

        txtDatos.setText("VAQUILLAS");
    }

    public void onClick1(View view) {
        Button btn1 = findViewById(R.id.btn1);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("1");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "1");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick2(View view) {
        Button btn2 = findViewById(R.id.btn2);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("2");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "2");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick3(View view) {
        Button btn3 = findViewById(R.id.btn3);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("3");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "3");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick4(View view) {
        Button btn4 = findViewById(R.id.btn4);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("4");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "4");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick5(View view) {
        Button btn5 = findViewById(R.id.btn5);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("5");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "5");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick6(View view) {
        Button btn6 = findViewById(R.id.btn6);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("6");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "6");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick7(View view) {
        Button btn7 = findViewById(R.id.btn7);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("7");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "7");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick8(View view) {
        Button btn8 = findViewById(R.id.btn8);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("8");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "8");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick9(View view) {
        Button btn9 = findViewById(R.id.btn9);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("9");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "9");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClick0(View view) {
        Button btn0 = findViewById(R.id.btn0);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        if (editTxtNum.getText().length() == 1 && editTxtNum.getText().toString().equals("0")) {
            editTxtNum.setText("0");
        } else {
            editTxtNum.setText(editTxtNum.getText() + "0");
        }
        if (editTxtNum.getText().length() > 5) {
            editTxtNum.setText("0");
        }
    }

    public void onClickDelete(View view) {
        TextView txtDatos = findViewById(R.id.textView7);
        Button btnDelete = findViewById(R.id.btnDelete);
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        TextView txtToros = findViewById(R.id.txtToros);
        txtToros.setText("");
        editTxtNum.setText("0");
        txtDatos.setText("Mensajes");
    }

    //read CSV file
    public void readCSV(View view) {
        TextView txtDatos = findViewById(R.id.txtDatos);
        txtDatos.setText("VACAS");

        TextView editTxtNum = findViewById(R.id.editTxtNum);
        TextView txtToros = findViewById(R.id.txtToros);
        TextView txtDatos2 = findViewById(R.id.textView7);
        //String csvFile ="/vacas.csv";
        InputStream csvFile = getResources().openRawResource(R.raw.vacas);
        //System.out.println(Environment.getExternalStorageDirectory().toString() );
        BufferedReader br = null;//read file
        String line = "";//line
        String cvsSplitBy = ",";//split by comma
        txtToros.setText("");
        txtDatos2.setText("No encontrado");
        try {
            br = new BufferedReader(new InputStreamReader(csvFile)); //read CSV file
            while ((line = br.readLine()) != null) {// read line by line
           // br.readLine()

                // use comma as separator
                String[] country = line.split(cvsSplitBy); //split line by comma
                if (country[0].equals(editTxtNum.getText().toString())) {//if the first column of the CSV file is equal to the number entered
                    txtToros.setText(country[1]+"   "+country[2]+"\n"+country[3]+"   "+country[4]+"\n"+country[5]+"   "+country[6]);//set the second column of the CSV file to the text view
                    //txtToros.setText(country[2]);//set the second column of the CSV file to the text view
                    txtDatos2.setText("Datos localizados");
                }else if(country[0].equals("")) {
                    txtDatos2.setText("Datos no localizados");
                    txtToros.setText("");
                }
            }
        } catch (FileNotFoundException e) {//catch exception
            e.printStackTrace();//print exception
            Toast.makeText(this, "Archivo no encontrado"+ csvFile, Toast.LENGTH_SHORT).show();//show message
        } catch (IOException e) {//catch exception
            e.printStackTrace();//print exception
            Toast.makeText(this, "Error de lectura"+ csvFile, Toast.LENGTH_SHORT).show();//show message
        } finally {
            if (br != null) {
                try {
                    br.close();//close file
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public void readCSVaquillas(View view) {
        TextView txtDatos = findViewById(R.id.txtDatos);
        txtDatos.setText("VAQUILLAS");

        TextView editTxtNum = findViewById(R.id.editTxtNum);
        TextView txtToros = findViewById(R.id.txtToros);
        TextView txtDatos2 = findViewById(R.id.textView7);
        //String csvFile ="/vacas.csv";
        InputStream csvFile = getResources().openRawResource(R.raw.vacas);
        //System.out.println(Environment.getExternalStorageDirectory().toString() );
        BufferedReader br = null;//read file
        String line = "";//line
        String cvsSplitBy = ",";//split by comma
        txtToros.setText("");
        txtDatos2.setText("No encontrado");
        try {
            br = new BufferedReader(new InputStreamReader(csvFile)); //read CSV file
            while ((line = br.readLine()) != null) {// read line by line
                // br.readLine()

                // use comma as separator
                String[] country = line.split(cvsSplitBy); //split line by comma
                if (country[0].equals(editTxtNum.getText().toString())) {//if the first column of the CSV file is equal to the number entered
                    txtToros.setText(country[1]+"   "+country[2]+"\n"+country[3]+"   "+country[4]+"\n"+country[5]+"   "+country[6]);//set the second column of the CSV file to the text view
                    //txtToros.setText(country[2]);//set the second column of the CSV file to the text view
                    txtDatos2.setText("Datos localizados");
                }else if(country[0].equals("")) {
                    txtDatos2.setText("Datos no localizados");
                    txtToros.setText("");
                }
            }
        } catch (FileNotFoundException e) {//catch exception
            e.printStackTrace();//print exception
            Toast.makeText(this, "Archivo no encontrado"+ csvFile, Toast.LENGTH_SHORT).show();//show message
        } catch (IOException e) {//catch exception
            e.printStackTrace();//print exception
            Toast.makeText(this, "Error de lectura"+ csvFile, Toast.LENGTH_SHORT).show();//show message
        } finally {
            if (br != null) {
                try {
                    br.close();//close file
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }


}