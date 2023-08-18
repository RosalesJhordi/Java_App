
package com.mycompany.busqueda;

import java.util.Arrays;
import java.util.Scanner;

public class Busqueda {

    public static void main(String[] args) {
        
        System.out.println("\t Algoritmo de ordenamiento de numeros \n");
        Scanner v = new Scanner(System.in);
        int n1,n2,n3,n4,n5;
        
        System.out.print("\nIngrese priner numero: ");
        n1 = v.nextInt();
        System.out.print("Ingrese segundo numero: ");
        n2 = v.nextInt();
        System.out.print("Ingrese tercer numero: ");
        n3 = v.nextInt();
        System.out.print("Ingrese cuerto numero: ");
        n4 = v.nextInt();
        System.out.print("Ingrese quinto numero: ");
        n5 = v.nextInt();
        
        int[] numeros ={n1,n2,n3,n4,n5};
        
        System.out.print("\nOdernar de: \n1: Menor a mayor \n2: Mayor a menor \n Opcion: ");
        int op = v.nextInt();
        
        if(op == 1){
            Arrays.sort(numeros);
            System.out.println("\t MENOR A MAYOR \n Numeros: "+ Arrays.toString(numeros));
        }
        else if(op == 2){
            
        }
    }
}