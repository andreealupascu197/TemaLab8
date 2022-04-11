package ro.fastTrackIt.temaLab8.codeEx3;

public class Duck implements LearningAboutAnimals {

    @Override
    public String walk() {
        return "duck walking";
    }

    @Override
    public String talk() {
        return "mac mac mac";
    }

    @Override
    public String eat() {
        return "insects";
    }
}
