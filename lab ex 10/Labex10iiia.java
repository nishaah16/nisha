/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labex10iiia;
import java.io.*;
/**
 *
 * @author niisha
 */
public class Labex10iiia {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException 
    {
        try
        (FileReader sourceStream = new FileReader("test.txt")) {
            int temp;
            while((temp=sourceStream.read())!= -1)
                System.out.println((char)temp);
        }
    }
}
  