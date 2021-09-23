package space.kuz.startcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button openCalculatorButton = findViewById(R.id.button_open_calculator);
        openCalculatorButton.setOnClickListener(v -> {
            Uri uri = Uri.parse("calculator://intent");
            Intent runCalculator = new Intent(Intent.ACTION_VIEW, uri);
            startActivity(runCalculator);
        });
    }
}