package ro.fastTrackIt.temaLab8.codeEx1V2;

public class AdvMain {
    public static void main(String[] args) {
        Facebook bricoAd = new Facebook();
        Email appleAd = new Email();
        Print audiAd = new Print();

        System.out.println(bricoAd.companyName());
        System.out.println(bricoAd.externalLink());
        System.out.println(bricoAd.advertisingMessage());

        System.out.println(appleAd.advertisingMessage());
        System.out.println(appleAd.companyName());
        System.out.println(appleAd.externalLink());

        System.out.println(new AdvertiseYourCompany(bricoAd).readyToAdvertise());
        System.out.println(new AdvertiseYourCompany(appleAd).readyToAdvertise());
        System.out.println(new AdvertiseYourCompany(audiAd).readyToAdvertise());
    }
}
