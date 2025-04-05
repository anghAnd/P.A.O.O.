public abstract class AbstractAnimal implements Animal {
    // Definirea unei metode care ar putea fi comuna tuturor animalelor
    public void breathe() {
        System.out.println("Breathing...");
    }

    // Implementarea metodelor din interfața Animal
    public abstract void move();
    public abstract void eat();
}