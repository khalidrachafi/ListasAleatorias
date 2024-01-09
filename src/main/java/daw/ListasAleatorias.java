/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author khalid
 */
public class ListasAleatorias {
    Random random = new Random();
    
    ArrayList<Character> lista1= new ArrayList<>();
    ArrayList<Character> lista2= new ArrayList<>();
    ArrayList<Character> lista3= new ArrayList<>();

    public ListasAleatorias() {
      this.lista1 = GeneradorChar1();
      this.lista2 = GeneradorChar2();
        
    }
    
    
    
    
    
    public ArrayList GeneradorChar1(){
         int tam= random.nextInt(10,21);
         for (int i = 0; i < tam; i++) {
            int gen=random.nextInt(26);
            char charAleatorio = (char) ('a' + gen);
            
            lista1.add(charAleatorio);
        }
         return lista1;
    }
    
    public ArrayList GeneradorChar2(){
         int tam= random.nextInt(10,21);
         for (int i = 0; i < tam; i++) {
            int gen=random.nextInt(26);
            char charAleatorio = (char) ('a' + gen);
            
            lista2.add(charAleatorio);
        }
         return lista2;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lista1.size(); i++) {
            sb.append(lista1.get(i));
        }
        sb.append("\n");
        for (int i = 0; i < lista2.size(); i++) {
            sb.append(lista2.get(i));
        }
        return sb.toString();
    }
    
    

    
    //En un programa nuevo, crea dos listas de tamaño aleatorio de letras 
//    entre la 'a' y la 'z'. Estas listas deben tener entre 10 y 20 elementos. 
//    Una vez creadas las listas, imprime por pantalla sus elementos usando 
//    un foreach. Crea una tercera lista con los elementos de la primera 
//    que no están en la segunda. Imprime el resultado usando API Stream y lambdas.
   
}

 