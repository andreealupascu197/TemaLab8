package ro.fastTrackIt.temaLab8.codeeEx1;

public class AdvertiseCompany implements Advertise {

    @Override
    public String advertiseOnFacebook(String companyName, String advertisingMessage) {
        return "This is an ad for " + companyName + ". " + advertisingMessage;
    }

    @Override
    public void advertiseByEmail(String emailSubject, String companyName, String emailBody) {
        System.out.println("Email subject: " + emailSubject);
        System.out.println("This is an ad for " + companyName + ". " + emailBody);
    }

}
