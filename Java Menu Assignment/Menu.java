/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menu;
import java.util.Scanner;
/**
 *
 * @author STUDENTS
 */
public class Menu {
    public  static void menu (String[] args){
        Scanner input= new Scanner(System.in);
       String  food, drinks;
        double price;
        System.out.println("enter food or drink");
       food = input.next();
       drinks= input.next();
     System.out.println("enter price");
     price= input.nextDouble();
     System.out.println("add drink"+drinks + "add food" +food +"price");
    
     
   
     
  
     
       
      
         
      
      
       
        
        
        
      
        
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("food");
        System.out.println("1. pasta: 450ksh");
        System.out.println("2. scrambled eggs: 250ksh");
         System.out.println("3. ugali sukuma: 150ksh");
         
         System.out.println("drinks");
         System.out.println("4. minute maid: 150ksh");
        System.out.println("5. chai masala: 50ksh");
         System.out.println("6. white coffe: 200ksh");
      //customer order
     System.out.println("would you like to order");
     
     Scanner input= new Scanner(System.in);
     int foodnumber= input.nextInt();
     int drinknumber= input.nextInt();
     System .out.println("how many would like to order");
     int quantity= input.nextInt();   
//calculate total  bill
     double totalbill=0.0;
     if(foodnumber==1){
         totalbill=quantity*450;
     }
     else if (foodnumber==2){
         totalbill=quantity*250;            
     }
      else if (foodnumber==3){
         totalbill=quantity*150;
      }
      else if (drinknumber==4){
         totalbill=quantity*150;
      }
      else if (drinknumber==5){
         totalbill=quantity*50;
      }
      else if (drinknumber==6){
         totalbill=quantity*200;
      }
     System.out.println("total bill is " +totalbill);
      //Ask user for mobile number
      System.out.println("enter mobile number");
      String mobilenumber=input.next();
      //making payment
       System.out.println("pay bill");
       double bill=input.nextDouble();
       
      
      
       
         
         
       
        
         
        
         
         
         
         
         
         
         
         
         
        
                
        // TODO code application logic here
    }
    
}
