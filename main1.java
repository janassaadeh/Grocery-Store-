/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e;

import java.util.Scanner;

/**
 *
 * @author janas
 */
public class main1 {
public static void main(String [] args){
    Scanner hi =new Scanner(System.in);
    Scanner bye =new Scanner(System.in);
    
    Item i1=new Item("#1220","Aquafina","Beverages",7000);
    Item i2=new Item("#1244","Unica","Snacks",10000);
    Item i3=new Item("#1229","Pepsi","Beverages",25000);
    Item i4=new Item("#1240","Mars","Snacks",8000);
    Item i5=new Item("#1223","Master Chips","Snacks",25000);
    Item i6=new Item("#1243","candia","Dairy",50000);
    Item i7=new Item("#1225","picon","Dairy",60000);
    StoreItems Simm=new StoreItems();
    Simm.addStoreItems(i1);
    Simm.addStoreItems(i2);
    Simm.addStoreItems(i3);
    Simm.addStoreItems(i4);
    Simm.addStoreItems(i5);
    Simm.addStoreItems(i6);
    Simm.addStoreItems(i7);
    System.out.println("Welcome to our store !");
    //add store items
     System.out.println("How many items do you want to add to the store?");
    int no=hi.nextInt();   
    for(int i=1;i<=no;i++){
        String id;
        System.out.println("enter item "+i+" id, name, type and price respectively ");
        id=bye.nextLine();
        
        String n;
    //    System.out.println("enter item "+i+" name ");
        n=bye.nextLine();   
        
        String t;
    //    System.out.println("enter item "+i+" type ");
        t=bye.nextLine();
        
        int p;
    //    System.out.println("enter item "+i+" price ");  
        p=hi.nextInt();
        Item ik=new Item(id,n,t,p);
        Simm.addStoreItems(ik);
    }
        Simm.printStoreItems();
    //remove store items
        System.out.println("How many items do you want to remove from the store?");
    int po=hi.nextInt();   
    for(int i=1;i<=po;i++){
        String id;
        System.out.println("enter item "+i+" id ");
        id=bye.nextLine();
        Simm.findItemsWithId(id);
   
        Simm.removeStoreItems( Simm.findItemsWithId(id));
    }
        Simm.printStoreItems();
        
    //search store items by type
          System.out.println("Do you want to search the store items by type (0|1)");
    int pi=hi.nextInt();   
    for(int i=1;i<=pi;i++){
        String t;
        System.out.println("enter type :");
        t=bye.nextLine();
        Simm.SearchByType(t);
    }
    CustomerQueue q1=new CustomerQueue();
    //enqueue 
    System.out.println("how many customers do you want to add to queue ?");    
      int np=hi.nextInt();
    for(int i=1;i<=np;i++){
        String name;
        System.out.println("enter customer "+i+" name");
        name=bye.nextLine();
        Customer c1=new Customer(name);
        q1.enqueue(c1);
          }
     System.out.println("how many customers do you want to remove from queue ?");    
      int npk=hi.nextInt();
    for(int i=1;i<=npk;i++){
        q1.dequeue();
          }   
    q1.display();
    
    //search customers queue by name
    System.out.println("Do you want to search the queue by name (0|1)");
    int poq=hi.nextInt();   
    for(int i=1;i<=poq;i++){
        String n;
        System.out.println("enter name :");
        n=bye.nextLine();
        
        System.out.println(q1.Searchbyname(n));
    }
    
 
 System.out.println("how many shopping cart ? ");
    int nq=hi.nextInt();
    for(int j=1;j<=nq;j++){
    System.out.println("enter customer name ");
    String namee=bye.nextLine();
    
    //add to shopping cart 
    ShoppingCart s1=new ShoppingCart(q1.Searchbyname(namee)); 
    System.out.println("How many items do you want to add to the shopping cart of "+namee+" ?");
    int n=hi.nextInt();   
    for(int i=1;i<=n;i++){
        String idd;
        System.out.println("enter item "+i+" id ");
        idd=bye.nextLine();
        int d;
        System.out.println("enter item "+i+" quantity ");  
        d=hi.nextInt();
        ShoppingCartItem siu=new ShoppingCartItem(Simm.findItemsWithId(idd),d);
        s1.insert(siu);
  
    }
   s1.display();
   //search from shopping cart
     System.out.println("How many items do you want to search from the shopping cart?");
    int nio=hi.nextInt();   
    for(int i=1;i<=nio;i++){
    System.out.println("enter item id ");
    String iddle;
    iddle=bye.nextLine();
    s1.Search(Simm.findItemsWithId(iddle));}
    
   //delete from shopping cart
     System.out.println("How many items do you want to delete from the shopping cart?");
    int ni=hi.nextInt();   
    for(int i=1;i<=ni;i++){
  System.out.println("enter item id ");
      String idde;
  idde=bye.nextLine();
        s1.delete(Simm.findItemsWithId(idde));}
    
   s1.display();
   s1.printTotal();
    }

    
   Employee  e1 = new Employee("Rayyan","B",27203,500);
        Employee  e2 = new Employee("Jana","S",25761,450);
        Employee  e3 = new Employee("Saja","J",46813,550);
        Employee  e4 = new Employee("Ahmad","T",69841,450);
        Employee  e5 = new Employee("Omar","A",62835,550);
        Employee  e6 = new Employee("Abdallah","H",16242,450);
        Employee  e7 = new Employee("Sara","K",35946,500);


        BSTNode root = new BSTNode(e1);
        EmployeesBST tree = new EmployeesBST(root);

        tree.insert(e1);
        tree.insert(e2);
        tree.insert(e3);
        tree.insert(e4);
        tree.insert(e5);
        tree.insert(e6);
        tree.insert(e7);

        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in);
        System.out.println("ONLY FOR EMPLOYERS:");
        System.out.println("There is a list of the grocery store employees:");
        System.out.print("e1 : "+e1.toString() + "\n" +
                "e2 : "+e2.toString() + "\n" +
                "e3 : "+e3.toString() + "\n" +
                "e4 : "+e4.toString() + "\n" +
                "e5 : "+e5.toString() + "\n" +
                "e6 : "+e6.toString() + "\n" +
                "e7 : "+e7.toString() + "\n");
        System.out.println("How many employees do you want to hire?");
        int hire = sc.nextInt();
        for(int i = 1; i <= hire;i++){
            System.out.println("Please enter employee "+i+" informations :");
            System.out.print("First name : ");
            String fName = s.nextLine();
            System.out.print("Second name : ");
            String lName = s.nextLine();
            System.out.print(" ID : ");
            int id = sc.nextInt();
            System.out.print(" Salary : ");
            int salary = sc.nextInt();
            System.out.println();
            Employee r = new Employee(fName,lName,id,salary);
            tree.insert(r);
        }
        System.out.println("New employees list : ");
        tree.inorder();

