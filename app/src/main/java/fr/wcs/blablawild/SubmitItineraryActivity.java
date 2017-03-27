package fr.wcs.blablawild;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class SubmitItineraryActivity extends AppCompatActivity {

    private EditText mEditTextDeparture;
    private EditText mEditTextDestination;
    private EditText mEditTextPrice;
    private EditText mEditTextDate;
    private Button mButtonPublish;
    private EditText mEditTextHour;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submit_itinerary);

        mEditTextDeparture = (EditText) findViewById(R.id.editTextDeparture);
        mEditTextDestination = (EditText) findViewById(R.id.editTextDestination);
        mEditTextPrice = (EditText) findViewById(R.id.editTextPrice);
        mEditTextDate = (EditText) findViewById(R.id.editTextDate);
        mButtonPublish = (Button) findViewById(R.id.buttonPublish);
        mEditTextHour = (EditText) findViewById(R.id.editTextHour);

        mButtonPublish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mEditTextDeparture.length() != 0 && mEditTextDestination.length() != 0 && mEditTextPrice.length() != 0 && mEditTextDate.length() != 0){
                    String driverLastName = "Wintour";
                    String driverFirstName = "Anna";
                    int user = 0;
                    String departure = mEditTextDeparture.getText().toString();
                    String destination = mEditTextDestination.getText().toString();
                    String date = mEditTextDate.getText().toString();
                    String hour = mEditTextHour.getText().toString();
                    int price = Integer.parseInt(mEditTextPrice.getText().toString());

                    // Write a message to the database
                    final FirebaseDatabase database = FirebaseDatabase.getInstance();
                    DatabaseReference myRef = database.getReference("itineraries");

                    ItineraryModel mItineraryModel = new ItineraryModel(user, price, driverLastName, driverFirstName, date, departure, destination, hour);
                    myRef.push().setValue(mItineraryModel);
                    finish();

                }
            }
        });



}
}
