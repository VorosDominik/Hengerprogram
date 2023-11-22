/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package HengerProgi;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Hengerprogram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Mertanihenger  h1=new TomorHenger(5.0, 4.0);
        Mertanihenger  h2=new TomorHenger(3.0, 5.0, 10.0);
        Mertanihenger  h3=new Cso(2.5, 5.0, 10.0);
        Mertanihenger  h4=new Cso(2.0, 5.0, 10.0, 20.0);
        
        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h3);
        System.out.println(h4);
        
    }
    
}
