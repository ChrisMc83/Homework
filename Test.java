package Polymorphism;

public class Test {
   public static void main(String [] args){

        //create a polyorphic array, it will accept any subclass of class Animal
       //saves loads of arrays and will call the appropriate method at runtime
      Animal animals[]=new Animal[3];
      animals[0]=new Dog();
      animals[1]=new Lion();
      animals[2]=new Animal();

      //cycle through the array
        for (Animal a: animals){
            //correct method is called
            a.makeNoise();
        }






    }

}
