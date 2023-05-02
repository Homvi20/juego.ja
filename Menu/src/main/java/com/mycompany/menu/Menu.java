
package com.mycompany.menu;
import java.util.*;

public class Menu {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String Nombre = "";
        Enano e = new Enano(Nombre,"Enano", "Hacha", 50, 15, 1, "Helhein");
        Elfo f = new Elfo(Nombre, "Elfo", "Daga", 100, 20, 2, "Eldar");
        Hombre h = new Hombre(Nombre, "Humano", "Mandoble",75, 10, 3,"Patriarcado");
           
        int p1,p2, daño_ataque; 
        String continuar;
        
        do{
            System.out.println("BIENVENIDO AL SIMULADOR DE BATALLAS\n");
            System.out.println("Menu de batallas\n");
            System.out.println("Ingrese 1 para jugar con Enano");
            System.out.println("Ingrese 2 para jugar con Elfo");
            System.out.println("Ingrese 3 para jugar con Humano");
            p1 = leer.nextInt();
            
            if(p1==1){
                System.out.println("Usted ha escogido al enano");
                System.out.println("Escoja un nombre para su guerrero: ");
                e.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + e.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+e.getNombre()+" vs Elfo");
                System.out.println("(2) "+e.getNombre()+" vs Humano");
                
            }
            else if(p1==2){
                System.out.println("Usted ha escogido al elfo");
                System.out.println("Escoja un nombre para su guerrero: ");
                f.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + f.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+f.getNombre()+" vs Enano");
                System.out.println("(2) "+f.getNombre()+" vs Humano");
            }
            else if(p1==3){
                System.out.println("Usted ha escogido al humano");
                System.out.println("Escoja un nombre para su guerrero: ");
                h.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + h.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+h.getNombre()+" vs Enano");
                System.out.println("(2) "+h.getNombre()+" vs Elfo");
            }
                            
            
            System.out.println("Si desea continuar jugando ingrese Si, de lo contrario No");
            continuar = leer.next();
                    
                   
            while((!"Si".equals(continuar)) && (!"No".equals(continuar)) ){
            System.out.println("Error Debe ingresar Si o No");
            System.out.println("Desea continuar ingrese Si, para salir ingrese No");            
            continuar = leer.next();
                    }
                    
            }while("Si".equals(continuar));
            
            
            
        }
        
        
}

