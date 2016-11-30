package com.example.hakeemsackes_bramble.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by hakeemsackes-bramble on 9/24/16.
 */
public class Winner extends AppCompatActivity{
//    public static void main(String[] args) {
////        AppCompatActivity find = new AppCompatActivity();
//        Log.d("Winner", find.toString());
//        Board game = new Board();
//        for (int i = 0; i < game.ids.length; i++) {
//            String text = (String)findViewById(game.ids[i]).getTag().toString();
//            System.out.println(text);
//        }
//    }

    boolean isWinner(int[] ids){
        ArrayList<String> setup = new ArrayList<>();
        for (int i = 0; i < ids.length; i++) {
            TextView text1 = (TextView) findViewById(ids[i]);
            String text = (String) text1.getText();
            setup.add(text);
        }
        boolean didSomeOneWin = false;

        for(int i = 0; i<3 ; i++){

            if (!didSomeOneWin) {
                boolean winVertical = (setup.get(i).equals(setup.get(i + 3)) && (setup.get(i + 3).equals(setup.get(i + 6))));
                boolean isEmpty = !(setup.get(i).equals(""));
                didSomeOneWin = winVertical && isEmpty;

            }if (!didSomeOneWin) {
                boolean winHorizontal = (setup.get(i * 3).equals(setup.get((i * 3) + 1)) && (setup.get((i * 3) + 1).equals(setup.get((i * 3) + 2))));
                boolean isitEmpty = !(setup.get(i * 3).equals(""));
                didSomeOneWin = winHorizontal && isitEmpty;

            }if (!didSomeOneWin) {
                boolean winDiagonal = (setup.get(i).equals(setup.get(4)) && (setup.get(4).equals(setup.get(8 - i))));
                boolean isEmpty = !(setup.get(i).equals(""));
                didSomeOneWin = winDiagonal && isEmpty;
            }
        }
        return didSomeOneWin;
    }
}
