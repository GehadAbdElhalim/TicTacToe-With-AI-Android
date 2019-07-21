package com.example.tictactoe;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,con,easy,medium,hard;
    TextView score;
    TextView result;
    boolean e = false;
    boolean m = false;
    boolean h = false;
    int X = 0;
    int O = 0;
    boolean gameEneded = false;
    int turn;
    int[] matrix = new int[]{0,0,0,
                             0,0,0,
                             0,0,0};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        score = (TextView) findViewById(R.id.score);
        result = (TextView) findViewById(R.id.result);

        con = (Button) findViewById(R.id.con);
        con.setEnabled(false);

        easy = (Button) findViewById(R.id.easy);
        medium = (Button) findViewById(R.id.medium);
        hard = (Button) findViewById(R.id.hard);


        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);

        turn = 1;

        refresh();

        easy.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e = true;
                m = false;
                h = false;

                easy.setEnabled(false);
                medium.setEnabled(false);
                hard.setEnabled(false);

                score.setText("3 ways to win");

                activateBoard();

            }
        });

        medium.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e = true;
                m = true;
                h = false;

                easy.setEnabled(false);
                medium.setEnabled(false);
                hard.setEnabled(false);

                score.setText("2 ways to win");

                activateBoard();
            }
        });

        hard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                e = true;
                m = true;
                h = true;

                easy.setEnabled(false);
                medium.setEnabled(false);
                hard.setEnabled(false);

                score.setText("u shall not pass");

                activateBoard();
            }
        });

        con.setOnClickListener(new View.OnClickListener(){
                @Override
                public void onClick(View v){

                    refresh();
                    easy.setEnabled(true);
                    medium.setEnabled(true);
                    hard.setEnabled(true);
                    e = false;
                    m = false;
                    h = false;
                    con.setVisibility(View.GONE);
                    con.setEnabled(false);
                }
            });






        b1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b1.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(0,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                }
