package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class SearchItineraryActivity extends AppCompatActivity {

    final static String EXTRA_REQUEST = "data";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_itinerary);

        final Button button = (Button) findViewById(R.id.buttonSearch);
        final EditText editTextSearchDeparture = (EditText) findViewById(R.id.editTextSearchDeparture);
        final EditText editTextSearchDestination = (EditText) findViewById(R.id.editTextSearchDestination);
        final EditText editTextDate = (EditText) findViewById(R.id.editTextDate);



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editTextSearchDeparture.length() == 0 || editTextSearchDestination.length() == 0){
                    Toast.makeText(SearchItineraryActivity.this, getString(R.string.toast),
                          Toast.LENGTH_LONG).show();
                }
                else {
                    String departure = editTextSearchDeparture.getText().toString();
                    String destination = editTextSearchDestination.getText().toString();
                    String date = editTextDate.getText().toString();

                    SearchRequestModel data = new SearchRequestModel (departure, destination, date);
                    Intent intent2 = new Intent(SearchItineraryActivity.this, ViewSearchItineraryResultsListActivity.class);
                    intent2.putExtra(EXTRA_REQUEST, data);
                    startActivity(intent2);

                }

            }
        });



    }
}
