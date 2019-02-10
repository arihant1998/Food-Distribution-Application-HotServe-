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
public class Fooddistributionapplication {

       

    /**\
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Useraccount acc=new Useraccount();
        Searchprocessitem menu=new Searchprocessitem();
        
        Scanner obj1=new Scanner(System.in);
        
        System.out.print("HotServe: We deliver instant ready food at your doorstep");
        System.out.print("\n\n1.Search\n2.Log-in\n3.Signup\n\n");
        
        int userchoice=obj1.nextInt();
        
        if(userchoice==1)
        {
            menu.inputitem();
        }
        else if(userchoice==2)
        {
            acc.login();
        }
        else if(userchoice==3)
        {
            acc.signup();
        }
    }
    
}
