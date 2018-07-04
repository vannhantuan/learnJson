package com.example.haison.learnjson2;

import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Objects;
import java.util.jar.Attributes;

public class ShowDetailActivity extends AppCompatActivity {
    TextView txtName;
    TextView txtCompanyName;
    TextView txtRom;
    TextView txtBackCamera;
    TextView txtScreenSize;

    String mName;
    String mCompanyName;
    String mRom;
    String mBackCamera;
    String mScreenSize;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_detail);

        addControls();


    }

    private void addControls() {


         mName = getIntent().getExtras().getString("Name");
         mCompanyName = getIntent().getExtras().getString("Company Name");
         mRom = getIntent().getExtras().getString("Rom");
         mBackCamera = getIntent().getExtras().getString("Back Camera");
         mScreenSize = getIntent().getExtras().getString("Screen Size");

         //String mobie1 = getIntent().getStringExtra("data");

        //  getIntent().getSerializableExtra("Name");
        //
        //intent.getExtras();


        txtName = (TextView) findViewById(R.id.txtName);
        txtName.setText(mName);
        txtCompanyName = (TextView) findViewById(R.id.txtCompanyName);
        txtCompanyName.setText(mCompanyName);
        txtRom = (TextView) findViewById(R.id.txtRom);
        txtRom.setText(mRom);
        txtBackCamera = (TextView) findViewById(R.id.txtBackCamera);
        txtBackCamera.setText(mBackCamera);
        txtScreenSize = (TextView) findViewById(R.id.txtScreenSize);
        txtScreenSize.setText(mScreenSize);
        // imgImage = (ImageView) findViewById(R.id.imgImage);


    }


}


