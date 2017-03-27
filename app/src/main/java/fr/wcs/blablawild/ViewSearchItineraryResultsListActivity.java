package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.Query;
import com.google.firebase.database.ValueEventListener;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import static fr.wcs.blablawild.R.layout.trip_item;

public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {

    static final String DATABASE_URL = "itineraries";
    private FirebaseDatabase database;
    private ValueEventListener mConnectedListener;
    Query ref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_results_list);

        database = FirebaseDatabase.getInstance();
        ref = database.getReference(DATABASE_URL);

        ListView listViewDriveList = (ListView) findViewById(R.id.driveList);
        TripResultAdapter adapter = new TripResultAdapter(ref, this, trip_item);

        listViewDriveList.setAdapter(adapter);


    }
}
