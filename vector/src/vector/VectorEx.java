package vector;

import java.util.Enumeration;
import java.util.Vector;

public class VectorEx {
	 public static void main(String arg[]){

			Vector v = new Vector(10,10);

		 for(int i=0; i<20; i++)
		{
			v.addElement(new Integer(i));
		}
			System.out.println("Successfull");

		for(Enumeration e = v.elements();e.hasMoreElements();){
			System.out.println(e.nextElement()+"");
		}
			System.out.println();
		for(int i= v.size()-1 ;i>=0; i--){
			System.out.println(v.elementAt(i)+"");
		}	

System.out.println(v.toString());
		}
}
