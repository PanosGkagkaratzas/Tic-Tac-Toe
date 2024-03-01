package com.example.exercise_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Activity4 extends AppCompatActivity {

    private Button play;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_4);

        final EditText n1 = (EditText) findViewById(R.id.pl1_input);
        final EditText n2 = (EditText) findViewById(R.id.pl2_input);

        play = (Button) findViewById(R.id.play);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (n1.getText().toString().matches("") || n2.getText().toString().matches("")) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Activity4.this).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Null fields are not allowed!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                } else if (n1.getText().toString().matches(n2.getText().toString())) {
                    AlertDialog alertDialog = new AlertDialog.Builder(Activity4.this).create();
                    alertDialog.setTitle("Alert");
                    alertDialog.setMessage("Players must have different names!");
                    alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Ok",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
                }
                else {
                    Intent intent = new Intent(Activity4.this, Activity5.class);
                    intent.putExtra("Name1", n1.getText().toString());
                    intent.putExtra("Name2", n2.getText().toString());
                    startActivity(intent);

                }
            }
        });

    }
}


