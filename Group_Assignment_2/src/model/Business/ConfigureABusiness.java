/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.Business;

import java.util.Random;
import model.Business.Business;
import model.CustomerManagement.CustomerDirectory;
import model.CustomerManagement.CustomerProfile;
import model.MarketingManagement.MarketingPersonDirectory;
import model.MarketingManagement.MarketingPersonProfile;
import model.OrderManagement.MasterOrderList;
import model.OrderManagement.Order;
import model.OrderManagement.OrderItem;
import model.Personnel.EmployeeDirectory;
import model.Personnel.EmployeeProfile;
import model.Personnel.Person;
import model.Personnel.PersonDirectory;
import model.ProductManagement.Product;
import model.ProductManagement.ProductCatalog;
import model.SalesManagement.SalesPersonDirectory;
import model.SalesManagement.SalesPersonProfile;
import model.Supplier.Supplier;
import model.Supplier.SupplierDirectory;
import model.UserAccountManagement.UserAccount;
import model.UserAccountManagement.UserAccountDirectory;

/**
 *
 * @author kal bugrara
 */
public class ConfigureABusiness {

  public static Business initialize() {
    Business business = new Business("Xerox");
    // Adding some default data for simulation purposes
    // Getting supplier directory
    SupplierDirectory supplierDir = business.getSupplierDirectory();
    // Creating suppliers and adding it in supplier directory
    Supplier supplier1 = supplierDir.newSupplier("Supplier1");
    Supplier supplier2 = supplierDir.newSupplier("Supplier2");
    Supplier supplier3 = supplierDir.newSupplier("Supplier3");
    Supplier supplier4 = supplierDir.newSupplier("Supplier4");
    Supplier supplier5 = supplierDir.newSupplier("Supplier5");
    Supplier supplier6 = supplierDir.newSupplier("Supplier6");
    // Getting product catalog for supplier 1
    ProductCatalog prodCatalog1 = supplier1.getProductCatalog();
    // Creating products and adding it in product catalog
    // Supplier 1
    Product supp1Prod1 = prodCatalog1.newProduct("Laptop", 100, 200, 150);
    Product supp1Prod2 = prodCatalog1.newProduct("Smartphone", 150, 200, 175);
    Product supp1Prod3 = prodCatalog1.newProduct("Tablet", 200, 250, 230);
    Product supp1Prod4 = prodCatalog1.newProduct("Headphones", 145, 200, 158);
    Product supp1Prod5 = prodCatalog1.newProduct("Monitor", 200, 300, 240);
    Product supp1Prod6 = prodCatalog1.newProduct("Keyboard", 100, 300, 210);
    Product supp1Prod7 = prodCatalog1.newProduct("Mouse", 70, 150, 110);
    Product supp1Prod8 = prodCatalog1.newProduct("Printer", 45, 100, 60);
    Product supp1Prod9 = prodCatalog1.newProduct("Camera", 400, 700, 650);
    Product supp1Prod10 = prodCatalog1.newProduct("Smartwatch", 600, 900, 750);

    // Supplier 2
    ProductCatalog prodCatalog2 = supplier2.getProductCatalog();
    Product supp2Prod1 = prodCatalog2.newProduct("Laptop", 100, 200, 150);
    Product supp2Prod2 = prodCatalog2.newProduct("Smartphone", 150, 200, 175);
    Product supp2Prod3 = prodCatalog2.newProduct("Tablet", 200, 250, 230);
    Product supp2Prod4 = prodCatalog2.newProduct("Headphones", 145, 200, 158);
    Product supp2Prod5 = prodCatalog2.newProduct("Monitor", 200, 300, 240);
    Product supp2Prod6 = prodCatalog2.newProduct("Keyboard", 100, 300, 210);
    Product supp2Prod7 = prodCatalog2.newProduct("Mouse", 70, 150, 110);
    Product supp2Prod8 = prodCatalog2.newProduct("Printer", 45, 100, 60);
    Product supp2Prod9 = prodCatalog2.newProduct("Camera", 400, 700, 650);
    Product supp2Prod10 = prodCatalog2.newProduct("Smartwatch", 600, 900, 750);

    // Supplier 3
    ProductCatalog prodCatalog3 = supplier3.getProductCatalog();
    Product supp3Prod1 = prodCatalog3.newProduct("Laptop", 100, 200, 150);
    Product supp3Prod2 = prodCatalog3.newProduct("Smartphone", 150, 200, 175);
    Product supp3Prod3 = prodCatalog3.newProduct("Tablet", 200, 250, 230);
    Product supp3Prod4 = prodCatalog3.newProduct("Headphones", 145, 200, 158);
    Product supp3Prod5 = prodCatalog3.newProduct("Monitor", 200, 300, 240);
    Product supp3Prod6 = prodCatalog3.newProduct("Keyboard", 100, 300, 210);
    Product supp3Prod7 = prodCatalog3.newProduct("Mouse", 70, 150, 110);
    Product supp3Prod8 = prodCatalog3.newProduct("Printer", 45, 100, 60);
    Product supp3Prod9 = prodCatalog3.newProduct("Camera", 400, 700, 650);
    Product supp3Prod10 = prodCatalog3.newProduct("Smartwatch", 600, 900, 750);

    // Supplier 4
    ProductCatalog prodCatalog4 = supplier4.getProductCatalog();
    Product supp4Prod1 = prodCatalog4.newProduct("Laptop", 100, 200, 150);
    Product supp4Prod2 = prodCatalog4.newProduct("Smartphone", 150, 200, 175);
    Product supp4Prod3 = prodCatalog4.newProduct("Tablet", 200, 250, 230);
    Product supp4Prod4 = prodCatalog4.newProduct("Headphones", 145, 200, 158);
    Product supp4Prod5 = prodCatalog4.newProduct("Monitor", 200, 300, 240);
    Product supp4Prod6 = prodCatalog4.newProduct("Keyboard", 100, 300, 210);
    Product supp4Prod7 = prodCatalog4.newProduct("Mouse", 70, 150, 110);
    Product supp4Prod8 = prodCatalog4.newProduct("Printer", 45, 100, 60);
    Product supp4Prod9 = prodCatalog4.newProduct("Camera", 400, 700, 650);
    Product supp4Prod10 = prodCatalog4.newProduct("Smartwatch", 600, 900, 750);

    // Supplier 5
    ProductCatalog prodCatalog5 = supplier5.getProductCatalog();
    Product supp5Prod1 = prodCatalog5.newProduct("Laptop", 100, 200, 150);
    Product supp5Prod2 = prodCatalog5.newProduct("Smartphone", 150, 200, 175);
    Product supp5Prod3 = prodCatalog5.newProduct("Tablet", 200, 250, 230);
    Product supp5Prod4 = prodCatalog5.newProduct("Headphones", 145, 200, 158);
    Product supp5Prod5 = prodCatalog5.newProduct("Monitor", 200, 300, 240);
    Product supp5Prod6 = prodCatalog5.newProduct("Keyboard", 100, 300, 210);
    Product supp5Prod7 = prodCatalog5.newProduct("Mouse", 70, 150, 110);
    Product supp5Prod8 = prodCatalog5.newProduct("Printer", 45, 100, 60);
    Product supp5Prod9 = prodCatalog5.newProduct("Camera", 400, 700, 650);
    Product supp5Prod10 = prodCatalog5.newProduct("Smartwatch", 600, 900, 750);

    // Supplier 6
    ProductCatalog prodCatalog6 = supplier6.getProductCatalog();
    Product supp6Prod1 = prodCatalog6.newProduct("Laptop", 100, 200, 150);
    Product supp6Prod2 = prodCatalog6.newProduct("Smartphone", 150, 200, 175);
    Product supp6Prod3 = prodCatalog6.newProduct("Tablet", 200, 250, 230);
    Product supp6Prod4 = prodCatalog6.newProduct("Headphones", 145, 200, 158);
    Product supp6Prod5 = prodCatalog6.newProduct("Monitor", 200, 300, 240);
    Product supp6Prod6 = prodCatalog6.newProduct("Keyboard", 100, 300, 210);
    Product supp6Prod7 = prodCatalog6.newProduct("Mouse", 70, 150, 110);
    Product supp6Prod8 = prodCatalog6.newProduct("Printer", 45, 100, 60);
    Product supp6Prod9 = prodCatalog6.newProduct("Camera", 400, 700, 650);
    Product supp6Prod10 = prodCatalog6.newProduct("Smartwatch", 600, 900, 750);
    // Getting person directory
    PersonDirectory personDir = business.getPersonDirectory();
    // Creating and adding persons to the person directory
    Person person1 = personDir.newPerson("person 1");
    Person person2 = personDir.newPerson("person 2");
    Person person3 = personDir.newPerson("person 3");
    Person person4 = personDir.newPerson("person 4");
    Person person5 = personDir.newPerson("person 5");
    Person person6 = personDir.newPerson("person 6");
    Person person7 = personDir.newPerson("person 7");
    Person person8 = personDir.newPerson("person 8");
    Person person9 = personDir.newPerson("person 9");
    Person person10 = personDir.newPerson("person 10");
    Person person11 = personDir.newPerson("person 11");
    Person person12 = personDir.newPerson("person 12");
    Person person13 = personDir.newPerson("person 13");
    Person person14 = personDir.newPerson("person 14");
    Person person15 = personDir.newPerson("person 15");
    Person person16 = personDir.newPerson("person 16");
    Person person17 = personDir.newPerson("person 17");
    Person person18 = personDir.newPerson("person 18");
    Person person19 = personDir.newPerson("person 19");
    Person person20 = personDir.newPerson("person 20");
    // Getting customer directory
    CustomerDirectory customerDir = business.getCustomerDirectory();
    // Creating customers and adding it to customer directory
    CustomerProfile customer1 = customerDir.newCustomerProfile(person1);
    CustomerProfile customer2 = customerDir.newCustomerProfile(person2);
    CustomerProfile customer3 = customerDir.newCustomerProfile(person3);
    CustomerProfile customer4 = customerDir.newCustomerProfile(person4);
    CustomerProfile customer5 = customerDir.newCustomerProfile(person5);
    CustomerProfile customer6 = customerDir.newCustomerProfile(person6);
    CustomerProfile customer7 = customerDir.newCustomerProfile(person7);
    CustomerProfile customer8 = customerDir.newCustomerProfile(person8);
    CustomerProfile customer9 = customerDir.newCustomerProfile(person9);
    CustomerProfile customer10 = customerDir.newCustomerProfile(person10);
    CustomerProfile customer11 = customerDir.newCustomerProfile(person11);
    CustomerProfile customer12 = customerDir.newCustomerProfile(person12);
    CustomerProfile customer13 = customerDir.newCustomerProfile(person13);
    CustomerProfile customer14 = customerDir.newCustomerProfile(person14);
    CustomerProfile customer15 = customerDir.newCustomerProfile(person15);
    CustomerProfile customer16 = customerDir.newCustomerProfile(person16);
    CustomerProfile customer17 = customerDir.newCustomerProfile(person17);
    CustomerProfile customer18 = customerDir.newCustomerProfile(person18);
    CustomerProfile customer19 = customerDir.newCustomerProfile(person19);
    CustomerProfile customer20 = customerDir.newCustomerProfile(person20);
    // Creating persons
    Person person21 = personDir.newPerson("Sales person 1");
    Person person22 = personDir.newPerson("Sales person 2");
    Person person23 = personDir.newPerson("Sales person 3");
    Person person24 = personDir.newPerson("Sales person 4");
    Person person25 = personDir.newPerson("Sales person 5");
    Person person26 = personDir.newPerson("Sales person 6");
    Person person27 = personDir.newPerson("Sales person 7");
    Person person28 = personDir.newPerson("Sales person 8");
    Person person29 = personDir.newPerson("Sales person 9");
    Person person30 = personDir.newPerson("Sales person 10");
    // Getting sales directory
    SalesPersonDirectory salesPersonDir = business.getSalesPersonDirectory();
    salesPersonDir.newSalesPersonProfile(person21);
    salesPersonDir.newSalesPersonProfile(person22);
    salesPersonDir.newSalesPersonProfile(person23);
    salesPersonDir.newSalesPersonProfile(person24);
    salesPersonDir.newSalesPersonProfile(person25);
    salesPersonDir.newSalesPersonProfile(person26);
    salesPersonDir.newSalesPersonProfile(person27);
    salesPersonDir.newSalesPersonProfile(person28);
    salesPersonDir.newSalesPersonProfile(person29);
    salesPersonDir.newSalesPersonProfile(person30);
    // Getting master order list
    MasterOrderList masterOrderList = business.getMasterOrderList();
    // Importing Random to randomly set actual prices of products
    Random random = new Random();
    for(Supplier supplier: supplierDir.getSuplierList()){
        ProductCatalog pc = supplier.getProductCatalog();
        for(Product p:pc.getProductList()){
            for(CustomerProfile c : customerDir.getCustomerlist()){
                int min = p.getFloorPrice();
                int max = p.getCeilingPrice();
                int salesPersonMax = salesPersonDir.getSalespersonlist().size();
                Order o = masterOrderList.newOrder(c, salesPersonDir.getSalespersonlist().get(random.nextInt(salesPersonMax)));
                o.newOrderItem(p, random.nextInt(max-min+1)+min, 1);
            }
        }
    }
    
    Person marketingPerson = personDir.newPerson("Marketing Person");
    EmployeeDirectory employeeDir = business.getEmployeeDirectory();
    EmployeeProfile employeeProfile = employeeDir.newEmployeeProfile(marketingPerson, "Marketing");
    UserAccountDirectory userAccountDir = business.getUserAccountDirectory();
    String userName = "Marketing";
    String password = "";
    userAccountDir.newUserAccount(employeeProfile, userName, password);

    return business;
  }
}
