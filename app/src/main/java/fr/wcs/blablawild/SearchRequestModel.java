package fr.wcs.blablawild;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.Date;

/**
 * Created by robingoudy on 06/03/2017.
 */

public class SearchRequestModel implements Parcelable {
    public String mDeparture;
    public String mDestination;
    public String mDate;

    private SearchRequestModel(){

    }

    public SearchRequestModel (String departure, String destination, String date){

        this.mDeparture = departure;
        this.mDestination = destination;
        this.mDate = date;
    }

    protected SearchRequestModel(Parcel in) {
        mDeparture = in.readString();
        mDestination = in.readString();
        mDate = in.readString();
    }

    public static final Creator<SearchRequestModel> CREATOR = new Creator<SearchRequestModel>() {
        @Override
        public SearchRequestModel createFromParcel(Parcel in) {
            return new SearchRequestModel(in);
        }

        @Override
        public SearchRequestModel[] newArray(int size) {
            return new SearchRequestModel[size];
        }
    };


    public String getDeparture(){
        return mDeparture;
    }
    public String getDestination(){
        return mDestination;
    }
    public String getDate(){
        return mDate;
    }

    @Override
    public int describeContents()
    {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags)
    {
        dest.writeString(mDeparture);
        dest.writeString(mDestination);
        dest.writeString(mDate);
    }


}
