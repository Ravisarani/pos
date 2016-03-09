/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collection;

import java.util.Enumeration;
import java.util.Vector;

/**
 *
 * @author ravisarani
 */
public class Collection {

    public static void main(String[] args) {

        Vector v = new Vector(10, 10);

        for (int i = 0; i < 20; i++) {
            v.addElement(new Integer(i));
        }
        System.out.println("Successfull");

        for (Enumeration e = v.elements(); e.hasMoreElements();) {
            System.out.println(e.nextElement() + "");
        }
        System.out.println();

    }

}
