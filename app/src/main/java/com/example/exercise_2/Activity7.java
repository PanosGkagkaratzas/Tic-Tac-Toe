package com.example.exercise_2;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class Activity7 extends AppCompatActivity implements View.OnClickListener{

    int player = 1;
    int states[];
    static int flag=0;

    ImageButton image1, image2, image3, image4, image5, image6, image7, image8, image9, image10, image11, image12, image13, image14, image15, image16;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_7);

        states = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        image1 = (ImageButton) findViewById(R.id.b1);
        image2 = (ImageButton) findViewById(R.id.b2);
        image3 = (ImageButton) findViewById(R.id.b3);
        image4 = (ImageButton) findViewById(R.id.b4);
        image5 = (ImageButton) findViewById(R.id.b5);
        image6 = (ImageButton) findViewById(R.id.b6);
        image7 = (ImageButton) findViewById(R.id.b7);
        image8 = (ImageButton) findViewById(R.id.b8);
        image9 = (ImageButton) findViewById(R.id.b9);
        image10 = (ImageButton) findViewById(R.id.b10);
        image11 = (ImageButton) findViewById(R.id.b11);
        image12 = (ImageButton) findViewById(R.id.b12);
        image13 = (ImageButton) findViewById(R.id.b13);
        image14 = (ImageButton) findViewById(R.id.b14);
        image15 = (ImageButton) findViewById(R.id.b15);
        image16 = (ImageButton) findViewById(R.id.b16);

        image1.setOnClickListener((View.OnClickListener) this);
        image2.setOnClickListener((View.OnClickListener) this);
        image3.setOnClickListener((View.OnClickListener) this);
        image4.setOnClickListener((View.OnClickListener) this);
        image5.setOnClickListener((View.OnClickListener) this);
        image6.setOnClickListener((View.OnClickListener) this);
        image7.setOnClickListener((View.OnClickListener) this);
        image8.setOnClickListener((View.OnClickListener) this);
        image9.setOnClickListener((View.OnClickListener) this);
        image10.setOnClickListener((View.OnClickListener) this);
        image11.setOnClickListener((View.OnClickListener) this);
        image12.setOnClickListener((View.OnClickListener) this);
        image13.setOnClickListener((View.OnClickListener) this);
        image14.setOnClickListener((View.OnClickListener) this);
        image15.setOnClickListener((View.OnClickListener) this);
        image16.setOnClickListener((View.OnClickListener) this);

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
            case R.id.b4:
                check_for_win(3);
                image4.setEnabled(false);
                break;
            case R.id.b5:
                check_for_win(4);
                image5.setEnabled(false);
                break;
            case R.id.b6:
                check_for_win(5);
                image6.setEnabled(false);
                break;
            case R.id.b7:
                check_for_win(6);
                image7.setEnabled(false);
                break;
            case R.id.b8:
                check_for_win(7);
                image8.setEnabled(false);
                break;
            case R.id.b9:
                check_for_win(8);
                image9.setEnabled(false);
                break;
            case R.id.b10:
                check_for_win(9);
                image10.setEnabled(false);
                break;
            case R.id.b11:
                check_for_win(10);
                image11.setEnabled(false);
                break;
            case R.id.b12:
                check_for_win(11);
                image12.setEnabled(false);
                break;
            case R.id.b13:
                check_for_win(12);
                image13.setEnabled(false);
                break;
            case R.id.b14:
                check_for_win(13);
                image14.setEnabled(false);
                break;
            case R.id.b15:
                check_for_win(14);
                image15.setEnabled(false);
                break;
            case R.id.b16:
                check_for_win(15);
                image16.setEnabled(false);
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
                || states[4] == player && states[5] == player && states[6] == player
                || states[8] == player && states[9] == player && states[10] == player
                || states[0] == player && states[4] == player && states[8] == player
                || states[1] == player && states[5] == player && states[9] == player
                || states[2] == player && states[6] == player && states[10] == player
                || states[0] == player && states[5] == player && states[10] == player
                || states[2] == player && states[5] == player && states[8] == player

                || states[4] == player && states[8] == player && states[12] == player
                || states[5] == player && states[9] == player && states[13] == player
                || states[6] == player && states[10] == player && states[14] == player
                || states[7] == player && states[11] == player && states[15] == player
                || states[3] == player && states[7] == player && states[11] == player

                || states[1] == player && states[2] == player && states[3] == player
                || states[5] == player && states[6] == player && states[7] == player
                || states[9] == player && states[10] == player && states[11] == player
                || states[13] == player && states[14] == player && states[15] == player
                || states[12] == player && states[13] == player && states[14] == player

                || states[4] == player && states[9] == player && states[14] == player
                || states[5] == player && states[10] == player && states[15] == player
                || states[1] == player && states[6] == player && states[11] == player
                || states[6] == player && states[9] == player && states[12] == player
                || states[3] == player && states[6] == player && states[9] == player
                || states[7] == player && states[10] == player && states[13] == player) {

            flag=1;

            if (player == 1) {
                player=2;
                AlertDialog alertDialog = new AlertDialog.Builder(Activity7.this).create();
                alertDialog.setTitle("TicTacToe");
                alertDialog.setMessage("Winner is: "+  name2  +"\nStart new game?");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Quit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity7.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent.putExtra("EXIT", true);
                                startActivity(intent);
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity7.this, MainActivity.class);
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
                AlertDialog alertDialog = new AlertDialog.Builder(Activity7.this).create();
                alertDialog.setTitle("TicTacToe");
                alertDialog.setMessage("Winner is: "+  name1  +"\nStart new game?");
                alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Quit",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity7.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                intent.putExtra("EXIT", true);
                                startActivity(intent);
                                dialog.dismiss();
                            }
                        });
                alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                        new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                Intent intent = new Intent(Activity7.this, MainActivity.class);
                                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK |Intent.FLAG_ACTIVITY_CLEAR_TOP);
                                startActivity(intent);
                                finish();
                                dialog.dismiss();
                            }
                        });
                alertDialog.show();
            }}
        else if (states[0] != 0 && states[1] != 0 && states[2] != 0 && states[3] != 0 && states[4] != 0
                && states[5] != 0 && states[6] != 0 && states[7] != 0 && states[8] != 0 && states[9] != 0
                && states[10] != 0 && states[11] != 0 && states[12] != 0 && states[13] != 0 && states[14] != 0
                && states[15] != 0) {

            flag=1;
            AlertDialog alertDialog = new AlertDialog.Builder(Activity7.this).create();
            alertDialog.setTitle("TicTacToe");
            alertDialog.setMessage("Draw!\nStart new game?");
            alertDialog.setButton(AlertDialog.BUTTON_NEUTRAL, "Quit",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Activity7.this, MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            intent.putExtra("EXIT", true);
                            startActivity(intent);
                            dialog.dismiss();
                        }
                    });
            alertDialog.setButton(AlertDialog.BUTTON_POSITIVE, "Yes",
                    new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Intent intent = new Intent(Activity7.this, MainActivity.class);
                            intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
                            startActivity(intent);
                            finish();
                            dialog.dismiss();
                        }
                    });
            alertDialog.show();
        } else {
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
