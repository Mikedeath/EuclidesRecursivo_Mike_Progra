/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package euclidesrecursivo_mike_progra;

/**
 *
 * @author sanch
 */
public class Calculos_Matematicos {

    public int a;
    public int b;
    public int c;
    
    public Calculos_Matematicos(int x,int y,int z){
        this.a = x;
        this.b = y;
        this.c = z;
    }
    
    public int MCD_Euclides(int x,int y, int c){
       if(c == 0){
           return x;
       }
       if(y == 0){
           return MCD_Euclides(c,y,x%c);
       }
       else{
           return MCD_Euclides(y,x%y,c);
       }
    }
    
   
}
    

