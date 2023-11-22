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

    public Cso(double falvastagsag, double fajsuly, double sugar, double magasag) {
        super(fajsuly, sugar, magasag);
        this.falvastagsag = falvastagsag;
    }

    public Cso(double falvastagsag, double sugar, double magasag) {
        super(sugar, magasag);
        this.falvastagsag = falvastagsag;
    }

    public double getFalvastagsag() {
        return falvastagsag;
    }

    @Override
    public double terfogat() {
        return super.terfogat(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public String toString() {
        return "Cso{" + "falvastagsag=" + falvastagsag +super.toString().replace("TomorHenger", "") + '}';
    }
    
    
    
}
