/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.io.FileReader;
/**
 *
 * @author ravisarani
 */
public class NewClass {

    public static void main(String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new FileReader("/home/ravisarani/Desktop/t.txt"));
        String str;

        List<String> list = new ArrayList<String>();
        while ((str = in.readLine()) != null) {
            list.add(str);
        }

        String[] stringArr = list.toArray(new String[0]);
         list.toArray(stringArr);
        System.out.println(list);
    }

}
