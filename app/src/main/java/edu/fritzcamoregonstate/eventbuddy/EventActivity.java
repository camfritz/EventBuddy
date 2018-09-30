package edu.fritzcamoregonstate.eventbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EventActivity extends AppCompatActivity {

    private Button mNextButton;
    private TextView mEventName;
    private TextView mEventLocation;
    private TextView mEventDate;

    private Event[] mEventBank = new Event[] {
            new Event(R.string.event_park_theater, R.string.location_park_theater, R.string.date_park_theater),
            new Event(R.string.event_brewfest, R.string.location_brewfest, R.string.date_brewfest),
            new Event(R.string.event_winter_fest, R.string.location_winter_fest, R.string.date_brewfest),
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mEventName = (TextView) findViewById(R.id.event_name);
        mEventLocation = (TextView) findViewById(R.id.event_location);
        mEventDate = (TextView) findViewById(R.id.event_date);

        mNextButton = (Button) findViewById(R.id.next_button);
        mNextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
