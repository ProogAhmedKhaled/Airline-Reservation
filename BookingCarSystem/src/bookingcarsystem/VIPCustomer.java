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
public class VIPCustomer extends Person {

    public VIPCustomer(int LicenceID, String Name, int Phone) {
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
        double taxes = price * .15; // beacuse it's a vip Cusomer 

        /// if he or she rent a vehicle for more than 35 we add another taxes
        if (days > 35) {
            ve.setTaxes(taxes);
            ve.setTotalPrice(price + ve.getTaxes());
        } else {
            ve.setTotalPrice(price + taxes);
        }
    }

}
