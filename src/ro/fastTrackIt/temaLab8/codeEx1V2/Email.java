package ro.fastTrackIt.temaLab8.codeEx1V2;

public class Email implements Advertise2 {

    @Override
    public String advertisingSource() {
        return "Email";
    }

    @Override
    public String companyName() {
        return "Apple";
    }

    @Override
    public String advertisingMessage() {
        return "- 50% reducere la Iphone 12 mini, 12 si 12 Pro";
    }

    @Override
    public String externalLink() {
        return "www.appleromania.com";
    }
}
