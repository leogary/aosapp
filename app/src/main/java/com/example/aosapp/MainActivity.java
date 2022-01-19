package com.example.aosapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    public int score = 0;
    public int money = 1000;
    public int step = 0;
    public int year = 1;
    public int tmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);


        setContentView(R.layout.activity_main);
        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setVideoPath("android.resource://com.example.aosapp/"+R.raw.divideo);
        videoView.setVisibility(View.INVISIBLE);
    }

    public void btn_onclick(View view) {
        ImageView dice1 = (ImageView) findViewById(R.id.d1);
        ImageView dice2 = (ImageView) findViewById(R.id.d2);
        ImageView dice3 = (ImageView) findViewById(R.id.d3);
        ImageView dice4 = (ImageView) findViewById(R.id.d4);
        ImageView dice5 = (ImageView) findViewById(R.id.d5);
        ImageView dice6 = (ImageView) findViewById(R.id.d6);

        VideoView videoView = (VideoView) findViewById(R.id.videoView2);
        videoView.setVisibility(View.VISIBLE);
        videoView.setVideoPath("android.resource://com.example.aosapp/"+R.raw.divideo);
        ImageView blackmanstartpoint = (ImageView) findViewById(R.id.blackman);
        blackmanstartpoint.setVisibility(View.INVISIBLE);
        videoView.start();

        videoView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            public void onCompletion(MediaPlayer mp) {
                ImageView imageview1 = (ImageView) findViewById(R.id.blackman_1);
                ImageView imageview2 = (ImageView) findViewById(R.id.blackman_2);
                ImageView imageview3 = (ImageView) findViewById(R.id.blackman_3);
                ImageView imageview4 = (ImageView) findViewById(R.id.blackman_4);
                ImageView imageview5 = (ImageView) findViewById(R.id.blackman_5);
                ImageView imageview6 = (ImageView) findViewById(R.id.blackman_6);
                ImageView imageview7 = (ImageView) findViewById(R.id.blackman_7);
                ImageView imageview8 = (ImageView) findViewById(R.id.blackman_8);
                ImageView imageview9 = (ImageView) findViewById(R.id.blackman_9);
                ImageView imageview10 = (ImageView) findViewById(R.id.blackman_10);
                ImageView imageview11 = (ImageView) findViewById(R.id.blackman_11);
                ImageView imageview12 = (ImageView) findViewById(R.id.blackman_12);
                ImageView imageview13 = (ImageView) findViewById(R.id.blackman_13);
                ImageView imageview14 = (ImageView) findViewById(R.id.blackman_14);
                ImageView imageview15 = (ImageView) findViewById(R.id.blackman_15);
                TextView confirmtext=(TextView) findViewById(R.id.confirmtext);
                Button yes =(Button) findViewById(R.id.yes);
                Button no =(Button) findViewById(R.id.no);

                tmp = (int)(Math.random()* 6) + 1;
                step = tmp + step;
                if(step > 15){
                    step =  step % 15;
                    year += 1;
                }
                switch (tmp){
                    case 1:
                        dice1.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"往前1步",Toast.LENGTH_LONG).show();
                        break;
                    case 2:
                        dice2.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"往前2步",Toast.LENGTH_LONG).show();
                        break;
                    case 3:
                        dice3.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"往前3步",Toast.LENGTH_LONG).show();
                        break;
                    case 4:
                        dice4.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"往前4步",Toast.LENGTH_LONG).show();
                        break;
                    case 5:
                        dice5.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"往前5步",Toast.LENGTH_LONG).show();
                        break;
                    default:
                        dice6.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"往前6步",Toast.LENGTH_LONG).show();
                }

                //tmp = 0;
                if(step > 0){
                    imageview15.setVisibility(View.INVISIBLE);
                    imageview14.setVisibility(View.INVISIBLE);
                    imageview13.setVisibility(View.INVISIBLE);
                    imageview12.setVisibility(View.INVISIBLE);
                    imageview11.setVisibility(View.INVISIBLE);
                    imageview10.setVisibility(View.INVISIBLE);
                    imageview9.setVisibility(View.INVISIBLE);
                    imageview8.setVisibility(View.INVISIBLE);
                    imageview7.setVisibility(View.INVISIBLE);
                    imageview6.setVisibility(View.INVISIBLE);
                    imageview5.setVisibility(View.INVISIBLE);
                    imageview4.setVisibility(View.INVISIBLE);
                    imageview3.setVisibility(View.INVISIBLE);
                    imageview2.setVisibility(View.INVISIBLE);
                    imageview1.setVisibility(View.INVISIBLE);

                }


                if(year == 3&&score<12){
                    ImageView image_failure = (ImageView) findViewById(R.id.failure);
                    image_failure.setVisibility(View.VISIBLE);
                    dice1.setVisibility(View.INVISIBLE);
                    dice2.setVisibility(View.INVISIBLE);
                    dice3.setVisibility(View.INVISIBLE);
                    dice4.setVisibility(View.INVISIBLE);
                    dice5.setVisibility(View.INVISIBLE);
                    dice6.setVisibility(View.INVISIBLE);
                    Toast.makeText(MainActivity.this,"GAME OVER",Toast.LENGTH_LONG).show();
                    return;
                }
                switch (step){
                    case 1:
                        imageview1.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 2:
                        imageview2.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 3:
                        imageview3.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"無所事事的一天",Toast.LENGTH_LONG).show();

                        break;

                    case 4:
                        imageview4.setVisibility(View.VISIBLE);
                        if(money >= 3000){
                            confirmtext.setVisibility(View.VISIBLE);
                            confirmtext.setText("是否要買學分");
                            yes.setVisibility(View.VISIBLE);
                            no.setVisibility(View.VISIBLE);
                        }else{
                            Toast.makeText(MainActivity.this,"你的錢不夠買學分",Toast.LENGTH_LONG).show();
                        }

                        break;
                    case 5:
                        imageview5.setVisibility(View.VISIBLE);
                        money -= 200;
                        Toast.makeText(MainActivity.this,"被交管會發現亂停車 金錢: -200",Toast.LENGTH_LONG).show();

                        break;

                    case 6:
                        imageview6.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 7:
                        imageview7.setVisibility(View.VISIBLE);
                        if(money >= 3000){
                            confirmtext.setVisibility(View.VISIBLE);
                            confirmtext.setText("是否要買學分");
                            yes.setVisibility(View.VISIBLE);
                            no.setVisibility(View.VISIBLE);
                        }else{
                            Toast.makeText(MainActivity.this,"你的錢不夠買學分",Toast.LENGTH_LONG).show();
                        }

                        break;

                    case 8:
                        imageview8.setVisibility(View.VISIBLE);
                        Toast.makeText(MainActivity.this,"無所事事的一天",Toast.LENGTH_LONG).show();

                        break;

                    case 9:
                        imageview9.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 10:
                        imageview10.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 11:
                        imageview11.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 12:
                        imageview12.setVisibility(View.VISIBLE);
                        if(money >= 3000){
                            confirmtext.setVisibility(View.VISIBLE);
                            confirmtext.setText("是否要買學分");
                            yes.setVisibility(View.VISIBLE);
                            no.setVisibility(View.VISIBLE);
                        }else{
                            Toast.makeText(MainActivity.this,"你的錢不夠買學分",Toast.LENGTH_LONG).show();
                        }

                        break;

                    case 13:
                        imageview13.setVisibility(View.VISIBLE);
                        if(money >= 3000){
                            confirmtext.setVisibility(View.VISIBLE);
                            confirmtext.setText("是否要買學分");
                            yes.setVisibility(View.VISIBLE);
                            no.setVisibility(View.VISIBLE);
                        }else{
                            Toast.makeText(MainActivity.this,"你的錢不夠買學分",Toast.LENGTH_LONG).show();
                        }

                        break;

                    case 14:
                        imageview14.setVisibility(View.VISIBLE);
                        money += 3000;
                        Toast.makeText(MainActivity.this,"金錢: + 3000",Toast.LENGTH_LONG).show();

                        break;

                    case 15:
                        imageview15.setVisibility(View.VISIBLE);
                        money -= 600;
                        Toast.makeText(MainActivity.this,"被猴子攻擊 金錢: -600",Toast.LENGTH_LONG).show();

                        break;

                    default:

                }
                TextView t_score = findViewById(R.id.textView18);
                TextView t_money = findViewById(R.id.textView19);
                String str_score=String.valueOf(score);
                String str_money=String.valueOf(money);
                t_score.setText("學分數: " + str_score);
                t_money.setText("金錢: " + str_money);
                videoView.setVisibility(View.INVISIBLE);
                /*

                */

            }

        });
        dice1.setVisibility(View.INVISIBLE);
        dice2.setVisibility(View.INVISIBLE);
        dice3.setVisibility(View.INVISIBLE);
        dice4.setVisibility(View.INVISIBLE);
        dice5.setVisibility(View.INVISIBLE);
        dice6.setVisibility(View.INVISIBLE);

    }

    public void restart_click(View view) {
        score = 0;
        money = 1000;
        step = 0;
        year = 1;
        ImageView image_graduate = (ImageView) findViewById(R.id.graduate);
        image_graduate.setVisibility(View.INVISIBLE);
        ImageView image_failure = (ImageView) findViewById(R.id.failure);
        image_failure.setVisibility(View.INVISIBLE);
        ImageView dice1 = (ImageView) findViewById(R.id.d1);
        ImageView dice2 = (ImageView) findViewById(R.id.d2);
        ImageView dice3 = (ImageView) findViewById(R.id.d3);
        ImageView dice4 = (ImageView) findViewById(R.id.d4);
        ImageView dice5 = (ImageView) findViewById(R.id.d5);
        ImageView dice6 = (ImageView) findViewById(R.id.d6);
        dice1.setVisibility(View.INVISIBLE);
        dice2.setVisibility(View.INVISIBLE);
        dice3.setVisibility(View.INVISIBLE);
        dice4.setVisibility(View.INVISIBLE);
        dice5.setVisibility(View.INVISIBLE);
        dice6.setVisibility(View.INVISIBLE);
        ImageView imageview1 = (ImageView) findViewById(R.id.blackman_1);
        ImageView imageview2 = (ImageView) findViewById(R.id.blackman_2);
        ImageView imageview3 = (ImageView) findViewById(R.id.blackman_3);
        ImageView imageview4 = (ImageView) findViewById(R.id.blackman_4);
        ImageView imageview5 = (ImageView) findViewById(R.id.blackman_5);
        ImageView imageview6 = (ImageView) findViewById(R.id.blackman_6);
        ImageView imageview7 = (ImageView) findViewById(R.id.blackman_7);
        ImageView imageview8 = (ImageView) findViewById(R.id.blackman_8);
        ImageView imageview9 = (ImageView) findViewById(R.id.blackman_9);
        ImageView imageview10 = (ImageView) findViewById(R.id.blackman_10);
        ImageView imageview11 = (ImageView) findViewById(R.id.blackman_11);
        ImageView imageview12 = (ImageView) findViewById(R.id.blackman_12);
        ImageView imageview13 = (ImageView) findViewById(R.id.blackman_13);
        ImageView imageview14 = (ImageView) findViewById(R.id.blackman_14);
        ImageView imageview15 = (ImageView) findViewById(R.id.blackman_15);
        TextView confirmtext=(TextView) findViewById(R.id.confirmtext);
        imageview15.setVisibility(View.INVISIBLE);
        imageview14.setVisibility(View.INVISIBLE);
        imageview13.setVisibility(View.INVISIBLE);
        imageview12.setVisibility(View.INVISIBLE);
        imageview11.setVisibility(View.INVISIBLE);
        imageview10.setVisibility(View.INVISIBLE);
        imageview9.setVisibility(View.INVISIBLE);
        imageview8.setVisibility(View.INVISIBLE);
        imageview7.setVisibility(View.INVISIBLE);
        imageview6.setVisibility(View.INVISIBLE);
        imageview5.setVisibility(View.INVISIBLE);
        imageview4.setVisibility(View.INVISIBLE);
        imageview3.setVisibility(View.INVISIBLE);
        imageview2.setVisibility(View.INVISIBLE);
        imageview1.setVisibility(View.INVISIBLE);
        TextView t_score = findViewById(R.id.textView18);
        TextView t_money = findViewById(R.id.textView19);
        String str_score=String.valueOf(score);
        String str_money=String.valueOf(money);
        t_score.setText("學分數: " + str_score);
        t_money.setText("金錢: " + str_money);
        confirmtext.setVisibility(View.INVISIBLE);
        ImageView blackmanstartpoint = (ImageView) findViewById(R.id.blackman);
        blackmanstartpoint.setVisibility(View.VISIBLE);
        Button yes =(Button) findViewById(R.id.yes);
        Button no =(Button) findViewById(R.id.no);
        yes.setVisibility(View.INVISIBLE);
        no.setVisibility(View.INVISIBLE);
    }


    public void yes_onclick(View view) {
        TextView confirmtext=(TextView) findViewById(R.id.confirmtext);
        TextView t_money = findViewById(R.id.textView19);
        TextView t_score = findViewById(R.id.textView18);

        Button yes =(Button) findViewById(R.id.yes);
        Button no =(Button) findViewById(R.id.no);
        confirmtext.setVisibility(View.INVISIBLE);
        yes.setVisibility(View.INVISIBLE);
        no.setVisibility(View.INVISIBLE);
        money -= 3000;
        score += 6;
        String str_money=String.valueOf(money);
        String str_score=String.valueOf(score);
        t_score.setText("學分數: " + str_score);
        t_money.setText("金錢: " + str_money);
        Toast.makeText(MainActivity.this,"金錢: -3000",Toast.LENGTH_LONG).show();
        Toast.makeText(MainActivity.this,"學分: +6",Toast.LENGTH_LONG).show();
        if (score == 12) {
            ImageView image_graduate = (ImageView) findViewById(R.id.graduate);
            image_graduate.setVisibility(View.VISIBLE);
            Toast.makeText(MainActivity.this,"順利畢業!!",Toast.LENGTH_LONG).show();
        }

    }

    public void no_click(View view) {
        TextView confirmtext=(TextView) findViewById(R.id.confirmtext);
        Button yes =(Button) findViewById(R.id.yes);
        Button no =(Button) findViewById(R.id.no);
        confirmtext.setVisibility(View.INVISIBLE);
        yes.setVisibility(View.INVISIBLE);
        no.setVisibility(View.INVISIBLE);
    }
}
