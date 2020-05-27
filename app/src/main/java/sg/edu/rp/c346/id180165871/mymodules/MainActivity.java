package sg.edu.rp.c346.id180165871.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tm1;
    TextView tm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tm1=findViewById(R.id.textViewM1);
        tm2=findViewById(R.id.textViewM2);

        tm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Module_Info.class);
                intent.putExtra("value", "Module Code: C346");
                intent.putExtra("value1", "Module Name: Android Programming");
                intent.putExtra("value2", "Academic Year: 2020");
                intent.putExtra("value3", "Semester: 1");
                intent.putExtra("value4", "Module Credit: 4");
                intent.putExtra("value5", "Venue: W66M");
                startActivity(intent);
            }
        });

        tm2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Module_Info.class);
                intent.putExtra("value", "Module Code: C349");
                intent.putExtra("value1", "Module Name: iPad Programming");
                intent.putExtra("value2", "Academic Year: 2020");
                intent.putExtra("value3", "Semester: 1");
                intent.putExtra("value4", "Module Credit: 4");
                intent.putExtra("value5", "Venue: W66L");
                startActivity(intent);
            }
        });

    }
}
