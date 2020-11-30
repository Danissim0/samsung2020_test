package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    Button solve;
    TextView answer;
    EditText num1, num2, num3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        solve = findViewById(R.id.solve);
        answer = findViewById(R.id.answer);
        num1 = findViewById(R.id.num1);
        num2 = findViewById(R.id.num2);
        num3 = findViewById(R.id.num3);
        solve.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        double a = Double.parseDouble(num1.getText().toString());
        double b = Double.parseDouble(num2.getText().toString());
        double c = Double.parseDouble(num3.getText().toString());
        if (a == 0)
            answer.setText("error");
        else {
            double d = b * b - 4 * a * c;
            if (d < 0)
                answer.setText("нет корней");
            else if (d == 0)
                answer.setText(String.valueOf((-b) / (2 * a)));
            else {
                double x1 = (-b + Math.sqrt(d)) / (2 * a);
                double x2 = (-b - Math.sqrt(d)) / (2 * a);
                answer.setText(String.format("%.2f %.2f", x1, x2));
            }
        }
    }
}
