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

public class MainActivity extends AppCompatActivity {

    private ArrayList<Integer> A, Acopia;
    private ArrayList<Integer> Aprima, AprimaCopia;
    private TextView numMov;
    private Button flecha_0_1,flecha_0_3,flecha_1_2,flecha_1_5,flecha_2_4,flecha_2_5,
            flecha_3_2,flecha_3_4,flecha_4_6,flecha_5_7,flecha_6_7, n0, n1, n2, n3, n4, n5, n6 ,n7;
    private int indicadorMov = 0;
    private int aux = 0,auxI = 0,cont = 0, numMovimientos = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

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

        flecha_0_1 = findViewById(R.id.cero_uno);
        flecha_0_3 = findViewById(R.id.cero_tres);
        flecha_1_2 = findViewById(R.id.uno_dos);
        flecha_1_5 = findViewById(R.id.uno_cinco);
        flecha_2_4 = findViewById(R.id.dos_cuatro);
        flecha_2_5 = findViewById(R.id.dos_cinco);
        flecha_3_2 = findViewById(R.id.tres_dos);
        flecha_3_4 = findViewById(R.id.tres_cuatro);
        flecha_4_6 = findViewById(R.id.cuatro_seis);
        flecha_5_7 = findViewById(R.id.cinco_siete);
        flecha_6_7 = findViewById(R.id.seis_siete);

        A = new ArrayList<>();
        Acopia = new ArrayList<>();
        Aprima = new ArrayList<>();
        AprimaCopia = new ArrayList<>();

        A.add(0);
        A.add(0);
        A.add(1);
        A.add(1);
        A.add(2);
        A.add(2);
        A.add(3);
        A.add(3);
        A.add(4);
        A.add(5);
        A.add(6);

        Acopia.add(0);
        Acopia.add(0);
        Acopia.add(1);
        Acopia.add(1);
        Acopia.add(2);
        Acopia.add(2);
        Acopia.add(3);
        Acopia.add(3);
        Acopia.add(4);
        Acopia.add(5);
        Acopia.add(6);

        Aprima.add(1);
        Aprima.add(3);
        Aprima.add(2);
        Aprima.add(5);
        Aprima.add(4);
        Aprima.add(5);
        Aprima.add(2);
        Aprima.add(4);
        Aprima.add(6);
        Aprima.add(7);
        Aprima.add(7);

        AprimaCopia.add(1);
        AprimaCopia.add(3);
        AprimaCopia.add(2);
        AprimaCopia.add(5);
        AprimaCopia.add(4);
        AprimaCopia.add(5);
        AprimaCopia.add(2);
        AprimaCopia.add(4);
        AprimaCopia.add(6);
        AprimaCopia.add(7);
        AprimaCopia.add(7);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menusiguiente, menu);
        return  true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch(item.getItemId()){
            case R.id.siguiente:
                Intent intent = new Intent(this, Nivel2.class);
                startActivity(intent);
                finish();
                Toast.makeText(this, "Nivel 2.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rein:
                Intent intent2 = new Intent(this, MainActivity.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.anterior:
                Intent intent3 = new Intent(this, MainActivity.class);
                startActivity(intent3);
                finish();
                Toast.makeText(this, "Primer Nivel.", Toast.LENGTH_SHORT).show();
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
    }


    public void recorrerRamas(){
        int aux = 0;
        boolean entro = false, entro2 = false, finish = false;

        if(indicadorMov >=2) {
            while (!finish) {
                for (int i = 0; i < A.size(); i++) {
                    try {
                        if (cont != 4 && cont != 5 && cont != 6) {
                            if (A.get(i) == cont && A.get(i + 1) == cont) {
                                aux = i;
                                entro2 = true;

                            } else if (A.get(i) == cont && Aprima.get(i) == 7 && !entro2) {
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
                    if (cont == 7) {
                        try {
                            System.currentTimeMillis();
                        }catch (Exception ex){
                            Toast.makeText(this, "Error bb", Toast.LENGTH_SHORT).show();
                        }
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE, REINCIA EL JUEGO.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
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
                    if (cont == 7) {

                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (cont == 7) {
                    try {
                        Thread.sleep(1000);
                    }catch (Exception ex){
                        Toast.makeText(this, "Error bb", Toast.LENGTH_SHORT).show();
                    }
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("PERDISTE");
                    buldier.setMessage("PERDISTE.");
                    buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Dialog dialog = buldier.create();
                    dialog.show();
                } else {
                    try {
                       Thread.sleep(1000);
                    }catch (Exception ex){
                        Toast.makeText(this, "Error bb", Toast.LENGTH_SHORT).show();
                    }
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("GANASTE");
                    buldier.setMessage("GANASTE, ME QUEDÉ EN EL NODO " + cont + ". SIGUE ADELANTE.");
                    buldier.setPositiveButton("SIGUIENTE NIVEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(MainActivity.this, "El boton de arriba :)", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Dialog dialog = buldier.create();
                    dialog.show();
                    finish = true;

                }


            }
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
                    if (contAux == 7) {
                        Toast.makeText(this, "El árbol llega", Toast.LENGTH_SHORT).show();
                        nodoVB = true;
                    }
                }
                else if(diez >= 40){
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

        if(diez>=40)
            return comodin;
        else
            return nodoVisitado;
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

    public void flecha_1_2(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 1 && Aprima.get(i) == 2){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_1_2.setVisibility(View.INVISIBLE);
            flecha_1_2.setEnabled(false);
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

    public void flecha_2_4(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 2 && Aprima.get(i) == 4){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_2_4.setVisibility(View.INVISIBLE);
            flecha_2_4.setEnabled(false);
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

    public void flecha_3_2(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 3 && Aprima.get(i) == 2){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_3_2.setVisibility(View.INVISIBLE);
            flecha_3_2.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }
    }

    public void flecha_3_4(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 3 && Aprima.get(i) == 4){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_3_4.setVisibility(View.INVISIBLE);
            flecha_3_4.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas();
        }
    }

    public void flecha_4_6(View view){
        if(indicadorMov <2){
            for (int i = 0; i< A.size(); i++){
                if(A.get(i) == 4 && Aprima.get(i) == 6){
                    A.remove(i);
                    Aprima.remove(i);
                }
            }
            flecha_4_6.setVisibility(View.INVISIBLE);
            flecha_4_6.setEnabled(false);
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
}
