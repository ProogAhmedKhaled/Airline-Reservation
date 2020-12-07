/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookingcarsystem;

import java.util.ArrayList;

public class BookingCarSystem {

    ArrayList<Vehicle> vehicleList;
    ArrayList<Person> CustomerList;
    ArrayList<Vehicle> rentedList;

    public BookingCarSystem() {

        vehicleList = new ArrayList<>();
        CustomerList = new ArrayList<>();
    }

    public boolean isExist(Vehicle ve) {

        boolean flag = false;
        for (Vehicle vehicleList1 : this.vehicleList) {
            if (vehicleList1.getID() == ve.getID()) {
                flag = true;
                break;
            }
        }
        return flag;
    }

    public void addvehical(Vehicle ve) {

        if (!isExist(ve)) {
            this.vehicleList.add(ve);
        } else {
            System.out.println("this " + ve.getClass().getName() + " Already Exists ");
        }
    }

    public void deletVehicle(Vehicle ve) {

        if (isExist(ve)) {
            this.vehicleList.remove(ve);
        }

    }

    public void showAvialableVechicle() {

        for (Vehicle vec : vehicleList) {

            System.out.println(vec.printDetails());
        }
    }

    public void cancelOrder(Person p, Vehicle ve) {

        for (int i = 0; i < p.getRented_Vehicle().size(); i++) {

            if (p.getRented_Vehicle().get(i).getID() == ve.getID()) {

                p.getRented_Vehicle().remove(i);
                System.out.println("Order Canceled ");
                break;
            }

        }

    }

    public void print_Current_Order_Details(Person p) {

        rentedList = p.getRented_Vehicle();

        for (int i = 0; i < rentedList.size(); i++) {

            System.out.println(p.printCustomer() + " \n Details of Rented Cars: \n" + rentedList.get(i).printDetails()
                    
                    + " | Taxes: " + rentedList.get(i).getTaxes() + " | Total Price: " + rentedList.get(i).getTotalPrice()
           
            );

            System.out.println("-------------------------------------------------------------------------------");
        }

    }

    public static void main(String[] args) {

        BookingCarSystem Book = new BookingCarSystem();

       
        Vehicle v1 = new Car(50, "Marcedes", 1500);
        Vehicle v2 = new Car(51, "KIA", 950);
        Vehicle v3 = new Van(80, "Toyota", 450);
        Vehicle v4 = new Van(81, "Chevorlet", 600);
        Vehicle v5 = new Truck(90, "Jumbo", 1000);
        Vehicle v6 = new Truck(91, "Isuzu", 500);

        Book.addvehical(v1);
        Book.addvehical(v2);
        Book.addvehical(v3);
        Book.addvehical(v4);
        Book.addvehical(v5);
        Book.addvehical(v6);

        /////////////////////////////////////////////////////////////////////////////
        Person customer = new Customer(29400929, "Ahmed", 012212);
        Person customer2 = new Customer(52554263, "Mostafa", 0111256);

        Person VIP = new VIPCustomer(9524552, "Sara", 0105245);

        Book.showAvialableVechicle();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        customer.rentAvehicle(v3, 20, Book);
        customer2.rentAvehicle(v6, 36, Book);
        VIP.rentAvehicle(v5, 50, Book);

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*");

        // Book.print_Current_Order_Details(customer);
        Book.print_Current_Order_Details(customer);
        Book.print_Current_Order_Details(customer2);
        Book.print_Current_Order_Details(VIP);

        Book.cancelOrder(customer2, v6); // canceled Mostafa Order 
        Book.print_Current_Order_Details(customer2);/// when i try to get order information of mostafa after i canceled it in previous line of code 

    }

}
