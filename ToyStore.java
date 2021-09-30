import java.util.*;
// Customer
class Customer{
    int budget;
    int childAge;
    char childGender;
    public Customer(int b,int a,char g){
        System.out.println("New Customer Created!");
        budget = b;
        childAge = a;
        childGender = g;
   }
   public void display(){
        System.out.println("\n=====\nCustomer's Budget "+budget+
        "\nChild's Age "+childAge+
        "\nChild's Gender "+childGender+
        "\n=====\n");
    }
}

// Toy
class Toy{
    int price;
    int minAgeReq;
    String type;
    char recFor;
    public Toy(int p,int a,String t,char r){
        price = p;
        minAgeReq = a;
        type = t;
        recFor = r;
    }
    public void display()
    {
        System.out.println("\n-----\nToy Price "+price+
        " \nThe minimum age required "+minAgeReq+
        " \nIt is recommended for "+recFor+
        " \nType is "+type+"\n");
        
    }
    
}

public class ToyStore {
    public static void filter(Toy[] Toys,int b,int a,char g) {
        for (int i = 0; i < Toys.length; i++) {
            if ((Toys[i].price <= b) && (Toys[i].minAgeReq <= a) && (Toys[i].recFor==g)){
                Toys[i].display();
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("-----Welcome to ToysStore-----\n");
        System.out.print("1.Buy Toy 2.Set Toys\n : ");
        int choice = sc.nextInt();
        Toy[] Toys = new Toy[10];
        switch (choice) {
            case 1:
                Toys[0] = new Toy(20,4,"Educational",'m');
                Toys[1] = new Toy(30,8,"Board",'f');
                Toys[2] = new Toy(10,3,"ActionFigure",'m');
                Toys[3] = new Toy(25,7,"Cars&RC",'m');
                Toys[4] = new Toy(35,10,"GameCollection",'m');
                Toys[5] = new Toy(15,8,"Electronic",'f');
                Toys[6] = new Toy(10,4,"Board",'m');
                Toys[7] = new Toy(40,8,"Educational",'f');
                Toys[8] = new Toy(45,7,"Electronic",'m');
                Toys[9] = new Toy(35,5,"GameCollection",'f');
                System.out.print("\nEnter your budget: ");
                int b = sc.nextInt();
                System.out.print("\nEnter Child's Age: ");
                int a = sc.nextInt();
                System.out.print("\nEnter Child's Gender(m/f): ");
                char g = sc.next().charAt(0);
                Customer c1 = new Customer(b, a, g);
                c1.display();
                System.out.println("Toys according to your choice :");
                filter(Toys,b,a,g);
                
                break;


            case 2:
                System.out.print("How many Toys? ");
                int n = sc.nextInt();
                Toys = new Toy[n];
                for (int i = 0; i < Toys.length; i++) {
                    int count = i+1;
                    System.out.println("\n----------\nToy "+count);
                    System.out.print("\nToy Price: ");
                    int p = sc.nextInt();
        
                    System.out.print("\nMin. Age for Toy: ");
                    int ag = sc.nextInt();
        
                    System.out.print("\nToy Type: ");
                    String t = sc.next();
        
                    System.out.print("\nRecommended for(m/f): ");
                    char r = sc.next().charAt(0);
        
                    Toys[i] = new Toy(p,ag,t,r);
                    // Toys[i].display();
                }
                break;
        
            default:
                System.out.println("Enter Correct Choice");
                break;
        }
        
        
        
        // for (int i = 0; i < Toys.length; i++) {
        //     Toys[i].display();
        // }
        sc.close();
    }
}
