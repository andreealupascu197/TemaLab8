package ro.fastTrackIt.temaLab8.codeEx1V2;

public class AdvertiseYourCompany {
    private Advertise2 liveAd;

    public AdvertiseYourCompany(Advertise2 liveAd) {
        this.liveAd = liveAd;
    }

    public String readyToAdvertise() {
        return "Acesta asta o reclama pentru " + liveAd.advertisingSource() + ". " + "Vino sa ne vizitezi la " + liveAd.companyName() + ". " + liveAd.advertisingMessage() + ". " + " Click aici pentru mai multe detalii: " + liveAd.externalLink() + ".";
    }
}
