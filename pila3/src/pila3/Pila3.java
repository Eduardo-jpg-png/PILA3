package pila3;

import java.util.Scanner;

public class Pila3 {
   public static void main(String[] args) {
   Scanner sc = new Scanner (System.in);
   int opcion=0, opt=100;
   System.out.println("Introduce el tamaño de la pila ");
   int tam=sc.nextInt();
   int pilaA[] =new int [opt];
   int pilaB [] = new int [opt];
   int pilaC[] = new int [opt];
   do{
       System.out.println("Menu principal\n"
               + "1-Llenar pila A,B\n"
               + "2-Mostrar pilas A,B\n"
               + "3-Vaciar pilas A,B\n"
               + "4-Unir pilas\n"
               + "5-Mostrar pila C\n"
               + "6-Salir");
       switch(opcion =sc.nextInt()){
           case 1:
                for (int i=0; i<tam; i++) {
                pilaA[i] = (int) (Math.random()*100+1);
                }
                System.out.println("Pila A llena");
                for (int i=0; i<tam; i++) {
                pilaB[i] = (int) (Math.random()*100+100);
                }
                System.out.println("Pila B llena");
               break;
           case 2:
               System.out.println("Elementos de la pila A\n");
                for (int i=0; i<tam; i++) {
                System.out.print(pilaA[i] + " \n");
                }
                System.out.println("Elementos de la pila B\n");
                for (int i=0; i<=tam; i++) {
                System.out.print(pilaB[i] + " \n");
                }
               break;
           case 3:
               if(tam==tam){
                   System.out.println("Pilas vacias");
               }
               break;
           case 4:
               for (int i=0; i <tam; i++){
                   pilaC[i] = pilaA[i] + pilaB[i];
               }
               System.out.println("Pilas unidas");
               break;
           case 5:
               for (int i=0; i <tam; i++){
                   pilaC[i] = pilaA[i] + pilaB[i];
                              System.out.println(pilaC[i]);
               }
               break;
       }
   }while(opcion !=6);
       }
            }

