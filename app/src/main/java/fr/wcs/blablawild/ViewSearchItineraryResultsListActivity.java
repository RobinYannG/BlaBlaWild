package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_results_list);

        Intent intent2 = getIntent();
        String départ = intent2.getStringExtra("départ");
        String arrivée = intent2.getStringExtra("arrivée");


        setTitle(départ + getString(R.string.titre) + arrivée);
    }
}
