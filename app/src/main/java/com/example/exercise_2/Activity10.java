package com.example.exercise_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity10 extends AppCompatActivity {

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_10);

        final EditText n1 = (EditText) findViewById(R.id.pl1_input);

        play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().matches("")) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Activity10.this).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Null fields are not allowed!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                else {
                    Intent intent = new Intent(Activity10.this, Activity11.class);
                    intent.putExtra("Name1", n1.getText().toString());
                    startActivity(intent);
                }
            }
        });
    }
}
