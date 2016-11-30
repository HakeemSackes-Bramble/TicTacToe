package com.example.hakeemsackes_bramble.tictactoe;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class MainActivity extends AppCompatActivity {
    private EditText logInPosition;
    private Button posIsClicked;
    private TextView playerXorO;
    static int turns = 0;
    static final String[] player = {"X", "O"};
    HashMap<View, Integer> spaces = new HashMap<>();


    String[] board = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    public void thisHashmap() {
        spaces.put(findViewById(R.id.position_1), 0);
        spaces.put(findViewById(R.id.position_2), 1);
        spaces.put(findViewById(R.id.position_3), 2);
        spaces.put(findViewById(R.id.position_4), 3);
        spaces.put(findViewById(R.id.position_5), 4);
        spaces.put(findViewById(R.id.position_6), 5);
        spaces.put(findViewById(R.id.position_7), 6);
        spaces.put(findViewById(R.id.position_8), 7);
        spaces.put(findViewById(R.id.position_9), 8);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        thisHashmap();
    }

    protected void setPosition(View view) {
        int position = spaces.get(view);


    }

    protected void getposition(View view, int place) {

    }

    private void checkPosition(TextView space) {

        if (space.getText().equals("")) {
            space.setText(player[turns % 2]);
            MainActivity.turns++;
        } else {
            Toast.makeText(getBaseContext(), "Position already taken", Toast.LENGTH_SHORT).show();
        }
    }

    public void onSaveInstanceState(Bundle savedInstanceState) {

        super.onSaveInstanceState(savedInstanceState);
    }


}
