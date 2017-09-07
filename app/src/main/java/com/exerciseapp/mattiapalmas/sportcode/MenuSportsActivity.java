package com.exerciseapp.mattiapalmas.sportcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MenuSportsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.activity_menu_sports);
       // getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.my_title_bar);
    }

    public void startDetailsSport(View view) {
        Intent intent =  new Intent(this, DetailSportActivity.class);

        switch (view.getId()){
            case R.id.soccerBtn :
                    intent.putExtra("sport", "soccer");
                break;
            case R.id.basketballBtn :
                intent.putExtra("sport", "basketball");
                break;
            case R.id.tennisBtn :
                intent.putExtra("sport", "tennis");
                break;
            case R.id.baseballBtn :
                intent.putExtra("sport", "baseball");
                break;
            case R.id.boxingBtn :
                intent.putExtra("sport", "boxing");
                break;
            case R.id.americanfootballBtn :
                intent.putExtra("sport", "americanFootball");
                break;
            case R.id.golfBtn :
                intent.putExtra("sport", "golf");
                break;
            case R.id.hokeyBtn :
                intent.putExtra("sport", "hockey");
                break;
            case R.id.waterpoloBtn :
                intent.putExtra("sport", "waterpolo");
                break;
        }
        startActivity(intent);
    }
}
