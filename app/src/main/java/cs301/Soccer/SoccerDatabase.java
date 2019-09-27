package cs301.Soccer;

import android.util.Log;
import cs301.Soccer.soccerPlayer.SoccerPlayer;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 * Soccer player database -- presently, all dummied up
 *
 * @author *** put your name here ***
 * @version *** put date of completion here ***
 *
 */



public class SoccerDatabase implements SoccerDB {

    /**
     * add a player
     *
     * @see SoccerDB#addPlayer(String, String, int, String)
     */


    Hashtable<String, SoccerPlayer> myDB = new Hashtable<>();




    @Override
    public boolean addPlayer(String firstName, String lastName,
                             int uniformNumber, String teamName) {


       String fullName = firstName+" $$ "+lastName;

       if(!myDB.contains(fullName)){
           SoccerPlayer player = new SoccerPlayer(firstName,lastName,uniformNumber,teamName);
           myDB.put(fullName, player);
           return true;
       }else{
           return false;
       }

    }

    /**
     * remove a player
     *
     * @see SoccerDB#removePlayer(String, String)
     */
    @Override
    public boolean removePlayer(String firstName, String lastName) {

        String fullName = firstName+" $$ "+lastName;

        if(myDB.containsKey(fullName)){
            myDB.remove(fullName);
            return true;
        }
        return false;

    }

    /**
     * look up a player
     *
     * @see SoccerDB#getPlayer(String, String)
     */


    @Override
    public SoccerPlayer getPlayer(String firstName, String lastName) {

        String fullName = firstName+" $$ "+lastName;

        if(myDB.containsKey(fullName)){
            return myDB.get(fullName);

        }else{
            return null;
        }



    }

    /**
     * increment a player's goals
     *
     * @see SoccerDB#bumpGoals(String, String)
     */
    @Override
    public boolean bumpGoals(String firstName, String lastName) {
        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setGoalsScored(myDB.get(fullName).getGoalsScored()+1);
            return true;
        }

        return false;
    }

    /**
     * increment a player's assists
     *
     * @see SoccerDB#bumpAssists(String, String)
     */
    @Override
    public boolean bumpAssists(String firstName, String lastName) {
        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setAssists(myDB.get(fullName).getAssists()+1);
            return true;
        }

        return false;
    }

    /**
     * increment a player's shots
     *
     * @see SoccerDB#bumpShots(String, String)
     */
    @Override
    public boolean bumpShots(String firstName, String lastName) {

        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setShots(myDB.get(fullName).getShots()+1);
            return true;
        }

        return false;

    }

    /**
     * increment a player's saves
     *
     * @see SoccerDB#bumpSaves(String, String)
     */
    @Override
    public boolean bumpSaves(String firstName, String lastName) {

        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setSaves(myDB.get(fullName).getSaves()+1);
            return true;
        }

        return false;
    }

    /**
     * increment a player's fouls
     *
     * @see SoccerDB#bumpFouls(String, String)
     */
    @Override
    public boolean bumpFouls(String firstName, String lastName) {


        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setFouls(myDB.get(fullName).getFouls()+1);
            return true;
        }

        return false;
    }

    /**
     * increment a player's yellow cards
     *
     * @see SoccerDB#bumpYellowCards(String, String)
     */
    @Override
    public boolean bumpYellowCards(String firstName, String lastName) {

        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setYellowCards(myDB.get(fullName).getYellowCards()+1);
            return true;
        }

        return false;
    }

    /**
     * increment a player's red cards
     *
     * @see SoccerDB#bumpRedCards(String, String)
     */
    @Override
    public boolean bumpRedCards(String firstName, String lastName) {
        String fullName = firstName+" $$ "+lastName;
        if(myDB.containsKey(fullName)) {
            myDB.get(fullName).setRedCards(myDB.get(fullName).getRedCards()+1);
            return true;
        }

        return false;
    }

    /**
     * tells the number of players on a given team
     *
     * @see SoccerDB#numPlayers(String)
     */
    @Override
    // report number of players on a given team (or all players, if null)
    public int numPlayers(String teamName) {
        int teamNum = 0;
        if(myDB.containsKey(teamName)) {
       //     for(SoccerPlayer myDB.containsKey(teamName): myDB){

        //    }
        }else{

        }




        

        return -1;
    }

    /**
     * gives the nth player on a the given team
     *
     * @see SoccerDB#playerNum(int, String)
     */
    // get the nTH player
    @Override
    public SoccerPlayer playerNum(int idx, String teamName) {
        return null;
    }

    /**
     * reads database data from a file
     *
     * @see SoccerDB#readData(java.io.File)
     */
    // read data from file
    @Override
    public boolean readData(File file) {
        return file.exists();
    }

    /**
     * write database data to a file
     *
     * @see SoccerDB#writeData(java.io.File)
     */
    // write data to file
    @Override
    public boolean writeData(File file) {
        return false;
    }

    /**
     * helper method that logcat-logs a string, and then returns the string.
     * @param s the string to log
     * @return the string s, unchanged
     */
    private String logString(String s) {
        Log.i("write string", s);
        return s;
    }

    /**
     * returns the list of team names in the database
     *
     * @see cs301.Soccer.SoccerDB#getTeams()
     */
    // return list of teams
    @Override
    public HashSet<String> getTeams() {
        return new HashSet<String>();
    }

}
