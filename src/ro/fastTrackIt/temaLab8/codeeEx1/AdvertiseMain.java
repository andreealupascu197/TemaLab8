package ro.fastTrackIt.temaLab8.codeeEx1;

public class AdvertiseMain {
    public static void main(String[] args) {
        AdvertiseCompany companyToAdvertise = new AdvertiseCompany();
        System.out.println(companyToAdvertise.advertiseOnFacebook("Instagram", "Download the app and enjoy talking and sharing memories with your friends"));
        companyToAdvertise.advertiseByEmail("Weekend Sales at Kaufland", "Kaufland", "You have never seen such promotions. Visit us this weekend to find out more.");
    }
}
