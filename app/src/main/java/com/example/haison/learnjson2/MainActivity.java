package com.example.haison.learnjson2;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;


public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MobieAdapter mAdapter;


    private Mobie[] mobie;
    private ItemClickListener itemClickListener; //khai báo interface

    //private Mobie[] mListMobie = new Mobie;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        processDownload();
        recyclerView = findViewById(R.id.recycler_View);

    }


    private void processDownload() {
        String linkJson = "https://androidtutorialpoint.com/api/MobileJSONArray.json";
        DownloadTask task = new DownloadTask();
        task.execute(linkJson);
    }

    class DownloadTask extends AsyncTask<String, Mobie, Void> {

        protected void onPreExecute() {
            super.onPreExecute();
        }

        protected Void doInBackground(String... link) {
            String a = "https://androidtutorialpoint.com/api/MobileJSONArray.json";
            try {
                URL url = new URL(a);
                InputStreamReader reader = new InputStreamReader(url.openStream(), "UTF-8");

                Gson gson = new Gson();
                mobie = gson.fromJson(reader, Mobie[].class);


                publishProgress(mobie);


            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }


            return null;
        }

        @Override
        protected void onProgressUpdate(Mobie... values) {
            super.onProgressUpdate(values);
            //lấy data được truyền từ doInBackground
            Mobie mobi = values[0];

            mAdapter = new MobieAdapter(MainActivity.this, mobie);

            RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
            recyclerView.setLayoutManager(mLayoutManager);
            recyclerView.setItemAnimator(new DefaultItemAnimator());
            recyclerView.setAdapter(mAdapter);





            if (mobie != null) {

                for (int i = 0; i < mobie.length; i++) {

                    Log.d("test", "phan tu thu " + i + " la cua " + mobie[i].getCompanyName());

                }
            }


        }
    }


}
