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
    Product supp1Prod1 = prodCatalog1.newProduct("Printer 110", 100, 200, 150);
    Product supp1Prod2 = prodCatalog1.newProduct("Printer 120", 150, 200, 175);
    Product supp1Prod3 = prodCatalog1.newProduct("Printer 150", 200, 250, 230);
    Product supp1Prod4 = prodCatalog1.newProduct("Printer 15", 145, 200, 158);
    Product supp1Prod5 = prodCatalog1.newProduct("Printer 18", 200, 300, 240);
    Product supp1Prod6 = prodCatalog1.newProduct("Printer 156", 100, 300, 210);
    Product supp1Prod7 = prodCatalog1.newProduct("Printer 186", 70, 150, 110);
    Product supp1Prod8 = prodCatalog1.newProduct("Printer 1", 45, 100, 60);
    Product supp1Prod9 = prodCatalog1.newProduct("Printer 199", 400, 700, 650);
    Product supp1Prod10 = prodCatalog1.newProduct("Printer 17", 600, 900, 750);

    // Supplier 2
    ProductCatalog prodCatalog2 = supplier2.getProductCatalog();
    Product supp2Prod1 = prodCatalog2.newProduct("Scanner 12", 100, 300, 200);
    Product supp2Prod2 = prodCatalog2.newProduct("Scanner 125", 190, 290, 210);
    Product supp2Prod3 = prodCatalog2.newProduct("Scanner 128", 150, 250, 200);
    Product supp2Prod4 = prodCatalog2.newProduct("Scanner 127", 154, 200, 168);
    Product supp2Prod5 = prodCatalog2.newProduct("Scanner 110", 210, 310, 250);
    Product supp2Prod6 = prodCatalog2.newProduct("Scanner 15", 150, 300, 210);
    Product supp2Prod7 = prodCatalog2.newProduct("Scanner 1210", 90, 150, 100);
    Product supp2Prod8 = prodCatalog2.newProduct("Scanner 1289", 145, 190, 150);
    Product supp2Prod9 = prodCatalog2.newProduct("Scanner 1274", 410, 750, 660);
    Product supp2Prod10 = prodCatalog2.newProduct("Scanner 1256", 650, 950, 760);

    // Supplier 3
    ProductCatalog prodCatalog3 = supplier3.getProductCatalog();
    Product supp3Prod1 = prodCatalog3.newProduct("Photocopy 42", 100, 200, 150);
    Product supp3Prod2 = prodCatalog3.newProduct("Photocopy 425", 150, 200, 175);
    Product supp3Prod3 = prodCatalog3.newProduct("Photocopy 4287", 200, 250, 230);
    Product supp3Prod4 = prodCatalog3.newProduct("Photocopy 4245", 145, 200, 158);
    Product supp3Prod5 = prodCatalog3.newProduct("Photocopy 4282", 200, 300, 240);
    Product supp3Prod6 = prodCatalog3.newProduct("Photocopy 4289", 100, 300, 210);
    Product supp3Prod7 = prodCatalog3.newProduct("Photocopy 421", 70, 150, 110);
    Product supp3Prod8 = prodCatalog3.newProduct("Photocopy 422", 45, 100, 60);
    Product supp3Prod9 = prodCatalog3.newProduct("Photocopy 4200", 400, 700, 650);
    Product supp3Prod10 = prodCatalog3.newProduct("Photocopy 4", 600, 900, 750);

    // Supplier 4
    ProductCatalog prodCatalog4 = supplier4.getProductCatalog();
    Product supp4Prod1 = prodCatalog4.newProduct("Printer ColorPix52", 500, 900, 650);
    Product supp4Prod2 = prodCatalog4.newProduct("Printer ColorPix525", 550, 950, 775);
    Product supp4Prod3 = prodCatalog4.newProduct("Printer ColorPix528", 600, 950, 730);
    Product supp4Prod4 = prodCatalog4.newProduct("Printer ColorPix5252", 445, 800, 658);
    Product supp4Prod5 = prodCatalog4.newProduct("Printer ColorPix5281", 700, 1000, 840);
    Product supp4Prod6 = prodCatalog4.newProduct("Printer ColorPix5282", 800, 1300, 1000);
    Product supp4Prod7 = prodCatalog4.newProduct("Printer ColorPix5210", 570, 950, 710);
    Product supp4Prod8 = prodCatalog4.newProduct("Printer ColorPix5287", 445, 700, 660);
    Product supp4Prod9 = prodCatalog4.newProduct("Printer ColorPix10", 300, 700, 650);
    Product supp4Prod10 = prodCatalog4.newProduct("Printer ColorPix5277", 700, 900, 800);

    // Supplier 5
    ProductCatalog prodCatalog5 = supplier5.getProductCatalog();
    Product supp5Prod1 = prodCatalog5.newProduct("Printer All in one 12", 1000, 2000, 1500);
    Product supp5Prod2 = prodCatalog5.newProduct("Printer All in one 122", 1500, 2000, 1750);
    Product supp5Prod3 = prodCatalog5.newProduct("Printer All in one 128", 2000, 2500, 2300);
    Product supp5Prod4 = prodCatalog5.newProduct("Printer All in one 1285", 1450, 2000, 1580);
    Product supp5Prod5 = prodCatalog5.newProduct("Printer All in one 1210", 2000, 3000, 2400);
    Product supp5Prod6 = prodCatalog5.newProduct("Printer All in one 1277", 1000, 3000, 2100);
    Product supp5Prod7 = prodCatalog5.newProduct("Printer All in one 110", 700, 1500, 1100);
    Product supp5Prod8 = prodCatalog5.newProduct("Printer All in one 120", 450, 1000, 600);
    Product supp5Prod9 = prodCatalog5.newProduct("Printer All in one 50", 4000, 7000, 6500);
    Product supp5Prod10 = prodCatalog5.newProduct("Printer All in one 1202", 6000, 9000, 7500);

    // Supplier 6
    ProductCatalog prodCatalog6 = supplier6.getProductCatalog();
    Product supp6Prod1 = prodCatalog6.newProduct("Scanner152", 100, 200, 150);
    Product supp6Prod2 = prodCatalog6.newProduct("Scanner151", 150, 200, 175);
    Product supp6Prod3 = prodCatalog6.newProduct("Scanner1522", 200, 250, 230);
    Product supp6Prod4 = prodCatalog6.newProduct("Scanner1528", 145, 200, 158);
    Product supp6Prod5 = prodCatalog6.newProduct("Scanner1529", 200, 300, 240);
    Product supp6Prod6 = prodCatalog6.newProduct("Scanner142", 100, 300, 210);
    Product supp6Prod7 = prodCatalog6.newProduct("Scanner1426", 70, 150, 110);
    Product supp6Prod8 = prodCatalog6.newProduct("Scanner1485", 45, 100, 60);
    Product supp6Prod9 = prodCatalog6.newProduct("Scanner1427", 400, 700, 650);
    Product supp6Prod10 = prodCatalog6.newProduct("Scanner1429", 600, 900, 750);
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
