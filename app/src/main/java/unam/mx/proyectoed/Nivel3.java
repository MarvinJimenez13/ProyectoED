package unam.mx.proyectoed;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Nivel3 extends AppCompatActivity {

    private ArrayList<Integer> A, Acopia;
    private ArrayList<Integer> Aprima, AprimaCopia;
    private Button flecha_0_1,flecha_0_2,flecha_0_3,flecha_1_4,flecha_1_5,flecha_2_5,
            flecha_3_6,flecha_4_7,flecha_5_7,flecha_6_2,flecha_6_7, flecha_6_8, flecha_6_9, flecha_7_10,
            flecha_8_10, flecha_9_10, n0, n1, n2, n3, n4, n5, n6 ,n7, n8, n9, n10;
    private TextView numMov;
    private int indicadorMov = 0;
    private int aux = 0,auxI = 0,cont = 0, numMovimientos = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel3);

        numMov = findViewById(R.id.nummov);
        numMov.setText("Tienes " + numMovimientos + " movimientos");

        n0 = findViewById(R.id.nodo0);
        n1 = findViewById(R.id.nodo1);
        n2 = findViewById(R.id.nodo2);
        n3 = findViewById(R.id.nodo3);
        n4 = findViewById(R.id.nodo4);
        n5 = findViewById(R.id.nodo5);
        n6 = findViewById(R.id.nodo6);
        n7 = findViewById(R.id.nodo7);
        n8 = findViewById(R.id.nodo8);
        n9 = findViewById(R.id.nodo9);
        n10 = findViewById(R.id.nodo10);

        flecha_0_1 = findViewById(R.id.cero_uno);
        flecha_0_2 = findViewById(R.id.cero_dos);
        flecha_0_3 = findViewById(R.id.cero_tres);
        flecha_1_4 = findViewById(R.id.uno_cuatro);
        flecha_1_5 = findViewById(R.id.uno_cinco);
        flecha_2_5 = findViewById(R.id.dos_cinco);
        flecha_3_6 = findViewById(R.id.tres_seis);
        flecha_4_7 = findViewById(R.id.cuatro_siete);
        flecha_6_2 = findViewById(R.id.seis_dos);
        flecha_5_7 = findViewById(R.id.cinco_siete);
        flecha_6_7 = findViewById(R.id.seis_siete);
        flecha_6_8 = findViewById(R.id.seis_ocho);
        flecha_6_9 = findViewById(R.id.seis_nueve);
        flecha_7_10 = findViewById(R.id.siete_diez);
        flecha_8_10 = findViewById(R.id.ocho_diez);
        flecha_9_10 = findViewById(R.id.nueve_diez);

        A = new ArrayList<>();
        Acopia = new ArrayList<>();
        Aprima = new ArrayList<>();
        AprimaCopia = new ArrayList<>();

        A.add(0);
        A.add(0);
        A.add(0);
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);
        A.add(6);
        A.add(6);
        A.add(6);
        A.add(7);
        A.add(8);
        A.add(9);

        Acopia.add(0);
        Acopia.add(0);
        Acopia.add(0);
        Acopia.add(1);
        Acopia.add(1);
        Acopia.add(2);
        Acopia.add(3);
        Acopia.add(4);
        Acopia.add(5);
        Acopia.add(6);
        Acopia.add(6);
        Acopia.add(6);
        Acopia.add(6);
        Acopia.add(7);
        Acopia.add(8);
        Acopia.add(9);

        Aprima.add(1);
        Aprima.add(2);
        Aprima.add(3);
        Aprima.add(4);
        Aprima.add(5);
        Aprima.add(5);
        Aprima.add(6);
        Aprima.add(7);
        Aprima.add(7);
        Aprima.add(2);
        Aprima.add(7);
        Aprima.add(8);
        Aprima.add(9);
        Aprima.add(10);
        Aprima.add(10);
        Aprima.add(10);

        AprimaCopia.add(1);
        AprimaCopia.add(2);
        AprimaCopia.add(3);
        AprimaCopia.add(4);
        AprimaCopia.add(5);
        AprimaCopia.add(5);
        AprimaCopia.add(6);
        AprimaCopia.add(7);
        AprimaCopia.add(7);
        AprimaCopia.add(2);
        AprimaCopia.add(7);
        AprimaCopia.add(8);
        AprimaCopia.add(9);
        AprimaCopia.add(10);
        AprimaCopia.add(10);
        AprimaCopia.add(10);
    }

    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menusiguiente, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.siguiente:
                Intent intent = new Intent(this, Nivel4.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "Nivel 4.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rein:
                Intent intent2 = new Intent(this, Nivel3.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.anterior:
                Intent intent3 = new Intent(this, Nivel2.class);
                startActivity(intent3);
                finish();
                Toast.makeText(this, "Nivel 2.", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public void posicionarAraña(){
        if(cont == 1){
            n1.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 2){
            n2.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 3){
            n3.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 4){
            n4.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 5){
            n5.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 6){
            n6.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 7){
            n7.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 8){
            n8.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 9){
            n9.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 10){
            n10.setBackgroundResource(R.mipmap.arana);
        }
    }

    public int recorrerArbol(){
        Acopia.clear();
        AprimaCopia.clear();

        for (int i = 0; i< A.size(); i ++){
            Acopia.add(A.get(i));
            AprimaCopia.add(Aprima.get(i));
        }

        int nodoVisitado = 0, contAux = cont;
        int i, diez = 0, comodin = 0;
        boolean entro, nodoVB = false, elegido = false, chale = false;
        try {


            while (!nodoVB) {
                diez++;
                i = 0;
                entro = false;
                if(chale) {
                    contAux = cont;
                    chale = false;
                }
                while (i < Acopia.size()) {
                    if (Acopia.get(i) == contAux) {
                        aux = i;
                        entro = true;
                    }

                    i++;
                }
                if (entro) {
                    contAux = AprimaCopia.get(aux);
                    if (!elegido)
                        nodoVisitado = contAux;
                    elegido = true;
                    if (contAux == 10) {
                        Toast.makeText(this, "El árbol llega", Toast.LENGTH_SHORT).show();
                        nodoVB = true;
                    }
                }
                else if(diez >= 50){
                    comodin = nodoVisitado;
                    nodoVB = true;
                }else {
                    nodoVB = false;
                    elegido = false;
                    for (int j = 0; j < AprimaCopia.size(); j++) {
                        if (AprimaCopia.get(j) == nodoVisitado) {
                            Acopia.remove(j);
                            AprimaCopia.remove(j);
                        }
                    }
                    chale = true;
                }
            }
        }catch (Exception e){
            Toast.makeText(this, String.valueOf(e), Toast.LENGTH_LONG).show();
        }

        if(diez>=50)
            return comodin;
        else
            return nodoVisitado;
    }

    public void recorrerRamas(){
        int aux = 0;
        boolean entro = false, entro2 = false, finish = false;

        if(indicadorMov >=2) {
            while (!finish) {
                for (int i = 0; i < A.size(); i++) {
                    try {
                        if (cont != 2 && cont != 3 && cont != 4 && cont != 5 && cont != 7 && cont != 8 && cont != 9) {
                            if (A.get(i) == cont && A.get(i + 1) == cont) {
                                aux = i;
                                entro2 = true;

                            } else if (A.get(i) == cont && Aprima.get(i) == 10 && !entro2) {
                                aux = i;
                                entro = true;
                            } else if (A.get(i) == cont && A.get(i + 1) != cont && !entro2) {
                                aux = i;
                                entro = true;

                            }
                        } else {
                            if (A.get(i) == cont) {
                                aux = i;
                                entro = true;
                            }
                        }
                    } catch (Exception e) {
                        Toast.makeText(this, String.valueOf(e), Toast.LENGTH_LONG).show();
                    }
                }
                if (entro) {
                    cont = Aprima.get(aux);
                    posicionarAraña();
                    entro = false;
                    if (cont == 10) {
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Nivel3.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (entro2) {
                    cont = recorrerArbol();
                    posicionarAraña();
                    entro2 = false;
                    if (cont == 10) {
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Nivel3.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (cont == 10) {
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("PERDISTE");
                    buldier.setMessage("PERDISTE.");
                    buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(Nivel3.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Dialog dialog = buldier.create();
                    dialog.show();
                } else {
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("GANASTE");
                    buldier.setMessage("GANASTE, ME QUEDÉ EN EL NODO " + cont + ".");
                    buldier.setTitle("GANASTE");
                    buldier.setMessage("GANASTE, ME QUEDÉ EN EL NODO " + cont + ". SIGUE ADELANTE.");
                    buldier.setPositiveButton("SIGUIENTE NIVEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(Nivel3.this, "El boton de arriba :)", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Dialog dialog = buldier.create();
                    dialog.show();
                    finish = true;

                }


            }
        }



    }

    public void flecha_0_1(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 0 && Aprima.get(i) == 1){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_0_1.setVisibility(View.INVISIBLE);
            flecha_0_1.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_0_2(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 0 && Aprima.get(i) == 2){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_0_2.setVisibility(View.INVISIBLE);
            flecha_0_2.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_0_3(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 0 && Aprima.get(i) == 3){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_0_3.setVisibility(View.INVISIBLE);
            flecha_0_3.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_1_4(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 1 && Aprima.get(i) == 4){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_1_4.setVisibility(View.INVISIBLE);
            flecha_1_4.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_1_5(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 1 && Aprima.get(i) == 5){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_1_5.setVisibility(View.INVISIBLE);
            flecha_1_5.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_2_5(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 2 && Aprima.get(i) == 5){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_2_5.setVisibility(View.INVISIBLE);
            flecha_2_5.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_3_6(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 3 && Aprima.get(i) == 6){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_3_6.setVisibility(View.INVISIBLE);
            flecha_3_6.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }


    public void flecha_4_7(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 4 && Aprima.get(i) == 7){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_4_7.setVisibility(View.INVISIBLE);
            flecha_4_7.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_5_7(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 5 && Aprima.get(i) == 7){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_5_7.setVisibility(View.INVISIBLE);
            flecha_5_7.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_6_2(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 6 && Aprima.get(i) == 2){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_6_2.setVisibility(View.INVISIBLE);
            flecha_6_2.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_6_7(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 6 && Aprima.get(i) == 7){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_6_7.setVisibility(View.INVISIBLE);
            flecha_6_7.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_6_8(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 6 && Aprima.get(i) == 8){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_6_8.setVisibility(View.INVISIBLE);
            flecha_6_8.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_6_9(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 6 && Aprima.get(i) == 9){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_6_9.setVisibility(View.INVISIBLE);
            flecha_6_9.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_7_10(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 7 && Aprima.get(i) == 10){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_7_10.setVisibility(View.INVISIBLE);
            flecha_7_10.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_8_10(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 8 && Aprima.get(i) == 10){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_8_10.setVisibility(View.INVISIBLE);
            flecha_8_10.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

    public void flecha_9_10(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 9 && Aprima.get(i) == 10){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_9_10.setVisibility(View.INVISIBLE);
            flecha_9_10.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }

    }

}
