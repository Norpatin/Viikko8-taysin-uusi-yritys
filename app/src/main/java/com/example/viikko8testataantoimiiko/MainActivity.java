package com.example.viikko8testataantoimiiko;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    private EditText EuroInput1;
    private TextView ResultText1;
    private float USDButton;
    private float GDPButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.EuroInput), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        EuroInput1 = findViewById(R.id.EuroInput);
        ResultText1 = findViewById(R.id.ResultText);
        USDButton = 1.05F;
        GDPButton = 0.83F;
    }

    public void USDButtonWork(View view) {
        String input = EuroInput1.getText().toString();
        int money = Integer.parseInt(input);
        float moneyChange = USDButton * money;
        String formattedMoneyChange = String.format("%.02f", moneyChange);
        ResultText1.setText("$" + formattedMoneyChange);
        //System.out.println("Hellou!!!");
        //float number = Float.parseFloat(String.valueOf(EuroInput));
        //float change = number * USDButton;
        //ResultText.setTextSize(change);
    }

    public void GDPButtonWork(View view) {
        String input = EuroInput1.getText().toString();
        int money = Integer.parseInt(input);
        float moneyChange = GDPButton * money;
        String formattedMoneyChange = String.format("%.02f", moneyChange);
        ResultText1.setText("£" + formattedMoneyChange);
        //float number = Float.parseFloat(String.valueOf(EuroInput));
        //float change = number * GDPButton;
        //ResultText.setTextSize(change);
    }
}