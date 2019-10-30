package Auto;

import java.io.*;
import java.util.*;
import java.util.HashSet;

public class AutoTest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
                Scanner scanner=new Scanner(System.in);
                
		Auto a1=new Auto();
		Auto a2=new Auto(4500, 60, 4);
		
		System.out.println(a1.toString());
                
                System.out.print("Hoeveeel km wenst u te rijden?");
		a1.aantalKilometerRijden(scanner.nextInt());
		System.out.println(a1.toString()); //gaat niet tank is leeg
		
		a1.vulTank(60);
		System.out.println(a1.toString());
		
		a1.aantalKilometerRijden(100);
		System.out.println(a1.toString());
		
		a1.aantalKilometerRijden(1500);
		System.out.println(a1.toString());
		
		//HashSet van auto's
		
		HashSet<Auto> autoHashSet=new HashSet<Auto>();
		
		autoHashSet.add(a1);
		autoHashSet.add(a2);
		autoHashSet.add(a1);
		
		System.out.println(autoHashSet.toString());
		
		
		
	}

}
