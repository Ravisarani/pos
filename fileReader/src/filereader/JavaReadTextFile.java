/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.in;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;
import sun.misc.IOUtils;

/**
 *
 * @author ravisarani
 */
public class JavaReadTextFile {

    public static void main(String[] args) throws IOException {
        try {

            String[] lines = new String[100];

            java.io.FileReader fileReader = new java.io.FileReader("/home/ravisarani/Desktop/t.txt");

            BufferedReader bufferedReader = new BufferedReader(fileReader);
            
            String s = null;

            while ((s = bufferedReader.readLine()) != null) {

                
                String[] x1 = s.split(" ");
                
                for (int i = 0; i < x1.length; i++) {
                    System.out.println(x1[i]);
                }

            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
