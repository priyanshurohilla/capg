/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capg;

/**
 *
 * @author priya
 */
class Address{
 String city;
 public Address(String city){ this.city = city; }
}

public class Customer {
 int cid;
 Address addr;
 
 public Customer( int cid ){ this.cid = cid; }
 public void setAddress(Address addr){ this.addr = addr;}

 public static void main(String[] args) {
  Address a1 = new Address("Bangalore");
  Customer c2 = new Customer(101);
     System.out.println("abc");
  System.out.print(c2.cid + c2.addr.city);
 }
}
