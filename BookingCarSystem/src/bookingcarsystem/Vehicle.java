/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingcarsystem;

/**
 *
 * @author AHMED 50070
 */
public class Vehicle {

    int ID;
    String Model;
    double Price , Taxes , TotalPrice ;

   
    public Vehicle(int ID, String Model, double Price) {
        this.ID = ID;
        this.Model = Model;
        this.Price = Price;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
     public double getTaxes() {
        return Taxes;
    }

    public void setTaxes(double Taxes) {
        this.Taxes = Taxes;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }
    

    
    
    public String printDetails() {
        return "ID: " + ID + " | Model: " + Model + " | Price: " + Price + " | Type: " + getClass().getSimpleName();
    }

}
