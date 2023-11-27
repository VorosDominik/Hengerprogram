/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HengerProgi;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class Cso extends TomorHenger{
    private double falvastagsag;
    static double csovekoszsuly=0;

    public Cso(double falvastagsag, double fajsuly, double sugar, double magasag) {
        super(fajsuly, sugar, magasag);
        this.falvastagsag = falvastagsag;
        csovekoszsuly+=suly();
    }

    public Cso(double falvastagsag, double sugar, double magasag) {
        this(falvastagsag,1.0, sugar, magasag);
      
    }

    public static double getCsovekoszsuly() {
        return csovekoszsuly;
    }
    

    public double getFalvastagsag() {
        return falvastagsag;
    }
    public String szoveg(){
       String szov= super.toString().replace("TomorHenger", "");
       szov=szov.replace("{", "");
       szov=szov.replace("}", "");
        
        
        return szov;
    }

    @Override
    public double terfogat() {
        return (Math.PI * Math.pow(getSugar(), 2) * getMagasag()) -(Math.PI * Math.pow((getSugar()-falvastagsag), 2) * getMagasag());
    }

    public double suly() {
        return terfogat() * getFajsuly();
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag +szoveg() + '}';
    }
    
    
    
}
