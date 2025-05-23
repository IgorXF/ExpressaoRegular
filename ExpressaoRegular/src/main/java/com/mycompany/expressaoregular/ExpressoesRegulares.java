/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.expressaoregular;

/**
 *
 * @author igorxf
 */
public class ExpressoesRegulares {
    
    public  String LINGUAGEM1 = "(0|1)(0|1)(0|1)+";
    public  String LINGUAGEM2 = "((a|b)*(aa|bb)(a|b)*)";
    
    public String BRANCO = "[ \n\t\b\r]";
    public String BRANCOS = BRANCO + "*";

    public String DIGITO = "[0-9]";
    public String DIGITOS = DIGITO + "*";

    public String LETRA = "[a-zA-Z]";
    public String LETRAS = LETRA + "*";

    public String EXPONENCIAL = "(E(\\+|\\-)"+ DIGITOS + ")";
    public String FRACIONARIA = "(\\." + DIGITOS + ")";

    public String REAL = "\\-?" + DIGITOS + "(" + FRACIONARIA + ")?" + "(" + EXPONENCIAL + ")?";
    public String INTEIRO = "\\-?" + DIGITOS;
    public String NUMEROS = "(" + INTEIRO + ")|(" + REAL + ")";
    
    
    public void confere(String expressaoRegular, String sentenca) {
        if (sentenca.matches(expressaoRegular)) {
            System.out.println("Sentença aceita");
        } else {
            System.out.println("Sentença rejeitada");
        }
    }
}
