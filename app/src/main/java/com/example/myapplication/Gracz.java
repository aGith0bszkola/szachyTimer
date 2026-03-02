package com.example.myapplication;

import android.os.CountDownTimer;
import android.widget.Button;

import java.nio.Buffer;

public class Gracz {
    private int ileSekund = 100;
    private boolean czyAktywny;
    private Button button;
    private CountDownTimer countDownTimer;


    public Gracz(boolean czyAktywny, Button button) {
        this.czyAktywny = czyAktywny;
        this.button = button;
        if(czyAktywny){
            uruchomione();
        }
        else{
            button.setClickable(false);
        }
    }

    public boolean isCzyAktywny(){
        return czyAktywny;
    }

    public void setCzyAktywny(boolean czyAktywny) {
        this.czyAktywny = czyAktywny;
    }
    public void odwrocAktywnosc(){

        czyAktywny = !czyAktywny;
        button.setClickable(czyAktywny);
        if(czyAktywny){
            uruchomione();
        }
        else{
            zatrzymajZegar();
        }
    }
    private void zatrzymajZegar(){
        countDownTimer.cancel();
    }

    private void uruchomione(){
        this.countDownTimer = new CountDownTimer(ileSekund*1000,1000) {
            @Override
            public void onFinish() {

            }

            @Override
            public void onTick(long l) {
                ileSekund = (int)l/1000;
                button.setText(""+ileSekund);
            }
        };
        countDownTimer.start();
    }
}
