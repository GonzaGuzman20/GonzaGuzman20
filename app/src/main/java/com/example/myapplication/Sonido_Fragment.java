package com.example.myapplication;

import android.media.MediaPlayer;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

/**

 */
public class Sonido_Fragment extends Fragment implements View.OnClickListener {

    MediaPlayer mp;
    ImageButton play,pause;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView=inflater.inflate(R.layout.fragment_sonido_,container,false);
        play=rootView.findViewById(R.id.btn_play);
        pause=rootView.findViewById(R.id.btn_pause);

        play.setOnClickListener(this);
        pause.setOnClickListener(this);

        return rootView;
    }
    public  void onClick(View view){
        switch (view.getId()){
            case R.id.btn_pause:
                mp.pause();
                break;
            case R.id.btn_play:
                mp=MediaPlayer.create(getActivity(),R.raw.primeramusica);
                mp.start();
                break;
        }
    }
}