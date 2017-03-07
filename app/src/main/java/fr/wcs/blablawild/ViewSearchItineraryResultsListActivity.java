package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class ViewSearchItineraryResultsListActivity extends AppCompatActivity {

    private SearchRequestModel data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_search_itinerary_results_list);

        Intent intent2 = getIntent();
        data = intent2.getParcelableExtra(SearchItineraryActivity.EXTRA_REQUEST);

        Toast.makeText(this,data.getDate(), Toast.LENGTH_SHORT).show();
        this.setTitle(data.getDeparture() + " " + ">>" + " " + data.getDestination());
    }
}
