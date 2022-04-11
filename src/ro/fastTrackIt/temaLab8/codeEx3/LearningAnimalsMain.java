package ro.fastTrackIt.temaLab8.codeEx3;

public class LearningAnimalsMain {
    public static void main(String[] args) {
        Cat tom  = new Cat();
        Dog rex = new Dog();
        Mouse jerry = new Mouse();
        Duck jenny = new Duck();

        System.out.println(tom.eat());
        System.out.println(rex.talk());
        System.out.println(jenny.walk());
        System.out.println(jerry.talk());


        System.out.println(new ClassAboutAnimals(tom).guessTheAnimals());
        System.out.println(new ClassAboutAnimals(rex).guessTheAnimals());
        System.out.println(new ClassAboutAnimals(jenny).guessTheAnimals());
        System.out.println(new ClassAboutAnimals(jerry).guessTheAnimals());


    }
}
