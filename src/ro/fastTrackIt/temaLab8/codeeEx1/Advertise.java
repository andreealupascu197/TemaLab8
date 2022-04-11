package ro.fastTrackIt.temaLab8.codeeEx1;

public interface Advertise {
    String advertiseOnFacebook(String companyName, String advertisingMessage);

    void advertiseByEmail(String emailSubject, String companyName, String emailBody);

}
