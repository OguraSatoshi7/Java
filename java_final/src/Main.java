import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Datasource ds = new Datasource(); //create DS instance
        Scanner sn = new Scanner(System.in);//create SN instance
        int userInput = 0;

        //connect to db
        if (ds.open()) {
            System.out.println("connected to db");
        } else {
            System.out.println("not connected to db");
        }

        do {
            //select CRUD
            System.out.println("*******************************************");
            System.out.println("PLEASE SELECT ACTION ITEM");
            System.out.println("*******************************************");
            System.out.println("1 : Create(Insert)");
            System.out.println("2 : Read(Select)");
            System.out.println("3 : Update");
            System.out.println("4 : Delete");
            System.out.println("0 : Exit");
            userInput = sn.nextInt();
            sn.nextLine();

            switch (userInput){
                case 1: { //user action : insert
                    System.out.println("1 : Create a product & a category");
                    System.out.println("2 : Create a customer");
                    System.out.println("3 : Create a card_detail");
                    System.out.println("0 : Exit");

                    int insertChoice = sn.nextInt();
                    sn.nextLine();

                    switch (insertChoice) {
                        case 1: { //user action : insert product & category
                            System.out.println("type productName ");
                            String productName = sn.nextLine();
                            System.out.println("type productDescription ");
                            String productDescription = sn.nextLine();
                            System.out.println("type productPrice ");
                            double productPrice = sn.nextDouble();
                            sn.nextLine();
                            System.out.println("type currency_id ");
                            int currency_id = sn.nextInt();
                            sn.nextLine();
                            System.out.println("type categoryName ");
                            String categoryName = sn.nextLine();
                            System.out.println("type subCategory ");
                            int subCategory = sn.nextInt();
                            sn.nextLine();
                            try {
                                ds.insertProductCategory(productName, productDescription, productPrice, currency_id, categoryName, subCategory);
                            } catch (SQLException e) {
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 2: { //user action : insert customer
                            System.out.println("type customerName ");
                            String customerName = sn.nextLine();
                            System.out.println("type customerEmail ");
                            String customerEmail = sn.nextLine();
                            System.out.println("type customerAddress ");
                            String customerAddress = sn.nextLine();
                            System.out.println("type customerPhone ");
                            String customerPhone = sn.nextLine();
                            try {
                                ds.insertCard(customerName, customerEmail, customerAddress, customerPhone);
                            } catch (SQLException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 3: { //user action : insert card_detail
                            System.out.println("type customerEmail ");
                            String customerEmail = sn.nextLine();
                            System.out.println("type productName ");
                            String productName = sn.nextLine();
                            System.out.println("type quantity : ");
                            int quantity = sn.nextInt();

                            try{
                                ds.insertCardDetails(customerEmail,productName,quantity);
                            }catch(SQLException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 0:
                            userInput = 0;
                            break;
                    };

                    break;
                }

                case 2: {//select
                    System.out.println("1 : Read products");
                    System.out.println("2 : Read customers");
                    System.out.println("3 : Read categories");
                    System.out.println("0 : Exit");
                    int selectChoice = sn.nextInt();
                    sn.nextLine();
                    switch (selectChoice) {
                        case 1: {
                            ds.queryProducts();
                            ds.queryProductCategoryCurrencies();
                            break;
                        }
                        case 2: {
                            ds.queryCustomers();
                            break;
                        }
                        case 3: {
                            ds.queryCategory();
                            break;
                        }
                        case 0:
                            userInput = 0;
                            break;
                    };
                    break;
                }

                case 3: {//update

                    System.out.println("1 : Update products");
                    System.out.println("2 : Update customers");
                    System.out.println("0 : Exit");

                    int updateChoice = sn.nextInt();
                    sn.nextLine();

                    switch (updateChoice) {
                        case 1: {

                            System.out.println("type productName ");
                            String productName = sn.nextLine();
                            try {
                                if(ds.examProducts(productName)) {
                                    System.out.println("type productNewPrice ");
                                    double productPrice = sn.nextDouble();
                                    sn.nextLine();
                                    try {
                                        ds.updateProducts(productName, productPrice);
                                    } catch (SQLException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch(SQLException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 2: {

                            System.out.println("type customerEmail ");
                            String customerEmail = sn.nextLine();
                            try {
                                if (ds.examCustomers(customerEmail)) {
                                    System.out.println("type customerNewName ");
                                    String customerNewName = sn.nextLine();
                                    try {
                                        ds.updateCustomers(customerEmail, customerNewName);
                                    } catch (SQLException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                            } catch(SQLException e){
                                System.out.println(e.getMessage());
                            }

                            break;
                        }


                        case 0:
                            userInput = 0;
                            break;
                    };

                    break;
                }

                case 4: {//delete

                    System.out.println("1 : Delete a product");
                    System.out.println("2 : Delete a customer");
                    System.out.println("0 : Exit");

                    int deleteChoice = sn.nextInt();
                    sn.nextLine();

                    switch (deleteChoice) {
                        case 1: {
                            try {
                                System.out.println("type productName ");
                                String productName = sn.nextLine();
                                ds.deleteProductCategory(productName);
                            } catch(SQLException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 2: {
                            try {
                                System.out.println("type customerEmail ");
                                String customerEmail = sn.nextLine();
                                ds.deleteCustomers(customerEmail);
                            } catch(SQLException e){
                                System.out.println(e.getMessage());
                            }
                            break;
                        }

                        case 0:
                            userInput = 0;
                            break;
                    };

                    break;
                }

            }

        }while(userInput != 0);
        System.out.println("See you!");
        ds.close();


    }
}
