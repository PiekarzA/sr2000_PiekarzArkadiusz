/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zorro;

/**
 *
 * @author student213
 */
public class Zorro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<2; i++){ System.out.println("*******************************");};
        for(int i=1; i<11; i++){
            for(int j=1; j<i; j++){System.out.print("   ");};
            System.out.print("****\n");
        }
        for(int i=0; i<2; i++){ System.out.println("*******************************");};
    }
    
}
