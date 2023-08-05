package com.example.medicalapplicationsystem;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Homepage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);

        CardView emergency = findViewById(R.id.cardView5);
        CardView firstaid = findViewById(R.id.cardView4);
        emergency.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEmergency();
            }
        });

        firstaid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openfirstaid();}
        }
        );
    }
    public void openEmergency()
    {
        Intent intent = new Intent(this,Emergency.class);
        startActivities(new Intent[]{intent} );
    }

    public void openfirstaid()
    {
        Intent intent = new Intent(this,firstaid.class);
        startActivities(new Intent[]{intent});
    }
}