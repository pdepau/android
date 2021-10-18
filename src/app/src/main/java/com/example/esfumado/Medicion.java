package com.example.esfumado;

/**
 *
 * AUTOR: Pau Blanes Climent
 * FECHA: 17/10/2021
 * DESCRIPCION: clase del objeto medicion
 *
 */


public class Medicion {
    int valor;
    String latitud;
    String longitud;
    long fecha;

    /**
     * constructor de Medicion, IMPORTANTE: String s me obligaba Android Studio a ponerlo sino daba fallo
     * @param valor
     * @param s
     * @param latitud
     * @param longitud
     */
    public  Medicion(int valor, String s, String latitud, String longitud){

        this.valor=valor;
        this.latitud=latitud;
        this.longitud=longitud;
        this.fecha=System.currentTimeMillis();
    }

    /**
     *
     * Getters y Setters de las variables de una medicion
     */
    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String location) {
        this.latitud = location;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String location) {
        this.longitud = location;
    }

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "{\"co2\":\"" + valor + "\" ,\"fecha\": \" " + fecha + "\",\"latitud\": \" "+ latitud +"\",\"longitud\":\" "+ longitud +"\"}";
    }
}