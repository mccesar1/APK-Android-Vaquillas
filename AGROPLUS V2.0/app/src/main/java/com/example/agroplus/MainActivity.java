package com.example.agroplus;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.Activity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.MediaPlayer;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        commonDocumentDirPath();
        verifyStoragePermissions(this);
    }
//ABRIR REGUNDA PANTALLA --------------------------------------------------------------------------------------------------------------------
    public void openActivity2() throws IOException {
        Intent intent = new Intent(this, MainActivity2.class);

        EditText txtNumVaca = findViewById(R.id.editTxtNum);
        String numero = String.valueOf(txtNumVaca.getText());

        TextView txtToros = findViewById(R.id.txtToros);
        String toro = String.valueOf(txtToros.getText());

        intent.putExtra("numero", numero);
        intent.putExtra("toro", toro);
        TextView editTxtNum = findViewById(R.id.editTxtNum);

        String cvsSplitBy2 = ",";
        String line2 = "";
        File dir2 = commonDocumentDirPath();

        try {

            String csvFile2 = dir2 + "/vacas.csv";
            BufferedReader br2 = null;
            br2 = new BufferedReader(new FileReader(csvFile2));
            String[] toro2 = new String[0];
            while ((line2 = br2.readLine()) != null) {// read line by line
                toro2 = line2.split(cvsSplitBy2);
                if (toro2[0].equals(editTxtNum.getText().toString())) {
                    intent.putExtra("CORR", toro2[1]);
                    intent.putExtra("DEL", toro2[2]);
                    intent.putExtra("LECH", toro2[3]);
                    intent.putExtra("LECHP", toro2[4]);
                    intent.putExtra("FCEL", toro2[6]);
                    intent.putExtra("VINS", toro2[7]);
                    intent.putExtra("LACT", toro2[8]);
                    intent.putExtra("RPRO", toro2[9]);
                    intent.putExtra("DCC", toro2[10]);
                    intent.putExtra("TECN", toro2[11]);

                    intent.putExtra("toro2", toro2[12]);
                    intent.putExtra("toro3", toro2[13]);
                    intent.putExtra("toro4", toro2[14]);
                    //intent.putExtra("toro5", toro2[4]);
                    //intent.putExtra("toro6", toro2[5]);
                    //intent.putExtra("toro7", toro2[6]);


                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //////////////////////////////////////////////////////

        try {

            String csvFile3 = dir2 + "/VAQUILLAS.csv";
            BufferedReader br3 = null;
            br3 = new BufferedReader(new FileReader(csvFile3));
            String[] toro2 = new String[0];
            while ((line2 = br3.readLine()) != null) {// read line by line
                toro2 = line2.split(cvsSplitBy2);
                if (toro2[0].equals(editTxtNum.getText().toString())) {
                    intent.putExtra("CORR", toro2[1]);
                    intent.putExtra("DEL", toro2[2]);
                    intent.putExtra("LECH", toro2[3]);
                    intent.putExtra("LECHP", toro2[4]);
                    intent.putExtra("FCEL", toro2[6]);
                    intent.putExtra("VINS", toro2[7]);
                    intent.putExtra("LACT", toro2[8]);
                    intent.putExtra("RPRO", toro2[9]);
                    intent.putExtra("DCC", toro2[10]);
                    intent.putExtra("TECN", toro2[11]);

                    intent.putExtra("toro2", toro2[12]);
                    intent.putExtra("toro3", toro2[13]);
                    intent.putExtra("toro4", toro2[14]);

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        startActivity(intent);

    }

    private static final int REQUEST_EXTERNAL_STORAGE = 1;
    private static String[] PERMISSIONS_STORAGE = {
            Manifest.permission.READ_EXTERNAL_STORAGE,
            Manifest.permission.WRITE_EXTERNAL_STORAGE
    };

    /**
     * Checks if the app has permission to write to device storage
     *
     * If the app does not has permission then the user will be prompted to grant permissions
     *
     * @param activity
     */
    public static void verifyStoragePermissions(Activity activity) {
        // Check if we have write permission
        int permission = ActivityCompat.checkSelfPermission(activity, Manifest.permission.READ_EXTERNAL_STORAGE);

        if (permission != PackageManager.PERMISSION_GRANTED) {
            // We don't have permission so prompt the user
            ActivityCompat.requestPermissions(
                    activity,
                    PERMISSIONS_STORAGE,
                    REQUEST_EXTERNAL_STORAGE

            );
        }
    }




    public   File commonDocumentDirPath(){
        File dir = null ;
        String folder_main = "/com.example.agroplus";
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            dir = new File (Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS)+ folder_main );
            // dir = new File(Environment.getExternalStorageDirectory() + folder_main);
            dir.mkdir();
        } else {
            dir = new File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOCUMENTS) + folder_main);
            dir.mkdir();
        }
        return  dir ;
    }

    public void createFolder(){
        String folder_main = "com.example.agroplus";

        File folder = new File(Environment.getExternalStorageDirectory() + "/Android/data/"+folder_main);


        String ruta = Environment.getExternalStorageDirectory() + "/Android/data/com.example.agroplus";
        boolean success = true;
        if (!folder.exists()) {
            success = folder.mkdirs();
        }
        if (success) {
            Toast.makeText(this, "Carpeta creada", Toast.LENGTH_SHORT).show();
        } else  {
            Toast.makeText(this, "Carpeta no creada " + ruta, Toast.LENGTH_SHORT).show();
        }
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


    public void readCSV(View view) {

        TextView txtDatos = findViewById(R.id.txtDatos);
        txtDatos.setText("VACAS");
        TextView editTxtNum = findViewById(R.id.editTxtNum);
        TextView txtToros = findViewById(R.id.txtToros);
        TextView txtDatos2 = findViewById(R.id.textView7);
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        txtToros.setText("");
        txtDatos2.setText("ID NO LOCALIZADO");
        File dir = commonDocumentDirPath();
        String csvFile =dir +"/vacas.csv";


        try {
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {// read line by line
                String[] toro = line.split(cvsSplitBy); //split line by comma
                if (toro[0].equals(editTxtNum.getText().toString())) {//if the first column of the CSV file is equal to the number entered
                    txtToros.setText(toro[12]+" \n"+toro[13]+" \n"+toro[14]);//set the second column of the CSV file to the text view
                   // txtToros.setText(toro[12]+"   "+toro[2]+"\n"+toro[13]+"   "+toro[4]+"\n"+toro[14]+"   "+toro[6]);//set the second column of the CSV file to the text view
                    txtDatos2.setText("OK");
                    MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.okey);
                    mediaPlayer2.start();
                    openActivity2();
                }else if(toro[0].equals("")) {
                    txtDatos2.setText("ID no localizado");
                    txtToros.setText("");
                }
            }
            if (txtDatos2.getText().toString().equals("ID NO LOCALIZADO")) {
                MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.ide);
                mediaPlayer2.start();
            }
        } catch (FileNotFoundException e) {//catch exception
            e.printStackTrace();//print exception
            MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.filenot);
            txtDatos2.setText("ARCHIVO NO LOCALIZADO");
            mediaPlayer2.start();
        } catch (IOException e) {//catch exception
            e.printStackTrace();//print exception
            MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.filenot);
            mediaPlayer2.start();
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

        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        txtToros.setText("");
        txtDatos2.setText("ID NO LOCALIZADO");
        File dir = commonDocumentDirPath();
        String csvFile =dir +"/VAQUILLAS.csv";

        try {
           br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {
                String[] toro = line.split(cvsSplitBy);
                if (toro[0].equals(editTxtNum.getText().toString())) {
                    txtToros.setText(toro[12]+" \n"+toro[13]+" \n"+toro[14]);
                    //txtToros.setText(toro[1]+"   "+toro[2]+"\n"+toro[3]+"   "+toro[4]+"\n"+toro[5]+"   "+toro[6]);//set the second column of the CSV file to the text view
                    txtDatos2.setText("OK");
                    MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.okey);
                    mediaPlayer2.start();
                    openActivity2();
                }else if(toro[0].equals("")) {
                    txtDatos2.setText("ID no localizado");
                    txtToros.setText("");
                }
            }
            if (txtDatos2.getText().toString().equals("ID NO LOCALIZADO")) {
                MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.ide);
                mediaPlayer2.start();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.filenot);
            txtDatos2.setText("ARCHIVO NO LOCALIZADO");
            mediaPlayer2.start();
        } catch (IOException e) {
            e.printStackTrace();
            MediaPlayer mediaPlayer2 = MediaPlayer.create(this, R.raw.filenot);
            mediaPlayer2.start();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}