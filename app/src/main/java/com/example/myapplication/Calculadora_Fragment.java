package com.example.myapplication;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class Calculadora_Fragment extends Fragment implements View.OnClickListener {

    Button botonSuma, botonResta, botonMulti, botonDividir, botonLimpiar;
    EditText numero1, numero2;
    TextView respuesta;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_calculadora_,container,false);

        numero1=(EditText)rootView.findViewById(R.id.numero1);
        numero2=(EditText)rootView.findViewById(R.id.numero2);
        respuesta=(TextView)rootView.findViewById(R.id.respuesta);

        botonSuma=(Button)rootView.findViewById(R.id.botonSuma);
        botonResta=(Button)rootView.findViewById(R.id.botonResta);
        botonMulti=(Button)rootView.findViewById(R.id.botonMulti);
        botonDividir=(Button)rootView.findViewById(R.id.botonDividir);

        botonLimpiar=(Button)rootView.findViewById(R.id.botonLimpiar);

        botonSuma.setOnClickListener(this);
        botonResta.setOnClickListener(this);
        botonDividir.setOnClickListener(this);
        botonMulti.setOnClickListener(this);
        botonLimpiar.setOnClickListener(this);
        return rootView;
    }
    public void onClick(View view){
        switch (view.getId()){
            case R.id.botonSuma:
                double num1=Double.parseDouble(numero1.getText().toString());
                double num2=Double.parseDouble(numero2.getText().toString());

                double res=num1+num2;

                respuesta.setText("El resultado es : "+res);
                break;
            case R.id.botonResta:
                double snum1=Double.parseDouble(numero1.getText().toString());
                double snum2=Double.parseDouble(numero2.getText().toString());

                double sres=snum1-snum2;

                respuesta.setText("El resultado es : "+sres);
                break;
            case R.id.botonDividir:
                double dnum1=Double.parseDouble(numero1.getText().toString());
                double dnum2=Double.parseDouble(numero2.getText().toString());

                double dres=dnum1/dnum2;

                respuesta.setText("El resultado es : "+dres);

                break;
            case R.id.botonMulti:
                double mnum1=Double.parseDouble(numero1.getText().toString());
                double mnum2=Double.parseDouble(numero2.getText().toString());
                double mres=mnum1*mnum2;
                respuesta.setText("El resultado es : "+mres);

                break;
            case R.id.botonLimpiar:
                numero1.setText("");
                numero1.invalidate();
                numero2.setText("");
                numero2.invalidate();
                respuesta.setText("");
                respuesta.invalidate();
                break;
        }
    }

}