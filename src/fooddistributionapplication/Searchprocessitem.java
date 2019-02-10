/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddistributionapplication;
import java.util.*;
/**
 *
 * @author Arihant Kumar
 */
public class Searchprocessitem {
   
  
    
   public void inputitem()
   { 
        
       Fooditemdetail useri=new Fooditemdetail();
   
       Database data=new Database();
      
       Scanner obj2=new Scanner(System.in);
       
       String[] itemlist;
       itemlist=data.createlist();
       
       String itemname;
       
       System.out.println("\nEnter an item to search");
       itemname=obj2.nextLine();
       
       data.searchitem(itemname,itemlist);
   }
    public void processdata(String database[], int j , int date[][][],int Price[])
    {
         
   Fooditemdetail useri=new Fooditemdetail();
    
    Database data=new Database();  
        
        System.out.print("\n\n\nFollowing matches have been found: -");
        System.out.print("\n\nS.No.\tItem Name\t\tDate\tItem Rate");
        
        for(int i=0; i<j ; i++)
        {
            System.out.print("\n"+(i+1)+".");
            System.out.print("\t"+database[i]);
            System.out.print("\t"+date[i][0][0]+"-"+date[0][i][0]+"-"+date[0][0][i]);
            System.out.print("\t"+Price[i]);
        }
        
        System.out.print("");
        
        System.out.print("\n\nSelect any one");
          
        Scanner obj2=new Scanner(System.in);
        
        int itemselection=obj2.nextInt();
        
        useri.itemdetails(database[itemselection-1]);
    }
}
