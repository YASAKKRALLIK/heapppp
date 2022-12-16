/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package heapp;

import java.util.Scanner;

/**
 *
 * @author YASİN
 */
public class Heapp {
     

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
     String i = sc.nextLine();
     String[] a=i.split(",");
     int vul=a.length;
     int[] tera=new int[vul];
        for (int j = 0; j < a.length; j++) {
            tera[j]=Integer.valueOf(a[j]);
        }
     int[] tava=new int[vul];
        for (int j = 0; j < vul; j++) {
            tava[j]=tera[j];
            int indix=j;
            while (tava[indix]<tava[(indix-1)/3]&&indix>0){
                int temp=tava[indix];
                tava[indix]=tava[(indix-1)/3];
                tava[(indix-1)/3]=temp;
                indix=(indix-1)/3;
            }
        } 
        int tru=1;
        for (int j = 0; j < vul; j++) {
            if(tava[j]!=tera[j]){
                tru=0;
            }
        }

        if (tru==1){
            System.out.println("evet min heaptir");
        }else{
            System.out.println("değildir");
        }
        
        for (int j = 0; j < vul; j++) {
            System.out.print(tava[j]+"-");
        }
        
        
     
     
     
     
     
        
        // TODO code application logic here
    }
    
    
    
}
