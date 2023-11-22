/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HengerProgi;

/**
 *
 * @author VörösDominik(SZF_202
 */
public class TomorHenger extends Mertanihenger{
    private double fajsuly;

    public TomorHenger(double fajsuly, double sugar, double magasag) {
        super(sugar, magasag);
        this.fajsuly = fajsuly;
    }

    public TomorHenger(double sugar, double magasag) {
        super(sugar, magasag);
        this.fajsuly=1.0;
    }

    public double getFajsuly() {
        return fajsuly;
    }
    public double suly(){
    
        return 0;
    
    } 

    @Override
    public String toString() {
        return "TomorHenger{" + "fajsuly=" + fajsuly +super.toString()+ '}';
    }
    
    
    

    
    
    
}
