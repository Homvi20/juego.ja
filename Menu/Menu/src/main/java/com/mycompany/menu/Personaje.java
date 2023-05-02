
package com.mycompany.menu;
import java.util.Random;

public class Personaje {
    private String nombre, raza, arma;
    private int vida, daño, bonificacion;
    
    private Random rand = new Random(System.nanoTime());

    public Personaje(String nombre, String raza, String arma, int vida, int daño, int bonificacion) {
        this.nombre = nombre;
        this.raza = raza;
        this.arma = arma;
        this.vida = vida;
        this.daño = daño;
        this.bonificacion = bonificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getArma() {
        return arma;
    }

    public void setArma(String arma) {
        this.arma = arma;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getDaño() {
        return daño;
    }

    public void setDaño(int daño) {
        this.daño = daño;
    }

    public int getBonificacion() {
        return bonificacion;
    }

    public void setBonificacion(int bonificacion) {
        this.bonificacion = bonificacion;
    }
    
    public String Atributos(){
        return"- Nombre: "+this.nombre+"\n" +"- Raza: "+this.raza+"\n"+"- Arma: "+this.arma+"\n" + "- Vida: "+this.vida+"\n"+"- Daño: "+this.daño+"\n";
    }
    
    public int Atacar(Personaje p2){
        int daño_total;
         daño_total =(p2.getVida() - this.daño);
         p2.setVida(daño_total);
        return daño_total;
    }
    
 
    public String Aleatorio(){
        String raz[] = {"Enano","Elfo","Humano"};
        int random = (int)(Math.random()*2+0);
        return raz[random];
    }
   
    
} 
