package com.example.esfumado;
/**
 *
 * AUTOR: Pau Blanes Climent
 * FECHA: 17/10/2021
 * DESCRIPCION: clase que simula la clase logica del servidor REST con la finalidad de poder comunicarse con el servidor
 *
 */

import android.util.Log;

public class LogicaFake {
    public LogicaFake(){

    }
    public Medicion obtenerUltimasMediciones(int cuantas){

        return null;
    }
    public Medicion obtenerTodasLasMediciones(){

        return null;
    }

    /**
     * funcion encargada de postear la medicion recibida
     * @param medicion
     */
    public void insertarMedicion(Medicion medicion) {
        Thread thread1 = new Thread(() -> {
            try {
                CheckURL check = new CheckURL();
                try {
                    String s = check.doInBackground("http://192.168.0.164:8080/medicion/" + medicion.toString(), "POST");
                    Log.d("POST", s);

                } catch (Exception e) {
                    Log.d("POST", e.toString());
                }
                //Your code goes here
            } catch (Exception e) {
                e.printStackTrace();
            }
        });

        thread1.start();
    }
}

