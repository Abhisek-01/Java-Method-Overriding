// Create a Animal class with properties name and species, and a method makeSound().
// Derive a class Dog from Animal with an additional property breed. Override the makeSound() method in Dog and use the super keyword to call the superclass constructor.

class Animal {

 String name;
 String species;

  public Animal(String name, String species) {
      this.name = name;
      this.species = species;
  }

  public void makeSound() {
      System.out.println("Some generic animal sound");
  }
}

class Dog extends Animal {
  String breed;

  public Dog(String name, String breed) {
      super(name, "Dog");
      this.breed = breed;
  }

  @Override
  public void makeSound() {
      System.out.println(name + " says: Woow! Woow!");
  }

  public void displayDetails() {
      System.out.println("Name: " + name);
      System.out.println("Species: " + species);
      System.out.println("Breed: " + breed);
  }
}

public class Problem2{
  public static void main(String[] args) {

      Dog myDog = new Dog("Buffy", "Golden Retriever");

      myDog.makeSound();
      myDog.displayDetails();

  }
}
