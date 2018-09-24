package com.gmail.kostamazanenko;

public class Main {

	public static void main(String[] args) {
		Database db = new Database();
		
		Cat catOne = new Cat("Bars");
		Cat catTwo = new Cat("Barbie");
		
		db.writeObject(catOne, catOne.getName());
		db.writeObject(catTwo, catTwo.getName());

		Cat catThree = (Cat) db.readObject(catOne.getName());
		
		System.out.println(catOne);
		System.out.println(catThree);
		System.out.println();
		
		catThree = (Cat) db.readObject(catTwo.getName());
		
		System.out.println();
		System.out.println(catThree);
		System.out.println(catTwo);
		
	}

}
