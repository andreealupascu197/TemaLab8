package ro.fastTrackIt.temaLab8.codeEx3;

public class Dog implements LearningAboutAnimals {

    @Override
    public String walk() {
        return "happy walk";
    }

    @Override
    public String talk() {
        return "ham ham";
    }

    @Override
    public String eat() {
        return "meat";
    }
}
