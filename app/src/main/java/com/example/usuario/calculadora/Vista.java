package com.example.usuario.calculadora;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by alumno on 06/09/2018.
 */

public class Vista
{
    public TextView t;
    public EditText et;

    public Vista(Activity activity, View.OnClickListener escuchador)

    {

        this.et = (EditText) activity.findViewById(R.id.eText1);
        this.t = (TextView) activity.findViewById(R.id.txt1);

        Button btn1 = (Button) activity.findViewById(R.id.btn1);
        Button btn2 = (Button) activity.findViewById(R.id.btn2);
        Button btn3 = (Button) activity.findViewById(R.id.btn3);
        Button btn4 = (Button) activity.findViewById(R.id.btn4);
        Button btn5 = (Button) activity.findViewById(R.id.btn5);
        Button btn6 = (Button) activity.findViewById(R.id.btn6);
        Button btn7 = (Button) activity.findViewById(R.id.btn7);
        Button btn8 = (Button) activity.findViewById(R.id.btn8);
        Button btn9 = (Button) activity.findViewById(R.id.btn9);
        Button btn0 = (Button) activity.findViewById(R.id.btn0);
        Button btnMas = (Button) activity.findViewById(R.id.btnMas);
        Button btnMenos = (Button) activity.findViewById(R.id.btnMen);
        Button btnPor = (Button) activity.findViewById(R.id.btnPor);
        Button btnDiv = (Button) activity.findViewById(R.id.btnDiv);
        Button btnDEL = (Button) activity.findViewById(R.id.btnBorra);
        Button btnComa = (Button) activity.findViewById(R.id.btnComa);
        Button btnIgual = (Button) activity.findViewById(R.id.btnIgual);

        btn1.setOnClickListener(escuchador);
        btn2.setOnClickListener(escuchador);
        btn3.setOnClickListener(escuchador);
        btn4.setOnClickListener(escuchador);
        btn5.setOnClickListener(escuchador);
        btn6.setOnClickListener(escuchador);
        btn7.setOnClickListener(escuchador);
        btn8.setOnClickListener(escuchador);
        btn9.setOnClickListener(escuchador);
        btn0.setOnClickListener(escuchador);
        btnMas.setOnClickListener(escuchador);
        btnMenos.setOnClickListener(escuchador);
        btnPor.setOnClickListener(escuchador);
        btnDiv.setOnClickListener(escuchador);
        btnDEL.setOnClickListener(escuchador);
        btnComa.setOnClickListener(escuchador);
        btnIgual.setOnClickListener(escuchador);

    }
}
