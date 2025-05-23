/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.expressaoregular;

/**
 *
 * @author igorxf
 */
public class ExpressaoRegular {

    public static void main(String[] args) {
        ExpressoesRegulares er = new ExpressoesRegulares();
        System.out.println("Números com 3 ou mais algarismos;");
        er.confere(er.LINGUAGEM1, "101010");
        er.confere(er.LINGUAGEM1, "10");

        System.out.println("palavras que contenham aa ou bb como subpalavra");
        er.confere(er.LINGUAGEM2, "bbab");
        er.confere(er.LINGUAGEM2, "babababa");

        System.out.println("números reais para também aceitar números negativos com expoente.");
        er.confere(er.REAL, "-123.456E-78");
        er.confere(er.REAL, "123..45");
//
    }
}
