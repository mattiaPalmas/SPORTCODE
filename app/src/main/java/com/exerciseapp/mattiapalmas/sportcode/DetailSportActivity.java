package com.exerciseapp.mattiapalmas.sportcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
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
    private HashMap<String,List<Spanned>> listHash;

    private ImageView sportImg1,sportImg2;
    private TextView titleSport;
    private String sport;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_sport);
        Intent intent = getIntent();
        sport = intent.getStringExtra("sport");

        listView = (ExpandableListView) findViewById(R.id.expanded_menu);
        initData();
        menuAdapter = new ExpandableMenuAdapter(this,listTitleHeader,listHash);
        listView.setAdapter(menuAdapter);

        initViews();


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
            case "tennis" :
                sportImg1.setBackgroundResource(R.drawable.tennis);
                sportImg2.setBackgroundResource(R.drawable.tennis);
                titleSport.setText("Tennis");
                break;
            case "baseball" :
                sportImg1.setBackgroundResource(R.drawable.baseball);
                sportImg2.setBackgroundResource(R.drawable.baseball);
                titleSport.setText("Baseball");
                break;
            case "boxing" :
                sportImg1.setBackgroundResource(R.drawable.boxing);
                sportImg2.setBackgroundResource(R.drawable.boxing);
                titleSport.setText("Boxing");
                break;
            case "americanFootball" :
                sportImg1.setBackgroundResource(R.drawable.americanfootball);
                sportImg2.setBackgroundResource(R.drawable.americanfootball);
                titleSport.setText("American Football");
                break;
            case "golf" :
                sportImg1.setBackgroundResource(R.drawable.golf);
                sportImg2.setBackgroundResource(R.drawable.golf);
                titleSport.setText("Golf");
                break;
            case "hockey" :
                sportImg1.setBackgroundResource(R.drawable.hokey);
                sportImg2.setBackgroundResource(R.drawable.hokey_);
                titleSport.setText("hockey");
                break;
            case "waterpolo" :
                sportImg1.setBackgroundResource(R.drawable.waterpolo);
                sportImg2.setBackgroundResource(R.drawable.waterpolo);
                titleSport.setText("Waterpolo");
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


        // Go through all sports and set all the descriptions for every tite in the menu.
        switch (sport){
            case "soccer" :

                listTitleHeader.add("Basic rules");
                listTitleHeader.add("Fouls and Misconduct");
                listTitleHeader.add("Domestic competition");
                listTitleHeader.add("International competition");
                listTitleHeader.add("More info");

                // Basic rules
                List<Spanned> basicRules = new ArrayList<>();
                String str1 = "<b>The Number of Players</b>" +
                        "<p>Matches are generally played by two teams of 11 to a side. The goalkeeper is included in the 11-player" +
                        " total. If a team cannot field at least seven players at match time, the game is a forfeit." +
                        " Teams of fewer than 11 a side can often be seen in youth leagues where smaller teams are used " +
                        "as a developmental tool. FIFA-sanctioned matches are generally limited to three substitutions per" +
                        " match, with the exception of friendly matches. Most youth leagues allow an unlimited number of" +
                        " substitutions, which must also be listed on the game card prior to the beginning of the match," +
                        " otherwise those players are ineligible. Substitutions may only enter at the halfway line, upon" +
                        " the referee’s approval, and after the player being subbed out has left the pitch. The goalkeeper" +
                        " may be substituted with anyone on the pitch or any eligible substitute on the bench during a game" +
                        " stoppage.</p>"+

                        "<b>The Referee</b>" +
                        "<p>The referee is the authority on the field, and his word is law. If you question a referee’s decision," +
                        " you can be disciplined further simply for dissent.</p>" +

                        "<b>The Duration of the Match</b>" +
                        "<p>A soccer match is comprised of two 45-minute halves, with extra time added for each at the referee’s discretion." +
                        " The halves are separated by a half-time period not to exceed 15 minutes. The extra time generally corresponds with" +
                        " the referee’s determination of how much time was taken up due to substitutions and injuries. The amount of extra time" +
                        " is announced and displayed at the half line at the end of each 45-minute period. Although soccer does have an allotted" +
                        " time limit, it is ultimately up to the referee’s as to when to end a match.</p>" +

                        "<b>The Start and Restart of Play</b>" +
                        "<p>Kick-off is generally determined by a coin toss, whereby the winning team can either choose to start with" +
                        " the ball or choose which goal they would like to attack. The losing team is then afforded whatever choice" +
                        " the winner does not elect to take. Kick-off occurs at the start of each half, and after each goal scored," +
                        " and is taken at the center of the halfway line. If a team scores a goal, the opposing team is given the" +
                        " kick-off to restart the match.</p>" +

                        "<b>The Method of Scoring</b>" +
                        "<p>A goal is scored when the entire ball has crossed the goal line within the frame of the goal. At the end" +
                        " of the match, the team with the most goals is the winner, barring the circumstantial necessity for extra time.</p>";
                basicRules.add(fromHtml(str1));



                //Fouls and Misconduct
                List<Spanned> fouls = new ArrayList<>();
                String str2 = "<b>A direct free kick is awarded when a player:</b><br><br>" +
                        "• Kicks or attempts to kick an opponent<br>" +
                        "• Trips or attempts to trip an opponent<br>" +
                        "• Jumps at an opponent<br>" +
                        "• Charges an opponent<br>" +
                        "• Strikes or attempts to strike an opponent<br>" +
                        "• Pushes an opponent<br>" +
                        "• Tackles an opponent<br>" +
                        "• Holds an opponent<br>" +
                        "• Spits at an opponent<br>" +
                        "• Handles the ball deliberately<br>" +
                        "<br><b>If any of these are fouls are committed by a player in their team’s penalty area, the opposing team is awarded a" +
                        " penalty kick. Indirect free kicks are awarded if a player:</b><br><br>" +
                        "• Plays in a dangerous manner<br>" +
                        "• Impedes the progress of an opponent<br>" +
                        "• Prevents the goalkeeper from releasing the ball from his/her hands<br>" +
                        "• Commits any other unmentioned offense<br>" +
                        "<br><b>Yellow cards are awarded as a caution or warning to a player and can be issued for the following offenses:</b><br><br>" +
                        "• Unsporting behavior<br>" +
                        "• Dissent by word or action<br>" +
                        "• Persistent infringement of the Laws of the Game<br>" +
                        "• Delaying the restart of play<br>" +
                        "• Failure to respect the required distance when play is restarted with a corner kick,free kick, or throw-in<br>" +
                        "• Entering or re-entering the field of play without the referee’s permission<br>" +
                        "• deliberately leaving the field of play without the referee’s permission<br>" +
                        "<br><b>Red cards are used to send a player off the field, and can be issued for the following offenses:</b><br><br>" +
                        "• Serious foul play<br>" +
                        "• Violent conduct<br>" +
                        "• Spitting at an opponent or any other person<br>" +
                        "• Denying the opposing team a goal or an obvious goal-scoring opportunity by deliberately handling the ball (the goalkeeper being an exception)<br>" +
                        "• Denying an obvious goal-scoring opportunity to an opponent moving towards the player’s goal by an offense punishable by a free kick or a penalty kick<br>" +
                        "• Using offensive or abusive language and/or gestures<br>" +
                        "• Receiving a second caution (yellow card) in the same match";
                fouls.add(fromHtml(str2));


                List<Spanned> competitonDom = new ArrayList<>();
                String str3 ="The governing bodies in each country operate league systems in a domestic season, normally comprising several divisions, in which" +
                        " the teams gain points throughout the season depending on results (<b>win = 3points, draw = 1 point ,lost = 0 points</b>).<br><br> Teams are placed into tables, " +
                        "placing them in order according to points accrued. Most commonly, <b>each team plays every other team in its league at home and away in each season</b>, in a" +
                        " round-robin tournament.<br><br> At the end of a season, the top team is declared the champion. The top few teams may be <b>promoted to a higher division</b>, and one" +
                        " or more of the teams finishing at the bottom are <b>relegated to a lower division</b>." +
                        "<p>Some countries' top divisions feature highly paid star players; in smaller countries and lower divisions, players may be part-timers with a second job," +
                        " or amateurs. <br><br>The five top European leagues – the <b>Bundesliga</b> (Germany), <b>Premier League</b> (England), <b>La Liga</b> (Spain), <b>Serie A</b> (Italy), and <b>Ligue 1</b> (France)" +
                        " – attract most of the world's best players and each of the leagues has a total wage cost in excess of £600 million/€763 million/US$1.185 billion.</p>";
                competitonDom.add(fromHtml(str3));

                // international competition
                List<Spanned> competitonInt = new ArrayList<>();
                String str4 ="<p>The major international competition in football is the <b>World Cup</b>, organised by FIFA. This competition" +
                        " takes place every four years since 1930 with the exception of 1942 and 1946 tournaments, which were cancelled due" +
                        " to World War II. Approximately 190–200 national teams compete in qualifying tournaments within the scope of" +
                        " continental confederations for a place in the finals.</p>" +
                        "<p>After the <b>World Cup</b>, the most important international football competitions are the continental championships," +
                        " which are organised by each continental confederation and contested between national teams. These are the" +
                        " <b>European Championship (UEFA)</b>, the <b>Copa América (CONMEBOL)</b>, <b>African Cup of Nations (CAF)</b>, the <b>Asian Cup (AFC)</b>," +
                        " the CONCACAF Gold Cup (CONCACAF) and the OFC Nations Cup (OFC). The FIFA Confederations Cup is contested by" +
                        " the winners of all six continental championships, the current FIFA World Cup champions and the country which" +
                        " is hosting the Confederations Cup.</p>" +
                        "<p>The most prestigious competitions in club football are the respective continental championships, which are generally" +
                        " contested between national champions, for example the <b>UEFA Champions League</b> in Europe and the <b>Copa Libertadores</b>" +
                        " in South America. The winners of each continental competition contest the FIFA Club World Cup.</p>";
                competitonInt.add(fromHtml(str4));

                List<Spanned> moreInfo = new ArrayList<>();
                String str5 = "<string name=\"my_link\"><a href=\"https://en.wikipedia.org/wiki/Association_football\">Football Wikipedia</a></string>";
                moreInfo.add(fromHtml(str5));

                listHash.put(listTitleHeader.get(0),basicRules);
                listHash.put(listTitleHeader.get(1),fouls);
                listHash.put(listTitleHeader.get(2),competitonDom);
                listHash.put(listTitleHeader.get(3),competitonInt);
                listHash.put(listTitleHeader.get(4),moreInfo);

                break;
        }
    }


    @SuppressWarnings("deprecation")
    public static Spanned fromHtml(String html){
        Spanned result;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.N) {
            result = Html.fromHtml(html,Html.FROM_HTML_MODE_LEGACY);
        } else {
            result = Html.fromHtml(html);
        }
        return result;
    }
}
