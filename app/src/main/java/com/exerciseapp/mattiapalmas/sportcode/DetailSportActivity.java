package com.exerciseapp.mattiapalmas.sportcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DetailSportActivity extends AppCompatActivity {

    private ExpandableListView listView;
    private  ExpandableMenuAdapter menuAdapter;
    private List<String> listTitleHeader;
    private HashMap<String,List<String>> listHash;

    private ImageView sportImg1,sportImg2;
    private TextView titleSport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sport);

        listView = (ExpandableListView) findViewById(R.id.expanded_menu);
        initData();
        menuAdapter = new ExpandableMenuAdapter(this,listTitleHeader,listHash);
        listView.setAdapter(menuAdapter);

        initViews();

        Intent intent = getIntent();
        String sport = intent.getStringExtra("sport");

        switch (sport){

            case "soccer" :
                sportImg1.setBackgroundResource(R.drawable.soccerball);
                sportImg2.setBackgroundResource(R.drawable.soccerball);
                titleSport.setText("Soccer");
                break;

            case "basketball" :
                sportImg1.setBackgroundResource(R.drawable.basketball);
                sportImg2.setBackgroundResource(R.drawable.basketball);
                titleSport.setText("Basketball");
                break;
        }
    }

    private void initViews() {
        sportImg1 = (ImageView) findViewById(R.id.imgSport1);
        sportImg2 = (ImageView) findViewById(R.id.imgSport2);
        titleSport = (TextView) findViewById(R.id.titleSport);
    }

    private void initData() {
        listTitleHeader = new ArrayList<>();
        listHash = new HashMap<>();


        listTitleHeader.add("Basic rules");
        listTitleHeader.add("History");
        listTitleHeader.add("Hall of fame");
        listTitleHeader.add("Info");
        listTitleHeader.add("More");
        listTitleHeader.add("About");


        List<String> edmDev = new ArrayList<>();
        edmDev.add("This is an expandable list view");


        List<String> androidStudio = new ArrayList<>();
        androidStudio.add("Expandable listview");

        List<String> xamarin = new ArrayList<>();
        xamarin.add("Xamarin Expandable listview");

        listHash.put(listTitleHeader.get(0),edmDev);
        listHash.put(listTitleHeader.get(1),androidStudio);
        listHash.put(listTitleHeader.get(2),xamarin);
        listHash.put(listTitleHeader.get(3),xamarin);
        listHash.put(listTitleHeader.get(4),xamarin);
        listHash.put(listTitleHeader.get(5),xamarin);
    }
}
