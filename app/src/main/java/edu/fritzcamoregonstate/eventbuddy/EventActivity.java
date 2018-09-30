package edu.fritzcamoregonstate.eventbuddy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class EventActivity extends AppCompatActivity {

    private Button mNextButton;
    private TextView mEventName;
    private TextView mEventLocation;
    private TextView mEventDate;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);

        mNextButton = (Button) findViewById(R.id.next_button);
        mEventName = (TextView) findViewById(R.id.event_name);
        mEventLocation = (TextView) findViewById(R.id.event_location);
        mEventDate = (TextView) findViewById(R.id.event_date);
    }
}
