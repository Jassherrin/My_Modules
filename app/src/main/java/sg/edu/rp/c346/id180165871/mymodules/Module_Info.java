package sg.edu.rp.c346.id180165871.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Module_Info extends AppCompatActivity {
    TextView tvAnswer;
    TextView tvAnswer1;
    TextView tvAnswer2;
    TextView tvAnswer3;
    TextView tvAnswer4;
    TextView tvAnswer5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module__info);
        tvAnswer = findViewById(R.id.textView);
        Intent intentReceived = getIntent();
        String value = intentReceived.getIntExtra("value", "null");
        tvAnswer.setText(value);
        tvAnswer1 = findViewById(R.id.textView2);
        Intent intentReceived = getIntent();
        String value1 = intentReceived.getIntExtra("value", "null");
        tvAnswer1.setText(value1);
        tvAnswer2 findViewById(R.id.textView3);
        Intent intentReceived = getIntent();
        String value2 = intentReceived.getIntExtra("value", "null");
        tvAnswer3.setText(value2);
        tvAnswer3 = findViewById(R.id.textView4);
        Intent intentReceived = getIntent();
        String value3 = intentReceived.getIntExtra("value", "null");
        tvAnswer4.setText(value3);
        tvAnswer4 = findViewById(R.id.textView5);
        Intent intentReceived = getIntent();
        String value4 = intentReceived.getIntExtra("value", "null");
        tvAnswer5.setText(value4);
        tvAnswer5 = findViewById(R.id.textView6);
        Intent intentReceived = getIntent();
        String value5 = intentReceived.getIntExtra("value", "null");
        tvAnswer5.setText(value5);

    }
}
