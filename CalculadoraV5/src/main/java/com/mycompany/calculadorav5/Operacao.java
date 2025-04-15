/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadorav5;

/**
 *
 * @author Professor
 */
public class Operacao {
    public static double somar(double v1, double v2){
        return v1+v2;
    }
    
    public static double subtrair(double v1, double v2){
        return v1 - v2;
    }
    
    public static double multiplicar(double v1, double v2){
        return v1* v2;
    }
    
    public static double dividir(double v1, double v2) throws Exception{
        if(v2 == 0){
            throw new Exception("Div By Zero");
        }else{
            return v1/v2;
        }
    }
}
