package Auto;

import java.util.ArrayList;
import java.util.Vector;

public class WatertonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		Waterton w1=new Waterton(100);
		Waterton w2=new Waterton(60,40);
		Waterton w3=new Waterton(100,100);
		
		System.out.println(w1.toString());
		w1.aftappenWater(5);
		System.out.println(w1.toString()); //mag niet -5 op staan
		
		System.out.println(w2.toString());
		if(w3.opvangenWater()) {
			System.out.println("De ton is vol");
		}
		else {
			System.out.println("De ton is niet vol");
		}
		
		Waterton[]tonnenRij=new Waterton[5];
		//tonnenRij invullen
		for(int i=0; i<tonnenRij.length;i++) {
			//double inhoud=Math.random()*101;
			//afgerond op 2 decimalen
			double inhoud=((int)(Math.random()*100*100))/100.0;
			//hier kiezen we best Math.random()*100 ipv 101 omdat eindresulataat een double is
			tonnenRij[i]=new Waterton(100,inhoud);
		}
		
		//tonnenRij afdrukken
		for(int i=0; i<tonnenRij.length;i++) {
			System.out.println(tonnenRij[i].toString());
		}
		
		System.out.println();
		
		//tonnenRij afdrukken -> verkorte schrijfwijze
		for(Waterton ton:tonnenRij) { //foreach methode
			System.out.println(ton.toString());
		}
		
		*/
		
		//ArrayList van watertonnen
		ArrayList <Waterton>tonnenArrayList=new ArrayList<Waterton>();
		
		for(int i=0; i<10; i++) {
			double inhoud=((int)(Math.random()*50*10))/10.0;
			tonnenArrayList.add(new Waterton(50,inhoud));
		}
		
		for(Waterton ton:tonnenArrayList) {
			System.out.println(ton.toString());
		}
		
		System.out.println(tonnenArrayList.toString());
		
		System.out.println("De tonnenArrayList bevat "+tonnenArrayList.size()+" elementen.");
		
		System.out.println("Het tweede element is "+tonnenArrayList.get(1));
		
		//overschrijf het element op de vijfde positie=5 -> 4de element
		Waterton w1=new Waterton(200,150);
		tonnenArrayList.set(5, w1);
		
		System.out.println(tonnenArrayList.toString());
		
		tonnenArrayList.remove(0);
		System.out.println(tonnenArrayList.toString());
		
		System.out.println("De tonnenArrayList bevat "+tonnenArrayList.size()+" elementen.");
		
		if(tonnenArrayList.contains(w1)) {
			System.out.println("De tonnenArrayList bevat de opgevraagde waterton en deze bevind zich op positie "+tonnenArrayList.indexOf(w1));	
		}
		else {
			System.out.println("De tonnenArrayList bevat NIET de opgevraagde waterton");	
		}
		
		Waterton[]tonnenRij=new Waterton[tonnenArrayList.size()];
		
		tonnenArrayList.toArray(tonnenRij);
		
		for(Waterton ton:tonnenRij) {
			System.out.println(ton.toString());
		}
		
		System.out.println(tonnenRij.toString()); //werkt niet daarvoor moet je element hebben <>
		
		//Vector van watertonnen
		Vector<Waterton> tonnenVector=new Vector<Waterton>();
		
		for(int i=0; i<10; i++) {
			double inhoud=((int)(Math.random()*50*10))/10.0;
			tonnenVector.add(new Waterton(50,inhoud));
		}
		
		System.out.println(tonnenVector.toString());
		
		tonnenVector.clear();
		System.out.println(tonnenVector.toString());
		
		
	}

}
