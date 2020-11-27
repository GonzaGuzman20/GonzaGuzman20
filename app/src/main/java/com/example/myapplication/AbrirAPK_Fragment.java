package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class AbrirAPK_Fragment extends Fragment implements View.OnClickListener{

    Button facebook,youtube,instagram;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_calculadora_,container,false);

        facebook=(Button)rootView.findViewById(R.id.btnface);
        youtube=(Button)rootView.findViewById(R.id.btnyou);
        instagram=(Button)rootView.findViewById(R.id.btnins);

        facebook.setOnClickListener(this);
        youtube.setOnClickListener(this);
        instagram.setOnClickListener(this);

        return rootView;
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.btnface:
                Intent intentface=getActivity().getPackageManager().getLaunchIntentForPackage("com.facebook.katana");
                startActivity(intentface);
                break;
            case R.id.btnins:
                Intent intentinsta=getActivity().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(intentinsta);
                break;
            case R.id.btnyou:
                Intent intentyoutube=getActivity().getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(intentyoutube);
                break;
        }
    }
}