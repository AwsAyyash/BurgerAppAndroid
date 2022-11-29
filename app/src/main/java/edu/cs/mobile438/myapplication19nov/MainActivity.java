package edu.cs.mobile438.myapplication19nov;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtLogo;
    private ImageView imgBurger;
    private Animation top, buttom;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        txtLogo = findViewById(R.id.txtLogos);
        imgBurger = findViewById(R.id.imgBurgers);

        top = AnimationUtils.loadAnimation(this,R.anim.top_anim);
        buttom = AnimationUtils.loadAnimation(this,R.anim.buttom_anim);

        imgBurger.setAnimation(top);
        txtLogo.setAnimation(buttom);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // intent

                Intent intent = new Intent(MainActivity.this,MenuActivity.class);
                startActivity(intent);
                finish();
            }
        }, 4000);

    }
}