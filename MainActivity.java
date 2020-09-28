package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {


    EditText bil_pertama, bil_kedua, operasi_bilangan;
    Button button;
    TextView Txthasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bil_pertama = findViewById(R.id.bil_pertama);
        bil_kedua = findViewById(R.id.bil_kedua);
        operasi_bilangan = findViewById(R.id.operasi_bilangan);
        button = findViewById(R.id.button);
        Txthasil  = findViewById(R.id.Txthasil);
    }


    public void Hasil(View a) {
        double Hasil_;
        int inputan_1 = Integer.parseInt(bil_pertama.getText().toString());
        int inputan_2 = Integer.parseInt(bil_kedua.getText().toString());
        String Aritmatika = operasi_bilangan.getText().toString();
        if (Aritmatika.equals("*")) {
            Hasil_ = inputan_1 * inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else if (Aritmatika.equals("/")) {
            Hasil_ = inputan_1 * inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else if (Aritmatika.equals("+")) {
            Hasil_ = inputan_1 + inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else if (Aritmatika.equals("-")) {
            Hasil_ = inputan_1 - inputan_2;
            Txthasil.setText(String.valueOf(Hasil_));
        } else {
            Txthasil.setText("Operasi Aritmatika Tidak Sesuai");
        }
    }
}