//                    else {
//                        turn = 1;
//                        put(0,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b2.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(1,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(1,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b3.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(2,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(2,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b4.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(3,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(3,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b5.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(4,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(4,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b6.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(5,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(5,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b7.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(6,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(6,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b8.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(7,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(7,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });

        b9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(b9.getText().toString().equals(""))
                {
//                    if (turn == 1) {
//                        turn = 2;
                        put(8,1);
                        endgame(matrix);
                    if (gameEneded == false) {
                        AI(matrix);
                        endgame(matrix);
                    }
//                    }
//                    else {
//                        turn = 1;
//                        put(8,2);
//                    }
//                    endgame(matrix);
                }
                else {
                    Toast.makeText(MainActivity.this,"you can't play in this cell",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void endgame(int[] matrix)
    {
        boolean end = false;

        // checking the diagonals
        if (matrix[0] == matrix[4] && matrix[4]==matrix[8] && matrix[8] == 1)
        {
            result.setText("u win \n :)");
            end = true;
            gameEneded = true;
            X++;
        }
        else if (matrix[2] == matrix[4] && matrix[4]==matrix[6] && matrix[6] == 1)
        {
            result.setText("u win \n :)");
            end = true;
            gameEneded = true;
            X++;
        }
        else if (matrix[0] == matrix[4] && matrix[4]==matrix[8] && matrix[8] == 2)
        {
            result.setText("u lose \n :(");
            end = true;
            gameEneded = true;
            O++;
        }
        else if (matrix[2] == matrix[4] && matrix[4]==matrix[6] && matrix[6] == 2)
        {
            result.setText("u lose \n :(");
            end = true;
            gameEneded = true;
            O++;
        }
        //checking the horizontal
        if (end == false){
        for(int i = 0 ; i<=6 ; i+=3)
        {
            if (matrix[i] == matrix[i+1] && matrix[i+1]==matrix[i+2] && matrix[i+2] == 1)
            {
                result.setText("u win \n :)");
                end = true;
                gameEneded = true;
                X++;
                break;
            }
            else if (matrix[i] == matrix[i+1] && matrix[i+1]==matrix[i+2] && matrix[i+2] == 2)
            {
                result.setText("u lose \n :(");
                end = true;
                gameEneded = true;
                O++;
                break;
            }
        }}
        //checking the vertical
        if (end == false){
        for(int j = 0 ; j<= 2 ; j++)
        {
            if (matrix[j] == matrix[j+3] && matrix[j+3]==matrix[j+6] && matrix[j+6] == 1)
            {
                result.setText("u win \n :)");
                end = true;
                gameEneded = true;
                X++;
                break;
            }
            else if (matrix[j] == matrix[j+3] && matrix[j+3]==matrix[j+6] && matrix[j+6] == 2)
            {
                result.setText("u lose \n :(");
                end = true;
                gameEneded = true;
                O++;
                break;
            }
        }}
        //a draw
        for (int i = 0 ; i <matrix.length ; i++){
            if (matrix[i] == 0){
                break;
            }
            else if (i == 8 && matrix[i] != 0)
            {
                result.setText("Draw !\n -_-");
                gameEneded = true;
                end = true;
                break;
            }
        }
        //disabling the buttons
        if (end == true)
        {
            b1.setEnabled(false);
            b2.setEnabled(false);
            b3.setEnabled(false);
            b4.setEnabled(false);
            b5.setEnabled(false);
            b6.setEnabled(false);
            b7.setEnabled(false);
            b8.setEnabled(false);
            b9.setEnabled(false);

            //score.setText("X:"+X+"   "+"O:"+O);

            con.setVisibility(View.VISIBLE);
            con.setEnabled(true);
        }
    }
    public void AI(int[] matrix)
    {
        //wining diagonal
        if (matrix[0] == matrix[4] && matrix[4] == 2)
        {
            if(b9.getText().toString().equals("")){
                put(8,2);
                return;
            }
        }
        else if (matrix[2] == matrix[4] && matrix[4] == 2)
        {
            if(b7.getText().toString().equals("")){
                put(6,2);
                return;
            }
        }
        else if (matrix[6] == matrix[4] && matrix[4] == 2)
        {
            if(b3.getText().toString().equals("")){
                put(2,2);
                return;
            }
        }
        else if (matrix[8] == matrix[4] && matrix[4] == 2)
        {
            if(b1.getText().toString().equals("")){
                put(0,2);
                return;
            }
        }
        //wining smart diagonal
        else if (matrix[0] == matrix[8] && matrix[8] == 2)
        {
            if(b5.getText().toString().equals("")){
                put(4,2);
                return;
            }
        }
        else if (matrix[2] == matrix[6] && matrix[6] == 2)
        {
            if(b5.getText().toString().equals("")){
                put(4,2);
                return;
            }
        }
        //wining horizontal
        for(int i = 0 ; i<=6 ; i+=3){
            for(int j = i ; j<i+2 ; j++){
                if (matrix[j] == matrix[j+1] && matrix[j+1] == 2){
                    if (j == i) {
                        if (matrix[i+2] == 0) {
                            put(i + 2, 2);
                            return;
                        }
                    }
                    else if (j == i+1){
                        if (matrix[j-1] == 0) {
                            put(j - 1, 2);
                            return;
                        }
                    }
                }
            }
        }
        //wining verticalplay normally
        for(int i = 0 ; i<3 ; i++){
            for(int j = i ; j<=i+3 ; j+=3){
                if (matrix[j] == matrix[j+3] && matrix[j+3] == 2){
                    if (j == i) {
                        if (matrix[i+6] == 0) {
                            put(i + 6, 2);
                            return;
                        }
                    }
                    else if (j == i+3){
                        if (matrix[j-3] == 0) {
                            put(j - 3, 2);
                            return;
                        }
                    }
                }
            }
        }
        // wining smart horizontal
        for(int i = 0 ; i<= 6 ; i+=3){
            if (matrix[i] == matrix[i+2] && matrix[i+2] == 2)
            {
                if (matrix[i+1] == 0){
                    put(i + 1,2);
                    return;
                }
            }
        }
        // wining smart vertical
        for(int i = 0 ; i<=2 ; i++){
            if(matrix[i] == matrix[i+6] && matrix[i+6] == 2)
            {
                if (matrix[i+3] == 0){
                    put(i + 3,2);
                    return;
                }
            }
        }
        // defense
        //defense diagonal
        if (matrix[0] == matrix[4] && matrix[4] == 1)
        {
            if(b9.getText().toString().equals("")){
                put(8,2);
                return;
            }
        }
        else if (matrix[2] == matrix[4] && matrix[4] == 1)
        {
            if(b7.getText().toString().equals("")){
                put(6,2);
                return;
            }
        }
        else if (matrix[6] == matrix[4] && matrix[4] == 1)
        {
            if(b3.getText().toString().equals("")){
                put(2,2);
                return;
            }
        }
        else if (matrix[8] == matrix[4] && matrix[4] == 1)
        {
            if(b1.getText().toString().equals("")){
                put(0,2);
                return;
            }
        }
        //defense smart diagonal
        else if (matrix[0] == matrix[8] && matrix[8] == 1)
        {
            if(b5.getText().toString().equals("")){
                put(4,2);
                return;
            }
        }
        else if (matrix[2] == matrix[6] && matrix[6] == 1)
        {
            if(b5.getText().toString().equals("")){
                put(4,2);
                return;
            }
        }
        //defense horizontal
        for(int i = 0 ; i<=6 ; i+=3){
            for(int j = i ; j<i+2 ; j++){
                if (matrix[j] == matrix[j+1] && matrix[j+1] == 1){
                    if (j == i) {
                        if (matrix[i+2] == 0) {
                            put(i + 2, 2);
                            return;
                        }
                    }
                    else if (j == i+1){
                        if (matrix[j-1] == 0) {
                            put(j - 1, 2);
                            return;
                        }
                    }
                }
            }
        }
        //defense vertical
        for(int i = 0 ; i<3 ; i++){
            for(int j = i ; j<i+6 ; j+=3){
                if (matrix[j] == matrix[j+3] && matrix[j+3] == 1){
                    if (j == i) {
                        if (matrix[i+6] == 0) {
                            put(i + 6, 2);
                            return;
                        }
                    }
                    else if (j == i+3){
                        if (matrix[j-3] == 0) {
                            put(j - 3, 2);
                            return;
                        }
                    }
                }
            }
        }
        // defense smart horizontal
        for(int i = 0 ; i<= 6 ; i+=3){
            if (matrix[i] == matrix[i+2] && matrix[i+2] == 1)
            {
                if (matrix[i+1] == 0){
                    put(i + 1,2);
                    return;
                }
            }
        }
        // defense smart vertical
        for(int i = 0 ; i<=2 ; i++){
            if(matrix[i] == matrix[i+6] && matrix[i+6] == 1)
            {
                if (matrix[i+3] == 0){
                    put(i + 3,2);
                    return;
                }
            }
        }
        // defending against small L strategy
        if (m) {
            if (matrix[1] == matrix[3] && matrix[3] == 1) {
                if (matrix[0] == 0) {
                    put(0, 2);
                    return;
                }
            }
            if (matrix[1] == matrix[5] && matrix[5] == 1) {
                if (matrix[2] == 0) {
                    put(2, 2);
                    return;
                }
            }
            if (matrix[3] == matrix[7] && matrix[7] == 1) {
                if (matrix[6] == 0) {
                    put(6, 2);
                    return;
                }
            }
            if (matrix[5] == matrix[7] && matrix[7] == 1) {
                if (matrix[8] == 0) {
                    put(8, 2);
                    return;
                }
            }
        }
        //defending against big L strategy
        if(h) {
            if ((matrix[0] == matrix[8] && matrix[8] == 1) || (matrix[2] == matrix[6] && matrix[6] == 1)) {
                if (matrix[1] == 0) {
                    put(1, 2);
                    return;
                } else if (matrix[3] == 0) {
                    put(3, 2);
                    return;
                } else if (matrix[7] == 0) {
                    put(7, 2);
                    return;
                } else if (matrix[5] == 0) {
                    put(5, 2);
                    return;
                }
            }
        }
        // defending against the asymmetric L (|_ , _| , __|)
        if(h) {
            if (matrix[7] == matrix[0] && matrix[0] == 1) {
                if (matrix[3] == 0) {
                    put(3, 2);
                    return;
                }
            } else if (matrix[7] == matrix[2] && matrix[2] == 1) {
                if (matrix[5] == 0) {
                    put(5, 2);
                    return;
                }
            } else if (matrix[5] == matrix[6] && matrix[6] == 1) {
                if (matrix[7] == 0) {
                    put(7, 2);
                    return;
                }
            }
        }
        // Center is the most important then corners then sides
        if (matrix[4] == 0){
            put(4,2);
            return;
        }
        else if (matrix[0] == 0){
            put(0,2);
            return;
        }
        else if (matrix[2] == 0){
            put(2,2);
            return;
        }
        else if (matrix[6] == 0){
            put(6,2);
            return;
        }
        else if (matrix[8] == 0){
            put(8,2);
            return;
        }
        else if (matrix[1] == 0){
            put(1,2);
            return;
        }
        else if (matrix[3] == 0){
            put(3,2);
            return;
        }
        else if (matrix[7] == 0){
            put(7,2);
            return;
        }
        else if (matrix[5] == 0){
            put(5,2);
            return;
        }
    }

    public void put(int position , int piece)
    {
        String letter = (piece == 1) ? "X" : "O";
        switch(position){
            case 0 : {b1.setText(letter);matrix[0] = piece ;break;}
            case 1 : {b2.setText(letter);matrix[1] = piece ;break;}
            case 2 : {b3.setText(letter);matrix[2] = piece ;break;}
            case 3 : {b4.setText(letter);matrix[3] = piece ;break;}
            case 4 : {b5.setText(letter);matrix[4] = piece ;break;}
            case 5 : {b6.setText(letter);matrix[5] = piece ;break;}
            case 6 : {b7.setText(letter);matrix[6] = piece ;break;}
            case 7 : {b8.setText(letter);matrix[7] = piece ;break;}
            case 8 : {b9.setText(letter);matrix[8] = piece ;break;}
            default: Toast.makeText(MainActivity.this,"Something went wrong",Toast.LENGTH_LONG).show();
        }
        return;
    }

    public void refresh()
    {
        b1.setText("");
        b2.setText("");
        b3.setText("");
        b4.setText("");
        b5.setText("");
        b6.setText("");
        b7.setText("");
        b8.setText("");
        b9.setText("");

        b1.setEnabled(false);
        b2.setEnabled(false);
        b3.setEnabled(false);
        b4.setEnabled(false);
        b5.setEnabled(false);
        b6.setEnabled(false);
        b7.setEnabled(false);
        b8.setEnabled(false);
        b9.setEnabled(false);

        score.setText("Choose a difficulty");

        result.setText("");

        matrix = new int[]{0,0,0,
                0,0,0,
                0,0,0};
        gameEneded = false;
    }

    public void activateBoard()
    {
        b1.setEnabled(true);
        b2.setEnabled(true);
        b3.setEnabled(true);
        b4.setEnabled(true);
        b5.setEnabled(true);
        b6.setEnabled(true);
        b7.setEnabled(true);
        b8.setEnabled(true);
        b9.setEnabled(true);
    }
}
