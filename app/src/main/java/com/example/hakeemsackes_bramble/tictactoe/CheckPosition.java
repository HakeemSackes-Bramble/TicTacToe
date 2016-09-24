package com.example.hakeemsackes_bramble.tictactoe;

import android.content.Context;
import android.widget.TextView;
import android.widget.Toast;


/**
 * Created by hakeemsackes-bramble on 9/24/16.
 */
public class CheckPosition {
     static  void checkPosition (TextView space, String[] player , int turns, Context cont){
        if (space.getText().equals("")){
            space.setText(player[turns % 2]);
            turns++;
        }else {
            Toast.makeText(cont,"Position already taken", Toast.LENGTH_SHORT).show();
        }
    }
}
