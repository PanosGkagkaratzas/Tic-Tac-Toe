package com.example.exercise_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity5 extends AppCompatActivity implements View.OnClickListener {

    int player = 1;
    int states[];
    int flag=0;

    ImageButton image1, image2, image3, image4, image5, image6, image7, image8, image9;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_5);

        states = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};

        image1 = (ImageButton) findViewById(R.id.b1);
        image2 = (ImageButton) findViewById(R.id.b2);
        image3 = (ImageButton) findViewById(R.id.b3);
        image4 = (ImageButton) findViewById(R.id.b5);
        image5 = (ImageButton) findViewById(R.id.b6);
        image6 = (ImageButton) findViewById(R.id.b7);
        image7 = (ImageButton) findViewById(R.id.b9);
        image8 = (ImageButton) findViewById(R.id.b10);
        image9 = (ImageButton) findViewById(R.id.b11);

        image1.setOnClickListener((View.OnClickListener) this);
        image2.setOnClickListener((View.OnClickListener) this);
        image3.setOnClickListener((View.OnClickListener) this);
        image4.setOnClickListener((View.OnClickListener) this);
        image5.setOnClickListener((View.OnClickListener) this);
        image6.setOnClickListener((View.OnClickListener) this);
        image7.setOnClickListener((View.OnClickListener) this);
        image8.setOnClickListener((View.OnClickListener) this);
        image9.setOnClickListener((View.OnClickListener) this);

        Toast.makeText(this, "Player:  " + player, Toast.LENGTH_SHORT).show();
    }

    public void onClick(View v) {

        if(flag==0){
            changeText(v);
        }
        switch (v.getId()) {
            case R.id.b1:
                check_for_win(0);
                image1.setEnabled(false);
                break;
            case R.id.b2:
                check_for_win(1);
                image2.setEnabled(false);
                break;
            case R.id.b3:
                check_for_win(2);
                image3.setEnabled(false);
                break;
            case R.id.b5:
                check_for_win(3);
                image4.setEnabled(false);
                break;
            case R.id.b6:
                check_for_win(4);
                image5.setEnabled(false);
                break;
            case R.id.b7:
                check_for_win(5);
                image6.setEnabled(false);
                break;
            case R.id.b9:
                check_for_win(6);
                image7.setEnabled(false);
                break;
            case R.id.b10:
                check_for_win(7);
                image8.setEnabled(false);
                break;
            case R.id.b11:
                check_for_win(8);
                image9.setEnabled(false);
                break;
        }
    }


    private void check_for_win(int i) {

        Intent intent = getIntent();
        String name1 = intent.getExtras().getString("Name1");
        String name2 = intent.getExtras().getString("Name2");

        if (states[i] == 0) {
            states[i] = player;
        }

        if (states[0] == player && states[1] == player && states[2] == player
                || states[0] == player && states[3] == player && states[6] == player
                || states[0] == player && states[4] == player && states[8] == player
                || states[2] == player && states[5] == player && states[8] == player
                || states[6] == player && states[7] == player && states[8] == player
                || states[1] == player && states[4] == player && states[7] == player
                || states[3] == player && states[4] == player && states[5] == player
                || states[2] == player && states[4] == player && states[6] == player) {

            flag=1;
            if (player == 1) {
                player=2;
                AlertDialog alertDialog = new AlertDialog.Builder(Activity5.this).create();
                alertDialog.setTitle("TicTacToe");
                alertDialog.setMessage("Winner is: "+  name2  +"\nStart new game?");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Quit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity5.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent.putExtra("EXIT", true);
                                startActivity(intent);
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity5.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }
            else if (player == 2) {
                player=1;
                AlertDialog alertDialog = new AlertDialog.Builder(Activity5.this).create();
                alertDialog.setTitle("TicTacToe");
                alertDialog.setMessage("Winner is: "+  name1  +"\nStart new game?");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Quit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity5.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent.putExtra("EXIT", true);
                                startActivity(intent);
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity5.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }}
        else if (states[0] != 0 && states[1] != 0 && states[2] != 0 && states[3] != 0 && states[4] != 0
                && states[5] != 0 && states[6] != 0 && states[7] != 0 && states[8] != 0) {
            flag=1;
            AlertDialog alertDialog = new AlertDialog.Builder(Activity5.this).create();
            alertDialog.setTitle("TicTacToe");
            alertDialog.setMessage("Draw!\nStart new game?");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Quit",
                    new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(Activity5.this, MainActivity.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    intent.putExtra("EXIT", true);
                                    startActivity(intent);
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                            new DialogInterface.OnClickListener() {
                                public void onClick(DialogInterface dialog, int which) {
                                    Intent intent = new Intent(Activity5.this, MainActivity.class);
                                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                    startActivity(intent);
                                    finish();
                                    dialog.dismiss();
                                }
                            });
                    alertDialog.show();
        }
        else {
            Toast.makeText(this, "Player:  " + player, Toast.LENGTH_SHORT).show();
        }
    }



    private void changeText(View v) {
        ImageButton selected = (ImageButton) v;

        if (player == 1) {
                selected.setImageResource(R.drawable.player1);
                player = 2;
        } else if (player == 2) {
                selected.setImageResource(R.drawable.player2);
                player = 1;
        }
    }
}








