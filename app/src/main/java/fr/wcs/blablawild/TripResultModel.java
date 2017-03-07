package fr.wcs.blablawild;

import java.util.Date;

/**
 * Created by robingoudy on 07/03/2017.
 */

public class TripResultModel {
    public String mFirstname;
    public Date mDepartureTime;
    public int mPrice;

    public TripResultModel(String firstname, Date departureTime, int price){
        this.mFirstname = firstname;
        this.mDepartureTime = departureTime;
        this.mPrice = price;
    }

    public String getmFirstname (){
        return this.mFirstname;
    }
    public Date getDepartureTime(){
        return this.mDepartureTime;
    }
    public int getmPrice(){
        return this.mPrice;
    }


    public void setmFirstname(String mFirstname){
        this.mDepartureTime = mDepartureTime;
    }
    public void setmDepartureTime(Date mDepartureTime){
        this.mDepartureTime = mDepartureTime;
    }
    public void setmPrice(int mPrice){
        this.mPrice = mPrice;
    }




}

