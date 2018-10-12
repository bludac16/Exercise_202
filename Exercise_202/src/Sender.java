/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author David
 */
public class Sender {
    private String name;
    private double frequenz;
    private String band;

    public Sender(String name, double frequenz, String band) {
        this.name = name;
        this.frequenz = frequenz;
        this.band = band;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFrequenz() {
        return frequenz;
    }

    public void setFrequenz(double frequenz) {
        this.frequenz = frequenz;
    }

    public String getBand() {
        return band;
    }

    public void setBand(String band) {
        this.band = band;
    }
    
    
}
