package ro.fastTrackIt.temaLab8.codeEx1V2;

public class Facebook implements Advertise2 {

    @Override
    public String advertisingSource() {
        return "Facebook";
    }

    @Override
    public String companyName() {
        return "Brico";
    }

    @Override
    public String advertisingMessage() {
        return "Cele mai mari oferte din luna pentru mobila";
    }

    @Override
    public String externalLink() {
        return "www.brico.com";
    }
}
