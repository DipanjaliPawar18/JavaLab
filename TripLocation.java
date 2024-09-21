package com.lab;

/* Create one superclass HillStations and three subclasses 
 * Manali, Mussoorie, Gulmarg. Subclasses extend the superclass
 * and override its location() and famousFor() method. i.call 
 * the location() and famousFor() method by the Parent class’, 
 * i.e. Hillstations class. As it refers to the base class object 
 * and the base class method overrides the superclass method; 
 * the base class method is invoked at runtime. ii.call the 
 * location() and famousFor() method by the all subclass’,and 
 * print accordingly.*/

	class HillStations{
		public void location(){
			System.out.println("There are various locations having hillstations...");
		}
		
		public void famousFor() {
			System.out.println("They have hills and beautiful views!!!");
		}
	}
	
	class Manali extends HillStations{
		public void location(){
			System.out.println("Located in Himachal Pradesh...");
		}
		
		public void famousFor() {
			System.out.println("Manali is famous for its excellent skiing conditons!!!");
		}
	}
	
	class Mussoorie extends HillStations{
		public void location(){
			System.out.println("Located in Uttarakhand...");
		}
		
		public void famousFor() {
			System.out.println("Mussoorie is famous for its scenic beauty and entertainment!!!");
		}
	}

	class Gulmarg extends HillStations{
		public void location(){
			System.out.println("Located in Jammu and Kashmir...");
		}
		
		public void famousFor() {
			System.out.println("Gulmarg is famous for its scenic beauty of the Himalayan moutains in the back drop!!!");
		}
	}

public class TripLocation {
		
	public static void main(String[] args) {
	
		HillStations h = new HillStations();
		Manali m = new Manali();
		Mussoorie mu = new Mussoorie();
		Gulmarg g = new Gulmarg();
		
		h.location();
		h.famousFor();
		System.out.println();
		m.location();
		m.famousFor();
		System.out.println();
		mu.location();
		mu.famousFor();
		System.out.println();
		g.location();
		g.famousFor();
	}

}
