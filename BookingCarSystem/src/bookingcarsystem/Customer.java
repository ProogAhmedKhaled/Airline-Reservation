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
public class Customer extends Person {

    public Customer(int LicenceID, String Name, int Phone) {
        super(LicenceID, Name, Phone);
    }

    @Override
    public String printCustomer() {
        return super.printCustomer();
    }

    @Override
    public void rentAvehicle(Vehicle ve, int days, BookingCarSystem admin) {

        super.rentAvehicle(ve, days, admin);

        double price = ve.getPrice();

        if (days > 35) {
            double taxes = price * .05;
            ve.setTaxes(taxes);
            ve.setTotalPrice(price + ve.getTaxes());

        } else {
         
            ve.setTotalPrice(price);
        }
    }

}
