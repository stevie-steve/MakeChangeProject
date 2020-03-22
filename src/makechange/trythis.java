package makechange;

import java.util.Scanner;

public class trythis {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        
        int twenties=0, tens=0, fives=0, singles=0; 
        double ¢25 = 0.0, ¢10 = 0.0, ¢5=0.0, ¢1 = 0.0; 
        
        System.out.println("How much does the item cost?");
        double price = sc.nextDouble();
        
        System.out.println("How much $ is tendered?");
        double offer = sc.nextDouble();
        
        double goodEnough = 0;
        goodEnough = price - offer;
        double change = offer - price;
        System.out.println("Your change is $" + change);
        
        
        if (offer<price) {
            System.out.println("Not enough!" + goodEnough+ "$ short");
        }
        else if (offer==price) {
            System.out.println("Exact amount. Pleasure having business with you.");
        }
        /// insert another method (double not void) that calculates change
    
        if (change > 20) {
                twenties = calculateBills(change, 20);
                System.out.print("20$" + twenties);
                 change = change - 20*twenties;
            }
        
              
        
        if (change>=10 && change<20) {
               tens = calculateBills(change, 10);
               System.out.print(" 10$" + tens); 
               change = change - 10*tens;
        }
               
        
        if (change>=5 && change<10) {
               fives = calculateBills(change, 5);
               System.out.print(" 5$" + fives); 
              change = change - 5*fives;
          
        }
        
        if (change>=1 && change<5) {
               singles = calculateBills(change, 1);
               System.out.print(" 1$" + singles); 
               change = Math.round((change-singles)*100.0)/100.0;
               
        }
               
        if (change>=0.25 && change<1) {
               ¢25 = calculateCoins(change, 0.25 );
                System.out.print(" 25¢" + (int)¢25); 
                change = change - (0.25*(int)¢25);
               }   
                
        if (change>=0.1 && change<0.25) {
            ¢10 = calculateCoins(change, 0.1 );
            System.out.print(" 10¢" + (int)¢10); 
            change = change - (0.1*(int)¢10);
        }   
        
        if (change>=0.05 && change<0.1) {
            ¢5 = calculateCoins(change, 0.05 );
            System.out.print(" 5¢" + (int)¢5); 
            change = change - (0.05*(int)¢5);
            
            
        }   
           change = Math.round(change*100.0)/100.0;
           
        if (change>=0.01 && change<0.05) {
            ¢1 = calculateCoins(change, 0.01 );
            change = Math.round((change-¢1)*100.0)/100.0;
            System.out.print(" 1¢" + (int)¢1); 
          
            }   
               
         sc.close();
    }
        
        
    
       public static int calculateBills (double change, int bill) {
           double leftOver;
           
           leftOver = change%bill;
                   if (leftOver >= 0 && leftOver !=change) {
                       bill = (int)(change/bill);
                       return bill;
                    
                   }
                   return bill;
           
       }
       
       public static double calculateCoins (double change, double coins) {
           double leftOver;
           
           leftOver = change%coins;
                   if (leftOver >= 0 && leftOver !=change) {
                       coins = change/coins;
                      
                   }
                   return coins;
               
       }
}     
