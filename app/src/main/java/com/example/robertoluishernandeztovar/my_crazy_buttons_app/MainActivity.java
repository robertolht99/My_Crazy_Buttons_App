package com.example.robertoluishernandeztovar.my_crazy_buttons_app;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    MediaPlayer mpLeonRisa;
    MediaPlayer mpGolpe;
    MediaPlayer mpRisaNiño;
    MediaPlayer mpAlarma;
    MediaPlayer mpNadiePregunto;
    MediaPlayer mpReallyNigga;
    MediaPlayer mpRisaMalvada;
    MediaPlayer mpTurnDownForWhat;
    MediaPlayer mpCow;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mpGolpe = MediaPlayer.create(this, R.raw.sonido_de_golpe);
        mpRisaNiño = MediaPlayer.create(this,R.raw.kidlaugh);
        mpAlarma = MediaPlayer.create(this,R.raw.alarma);
        mpLeonRisa = MediaPlayer.create(this,R.raw.leon);
        mpNadiePregunto = MediaPlayer.create(this,R.raw.nadiepregunto);
        mpReallyNigga = MediaPlayer.create(this,R.raw.reallynigga);
        mpRisaMalvada = MediaPlayer.create(this,R.raw.risamalvada);
        mpTurnDownForWhat = MediaPlayer.create(this,R.raw.tdfw);
        mpCow = MediaPlayer.create(this,R.raw.cow);




    }

    public void playAudio1(View view) { mpGolpe.start();             }
    public void playAudio2(View view) { mpRisaNiño.start();          }
    public void playAudio3(View view) { mpAlarma.start();            }
    public void playAudio4(View view) { mpLeonRisa.start();          }
    public void playAudio5(View view) { mpNadiePregunto.start();     }
    public void playAudio6(View view) { mpReallyNigga.start();       }
    public void playAudio7(View view) { mpRisaMalvada.start();       }
    public void playAudio8(View view) { mpTurnDownForWhat.start();   }
    public void playAudio9(View view) { mpCow.start();               }



}
