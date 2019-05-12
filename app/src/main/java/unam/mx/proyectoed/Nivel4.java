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

public class Nivel4 extends AppCompatActivity {

    private ArrayList<Integer> Araña1, Araña1copia, Araña2, Araña2copia;
    private ArrayList<Integer> Araña1prima, Araña1primaCopia, Araña2prima, Araña2primaCopia;
    private Button flecha_0_1,flecha_0_2,flecha_0_3,flecha_1_4,flecha_2_4,flecha_2_8,
            flecha_2_3,flecha_3_8,flecha_4_5,flecha_5_6,flecha_5_7, flecha_6_17, flecha_7_17, flecha_8_17,
            flecha_9_8, flecha_10_8,flecha_10_9,flecha_11_17,flecha_12_17,flecha_13_11, flecha_13_12, flecha_10_13,
            flecha_14_10,flecha_15_14, flecha_15_9,flecha_16_13, flecha_16_15, n0, n1, n2, n3, n4, n5, n6 ,n7, n8, n9, n10,
            n11, n12, n13, n14, n15, n16, n17;
    private TextView numMov;
    private int indicadorMov = 0;
    private int aux = 0,aux2 = 0,cont = 0, cont2 = 16, numMovimientos =4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nivel4);

        numMov = findViewById(R.id.nummov);
        numMov.setText("Tienes " + numMovimientos + "\n movimientos");

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
        n11 = findViewById(R.id.nodo11);
        n12 = findViewById(R.id.nodo12);
        n13 = findViewById(R.id.nodo13);
        n14 = findViewById(R.id.nodo14);
        n15 = findViewById(R.id.nodo15);
        n16 = findViewById(R.id.nodo16);
        n17 = findViewById(R.id.nodo17);

        flecha_0_1 = findViewById(R.id.cero_uno);
        flecha_0_2 = findViewById(R.id.cero_dos);
        flecha_0_3 = findViewById(R.id.cero_tres);
        flecha_1_4 = findViewById(R.id.uno_cuatro);
        flecha_2_4 = findViewById(R.id.dos_cuatro);
        flecha_2_8 = findViewById(R.id.dos_ocho);
        flecha_2_3 = findViewById(R.id.dos_tres);
        flecha_3_8 = findViewById(R.id.tres_ocho);
        flecha_4_5 = findViewById(R.id.cuatro_cinco);
        flecha_5_6 = findViewById(R.id.cinco_seis);
        flecha_5_7 = findViewById(R.id.cinco_siete);
        flecha_6_17 = findViewById(R.id.seis_diecisiete);
        flecha_7_17 = findViewById(R.id.siete_diecisiete);
        flecha_8_17 = findViewById(R.id.ocho_diecisiete);
        flecha_9_8 = findViewById(R.id.nueve_ocho);
        flecha_10_8 = findViewById(R.id.diez_ocho);
        flecha_10_9 = findViewById(R.id.diez_nueve);
        flecha_11_17 = findViewById(R.id.once_diecisiete);
        flecha_12_17 = findViewById(R.id.doce_diecisiete);
        flecha_13_11 = findViewById(R.id.trece_once);
        flecha_13_12 = findViewById(R.id.trece_doce);
        flecha_10_13 = findViewById(R.id.diez_trece);
        flecha_14_10 = findViewById(R.id.catorce_diez);
        flecha_15_14 = findViewById(R.id.quince_catorce);
        flecha_15_9 = findViewById(R.id.quince_nueve);
        flecha_16_13 = findViewById(R.id.dieciseis_trece);
        flecha_16_15 = findViewById(R.id.dieciseis_quince);

        Araña1 = new ArrayList<>();
        Araña1copia = new ArrayList<>();
        Araña1prima = new ArrayList<>();
        Araña1primaCopia = new ArrayList<>();

        Araña2 = new ArrayList<>();
        Araña2copia = new ArrayList<>();
        Araña2prima = new ArrayList<>();
        Araña2primaCopia = new ArrayList<>();


        Araña1.add(0);
        Araña1.add(0);
        Araña1.add(0);
        Araña1.add(1);
        Araña1.add(2);
        Araña1.add(2);
        Araña1.add(2);
        Araña1.add(3);
        Araña1.add(4);
        Araña1.add(5);
        Araña1.add(5);
        Araña1.add(6);
        Araña1.add(7);
        Araña1.add(8);

        Araña1copia.add(0);
        Araña1copia.add(0);
        Araña1copia.add(0);
        Araña1copia.add(1);
        Araña1copia.add(2);
        Araña1copia.add(2);
        Araña1copia.add(2);
        Araña1copia.add(3);
        Araña1copia.add(4);
        Araña1copia.add(5);
        Araña1copia.add(5);
        Araña1copia.add(6);
        Araña1copia.add(7);
        Araña1copia.add(8);

        Araña1prima.add(1);
        Araña1prima.add(2);
        Araña1prima.add(3);
        Araña1prima.add(4);
        Araña1prima.add(4);
        Araña1prima.add(3);
        Araña1prima.add(8);
        Araña1prima.add(8);
        Araña1prima.add(5);
        Araña1prima.add(6);
        Araña1prima.add(7);
        Araña1prima.add(17);
        Araña1prima.add(17);
        Araña1prima.add(17);

        Araña1primaCopia.add(1);
        Araña1primaCopia.add(2);
        Araña1primaCopia.add(3);
        Araña1primaCopia.add(4);
        Araña1primaCopia.add(4);
        Araña1primaCopia.add(3);
        Araña1primaCopia.add(8);
        Araña1primaCopia.add(8);
        Araña1primaCopia.add(5);
        Araña1primaCopia.add(6);
        Araña1primaCopia.add(7);
        Araña1primaCopia.add(17);
        Araña1primaCopia.add(17);
        Araña1primaCopia.add(17);

        Araña2.add(16);
        Araña2.add(16);
        Araña2.add(15);
        Araña2.add(15);
        Araña2.add(14);
        Araña2.add(13);
        Araña2.add(13);
        Araña2.add(12);
        Araña2.add(11);
        Araña2.add(10);
        Araña2.add(10);
        Araña2.add(10);
        Araña2.add(9);
        Araña2.add(8);

        Araña2copia.add(16);
        Araña2copia.add(16);
        Araña2copia.add(15);
        Araña2copia.add(15);
        Araña2copia.add(14);
        Araña2copia.add(13);
        Araña2copia.add(13);
        Araña2copia.add(12);
        Araña2copia.add(11);
        Araña2copia.add(10);
        Araña2copia.add(10);
        Araña2copia.add(10);
        Araña2copia.add(9);
        Araña2copia.add(8);

        Araña2prima.add(13);
        Araña2prima.add(15);
        Araña2prima.add(9);
        Araña2prima.add(14);
        Araña2prima.add(10);
        Araña2prima.add(11);
        Araña2prima.add(12);
        Araña2prima.add(17);
        Araña2prima.add(17);
        Araña2prima.add(8);
        Araña2prima.add(9);
        Araña2prima.add(13);
        Araña2prima.add(8);
        Araña2prima.add(17);

        Araña2primaCopia.add(13);
        Araña2primaCopia.add(15);
        Araña2primaCopia.add(9);
        Araña2primaCopia.add(14);
        Araña2primaCopia.add(10);
        Araña2primaCopia.add(11);
        Araña2primaCopia.add(12);
        Araña2primaCopia.add(17);
        Araña2primaCopia.add(17);
        Araña2primaCopia.add(8);
        Araña2primaCopia.add(9);
        Araña2primaCopia.add(13);
        Araña2primaCopia.add(8);
        Araña2primaCopia.add(17);

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
                Toast.makeText(this, "No hay más.", Toast.LENGTH_SHORT).show();
                break;
            case R.id.rein:
                Intent intent2 = new Intent(this, Nivel4.class);
                startActivity(intent2);
                finish();
                break;
            case R.id.anterior:
                Intent intent3 = new Intent(this, Nivel3.class);
                startActivity(intent3);
                finish();
                Toast.makeText(this, "Nivel 3.", Toast.LENGTH_SHORT).show();
                break;
        }
        return true;
    }

    public void posicionarAraña1(){
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
        if( cont == 11){
            n11.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 12){
            n12.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 13){
            n13.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 14){
            n14.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 15){
            n15.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 16){
            n16.setBackgroundResource(R.mipmap.arana);
        }
        if( cont == 17){
            n17.setBackgroundResource(R.mipmap.arana);
        }

    }

    public void posicionarAraña2(){
        if(cont2 == 1){
            n1.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 2){
            n2.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 3){
            n3.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 4){
            n4.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 5){
            n5.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 6){
            n6.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 7){
            n7.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 8){
            n8.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 9){
            n9.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 10){
            n10.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 11){
            n11.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 12){
            n12.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 13){
            n13.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 14){
            n14.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 15){
            n15.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 16){
            n16.setBackgroundResource(R.mipmap.arana2);
        }
        if( cont2 == 17){
            n17.setBackgroundResource(R.mipmap.arana2);
        }

    }

    public int recorrerArbol1(){
        Araña1copia.clear();
        Araña1primaCopia.clear();

        for (int i = 0; i< Araña1.size(); i ++){
            Araña1copia.add(Araña1.get(i));
            Araña1primaCopia.add(Araña1prima.get(i));
        }

        int nodoVisitado = 0, contAux = cont;
        int i, diez = 0, comodin = 0;
        boolean entro, entro2, nodoVB = false, elegido = false, chale = false;
        try {


            while (!nodoVB) {
                diez++;
                i = 0;
                entro = false;
                entro2 = false;
                if(chale) {
                    contAux = cont;
                    chale = false;
                }
                while (i < Araña1copia.size()) {
                    if (Araña1copia.get(i) == contAux) {
                        aux = i;
                        entro = true;
                    }
                    if(Araña1copia.get(i) == contAux && Araña1copia.get(i + 1) == contAux){
                        System.out.println("Jajajajajajajaja");
                        aux = i;
                        entro2 = true;
                    }

                    i++;
                }
                if (entro2) {
                    contAux = Araña1primaCopia.get(contAux);
                    if (!elegido)
                        nodoVisitado = contAux;
                    elegido = true;
                    if (contAux == 17) {
                        Toast.makeText(this, "El árbol llega", Toast.LENGTH_SHORT).show();
                        nodoVB = true;
                    }
                }
                if (entro) {
                    contAux = Araña1primaCopia.get(aux);
                    if (!elegido)
                        nodoVisitado = contAux;
                    elegido = true;
                    if (contAux == 17) {
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

                    for (int j = 0; j < Araña1primaCopia.size(); j++) {
                        if (Araña1primaCopia.get(j) == nodoVisitado) {
                            Araña1copia.remove(j);
                            Araña1primaCopia.remove(j);
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

    public void recorrerRamas1(){
        int aux = 0;
        boolean entro = false, entro2 = false, finish = false;

        if(indicadorMov >=4) {
            while (!finish) {
                for (int i = 0; i < Araña1.size(); i++) {
                    try {
                        if (cont != 1 && cont != 3 && cont != 4 && cont != 6 && cont != 7 && cont != 8) {
                            if (Araña1.get(i) == cont && Araña1.get(i + 1) == cont) {
                                aux = i;
                                entro2 = true;

                            } else if (Araña1.get(i) == cont && Araña1prima.get(i) == 17 && !entro2) {
                                aux = i;
                                entro = true;
                            } else if (Araña1.get(i) == cont && Araña1.get(i + 1) != cont && !entro2) {
                                aux = i;
                                entro = true;

                            }
                        } else {
                            if (Araña1.get(i) == cont) {
                                aux = i;
                                entro = true;
                            }
                        }
                    } catch (Exception e) {
                        Toast.makeText(this, String.valueOf(e), Toast.LENGTH_LONG).show();
                    }
                }
                if (entro) {
                    cont = Araña1prima.get(aux);
                    posicionarAraña1();
                    entro = false;
                    if (cont == 17) {
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Nivel4.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (entro2) {
                    cont = recorrerArbol1();
                    posicionarAraña1();
                    entro2 = false;
                    if (cont == 17) {
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Nivel4.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (cont == 17) {
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("PERDISTE");
                    buldier.setMessage("PERDISTE.");
                    buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(Nivel4.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
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
                            Toast.makeText(Nivel4.this, "El boton de arriba :)", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Dialog dialog = buldier.create();
                    dialog.show();
                    finish = true;

                }


            }
        }



    }

    public int recorrerArbol2(){
        Araña2copia.clear();
        Araña2primaCopia.clear();

        for (int i = 0; i< Araña2.size(); i ++){
            Araña2copia.add(Araña2.get(i));
            Araña2primaCopia.add(Araña2prima.get(i));
        }

        int nodoVisitado = 0, contAux = cont2;
        int i, diez = 0, comodin = 0;
        boolean entro, nodoVB = false, elegido = false, chale = false;
        try {


            while (!nodoVB) {
                diez++;
                i = 0;
                entro = false;
                if(chale) {
                    contAux = cont2;
                    chale = false;
                }
                while (i < Araña2copia.size()) {
                    if (Araña2copia.get(i) == contAux) {
                        aux2 = i;
                        entro = true;
                    }

                    i++;
                }
                if (entro) {
                    contAux = Araña2primaCopia.get(aux2);
                    if (!elegido)
                        nodoVisitado = contAux;
                    elegido = true;
                    if (contAux == 17) {
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
                    for (int j = 0; j < Araña2primaCopia.size(); j++) {
                        if (Araña2primaCopia.get(j) == nodoVisitado) {
                            Araña2copia.remove(j);
                            Araña2primaCopia.remove(j);
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

    public void recorrerRamas2(){
        int aux = 0;
        boolean entro = false, entro2 = false, finish = false;

        if(indicadorMov >=4) {
            while (!finish) {
                for (int i = 0; i < Araña2.size(); i++) {
                    try {
                        if (cont != 14 && cont2 != 12 && cont2 != 11 && cont2 != 9 && cont2 != 8) {
                            if (Araña2.get(i) == cont2 && Araña2.get(i + 1) == cont2) {
                                aux = i;
                                entro2 = true;

                            } else if (Araña2.get(i) == cont2 && Araña2prima.get(i) == 17 && !entro2) {
                                aux = i;
                                entro = true;
                            } else if (Araña2.get(i) == cont2 && Araña2.get(i + 1) != cont2 && !entro2) {
                                aux = i;
                                entro = true;

                            }
                        } else {
                            if (Araña2.get(i) == cont2) {
                                aux = i;
                                entro = true;
                            }
                        }
                    } catch (Exception e) {
                        Toast.makeText(this, String.valueOf(e), Toast.LENGTH_LONG).show();
                    }
                }
                if (entro) {
                    cont2 = Araña2prima.get(aux);
                    posicionarAraña2();
                    entro = false;
                    if (cont2 == 17) {
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Nivel4.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (entro2) {
                    cont2 = recorrerArbol2();
                    posicionarAraña2();
                    entro2 = false;
                    if (cont2 == 17) {
                        AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                        buldier.setTitle("PERDISTE");
                        buldier.setMessage("PERDISTE.");
                        buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(Nivel4.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                            }
                        });

                        Dialog dialog = buldier.create();
                        dialog.show();
                        finish = true;
                    }

                } else if (cont2 == 17) {
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("PERDISTE");
                    buldier.setMessage("PERDISTE.");
                    buldier.setPositiveButton("ACEPTAR", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(Nivel4.this, "ERES UN PERDEDOR :(", Toast.LENGTH_SHORT).show();
                        }
                    });

                    Dialog dialog = buldier.create();
                    dialog.show();
                } else {
                    AlertDialog.Builder buldier = new AlertDialog.Builder(this);
                    buldier.setTitle("GANASTE");
                    buldier.setMessage("GANASTE, ME QUEDÉ EN EL NODO " + cont2 + ".");
                    buldier.setTitle("GANASTE");
                    buldier.setMessage("GANASTE, ME QUEDÉ EN EL NODO " + cont2 + ". SIGUE ADELANTE.");
                    buldier.setPositiveButton("SIGUIENTE NIVEL", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(Nivel4.this, "El boton de arriba :)", Toast.LENGTH_SHORT).show();
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
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 0 && Araña1prima.get(i) == 1){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 0 && Araña2prima.get(i) == 1){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_0_1.setVisibility(View.INVISIBLE);
            flecha_0_1.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_0_2(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 0 && Araña1prima.get(i) == 2){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 0 && Araña2prima.get(i) == 2){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_0_2.setVisibility(View.INVISIBLE);
            flecha_0_2.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_0_3(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 0 && Araña1prima.get(i) == 3){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 0 && Araña2prima.get(i) == 3){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_0_3.setVisibility(View.INVISIBLE);
            flecha_0_3.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_1_4(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 1 && Araña1prima.get(i) == 4){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 1 && Araña2prima.get(i) == 4){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_1_4.setVisibility(View.INVISIBLE);
            flecha_1_4.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_2_4(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 2 && Araña1prima.get(i) == 4){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 2 && Araña2prima.get(i) == 4){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_2_4.setVisibility(View.INVISIBLE);
            flecha_2_4.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_2_8(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 2 && Araña1prima.get(i) == 8){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 2 && Araña2prima.get(i) == 8){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_2_8.setVisibility(View.INVISIBLE);
            flecha_2_8.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_2_3(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 2 && Araña1prima.get(i) == 3){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 2 && Araña2prima.get(i) == 3){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_2_3.setVisibility(View.INVISIBLE);
            flecha_2_3.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_3_8(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 3 && Araña1prima.get(i) == 8){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 3 && Araña2prima.get(i) == 8){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_3_8.setVisibility(View.INVISIBLE);
            flecha_3_8.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_4_5(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 4 && Araña1prima.get(i) == 5){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 4 && Araña2prima.get(i) == 5){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_4_5.setVisibility(View.INVISIBLE);
            flecha_4_5.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_5_6(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 5 && Araña1prima.get(i) == 6){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 5 && Araña2prima.get(i) == 6){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_5_6.setVisibility(View.INVISIBLE);
            flecha_5_6.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_5_7(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 5 && Araña1prima.get(i) == 7){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 5 && Araña2prima.get(i) == 7){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_5_7.setVisibility(View.INVISIBLE);
            flecha_5_7.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_6_17(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 6 && Araña1prima.get(i) == 17){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 6 && Araña2prima.get(i) == 17){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_6_17.setVisibility(View.INVISIBLE);
            flecha_6_17.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_7_17(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 7 && Araña1prima.get(i) == 17){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 7 && Araña2prima.get(i) == 17){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_7_17.setVisibility(View.INVISIBLE);
            flecha_7_17.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_8_17(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 8 && Araña1prima.get(i) == 17){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 8 && Araña2prima.get(i) == 17){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_8_17.setVisibility(View.INVISIBLE);
            flecha_8_17.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_9_8(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 9 && Araña1prima.get(i) == 8){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 9 && Araña2prima.get(i) == 8){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_9_8.setVisibility(View.INVISIBLE);
            flecha_9_8.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_10_8(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 10 && Araña1prima.get(i) == 8){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 10 && Araña2prima.get(i) == 8){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_10_8.setVisibility(View.INVISIBLE);
            flecha_10_8.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_10_9(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 10 && Araña1prima.get(i) == 9){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 10 && Araña2prima.get(i) == 9){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_10_9.setVisibility(View.INVISIBLE);
            flecha_10_9.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_11_17(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 11 && Araña1prima.get(i) == 17){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 11 && Araña2prima.get(i) == 17){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_11_17.setVisibility(View.INVISIBLE);
            flecha_11_17.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_12_17(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 12 && Araña1prima.get(i) == 17){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 12 && Araña2prima.get(i) == 17){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_12_17.setVisibility(View.INVISIBLE);
            flecha_12_17.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_13_11(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 13 && Araña1prima.get(i) == 11){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 13 && Araña2prima.get(i) == 11){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_13_11.setVisibility(View.INVISIBLE);
            flecha_13_11.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_13_12(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 13 && Araña1prima.get(i) == 12){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 13 && Araña2prima.get(i) == 12){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_13_12.setVisibility(View.INVISIBLE);
            flecha_13_12.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_10_13(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 10 && Araña1prima.get(i) == 13){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 10 && Araña2prima.get(i) == 13){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_10_13.setVisibility(View.INVISIBLE);
            flecha_10_13.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_14_10(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 14 && Araña1prima.get(i) == 10){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 14 && Araña2prima.get(i) == 10){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_14_10.setVisibility(View.INVISIBLE);
            flecha_14_10.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_15_14(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 15 && Araña1prima.get(i) == 14){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 15 && Araña2prima.get(i) == 14){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_15_14.setVisibility(View.INVISIBLE);
            flecha_15_14.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_15_9(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 15 && Araña1prima.get(i) == 9){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 15 && Araña2prima.get(i) == 9){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_15_9.setVisibility(View.INVISIBLE);
            flecha_15_9.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_16_13(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 16 && Araña1prima.get(i) == 13){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 16 && Araña2prima.get(i) == 13){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_16_13.setVisibility(View.INVISIBLE);
            flecha_16_13.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }

    public void flecha_16_15(View view){
        if(indicadorMov <4){
            for (int i = 0; i< Araña1.size(); i++){
                if(Araña1.get(i) == 16 && Araña1prima.get(i) == 15){
                    Araña1.remove(i);
                    Araña1prima.remove(i);
                }
            }
            for (int i = 0; i< Araña2.size(); i++){
                if(Araña2.get(i) == 16 && Araña2prima.get(i) == 15){
                    Araña2.remove(i);
                    Araña2prima.remove(i);
                }
            }
            flecha_16_15.setVisibility(View.INVISIBLE);
            flecha_16_15.setEnabled(false);
            indicadorMov ++;
            numMovimientos--;
            numMov.setText(numMovimientos + " movimientos");
            recorrerRamas1();
            recorrerRamas2();
        }

    }
}
