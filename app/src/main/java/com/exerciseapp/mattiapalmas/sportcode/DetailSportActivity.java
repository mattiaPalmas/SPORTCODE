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
                setBaseballInfo();
                break;
            case "boxing" :
                sportImg1.setBackgroundResource(R.drawable.boxing);
                sportImg2.setBackgroundResource(R.drawable.boxing);
                titleSport.setText("Boxing");
                setBoxingInfo();
                break;
            case "americanFootball" :
                sportImg1.setBackgroundResource(R.drawable.americanfootball);
                sportImg2.setBackgroundResource(R.drawable.americanfootball);
                titleSport.setText("American Football");
                setAmericanFootballInfo();
                break;
            case "golf" :
                sportImg1.setBackgroundResource(R.drawable.golf);
                sportImg2.setBackgroundResource(R.drawable.golf);
                titleSport.setText("Golf");
                setGolfInfo();
                break;
            case "hockey" :
                sportImg1.setBackgroundResource(R.drawable.hokey);
                sportImg2.setBackgroundResource(R.drawable.hokey_);
                titleSport.setText("hockey");
                setHockeyInfo();
                break;
            case "waterpolo" :
                sportImg1.setBackgroundResource(R.drawable.waterpolo);
                sportImg2.setBackgroundResource(R.drawable.waterpolo);
                titleSport.setText("Waterpolo");
                setWaterpoloInfo();
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


        listHash.put(listTitleHeader.get(0),basicRules);
        listHash.put(listTitleHeader.get(1),fouls);
        listHash.put(listTitleHeader.get(2),competitonDom);
        listHash.put(listTitleHeader.get(3),competitonInt);

    }

    private void setBasketballInfo() {
        listTitleHeader.add("Overview");
        listTitleHeader.add("Position players");
        listTitleHeader.add("Rules and regulations");
        listTitleHeader.add("Violations");

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

        listHash.put(listTitleHeader.get(0),overview);
        listHash.put(listTitleHeader.get(1),players);
        listHash.put(listTitleHeader.get(2),rules);
        listHash.put(listTitleHeader.get(3),violations);
    }

    private void setTennisInfo() {
        listTitleHeader.add("Scoring");
        listTitleHeader.add("Officials");
        listTitleHeader.add("Court Lines");


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
    }

    private void setBaseballInfo() {
        listTitleHeader.add("Overview");
        listTitleHeader.add("Player rosters");
        listTitleHeader.add("No clock to kill");


        List<Spanned> overview = new ArrayList<>();
        String str1 = "A game is played between two teams, each composed of nine players, that take turns playing offense " +
                "(batting and baserunning) and defense (pitching and fielding). A <b>pair of turns</b>, one at bat and one in the" +
                " field, by each team constitutes an inning.<br><br> A game consists of <b>nine innings</b> (seven innings at the high" +
                " school level and in doubleheaders in college and minor leagues). One team—customarily the visiting team—bats" +
                " in the top, or first half, of every inning. <br><br>The other team—customarily the home team—bats in the" +
                " bottom, or second half, of every inning. The goal of the game is to score more points (runs) than the other" +
                " team. The players on the team at bat attempt to score runs by circling or completing a tour of the four b" +
                "ases set at the corners of the square-shaped baseball diamond.<br><br> A player bats at home plate and must " +
                "proceed counterclockwise to <b>first base, second base, third base, and back home</b> in order to score a run. The " +
                "team in the field attempts both to prevent runs from scoring and to record outs, which remove opposing players" +
                " from offensive action until their turn in their team's batting order comes up again.<br><br> When <b>three outs</b>" +
                " are recorded, the teams switch roles for the next half-inning. If the score of the game is tied after nine " +
                "innings, extra innings are played to resolve the contest. Many amateur games, particularly unorganized ones," +
                " involve different numbers of players and innings.";
        overview.add(fromHtml(str1));

        List<Spanned> player = new ArrayList<>();
        String str2 = "Roster, or squad, sizes differ between different leagues and different levels of organized play. Major" +
                " League Baseball teams maintain <b>25-player</b> active rosters.<br>A typical 25-man roster in a league without" +
                " the DH rule, such as MLB's National League, features:<br><br>" +
                "• eight position players—catcher, four infielders, three outfielders—who play on a regular basis\n" +
                "<br><br>• five <b>starting pitchers</b> who constitute the team's pitching rotation or starting rotation\n" +
                "<br><br>• six <b>relief pitchers</b>, including one specialist closer, who constitute the team's bullpen (named for the off-field area where pitchers warm up)\n" +
                "<br><br>• one <b>backup catcher</b>" +
                "<br><br>• two <b>backup infielders</b>" +
                "<br><br>• two <b>backup outfielders</b>" +
                "<br><br>• one specialist pinch hitter, or a second backup catcher, or a seventh reliever\n" +
                "In the American League and others with the DH rule, there will usually be nine offensive regulars (including the DH), " +
                "five starting pitchers, seven or eight relievers, a backup catcher and two or three other reserves; the need for late inning pinch-hitters is reduced by the DH.";
        player.add(fromHtml(str2));

        List<Spanned> clock = new ArrayList<>();
        String str3 = "In clock-limited sports, games often end with a team that holds the lead killing the clock rather than" +
                " competing aggressively against the opposing team.<br> In contrast, <b>baseball has no clock</b>; a team cannot" +
                " win without getting the last batter out and rallies are not constrained by time." +
                " At almost any turn in any baseball game, the most advantageous strategy is some form of aggressive strategy.<br><br>" +
                " In contrast, again, the clock comes into play even in the case of multi-day Test and first-class cricket:" +
                " the possibility of a draw often encourages a team that is batting last and well behind to bat defensively," +
                " giving up any faint chance at a win to avoid a loss.[133] Baseball offers no such reward for conservative batting.";
        clock.add(fromHtml(str3));


        listHash.put(listTitleHeader.get(0),overview);
        listHash.put(listTitleHeader.get(1),player);
        listHash.put(listTitleHeader.get(2),clock);
    }

    private void setBoxingInfo() {
        listTitleHeader.add("Rules");
        listTitleHeader.add("Boxing styles");
        listTitleHeader.add("Punches");

        List<Spanned> rules = new ArrayList<>();
        String str1 = "A boxing match typically consists of a determined number of three-minute rounds, " +
                "a total of up to <b>9 to 12 rounds</b>. A minute is typically spent between each round with" +
                " the fighters in their assigned corners receiving advice and attention from their coach and staff. " +
                "<br>The fight is controlled by a referee who works within the ring to judge and control the conduct of " +
                "the fighters, rule on their ability to fight safely, count knocked-down fighters, and rule on fouls." +
                "<br><br>A bout in which the predetermined number of rounds passes is decided by the judges, and is said to" +
                " \"go the distance\". The fighter with the higher score at the end of the fight is ruled the winner." +
                " With three judges, <b>unanimous</b> and <b>split decisions</b> are possible, as are draws. <br>A boxer may win the bout before " +
                "a decision is reached through a <b>knock-out</b>; such bouts are said to have ended \"inside the distance\". If a fighter is knocked down during the fight," +
                " determined by whether the boxer touches the canvas floor of the ring with any part of their body other than" +
                " the feet as a result of the opponent's punch and not a slip, as determined by the referee" +
                ", the referee begins counting until the fighter returns to his or her feet and can continue. " +
                "Some jurisdictions require the referee to count to eight regardless of if the fighter gets up before.";
        rules.add(fromHtml(str1));

        List<Spanned> style = new ArrayList<>();
        String str2 = "\"<b>Style</b>\" is often defined as the strategic approach a fighter takes during a bout. No two fighters' " +
                "styles are alike, as it is determined by that individual's physical and mental attributes." +
                "<br><br>Three main styles exist in boxing: <b>outside fighter</b> (\"boxer\"), <b>brawler</b> (or \"slugger\"), " +
                "and <b>Inside fighter</b> (\"swarmer\"). These styles may be divided into several special subgroups, such as" +
                " counter puncher, etc. The main philosophy of the styles is, that each style has an advantage over one, but" +
                " disadvantage over the other one. It follows the rock-paper-scissors scenario - boxer beats brawler, brawler" +
                " beats swarmer, and swarmer beats boxer." +
                "<br><br><b>Boxer/out-fighter</b>" +
                "<br><br>A classic \"boxer\" or stylist (also known as an \"out-fighter\") seeks to maintain distance between himself" +
                " and his opponent, fighting with <b>faster, longer range punches</b>," +
                " most notably the jab, and gradually wearing his opponent down. Due to this reliance on weaker punches," +
                " out-fighters <b>tend to win by point decisions</b> rather than by knockout, though some out-fighters have notable k" +
                "nockout records. They are often regarded as the best boxing strategists due to their ability to control the pace" +
                " of the fight and lead their opponent, methodically wearing him down and exhibiting more skill and finesse than " +
                "a brawler. <b>Out-fighters need reach, hand speed, reflexes, and footwork</b>." +
                "<br><br><b>Boxer-puncher</b>" +
                "<br><br>A boxer-puncher is a well-rounded boxer who is able to fight at <b>close range with a combination of technique and power</b>," +
                " often with the ability to knock opponents out with a combination and in some instances a single shot.<br>Their movement" +
                " and tactics are similar to that of an out-fighter (although they are generally not as mobile as an out-fighter)," +
                " but instead of winning by decision, they tend to wear their opponents down using combinations and then <b>move in to" +
                " score the knockout</b>.<br>A boxer must be well rounded to be effective using this style." +
                "<br><br><b>Brawler/slugger</b>" +
                "<br><br>A brawler is a fighter who generally <b>lacks finesse and footwork</b> in the ring, but makes up for it through sheer" +
                " punching power. Many brawlers tend to lack mobility, preferring a less mobile, more stable platform and have difficulty" +
                " pursuing fighters who are fast on their feet. <br>They may also have a tendency to ignore combination punching in favor of" +
                " continuous beat-downs with one hand and by throwing slower, <b>more powerful single punches</b> (such as hooks and uppercuts)." +
                "<br>Their slowness and predictable punching pattern (single punches with obvious leads) often leaves them open to counter" +
                " punches, so successful brawlers <b>must be able to absorb</b> substantial amounts of punishment. " +
                "<br><br><b>Swarmer/in-fighter</b>" +
                "<br><br>In-fighters/swarmers (sometimes called \"pressure fighters\") attempt to <b>stay close to an opponent</b>, throwing intense flurries" +
                " and combinations of hooks and uppercuts. Mainly Mexican, Irish, Irish-American, Puerto Rican, and Mexican-American boxers" +
                " popularized this style. A successful in-fighter often <b>needs a good \"chin\"</b> because swarming usually involves being hit" +
                " with many jabs before they can maneuver inside where they are more effective.<br> In-fighters operate best at close range" +
                " because they are generally shorter and have less reach than their opponents and thus are more effective at a short" +
                " distance where the longer arms of their opponents make punching awkward. However, several fighters tall for their division" +
                " have been relatively adept at in-fighting as well as out-fighting.";
        style.add(fromHtml(str2));

        List<Spanned> punches = new ArrayList<>();
        String str3 = "There are four basic punches in boxing: the <b>jab</b>, <b>cross</b>, <b>hook</b> and <b>uppercut</b>. Any punch other than a jab " +
                "is considered a <b>power punch</b>. If a boxer is right-handed (orthodox), his left hand is the lead hand and his right" +
                " hand is the rear hand. For a left-handed boxer or southpaw, the hand positions are reversed. For clarity, the" +
                " following discussion will assume a right-handed boxer." +
                "<br><br><b>Jab</b>" +
                "<br><br>A quick, straight punch thrown with the lead hand from the guard position. The jab is accompanied by a small," +
                " clockwise rotation of the torso and hips, while the fist rotates 90 degrees, becoming horizontal upon impact." +
                " <br>As the punch reaches <b>full extension</b>, the lead shoulder can be brought up to guard the chin. The rear hand remains" +
                " next to the face to guard the jaw. After making contact with the target, the lead hand is retracted quickly to resume" +
                " a <b>guard position</b> in front of the face." +
                "<br><br><b>Cross</b>" +
                "<br><br>A <b>powerful, straight punch thrown with the rear hand</b>. From the guard position, the rear hand is thrown from" +
                " the chin, crossing the body and traveling towards the target in a straight line. The rear shoulder is thrust forward" +
                " and finishes just touching the <b>outside of the chin</b>.<br> At the same time, the lead hand is retracted and tucked against" +
                " the face to protect the inside of the chin. For <b>additional power</b>, the torso and hips are rotated counter-clockwise as" +
                " the cross is thrown.<br>A measure of an ideally extended cross is that the shoulder of the striking arm, the knee of the" +
                " front leg and the ball of the front foot are on the same vertical plane." +
                "<br><br><b>Hook</b>" +
                "<br><br>A <b>semi-circular punch</b> thrown with the lead hand to the side of the opponent's head. <b>From the guard position</b>, the elbow is drawn back" +
                " with a horizontal fist (knuckles pointing forward) and the <b>elbow bent</b>. The rear hand is tucked firmly against the jaw" +
                " to protect the chin. The torso and hips are rotated clockwise, propelling the fist through a tight, clockwise arc across" +
                " the front of the body and connecting with the target." +
                "<br><br><b>Uppercut</b>" +
                "<br><br>A vertical, <b>rising punch</b> thrown with the <b>rear hand</b>. From the guard position, the torso shifts slightly to the right," +
                " the rear hand drops below the level of the opponent's chest and the knees are bent slightly. From this position," +
                " the rear hand is thrust <b>upwards</b> in a rising arc towards the opponent's chin or torso.";
        punches.add(fromHtml(str3));

        List<Spanned> moreInfo = new ArrayList<>();
        String str4 = "<string name=\"my_link\"><a href=\"https://en.wikipedia.org/wiki/Boxing\">Boxing Wikipedia</a></string>";
        moreInfo.add(fromHtml(str4));

        listHash.put(listTitleHeader.get(0),rules);
        listHash.put(listTitleHeader.get(1),style);
        listHash.put(listTitleHeader.get(2),punches);
    }

    private void setAmericanFootballInfo() {
        listTitleHeader.add("Teams and positions");
        listTitleHeader.add("Scoring");
        listTitleHeader.add("Leagues and tournaments");

        List<Spanned> position = new ArrayList<>();
        String str1 = "A football game is played between two teams of <b>11 players</b> each. Playing with more on the field" +
                " is punishable by a penalty. Teams may substitute any number of their players between downs;" +
                " this \"platoon\" system replaced the original system, which featured limited substitution rules," +
                " and has resulted in teams utilizing specialized offensive, defensive and special teams squads.<br><br>" +
                "Individual players in a football game must be designated with a <b>uniform number between 1 and 99</b>. NFL teams" +
                " are required to number their players by a league-approved numbering system, and any exceptions must be" +
                " approved by the Commissioner. NCAA and NFHS teams are \"strongly advised\" to number their offensive" +
                " players according to a league-suggested numbering scheme." +
                "<br><br><b>Offensive unit</b>" +
                "<br><br>The offensive team must line up in a legal formation before they can snap the ball. An offensive " +
                "formation is considered illegal if there are more than four players in the backfield or fewer than five players" +
                " numbered 50–79 on the offensive line. <br><br>The main backfield positions are the <b>quarterback (QB), halfback/tailback " +
                "(HB/TB) and fullback (FB)</b>. The quarterback is the leader of the offense. Either he or a coach calls the plays. Quarterbacks" +
                " typically inform the rest of the offense of the play in the huddle before the team lines up. The quarterback lines up" +
                " behind the center to take the snap and then hands the ball off, throws it or runs with it." +
                "<br><br><b>Defensive unit</b>" +
                "<br><br>The defensive line (DL) consists of <b>defensive ends (DE) and defensive tackles (DT)</b>. Defensive ends line up on " +
                "the ends of the line, while defensive tackles line up inside, between the defensive ends. The primary responsibilities" +
                " of defensive ends and defensive tackles is to stop running plays on the outside and inside, respectively, to pressure" +
                " the quarterback on passing plays, and to occupy the line so that the linebackers can break through." +
                "<br><br><b>Special teams unit</b>" +
                "<br><br>The special teams unit is <b>responsible for all kicking plays</b>. The special teams unit of the team in control of the ball " +
                "will try and execute field goal (FG) attempts, punts and kickoffs, while the opposing team's unit will aim to " +
                "block or return them.";
        position.add(fromHtml(str1));


        List<Spanned> scoring = new ArrayList<>();
        String str2 = "<b>The <b>touchdown</b> (TD)</b>, worth <b>six points</b>, is the most valuable scoring play in American football. A touchdown is scored when" +
                " a live ball is advanced into, caught in, or recovered in the end zone of the opposing team. The scoring team then attempts" +
                " a try or conversion, more commonly known as the <b>point(s)-after-touchdown (PAT)</b>, which is a single scoring opportunity." +
                "<br><br>A <b>field goal</b> (FG), worth three points, is scored when the ball is placekicked or dropkicked through the uprights and over the crossbars" +
                " of the defense's goalposts. After a PAT attempt or successful field goal the scoring team must kick the ball off to the other team." +
                "<br><br> A <b>safety</b> is scored when the ball carrier is tackled in his own end zone. Safeties are worth two points, which are awarded to the defense." +
                " In addition, the team that conceded the safety must kick the ball to the scoring team via a free kick.";
        scoring.add(fromHtml(str2));

        List<Spanned> tournament = new ArrayList<>();
        String str3 = "The <b>National Football League (NFL)</b> and the <b>National Collegiate Athletic Association (NCAA)</b> are the most popular" +
                " football leagues in the United States. The National Football League was founded in 1920 and has since become the" +
                " largest and most popular sport in the United States. The NFL has the highest average attendance of any " +
                "sporting league in the world, with an average attendance of 66,960 during the 2011 NFL Season. The NFL championship" +
                " game is called the <b>Super Bowl</b>, and is among the biggest events in club sports worldwide. It is played between" +
                " the champions of the National Football Con    ference (NFC) and the American Football Conference (AFC), " +
                "and its winner is awarded the Vince Lombardi Trophy.";
        tournament.add(fromHtml(str3));


        listHash.put(listTitleHeader.get(0),position);
        listHash.put(listTitleHeader.get(1),scoring);
        listHash.put(listTitleHeader.get(2),tournament);
    }

    private void setGolfInfo() {
        listTitleHeader.add("Overview");
        listTitleHeader.add("Play of the game");
        listTitleHeader.add("Golf club");

        List<Spanned> overview = new ArrayList<>();
        String str1 = "Golf, unlike most ball games, cannot and does not utilize a standardized playing area, " +
                "and coping with the varied terrains encountered on different courses is a key part of the game." +
                "<br><br>The game at the highest level is played on a course with an arranged progression of <b>18 holes</b>," +
                " though recreational courses can be smaller, usually 9 holes. <br>Each hole on the course must contain a" +
                " <b>tee box</b> to start from, and a <b>putting green</b> containing the actual hole or cup (4.25 inches in diameter)." +
                "<br><br>There are other standard forms of terrain in between, such as the <b>fairway, rough (long grass), sand traps " +
                "(or \"bunkers\"), and various hazards (water, rocks, fescue)</b> but each hole on a course is unique in its specific" +
                " layout and arrangement.<br><br>" +
                "Golf is played for the <b>lowest number of strokes</b> by an individual, known as stroke play, or the lowest score on" +
                " the most individual holes in a complete round by an individual or team, known as match play. <b>Stroke play</b> is the most" +
                " commonly seen format at all levels, but most especially at the elite level.";
        overview.add(fromHtml(str1));

        List<Spanned> play = new ArrayList<>();
        String str2 = "When the initial shot on a hole is intended to move the ball a long distance (typically more than 225 yards " +
                "(210 m)), the shot is commonly called a \"<b>drive</b>\" and is generally made with a long-shafted, large-headed" +
                " wood club called a \"driver\".<br>Shorter holes may be initiated with other clubs, such as higher-numbered " +
                "woods or irons.<br><br>Once the ball comes to rest, the golfer strikes it again as many times as necessary using" +
                " shots that are variously known as a \"<b>lay-up</b>\", an \"<b>approach</b>\", a \"<b>pitch</b>\", or a \"<b>chip</b>" +
                "\", until the ball reaches the green, where he or she then \"putts\" the ball into the hole (commonly called <b>\"" +
                "sinking the putt\" or \"holing out\"</b>). <br><br>The goal of getting the ball into the hole (\"holing\" the ball)" +
                " in as few strokes as possible may be impeded by obstacles such as areas of longer grass called" +
                " <b>\"rough\"</b> (usually found alongside fairways), which both slows any ball that contacts it and makes it harder" +
                " to advance a ball that has stopped on it; <b>\"doglegs\"</b>, which are changes in the direction of the fairway that" +
                " often require shorter shots to play around them; <b>bunkers</b> (or sand traps); and <b>water hazards</b> such as ponds or " +
                "streams.";
        play.add(fromHtml(str2));

        List<Spanned> club = new ArrayList<>();
        String str3 = "The golfer chooses a <b>golf club, grip, and stroke</b> appropriate to the distance:" +
                "<br><br>• The <b>\"drive\"</b> or <b>\"full swing\"</b> is used on the teeing ground and fairway, typically with" +
                " a wood or long iron, to produce the maximum distance capable with the club. In the extreme, the windup can end with " +
                "the shaft of the club parallel to the ground above the player's shoulders." +
                "<br><br>• The <b>\"approach\"</b> or <b>\"3/4 swing\"</b> is used in medium- and long-distance situations where an exact" +
                " distance and good accuracy is preferable to maximum possible distance, such as to place the ball on the green or " +
                "\"lay up\" in front of a hazard. The windup or \"backswing\" of such a shot typically ends up with the shaft of the club" +
                " pointing straight upwards or slightly towards the player." +
                "<br><br>• The <b>\"chip\"<b> or </b>\"half-swing\"</b> is used for relatively short-distance shots near the green," +
                " with high-lofted irons and wedges. The goal of the chip is to land the ball safely on the green, allowing it to roll" +
                " out towards the hole. It can also be used from other places to accurately position the ball into a more advantageous" +
                " lie. The backswing typically ends with the head of the club between hip and head height." +
                "<br><br>• The <b>\"putt\"</b> is used in short-distance shots on or near the green, typically made with the eponymous \"putter\"," +
                " although similar strokes can be made with medium to high-numbered irons to carry a short distance in the air and then" +
                " roll (a <b>\"bump and run\")</b>. <br>The backswing and follow-through of the putt are both abbreviated compared to other strokes," +
                " with the head of the club rarely rising above the knee. The goal of the putt is usually to put the ball in the hole," +
                " although a long-distance putt may be called a \"lag\" and is made with the primary intention of simply closing distance" +
                " to the hole or otherwise placing the ball advantageously.";
        club.add(fromHtml(str3));

        List<Spanned> moreInfo = new ArrayList<>();
        String str4 = "<string name=\"my_link\"><a href=\"https://en.wikipedia.org/wiki/Golf\">Golf Wikipedia</a></string>";
        moreInfo.add(fromHtml(str4));

        listHash.put(listTitleHeader.get(0),overview);
        listHash.put(listTitleHeader.get(1),play);
        listHash.put(listTitleHeader.get(2),club);
    }

    private void setHockeyInfo() {
        listTitleHeader.add("Overview");
        listTitleHeader.add("Penalties");
        listTitleHeader.add("Periods and overtime");

        List<Spanned> overview = new ArrayList<>();
        String str1 = "Ice hockey is played on a hockey rink. During normal play, there are six players per side on the ice" +
                " at any time, one of them being the goaltender, each of whom is on ice skates. " +
                "<br>The objective of the game is to score goals by shooting a hard vulcanized rubber disc, <b>the puck</b>," +
                " into the opponent's goal net, which is placed at the opposite end of the rink. " +
                "The players use their sticks to pass or shoot the puck." +
                "<br><br>Between the <b>six players</b> on the ice, they are typically divided into three forwards, two defencemen," +
                " and a goaltender. The term skaters is typically used to describe all players who are not goaltenders. " +
                "<br><br>The <b>forward positions</b> consist of a centre and two wingers: a left wing and a right wing. Forwards " +
                "often play together as units or lines, with the same three forwards always playing together. " +
                "<br>The <b>defencemen</b> usually stay together as a pair generally divided between left and right. Left and right" +
                " side wingers or defencemen are generally positioned as such, based on the side on which they carry their stick." +
                " <br>A <b>substitution</b> of an entire unit at once is called a line change. Teams typically employ alternate sets of" +
                " forward lines and defensive pairings when shorthanded or on a power play. " +
                "<br>The <b>goaltender</b> stands in a, usually blue, semi-circle called the crease in the defensive zone keeping pucks" +
                " from going in. " +
                "<br><br><b>Substitutions</b> are permitted at any time during the game, although during a stoppage of play the home " +
                "team is permitted the final change. When players are substituted during play, it is called <b>changing on the fly</b>." +
                " A new NHL rule added in the 2005–06 season prevents a team from changing their line after they ice the puck.";
        overview.add(fromHtml(str1));

        List<Spanned> penalties = new ArrayList<>();
        String str2 = "In ice hockey, infractions of the rules lead to play stoppages whereby the play is restarted at a face off. " +
                "Some infractions result in the imposition of a penalty to a player or team. In the simplest case, the offending player" +
                " is sent to the <b>\"penalty box\"</b> and their team has to play with one less player on the ice for a designated amount" +
                " of time. <br><b>Minor penalties</b> last for two minutes, <b>major penalties</b> last for five minutes, and a " +
                "<b>double minor penalty</b> is two consecutive penalties of two minutes duration." +
                "<br><br>A <b>\"penalty shot\"</b> is awarded to a player when the illegal actions of another player stop a clear scoring " +
                "opportunity, most commonly when the player is on a <b>\"breakaway\"</b>. A penalty shot allows the obstructed player to pick" +
                " up the puck on the centre red-line and attempt to score on the goalie with no other players on the ice, to compensate for " +
                "the earlier missed scoring opportunity.";
        penalties.add(fromHtml(str2));

        List<Spanned> periods = new ArrayList<>();
        String str3 = "A professional game consists of <b>three \"periods\" of twenty minutes</b>, the clock running only when the puck is in " +
                "play. The teams change ends after each period of play, including overtime. Recreational leagues and children's leagues often" +
                " play shorter games, generally with three shorter periods of play." +
                "<br><br>Various procedures are used if a tie occurs. In tournament play, as well as in the NHL playoffs, North Americans favour" +
                " sudden death overtime, in which the teams continue to play <b>twenty-minute periods</b> until a goal is scored. Up until the" +
                " 1999–2000 season regular season NHL games were settled with a single five-minute sudden death period with five players " +
                "(plus a goalie) per side, with both teams awarded one point in the standings in the event of a tie. " +
                "With a goal, the winning team would be awarded two points and the losing team none (just as if they had lost in regulation)." +
                "<br><br>The overtime mode for the <b>NHL playoffs</b> differ from the regular season. In the playoffs there are no shootouts nor ties." +
                " If a game is tied after regulation an additional 20 minutes of 5 on 5 sudden death overtime will be added. " +
                "In case of a tied game after the overtime, multiple 20-minute overtimes will be played until a team scores, which wins" +
                " them the match.";
        periods.add(fromHtml(str3));


        listHash.put(listTitleHeader.get(0),overview);
        listHash.put(listTitleHeader.get(1),penalties);
        listHash.put(listTitleHeader.get(2),periods);
    }

    private void setWaterpoloInfo() {
        listTitleHeader.add("Overview");
        listTitleHeader.add("Players and Positions");
        listTitleHeader.add("Common techniques");

        List<Spanned> overview = new ArrayList<>();
        String str1 = "<b>Water polo</b> is a competitive team sport played in the water between two teams. The game " +
                "consists of <b>four quarters</b>, in which the two teams attempt to score goals and throw the ball into their" +
                " opponent's goal.<br>The team with the most goals at the end of the game wins the match. Each team made up " +
                "of <b>six field players and one goalkeeper</b>. Except for the goalkeeper, players participate in both offensive " +
                "and defensive roles. Water polo is typically played in an all-deep pool seven feet (or two meters) deep.";
        overview.add(fromHtml(str1));

        List<Spanned> players = new ArrayList<>();
        String str2 = "There are seven players in the water from each team at one time. There are six players that play" +
                " out and one goalkeeper. Unlike most common team sports, there is little positional play; field players" +
                " will often fill several positions throughout the game as situations demand.<br>These positions usually" +
                " consist of a <b>center forward, a center back, the two wing players and the two drivers</b>. Players who are" +
                " skilled in all positions of offense or defense are called utility players. <b>Utility players</b> tend to come " +
                "off of the bench, though this is not absolute.<br> Certain body types are more suited for particular positions," +
                " and left-handed players are especially coveted on the right-hand side of the field, allowing teams to launch" +
                " 2-sided attacks." +
                "<br><br><b>Offense</b>" +
                "<br><br>The offensive positions include: one <b>center forward</b> (also called a \"set\", \"hole-set\", \"center\", " +
                "\"setter\", \"hole\", or \"2-meter man\", located on or near the 2-meter, roughly in the center of the goal)," +
                " <b>two wings</b> (located on or near the 2-meter, just outside of the goal posts, respectively), <b>two drivers</b> (also " +
                "called \"flats\", located on or near the 5-meter, roughly at the goal posts, respectively), and one \"point\"" +
                " (usually just behind the 5 meter, roughly in the center of the goal, respectively), positioned farthest from the goal." +
                "<br><br>Beginning with the offensive wing to the opposing goalies right side is called <b>one</b>. The flat in a counter" +
                " clockwise from one is called <b>two</b>. Moving along in the same direction the point player is <b>three</b>, the next flat is" +
                " <b>four</b>, the final wing is <b>five</b>, and the hole set is called <b>six</b>. Additionally, the position in which a player is can" +
                " give advantages based on a player's handedness, to improve a shooting or passing angle (for example, the right wing" +
                " is often left handed). " +
                "<br><br><b>Defense</b>" +
                "<br><br>Defensive positions are often the same, but just switched from offense to defense. For example, the center forward" +
                " or hole set, who directs the attack on offense, on defense is known as \"<b>hole D</b>\" (also known as set guard, hole guard," +
                " hole check, pit defense or two-meter defense), and guards the opposing team's center forward (also called the hole). " +
                "<br><br><b>Goalkeeper</b>" +
                "<br><br>The goalkeeper has the main role in blocking shots against the goal as well as guiding and informing their defense" +
                " of imposing threats and gaps in the defense. The goalkeeper is also the \"<b>quarterback</b>\", as he or she usually begins" +
                " the offensive play. It is not unusual for a goalie to make the assisting pass to a goal on a break away" +
                "The goalkeeper is given several <b>privileges</b> above those of the other players, but only if he or she is within the five" +
                " meter area in front of his or her goal:<br><br>" +
                "• The ability to punch the ball with a clenched fist.<br>" +
                "• The ability to touch the ball with two hands.<br>" +
                "• The ability to touch the bottom of the pool.";
        players.add(fromHtml(str2));

        List<Spanned> common = new ArrayList<>();
        String str3 = "<br><b>Offense strategy</b><br><br>" +
                "The most basic positional set up is known as a \"<b>3–3</b>\", so called because there are two lines in front of the opponent's " +
                "goal. Another set up, used more by professional teams, is known as an <b>\"arc\", \"umbrella\", or \"mushroom\"</b>; perimeter" +
                " players form the shape of an arc around the goal, with the hole set as the handle or stalk. Yet another option for" +
                " offensive set is called a 4–2 or double hole; there are two center forward offensive players in front of the goal." +
                " <br>Double hole is most often used in \"man up\" situations, or when the defense has only one skilled \"hole D\", or to" +
                " draw in a defender and then pass out to a perimeter player for a shot (\"kick out\")." +
                "<br><br><b>Defense strategy</b>" +
                "<br><br>On defense, the players work to regain possession of the ball and to prevent a goal in their own net. The defense" +
                " attempts to knock away or steal the ball from the offense or to commit a foul in order to stop an offensive player " +
                "from taking a goal shot. The defender attempts to stay between the attacker and the goal, a position known as inside water.";
        common.add(fromHtml(str3));

        listHash.put(listTitleHeader.get(0),overview);
        listHash.put(listTitleHeader.get(1),players);
        listHash.put(listTitleHeader.get(2),common);
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
