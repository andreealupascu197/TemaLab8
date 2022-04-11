package ro.fastTrackIt.temaLab8.codeEx1V2;

public class Print implements Advertise2 {
    @Override
    public String advertisingSource() {
        return "printat";
    }

    @Override
    public String companyName() {
        return "Audi";
    }

    @Override
    public String advertisingMessage() {
        return "Vino sa incerci noul Audi e-tron S line";
    }

    @Override
    public String externalLink() {
        return "www.audi.com";
    }
}