        System.out.println("How many employees do you want to fire ?");
        int fire = sc.nextInt();
        for(int i = 1; i <= fire; i++) {

            System.out.print(" Enter the nb of employee " + i + " you want to fire (e1,e2...): ");
            String e = s.nextLine();

            switch (e) {
                case "e1":
                    tree.delete(e1);
                    break;
                case "e2":
                    tree.delete(e2);
                    break;
                case "e3":
                    tree.delete(e3);
                    break;
                case "e4":
                    tree.delete(e4);
                    break;
                case "e5":
                    tree.delete(e5);
                    break;
                case "e6":
                    tree.delete(e6);
                    break;
                case "e7":
                    tree.delete(e7);
                    break;
                default:
                    System.out.println("Please check employees list.");
            }
        }
        System.out.println(" The remaining employees are :");
        tree.inorder();
        System.out.print(" Enter the nb of employee you are searching for (e1,e2...): ");
        String ee = s.nextLine();
        switch (ee){
            case "e1":
                tree.search(e1);
                break;
            case "e2":
                tree.search(e2);
                break;
            case "e3":
                tree.search(e3);
                break;
            case "e4":
                tree.search(e4);
                break;
            case "e5":
                tree.search(e5);
                break;
            case "e6":
                tree.search(e6);
                break;
            case "e7":
                tree.search(e7);
                break;
            default:
                System.out.println("Employee not found.");
            }    
    
    
    
   
    }
    }
