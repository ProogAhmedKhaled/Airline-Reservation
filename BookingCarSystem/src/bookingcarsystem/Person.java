/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingcarsystem;

import java.util.ArrayList;

/**
 *
 * @author AHMED 50070
 */
public class Person {

    private int LicenceID;
    private String Name;
    private int Phone;

    ArrayList<Vehicle> rented_Vehicle;

    public Person(int LicenceID, String Name, int Phone) {
        this.LicenceID = LicenceID;
        this.Name = Name;
        this.Phone = Phone;

        rented_Vehicle = new ArrayList();

    }

    

    public int getLicenceID() {
        return LicenceID;
    }

    public void setLicenceID(int LicenceID) {
        this.LicenceID = LicenceID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getPhone() {
        return Phone;
    }

    public void setPhone(int Phone) {
        this.Phone = Phone;
    }

    public ArrayList<Vehicle> getRented_Vehicle() {
        return rented_Vehicle;
    }

    public void setRented_Vehicle(Vehicle vehicle) {

        this.rented_Vehicle.add(vehicle);

    }

    public void rentAvehicle(Vehicle ve, int days, BookingCarSystem admin) {

        if (ve != null) {

            if (admin.isExist(ve)) {

                this.setRented_Vehicle(ve);

                admin.deletVehicle(ve);

            } else {
                System.out.println("this " + ve.getClass().getSimpleName() + " Already Rented");
            }
        } else {
            System.out.println("Sorry you Entered Wrong ID ");
        }

    }

    public String printCustomer() {
        return "Licence ID: " + LicenceID + " | Name: " + Name + " | Phone: " + Phone + " | Type: " + getClass().getSimpleName();
    }

}
