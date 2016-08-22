/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyyracard;

import java.util.Scanner;

/**
 *
 * @author josel
 */
public class LyyraCard {
    Scanner teclado = new Scanner(System.in);
    private double balance;

    public LyyraCard(double saldoInicial) {
        this.balance=saldoInicial;
    }
    
    public String toString() {
        
        return "usted tiene " +this.balance+ " Euros";
    }
    public void payEconomical() {
    this.balance=balance-2.50;
    
    }

    public void payGourmet() {
    this.balance=balance-4.00;
    }
 
    
    public void loadMoney(double monto) {
      
        this.balance=balance+monto;
}
    

    public static void main(String[] args) {
        
        LyyraCard cardPekka = new LyyraCard(20);
        LyyraCard cardBrian = new LyyraCard(30);
        cardPekka.payGourmet();
        cardBrian.payEconomical();
        System.out.println("pekka: "+cardPekka);
        System.out.println("pekka: "+cardBrian);
       
        cardPekka.loadMoney(20);
        cardBrian.payGourmet();
        System.out.println("pekka: "+cardPekka);
        System.out.println("pekka: "+cardBrian);
        cardPekka.payEconomical();
        cardPekka.payEconomical();
        cardBrian.loadMoney(50);
        System.out.println("pekka: "+cardPekka);
        System.out.println("pekka: "+cardBrian);
        
       
    }

}