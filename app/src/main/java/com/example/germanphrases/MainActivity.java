package com.example.germanphrases;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void audio(View view){
        Button button = (Button) view;
        MediaPlayer mediaPlayer = MediaPlayer.create(this, getResources().getIdentifier(button.getTag().toString(),"raw", getPackageName()));
        mediaPlayer.start();
        TextView textView2 = (TextView) findViewById(R.id.textView2);
        if(button.getTag().equals("bisspater"))
        {
            textView2.setText("Bis Spater");
        }
        else if(button.getTag().equals("gutenmorgen"))
        {
            textView2.setText("Guten Morgen");
        }else
        {
            textView2.setText(button.getTag().toString().substring(0,1).toUpperCase() + button.getTag().toString().substring(1));
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setSelected(true);
    }
}