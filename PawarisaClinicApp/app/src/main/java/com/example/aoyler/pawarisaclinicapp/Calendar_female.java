package com.example.aoyler.pawarisaclinicapp;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.design.widget.CoordinatorLayout;
import android.support.v7.app.AppCompatActivity;
import android.text.InputType;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

import okhttp3.MediaType;
import okhttp3.OkHttpClient;

public class Calendar_female extends AppCompatActivity implements View.OnClickListener {

    private EditText startdate;
    private EditText enddate;
    private DatePickerDialog fromDatePickerDialog;
    private SimpleDateFormat dateFormatter;
    private DatePickerDialog fromDatePickerDialogEnd;
    private SimpleDateFormat dateFormatterEnd;

    @Override
    protected void onCreate(Bundle savedInstanceStatusCode) {
        super.onCreate(savedInstanceStatusCode);
        setContentView(R.layout.calendar_female);

        dateFormatter = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        setAddStartdate();
        setDateTimeField();

        dateFormatterEnd = new SimpleDateFormat("dd-MM-yyyy", Locale.US);
        setAddEndtime();
        setDateTimeFieldEnd();
    }

    private void setAddStartdate() {//ให้เซ็ตข้อมมูลเข้าให้เป็นวันที่
        startdate = (EditText) findViewById(R.id.editText);
        startdate.setInputType(InputType.TYPE_NULL);
    }

    private void setAddEndtime() {//ให้เซ็ตข้อมมูลเข้าให้เป็นวันที่
        enddate = (EditText) findViewById(R.id.editText2);
        enddate.setInputType(InputType.TYPE_NULL);
    }

    private void setDateTimeField() {//เรียกปฎิทิน
        startdate.setOnClickListener(this);
        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialog = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                startdate.setText(dateFormatter.format(newDate.getTime()));
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }
    private void setDateTimeFieldEnd() {//เรียกปฎิทิน
        enddate.setOnClickListener(this);
        Calendar newCalendar = Calendar.getInstance();
        fromDatePickerDialogEnd = new DatePickerDialog(this, new DatePickerDialog.OnDateSetListener() {
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                Calendar newDate = Calendar.getInstance();
                newDate.set(year, monthOfYear, dayOfMonth);
                enddate.setText(dateFormatterEnd.format(newDate.getTime()));
            }
        }, newCalendar.get(Calendar.YEAR), newCalendar.get(Calendar.MONTH), newCalendar.get(Calendar.DAY_OF_MONTH));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
    return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        //getMenuInflater().inflate(R.menu.menu_add, menu);
        return true;
    }

    @Override
    public void onClick(View v) {
        if (v == startdate) {
            fromDatePickerDialog.show();
        }
        else if(v == enddate){
            fromDatePickerDialogEnd.show();
        }
    }

}
