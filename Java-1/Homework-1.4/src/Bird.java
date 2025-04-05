public class Bird extends AbstractAnimal implements Flyable {

    @Override
    public void move() {
        System.out.println("The bird is flying.");
    }

    @Override
    public void eat() {
        System.out.println("The bird is eating.");
    }

    @Override
    public void fly() {
        System.out.println("The bird is soaring through the sky.");
    }
}