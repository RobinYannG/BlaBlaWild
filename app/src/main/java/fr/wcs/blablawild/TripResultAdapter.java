package fr.wcs.blablawild;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.google.firebase.database.Query;

import java.util.ArrayList;

/**
 * Created by robingoudy on 07/03/2017.
 */

public class TripResultAdapter extends FirebaseListAdapter<ItineraryModel> {
    // The mUsername for this client. We use this to indicate which messages originated from this user

    public TripResultAdapter(Query ref, Activity activity, int layout) {
        super(ref, ItineraryModel.class, layout, activity);
    }

    /**
     * Bind an instance of the <code>Chat</code> class to our view. This method is called by <code>FirebaseListAdapter</code>
     * when there is a data change, and we are given an instance of a View that corresponds to the layout that we passed
     * to the constructor, as well as a single <code>Chat</code> instance that represents the current data to bind.
     *
     * @param view A view instance corresponding to the layout we passed to the constructor.
     * @param model An instance representing the current state of a chat message
     */
    @Override
    protected void populateView(View view, ItineraryModel model) {
        TextView textViewDepartureTime = (TextView) view.findViewById(R.id.textViewDepartureTime);
        TextView textViewFirstname = (TextView) view.findViewById(R.id.textViewFirstname);
        TextView textViewPrice = (TextView) view.findViewById(R.id.textViewPrice);
        textViewDepartureTime.setText(model.getmDepartureDate() + " " + model.getmHour());
        textViewFirstname.setText("Robin");
        textViewPrice.setText(String.valueOf(model.getmPrice()));

    }
}

