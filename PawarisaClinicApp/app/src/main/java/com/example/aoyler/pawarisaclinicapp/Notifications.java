package com.example.aoyler.pawarisaclinicapp;

/**
 * Created by aoyler on 24/4/2559.
 */
import android.content.Intent;
import android.net.Uri;
import android.provider.CalendarContract;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import java.util.Calendar;
import android.provider.CalendarContract.Events;
public class Notifications extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.notifications);
    }

    public void onAddEventClicked(View view){
        Intent intent = new Intent(Intent.ACTION_INSERT)
                .setType("vnd.android.cursor.item/event")
                //.putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                //.putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
//                .putExtra(CalendarContract.EXTRA_EVENT_ALL_DAY , false) // just included for completeness
                .putExtra(Events.TITLE, "ทานยา");
//                .putExtra(Events.DESCRIPTION, "Heading out with friends to do something awesome.")
//                .putExtra(Events.EVENT_LOCATION, "Earth")
//                .putExtra(Events.RRULE, "FREQ=DAILY;COUNT=10")
//                .putExtra(Events.AVAILABILITY, Events.AVAILABILITY_BUSY)
//                .putExtra(Events.ACCESS_LEVEL, Events.ACCESS_PRIVATE)
//                .putExtra(Intent.EXTRA_EMAIL, "aoy.wannisa1994@example.com");
        startActivity(intent);
       // startActivityForResult(Intent.createChooser(intent
               // , "Select photo from"), 0);
        //Uri uri = Uri.parse("content://com.android.calendar/events");
       //Intent calIntent = new Intent("android.intent.action.INSERT", uri)
       //         .setAction(Intent.ACTION_INSERT);
//       startActivity(calIntent);


      /*Calendar beginTime = Calendar.getInstance();
     beginTime.set(2012, 0, 19, 7, 30);
     Calendar endTime = Calendar.getInstance();
     endTime.set(2012, 0, 19, 8, 30);
     Intent intent = new Intent(Intent.ACTION_INSERT)
                .setData(Events.CONTENT_URI)
                .putExtra(CalendarContract.EXTRA_EVENT_BEGIN_TIME, beginTime.getTimeInMillis())
                .putExtra(CalendarContract.EXTRA_EVENT_END_TIME, endTime.getTimeInMillis())
                .putExtra(Events.TITLE, "Yoga")
                .putExtra(Events.DESCRIPTION, "Group class")
                .putExtra(Events.EVENT_LOCATION, "The gym")
                .putExtra(Events.AVAILABILITY, Events.AVAILABILITY_BUSY)
                .putExtra(Intent.EXTRA_EMAIL, "rowan@example.com,trevor@example.com");
        startActivity(intent);*/
    }

}

