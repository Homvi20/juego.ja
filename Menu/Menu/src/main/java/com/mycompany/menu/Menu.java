
package com.mycompany.menu;
import java.util.*;

public class Menu {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String Nombre = "";
        Enano e = new Enano(Nombre,"Enano", "Hacha", 50, 15, 1, "Helhein");
        Elfo f = new Elfo(Nombre, "Elfo", "Daga", 100, 20, 2, "Eldar");
        Hombre h = new Hombre(Nombre, "Humano", "Mandoble",75, 10, 3,"Patriarcado");
        Combate C = new Combate();   
        int p1,p2;
        String continuar;
        
        do{
            System.out.println("BIENVENIDO AL SIMULADOR DE BATALLAS\n");
            System.out.println("Menu de batallas\n");
            System.out.println("1) Jugar con Enano");
            System.out.println("2) Jugar con Elfo");
            System.out.println("3) Jugar con Humano");
            System.out.print("Escribe una opcion: " );
            p1 = leer.nextInt();
            
            if(p1==1){
                System.out.println("\nUsted ha escogido al enano");
                System.out.print("Escoja un nombre para su guerrero: ");
                e.setNombre(leer.next());
                System.out.println("\nEstos son los atributos de su personaje: \n" + e.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+e.getNombre()+" vs Elfo");
                System.out.println("(2) "+e.getNombre()+" vs Humano");
                p2 = leer.nextInt();
                
                if(p2==1){
                    f.setNombre("Legolas");
                    int I = 0;
                    
                    while(9>I){  
                        e.Atacar(f);
                        f.Atacar(e);
  
                        if(f.getVida()<0){
                        f.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        
                        else{
                         I= I + 1;   
                        }
                        
                        System.out.println(e.getNombre()+ " ataco a " + f.getNombre()+" con su "+ e.getArma());
                        System.out.println(f.getNombre()+" sangra");
                        System.out.println("La vida de " + f.getNombre() + " baja a " + f.getVida()+"\n" );

                        System.out.println(f.getNombre()+ " ataco a " + e.getNombre()+" con su "+ f.getArma());
                        System.out.println(e.getNombre()+" sangra");
                        System.out.println("La vida de " + e.getNombre() + " baja a " + e.getVida()+"\n" );

                    }
                    
                    if( e.getVida() == 0 ){
                        System.out.println(f.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                    
                    else{
                        System.out.println(e.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
   
                }                
                else{
                    h.setNombre("Kratos");
                    int I = 0;
                    
                    while(9>I){  
                        e.Atacar(h);
                        h.Atacar(e);
  
                        if(h.getVida()<0){
                        h.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        
                        else{
                         I= I + 1;   
                        }
                        
                        System.out.println(e.getNombre()+ " ataco a " + h.getNombre()+" con su "+ e.getArma());
                        System.out.println(h.getNombre()+" sangra");
                        System.out.println("La vida de " + h.getNombre() + " baja a " + h.getVida()+"\n" );

                        System.out.println(h.getNombre()+ " ataco a " + e.getNombre()+" con su "+ h.getArma());
                        System.out.println(e.getNombre()+" sangra");
                        System.out.println("La vida de " + e.getNombre() + " baja a " + e.getVida()+"\n" );

                    }
                    if( e.getVida() == 0 ){
                        System.out.println(h.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                    
                    else{
                        System.out.println(e.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                }                
                
            }
            else if(p1==2){
                System.out.println("Usted ha escogido al elfo");
                System.out.println("Escoja un nombre para su guerrero: ");
                f.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + f.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+f.getNombre()+" vs Enano");
                System.out.println("(2) "+f.getNombre()+" vs Humano");
                p2 = leer.nextInt();
                
                if(p2==1){
                    e.setNombre("Gymli");
                    int I = 0;
                    
                    while(9>I){  
                        f.Atacar(e);
                        e.Atacar(f);
  
                        if(f.getVida()<0){
                        f.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(e.getVida()<=0){                           
                        e.setVida(0);
                        I = 10;    
                        }
                        
                        else{
                         I= I + 1;   
                        }
                        
                        System.out.println(f.getNombre()+ " ataco a " + e.getNombre()+" con su "+ f.getArma());
                        System.out.println(e.getNombre()+" sangra");
                        System.out.println("La vida de " + e.getNombre() + " baja a " + e.getVida()+"\n" );

                        System.out.println(e.getNombre()+ " ataco a " + f.getNombre()+" con su "+ e.getArma());
                        System.out.println(f.getNombre()+" sangra");
                        System.out.println("La vida de " + f.getNombre() + " baja a " + f.getVida()+"\n" );

                    }
                    
                    if( e.getVida() == 0 ){
                        System.out.println(f.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                    
                    else{
                        System.out.println(e.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                   
                }                
                else{
                    h.setNombre("Kratos");
                    int I = 0;
                    
                    while(9>I){  
                        f.Atacar(h);
                        h.Atacar(f);
  
                        if(f.getVida()<0){
                        f.setVida(0);                     
                        I = 10;   
                        }
                        
                        if(h.getVida()<=0){                           
                        h.setVida(0);
                        I = 10;    
                        }
                        
                        else{
                         I= I + 1;   
                        }
                        
                        System.out.println(f.getNombre()+ " ataco a " + h.getNombre()+" con su "+ f.getArma());
                        System.out.println(h.getNombre()+" sangra");
                        System.out.println("La vida de " + h.getNombre() + " baja a " + h.getVida()+"\n" );

                        System.out.println(h.getNombre()+ " ataco a " + f.getNombre()+" con su "+ h.getArma());
                        System.out.println(f.getNombre()+" sangra");
                        System.out.println("La vida de " + f.getNombre() + " baja a " + f.getVida()+"\n" );

                    }
                    
                    if( h.getVida() == 0 ){
                        System.out.println(f.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                    
                    else{
                        System.out.println(h.getNombre()+" latimado por la batalla, selebra su victoria \n");
                    }
                }                
            }
            else if(p1==3){
                System.out.println("Usted ha escogido al humano");
                System.out.println("Escoja un nombre para su guerrero: ");
                h.setNombre(leer.next());
                System.out.println("Estos son los atributos de su personaje: \n" + h.Atributos());
                System.out.println("Escoja contra quien quiere combatir: ");
                System.out.println("(1) "+h.getNombre()+" vs Enano");
                System.out.println("(2) "+h.getNombre()+" vs Elfo");
                p2 = leer.nextInt();
                
                if(p2==1){
                    e.setNombre("Gymli");
                
                   
                }                
                else{
                    f.setNombre("Legolas");
                }                
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

