package com.example.hakeemsackes_bramble.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hakeemsackes-bramble on 9/19/16.
 */
public class Board extends AppCompatActivity {
    static int[] ids = {
            R.id.position_1,
            R.id.position_2,
            R.id.position_3,
            R.id.position_4,
            R.id.position_5,
            R.id.position_6,
            R.id.position_7,
            R.id.position_8,
            R.id.position_9
    };
    //TextView text = (TextView) findViewById(ids[i]);

     List<String> board(int[] id) {
        TextView text;
        List<String> boardStr = new ArrayList<>();
        for (int i = 0; i < id.length; i++) {
            text = (TextView) findViewById(ids[i]);
            boardStr.add(text.getText().toString());
        }
        return boardStr;
    }

}
