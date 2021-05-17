package basic;
class Animal {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}

	class Pig extends Animal {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}

	class Dog extends Animal {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
	class empty extends Animal{
		
	}

	class polimorphism {
	  public static void main(String[] args) {
	    Animal myAnimal = new Animal();  // Create a Animal object
	    //Animal myPig = new Pig();  // Create a Pig object
	    Pig myPig=new Pig();
	    Animal myDog = new Dog();  // Create a Dog object
	    empty emp=new empty();
	    
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDog.animalSound();
	    emp.animalSound();
	  }
	}