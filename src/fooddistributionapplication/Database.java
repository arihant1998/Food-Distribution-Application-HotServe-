/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fooddistributionapplication;

/**
 *
 * @author Arihant Kumar
 */
public class Database {
            
       Searchprocessitem sch=new Searchprocessitem();
    
    public String[] createlist()
    {

    
       String[] itemlist=new String[100];
       
       for(int i=0 ; i<100 ; i++)
       {
           itemlist[i]="item number "+(i+1);
       }
       
       return itemlist;
    }
    
    public void searchitem(String itemname,String[] itemlist)
    {
        
        String[] database=new String[100];
        
        int j=0;
        
        for(int i=0 ; i<100 ; i++)
        {
            if( itemlist[i].contains(itemname) )
            {
                database[j++]=itemlist[i];
            }
        }
        
        int [][][]Date;
        Date=itemdate(j);
        
        int []Price;
        Price=itemprice(j);
        
        sch.processdata(database,j,Date,Price);
    }
    
    private int[][][] itemdate(int j)
    {
        
        int[][][] date=new int[j][j][j];
        
        for(int i=0 ; i<j ; i++)
        {
            date[i][0][0] = 1 + (int)(Math.random() * 31);
        }
        
        for(int i=0 ; i<j ; i++)
        {
            date[0][i][0] = 1 + (int)(Math.random() * 12);
        }
        
        for(int i=0 ; i<j ; i++)
        {
            date[0][0][i] = 1950 + (int)(Math.random() * 2018);
        }
        
        return date;
    }
    
    private int[] itemprice(int j)
    {
        int []price=new int[j];
        
        for(int i=0 ; i<j ; i++)
        {
            price[i]= 1 + (int)(Math.random() * 1300);
        }
        
        return price;
    }
}
