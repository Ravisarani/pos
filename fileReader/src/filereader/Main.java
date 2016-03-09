/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package filereader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ravisarani
 */
public class Main {

    public static void main(String[] args) throws Exception {
        FileReader fin = new FileReader("/home/ravisarani/Desktop/t.txt");
        Scanner src = new Scanner(fin);
        ArrayList<String> lines = new ArrayList<String>();
        src.useDelimiter(":");

        while (src.hasNext()) {
            lines.add(src.nextLine());
    // replace above line with array
        }
        String[] lineArray = new String[lines.size()];
        lines.toArray(lineArray);
        System.out.println(lines);
    }
}
