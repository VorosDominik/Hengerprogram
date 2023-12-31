/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HengerProgi;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Mertanihenger {
    private static int hengerdb=0;
    private double sugar,magasag;
    private static double AT=0,OSZFOGAT=0;

    public static double getAT() {
        return AT;
    }

    public static double getOSZFOGAT() {
        return OSZFOGAT;
    }
    

    public Mertanihenger(double sugar, double magasag) {
        this.sugar = sugar;
        this.magasag = magasag;
        hengerdb++;
        OSZFOGAT+=terfogat();
        AT=OSZFOGAT/Mertanihenger.getHengerdb();
    }

    public static int getHengerdb() {
        return hengerdb;
    }

    public double getSugar() {
        return sugar;
    }

    public double getMagasag() {
        return magasag;
    }
    public  double terfogat(){
    
        return 0;
    }
    

    @Override
    public String toString() {
        return  "; sugar=" + sugar + ", magasag=" + magasag + '}';
    }
    
    
}
