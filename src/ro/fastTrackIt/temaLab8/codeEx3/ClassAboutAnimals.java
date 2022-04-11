package ro.fastTrackIt.temaLab8.codeEx3;

public class ClassAboutAnimals {
    private LearningAboutAnimals learn;

    public ClassAboutAnimals(LearningAboutAnimals interaction) {
        this.learn = interaction;
    }

    public String guessTheAnimals() {
        return "This animal is walking like a " + learn.walk() + " and the sound made by this animal is " + learn.talk() + " and this animal usually eats " + learn.eat() + ". ";

    }
}

