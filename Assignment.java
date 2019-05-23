
package Class_Assignment;

import java.util.Scanner;

interface Vat_Percentages
{
    double books = 9.25;
    double fruits = 8.50;
    double cosmetics = 8.75;
    double medicine = 7.75;
}
class A 
{
    double price;
    public double show1()
    {
        while(true)
        {
            try
            {
                System.out.print("Enter Price  : ");
                Scanner sc=new Scanner(System.in);
                price=sc.nextDouble();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Enter any number.Please try again!!!");
            }
        }
        return price;
    }
}
class B
{
    double amount;
    public double show2()
    {   
         while(true)
         {
            try
            {
                System.out.print("Enter Amount : ");
                Scanner sc=new Scanner(System.in);
                amount=sc.nextDouble();
                break;
            }
            catch(Exception e)
            {
                System.out.println("Enter any number.Please try again!!!");
            }
         }
        return amount;
    }
}
class C extends A implements Vat_Percentages
{
    Scanner sc=new Scanner (System.in);
    B Obj=new B();
    String name;
    double amount,price;
    double Total_Vat;
    public void forBooks()
    {
        System.out.print("Enter Product name : ");
        name=sc.nextLine();
        this.amount=super.show1();
        this.price=Obj.show2();
        Total_Vat=((amount*price)*books)/100;
        System.out.println("Total Vat for Books : "+Total_Vat);
    }
    public void forFruits()
    {
        System.out.print("Enter Product name : ");
        name=sc.nextLine();
        this.amount=super.show1();
        this.price=Obj.show2();
        Total_Vat=((amount*price)*fruits)/100;
        System.out.println("Total Vat for Fruits : "+Total_Vat);
    }
    public void forCosmetics()
    {
        System.out.print("Enter Product name : ");
        name=sc.nextLine();
        this.amount=super.show1();
        this.price=Obj.show2();
        Total_Vat=((amount*price)*cosmetics)/100;
        System.out.println("Total Vat for Cosmetics : "+Total_Vat);
    }
    public void forMedicines()
    {
        System.out.print("\nEnter Product name : ");
        name=sc.nextLine();
        this.amount=super.show1();
        this.price=Obj.show2();
        Total_Vat=((amount*price)*medicine)/100;
        System.out.println("Total Vat for Medicine : "+Total_Vat);       
    }       
}
public class Assignment 
{
    public static void main(String[] args) 
    {       
        C Ob=new C();
        int num;
        while(true) 
        {
            System.out.println();
            System.out.println("< This is a Shop > ");
            System.out.println("Avaiable product category in this shop given bellow - ");
            System.out.println(" 1.Books \n 2.Fruits \n 3.Cosmetics \n 4.Medicine");
            System.out.println("Enter 1 for choosing book category!!");
            System.out.println("Enter 2 for choosing fruits category!!");
            System.out.println("Enter 3 for choosing cosmetics category!!");
            System.out.println("Enter 4 for choosing medicine category!!");
            System.out.println("Enter 5 Exiting program!!!");
            while(true)
            {
                try
                {
                    Scanner input=new Scanner(System.in);
                    System.out.print("Enter your choice ::: ");
                    num=input.nextInt();
                    break;
                }
                catch(Exception e)
                {
                    System.out.println("You must enter integer.Please try again!!!");
                }
            }
           if(num==5)
           {
               System.out.println("Rest of code..........");
               break;
           }
           switch(num)
           {
               case 1: Ob.forBooks();break;
               case 2: Ob.forFruits();break;
               case 3: Ob.forCosmetics();break;
               case 4: Ob.forMedicines();break;
               default:System.out.println("Wrong Choice!!!");
           }
        }
    } 
}
