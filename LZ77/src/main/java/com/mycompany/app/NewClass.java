/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.app;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Abdelrahman Hany
 */
public class NewClass {
    static int myMethod(String data,String sup,int index ,int count,int  i,String buffer, int key){
    
               // System.out.println(buffer+"   buffer of  "+i);
                int isExist;
              isExist=buffer.lastIndexOf(sup);
              //System.out.println(isExist+"kkkkk"+i);
              if(i+1<data.length() && isExist>=0  )//element found
              {
                  index=key-isExist;
                count=sup.length();       
               // System.out.println(sup+"   before");

                  sup=data.substring(key, i+2);
              //  System.out.println(sup+"   after");

                  i++;
                     i= myMethod(data,sup,index,count,i,buffer,key)  ;  
             
                }else{
                  if(i+1==data.length() && i==key &&index>0){
                  Tag b=new Tag(index,count,'0');
                 System.out.println( b.toString());}
                  else{
                  Tag b=new Tag(index,count,data.charAt(i));
                 System.out.println( b.toString());
                  }
                return i;
              }
                  return i;

    }
    public static void main(String[] args) throws Exception 
    {               
       
      File myObj = new File("C:\\Users\\Sooooom3a\\Downloads\\first siemester third grade\\data compression\\app");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String data = myReader.nextLine();
      // int index=0;
       //Sint count=0;
       int i=0;
      for(i=0;i<data.length();i++){
          int index=0;
       int count=0;
          String sup=data.substring(i, i+1);
          int key=i;
         // System.out.println(sup +" sup of "+i);
         if(i==0)// first element
          {
              Tag a=new Tag(0,0,data.charAt(0));
              System.out.println(a.toString());
          }else{
              String buffer=data.substring(0,i);
             // System.out.println(buffer+"   buffer of  "+i);
              int isExist;
              isExist=buffer.lastIndexOf(sup) ;
              if((isExist>=0) && (i+1<data.length()))//element found
              {
                  index=key-isExist;
                  count=sup.length();
                 // System.out.println(sup+"   before");
                  sup=data.substring(key, i+2);
               //  System.out.println(sup+"   after");
                  i++;
                  i=myMethod(data,sup,index,count,i,buffer,key);
             
                }else{
                  if(i+1==data.length() && i==key&&index>0){
                      Tag b=new Tag(index,count,'0');
                   System.out.println( b.toString());
                  }else{
                  Tag b=new Tag(index,count,data.charAt(i));
                 System.out.println( b.toString());
                  }        

              }
          }
            
         
         
         
         
         
         
      }
    }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     
}
    }

    

    

