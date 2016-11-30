package com.example.hakeemsackes_bramble.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hakeemsackes-bramble on 9/24/16.
 */
public class BoardArray extends AppCompatActivity{
    //TextView text = (TextView) findViewById(ids[i]);

    public List<String> board(int[] id) {
        TextView text;
        List<String> boardStr = new ArrayList<>();
        Board game = new Board();
        for (int i = 0; i < id.length; i++) {
            text = (TextView) findViewById(game.ids[i]);
            boardStr.add(text.getText().toString());
        }
        return boardStr;
    }
}
