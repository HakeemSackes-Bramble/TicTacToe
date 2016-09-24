package com.example.hakeemsackes_bramble.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText logInPosition;
    private Button posIsClicked;
    private TextView playerXorO;
    static int turns = 0;
    static final String[] player = {"X", "O"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

     protected void setPosition(View view) {
        playerXorO = (TextView) findViewById(view.getId());
        checkPosition(playerXorO);


    }
    private void checkPosition(TextView space) {
        if (space.getText().equals("")) {
            space.setText(player[turns % 2]);
            MainActivity.turns++;
            System.out.println();
        } else {
            Toast.makeText(getBaseContext(), "Position already taken", Toast.LENGTH_SHORT).show();
        }
    }


}
