package ExercícioProva2.Animal;

public class Principal {
    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cat();
        animais[1] = new Dog();
        animais[2] = new Dog();

        for(Animal animal: animais){
            animal.speak();
        }
    }
}