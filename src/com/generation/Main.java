package com.generation;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// estructura de control IF
        /*if(cond){

        }else if{

        }else{

        }*/
    Scanner sc = new Scanner(System.in);
    /*System.out.println("Teclea tu edad");
        int edad = sc.nextInt();
    System.out.println("¿Como te llamas?");
        sc.nextLine();
        String nombre = sc.nextLine();

    if(edad >= 18)
        System.out.println("Felicidades "+ nombre +" Puedes Votar");
    else
        System.out.println("Hola "+nombre+" Aun no puedes votar");
    sc.close();*/

        /*System.out.println("Programa que te dice si es un triángulo Valido");
        System.out.println("Teclea el valor del primer ángulo");
        int ang1 = sc.nextInt();
        System.out.println("Teclea el valor del segundo ángulo");
        sc.nextLine();
        int ang2 = sc.nextInt();
        System.out.println("Teclea el valor del tercer ángulo");
        sc.nextLine();
        int ang3 = sc.nextInt();

        if((ang1+ang2+ang3)==180)
            System.out.println("Triángulo Valido");
        else
            System.out.println("La suma de los ángulos es diferente a 180, no es un triángulo valido");*/
        /*System.out.println("Programa que te dice si es un año Bisiesto");
        System.out.println("Teclea el año");
        int anio = sc.nextInt();
        if(anio%4==0 && (anio%100!=0 || anio%400==0))
            System.out.println("Es un Año bisiesto");
        else
            System.out.println("No es un Año bisiesto");*/
        //Control de Flujo Switch
        /*switch (condicion) {
            case 1:
                codigo
                break;
            case 2:
                codigo
                break;
            default:
                break;*/
        /*System.out.println("Calculadora con Switch");
        System.out.println("Teclea un numero");
        int num1 = sc.nextInt();
        System.out.println("Teclea otro numero");
        int num2 = sc.nextInt();
        System.out.println("Que operación deseas realizar:\n1)Suma\n2)Resta\n3)Multiplicación\n4)División");
        int op = sc.nextInt();
        sc.nextLine();
        float resultado=0;
        switch (op){
            case 1:
                resultado=num1+num2;
                System.out.println("La suma de "+num1+" + "+num2+" = "+resultado);
                break;
            case 2:
                resultado=num1-num2;
                System.out.println("La resta de "+num1+" - "+num2+" = "+resultado);
                break;
            case 3:
                resultado=num1*num2;
                System.out.println("El producto de "+num1+" * "+num2+" = "+resultado);
                break;
            case 4:
                if (num2!=0) {
                    resultado = num1 / num2;
                    System.out.println("El cociente de " + num1 + " / " + num2 + " = " + resultado);
                }else
                    System.out.println("Nose puede dividir entre 0");
                break;
            default:
                System.out.println("Opción No valida");
                break;
                sc.close();*/
        System.out.println("Dias de la semana con numeros");
        int num1;
        do {
            System.out.println("Teclea un numero");
            num1 = sc.nextInt();
            switch (num1) {
                case 1:
                    System.out.println("Lunes");
                    break;
                case 2:
                    System.out.println("Martes");
                    break;
                case 3:
                    System.out.println("Miercoles");
                    break;
                case 4:
                    System.out.println("Jueves");
                    break;
                case 5:
                    System.out.println("Viernes");
                    break;
                case 6:
                    System.out.println("Sabado");
                    break;
                case 7:
                    System.out.println("Domingo");
                    break;
                default:
                    System.out.println("Opción No valida");
                    break;
            }
        }while(num1<1 || num1>8);
        sc.close();
        }
    }

