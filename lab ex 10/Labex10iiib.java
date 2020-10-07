/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10iiib;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author nisha
 */
public class Labex10iiib {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        FileInputStream sourceStream =null;
        FileOutputStream targetStream =null;
        try
        {
            sourceStream =new FileInputStream("sorcefile.txt");
            targetStream =new FileOutputStream ("targetfile.txt");
            int temp;
            while((temp=sourceStream.read())!=-1)
                targetStream.write((byte)temp);
        }
        finally
        {
            if(sourceStream !=null)
                sourceStream.close();
            if(targetStream !=null)
                targetStream.close();            
        }
        // TODO code application logic here
    }
}