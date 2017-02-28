package fr.wcs.blablawild;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;


public class SearchItineraryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_itinerary);

        final Button button = (Button) findViewById(R.id.buttonSearch);
        final EditText editText = (EditText) findViewById(R.id.editTextSearchDeparture);
        final EditText editText2 = (EditText) findViewById(R.id.editTextSearchDestination);
        final EditText editText4 = (EditText) findViewById(R.id.editText4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (editText.length() == 0 || editText2.length() == 0){
                    Toast.makeText(SearchItineraryActivity.this, getString(R.string.toast),
                          Toast.LENGTH_LONG).show();
                }
                else {
                    Intent intent2 = new Intent(SearchItineraryActivity.this, ViewSearchItineraryResultsListActivity.class);
                    String textDepart = editText.getText().toString();
                    String textDestination = editText2.getText().toString();
                    String textDate = editText4.getText().toString();
                    intent2.putExtra("départ", textDepart);
                    intent2.putExtra("arrivée", textDestination);
                    intent2.putExtra("date", textDate);
                    startActivity(intent2);

                }

            }
        });



    }
}
