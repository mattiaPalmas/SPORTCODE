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

        listTitleHeader = new ArrayList<>();
        listHash = new HashMap<>();
        listView = (ExpandableListView) findViewById(R.id.expanded_menu);
        menuAdapter = new ExpandableMenuAdapter(this,listTitleHeader,listHash);
        listView.setAdapter(menuAdapter);

        initViews();


        switch (sport){

            case "soccer" :
                sportImg1.setBackgroundResource(R.drawable.soccerball);
                sportImg2.setBackgroundResource(R.drawable.soccerball);
                titleSport.setText("Soccer");
                setSoccerInfo();
                break;
            case "basketball" :
                sportImg1.setBackgroundResource(R.drawable.basketball);
                sportImg2.setBackgroundResource(R.drawable.basketball);
                titleSport.setText("Basketball");
                setBasketballInfo();
                break;
            case "tennis" :
                sportImg1.setBackgroundResource(R.drawable.tennis);
                sportImg2.setBackgroundResource(R.drawable.tennis);
                titleSport.setText("Tennis");
                setTennisInfo();
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

    private void setSoccerInfo() {
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

    }

    private void setBasketballInfo() {
        listTitleHeader.add("Overview");
        listTitleHeader.add("Position players");
        listTitleHeader.add("Rules and regulations");
        listTitleHeader.add("Violations");
        listTitleHeader.add("More info");


        List<Spanned> overview = new ArrayList<>();
        String str1 = "A team can score a field goal by shooting the ball through the basket being defended by the opposition" +
                " team during regular play. A field goal scores <b>three points</b> for the shooting team if the player shoots from" +
                " behind the three-point line, and <b>two points</b> if shot from in front of the line. A team can also score via <b>free" +
                " throws</b>, which are worth one point, after the other team is assessed with certain fouls. The team with the most" +
                " points at the end of the game wins, but additional time (overtime) is mandated when the score is tied at the" +
                " end of regulation. The ball can be advanced on the court by passing it to a teammate, or by bouncing it while" +
                " walking or running (dribbling). It is a violation to lift, or drag, one's pivot foot without dribbling the ball," +
                " to carry it, or to hold the ball with both hands then resume dribbling." +
                "Basketball is one of the world's most popular and widely viewed sports. The <b>National Basketball Association (NBA)</b>" +
                " is the most popular and widely considered to be the highest level of professional basketball in the world and" +
                " NBA players are the world's best paid athletes by average annual salary per player. Outside North America, the top " +
                "clubs from national leagues qualify to continental championships such as the Euroleague and FIBA Americas League. " +
                "The FIBA Basketball World Cup attracts the top national teams from around the world. Each continent hosts regional" +
                " competitions for national teams, like <b>EuroBasket</b> and <b>FIBA</b> Americas Championship.";
        overview.add(fromHtml(str1));

        List<Spanned> players = new ArrayList<>();
        String str2 = "The game has many individual techniques for displaying skill—ball-handling, shooting, passing, dribbling, dunking," +
                " shot-blocking, and rebounding. <br>Basketball teams generally have <b>player positions</b>, the tallest and strongest members" +
                " of a team are called a <b>center or power forward</b>, while slightly shorter and more agile players are called <b>small" +
                " forward</b>, and the shortest players or those who possess the best ball handling skills are called a <b>point guard" +
                " or shooting guard</b>. <br>The point guard directs the on court action of the team, implementing the coach's game plan," +
                " and managing the execution of offensive and defensive plays (player positioning).<br><br>" +
                "<b>Point guard</b> (often called the \"1\") : usually the fastest player on the team, organizes the team's offense by controlling the ball and making sure that it gets to the right player at the right time.\n" +
                "<br><b>Shooting guard</b> (the \"2\") : creates a high volume of shots on offense, mainly long-ranged; and guards the opponent's best perimeter player on defense.\n" +
                "<br><b>Small forward</b> (the \"3\") : often primarily responsible for scoring points via cuts to the basket and dribble penetration; on defense seeks rebounds and steals, but sometimes plays more actively.\n" +
                "<br><b>Power forward</b> (the \"4\"): plays offensively often with their back to the basket; on defense, plays under the basket (in a zone defense) or against the opposing power forward (in man-to-man defense).\n" +
                "<br><b>Center</b> (the \"5\"): uses height and size to score (on offense), to protect the basket closely (on defense), or to rebound.";
        players.add(fromHtml(str2));


        List<Spanned> rules = new ArrayList<>();
        String str3 = "Games are played in <b>four quarters</b> of 10 (FIBA) or 12 minutes (NBA). <b>Overtime</b> periods are five minutes in length.<br>" +
                "Five players from each team may be on the court at one time. <b>Substitutions are unlimited</b> but can only be done when play is stopped.<br>" +
                "The game is controlled by the officials consisting of the referee (referred to as crew chief in the NBA), one or two umpires (referred to" +
                " as referees in the NBA) and the table officials. For college, the NBA, and many high schools, there are a total of <b>three referees on the court</b>." +
                " The <b>table officials</b> are responsible for keeping track of each teams scoring, timekeeping, individual and team fouls, player substitutions, " +
                "team possession arrow, and the shot clock.";
        rules.add(fromHtml(str3));

        List<Spanned> violations = new ArrayList<>();
        String str4 = "There are limits placed on the steps a player may take without dribbling, which commonly results in an infraction" +
                " known as <b>traveling</b>. Nor may a player stop his dribble and then resume dribbling. A dribble that touches both hands" +
                " is considered stopping the dribble, giving this infraction the name <b>double dribble</b>.<br> Within a dribble, the player cannot carry" +
                " the ball by placing his hand on the bottom of the ball; doing so is known as <b>carrying the ball</b>. A team, once having " +
                "established ball control in the front half of their court, may not return the ball to the backcourt and be the first to touch it.<br> A violation of these rules results in loss of possession.\n" +
                "The ball may not be kicked, nor be struck with the fist.<br> For the offense, a violation of these rules results in <b>loss of possession</b>; for the defense, most leagues reset the shot " +
                "clock and the offensive team is given possession of the ball out of bounds.";
        violations.add(fromHtml(str4));

        List<Spanned> moreInfo = new ArrayList<>();
        String str5 = "<string name=\"my_link\"><a href=\"https://en.wikipedia.org/wiki/Basketball\">Basketball Wikipedia</a></string>";
        moreInfo.add(fromHtml(str5));

        listHash.put(listTitleHeader.get(0),overview);
        listHash.put(listTitleHeader.get(1),players);
        listHash.put(listTitleHeader.get(2),rules);
        listHash.put(listTitleHeader.get(3),violations);
        listHash.put(listTitleHeader.get(4),moreInfo);
    }

    private void setTennisInfo() {
        listTitleHeader.add("Scoring");
        listTitleHeader.add("Officials");
        listTitleHeader.add("Court Lines");
        listTitleHeader.add("moreInfo");


        List<Spanned> scoring = new ArrayList<>();
        String str1 = "<b>Game</b><br><br>" +
                "A game consists of a sequence of points played with the <b>same player serving</b>. A game is won by the first" +
                " player to have won at least four points in total and at least two points more than the opponent.<br>" +
                "The running score of each game is described in a manner peculiar to tennis: scores from zero to three points are described as" +
                " \"<b>love</b>\", \"<b>fifteen</b>\", \"<b>thirty</b>\", and \"<b>forty</b>\", respectively.<br> If at least three points have" +
                " been scored by each player, making the player's scores equal at forty apiece, the score is not called out as \"forty-forty\", but" +
                " rather as \"<b>deuce</b>\".<br> If at least three points have been scored by each side and a player has one more point than his opponent," +
                " the score of the game is \"<b>advantage</b>\" for the player in the lead." +
                "<br><br><b>Set</b><br><br>" +
                "A set consists of a sequence of games played with service alternating between games, ending when the count of games" +
                " won meets certain criteria.<br>Typically, a player wins a set by winning <b>at least six games</b> and at least two games <b>more than the opponent</b>. " +
                "If one player has won six games and the opponent five, an additional game is played. If the leading player wins that game, the player wins the set 7–5. " +
                "If the trailing player wins the game, a tie-break is played. A tie-break, played under a separate set of rules, allows one player to win one more game" +
                " and thus the set, to give a final set score of 7–6. " +
                "<br><br><b>Match</b><br><br>" +
                "A match consists of a sequence of sets. The outcome is determined through a best of three or five sets system. " +
                "On the professional circuit, men play <b>best-of-five-set</b> matches at all four Grand Slam tournaments, Davis Cup, and" +
                " the final of the Olympic Games and best-of-three-set matches at all other tournaments, while women play" +
                " best-of-three-set matches at all tournaments.<br>The first player to win two sets in a best-of-three, or three sets" +
                " in a best-of-five, wins the match.<br>Only in the final sets of matches at the Australian Open, the French Open," +
                " Wimbledon, the Olympic Games, Davis Cup (until 2015), and Fed Cup are tie-breaks not played. In these cases, sets" +
                " are played indefinitely until one player has a two-game lead, leading to some remarkably long matches.";
        scoring.add(fromHtml(str1));

        List<Spanned> officials = new ArrayList<>();
        String str2 = "In most professional play and some amateur competition, there is an officiating <b>head judge</b> or chair umpire" +
                " (usually referred to as the umpire), who sits in a raised chair to one side of the court. The umpire has absolute" +
                " authority to make factual determinations. <br>The umpire may be assisted by line judges, who determine whether the" +
                " ball has landed within the required part of the court and who also call foot faults. There also may be a <b>net" +
                " judge</b> who determines whether the ball has touched the net during service. <br>The umpire has the right to overrule" +
                " a line judge or a net judge if the umpire is sure that a clear mistake has been made.<br><br>" +
                "The referee, who is usually located off the court, is the final authority about tennis rules. When called to the court" +
                " by a player or team captain, the referee may overrule the umpire's decision if the tennis rules were violated (question " +
                "of law) but may not change the umpire's decision on a question of fact. If, however, the referee is on the court during" +
                " play, the referee may overrule the umpire's decision (This would only happen in Davis Cup or Fed Cup matches, not at" +
                " the World Group level, when a chair umpire from a non-neutral country is in the chair).";
        officials.add(fromHtml(str2));

        List<Spanned> courtLines = new ArrayList<>();
        String str3 = "<b>Lines</b><br><br>" +
                "The lines that delineate the width of the court are called the baseline (farthest back) and the service line " +
                "(middle of the court). The short mark in the center of each <b>baseline</b> is referred to as either the hash mark or the" +
                " center mark. The outermost lines that make up the length are called the <b>doubles sidelines</b>.<br>These are the boundaries" +
                " used when doubles is being played. The lines to the inside of the doubles sidelines are the singles sidelines and are" +
                " used as boundaries in singles play.<br><br>The area between a doubles sideline and the nearest singles sideline is called the" +
                " doubles alley, which is considered playable in doubles play. The line that runs across the center of a player's side" +
                " of the court is called the service line because the serve must be delivered into the area between the <b>service line</b> and" +
                " the net on the receiving side. Despite its name, this is not where a player legally stands when making a serve.";
        courtLines.add(fromHtml(str3));

        List<Spanned> moreInfo = new ArrayList<>();
        String str4 = "<string name=\"my_link\"><a href=\"https://en.wikipedia.org/wiki/tennis\">Tennis Wikipedia</a></string>";
        moreInfo.add(fromHtml(str4));


        listHash.put(listTitleHeader.get(0),scoring);
        listHash.put(listTitleHeader.get(1),officials);
        listHash.put(listTitleHeader.get(2),courtLines);
        listHash.put(listTitleHeader.get(3),moreInfo);
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
