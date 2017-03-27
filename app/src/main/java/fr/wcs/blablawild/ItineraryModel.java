package fr.wcs.blablawild;

/**
 * Created by robingoudy on 21/03/2017.
 */

public class ItineraryModel {

    private int mUserID;
    private int mPrice;
    private String mDriverLastName;
    private String mDriverFirstName;
    private String mDepartureDate;
    private String mDeparture;
    private String mDestination;
    private String mHour;

    private ItineraryModel(){

    }

    public ItineraryModel(int userID, int price, String driverLastName, String driverFirstName, String departureDate, String departure, String destination, String hour){
        mUserID = userID;
        mPrice = price;
        mDriverLastName = driverLastName;
        mDriverFirstName = driverFirstName;
        mDepartureDate = departureDate;
        mDeparture = departure;
        mDestination = destination;
        mHour = hour;
    }

    public int getmUserID() {
        return mUserID;
    }

    public int getmPrice() {
        return mPrice;
    }

    public String getmDriverLastName() {
        return mDriverLastName;
    }

    public String getmDriverFirstName() {
        return mDriverFirstName;
    }

    public String getmDepartureDate() {
        return mDepartureDate;
    }

    public String getmDeparture() {
        return mDeparture;
    }

    public String getmDestination() {
        return mDestination;
    }

    public String getmHour() {return  mHour; }


}
