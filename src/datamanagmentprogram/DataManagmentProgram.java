/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package datamanagmentprogram;

/**
 *
 * @author kibat6204
 */
import java.io.*;
public class DataManagmentProgram {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try
        {
        FileReader file = new FileReader("scoreInfo.dat");
        BufferedReader br = new BufferedReader(file);
        }
        
        catch(Exception e)
        {
            
        }
    }
    
}
