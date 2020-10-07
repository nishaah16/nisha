/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10i;
import java.io.*;
/**
 *
 * @author nisha
 */
public class Labex10i {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        File filein=new File("inputtext.txt");
        File fileout=new File("outputtext.txt");
        char CharCounter=0;
        PrintWriter out;
        try (BufferedReader in = new BufferedReader(new FileReader(filein))) {
            out = (new PrintWriter(new FileWriter(fileout)));
            int z;
            while((z=in.read())!=-1)
            {
                if(Character.isUpperCase(z))
                {
                    Character.toLowerCase(z);
                }
                out.write(z);
            }
        }
        out.close();
        // TODO code application logic here
    }    
}

