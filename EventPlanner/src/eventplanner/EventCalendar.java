/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventplanner;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;


/**
 *
 * @author Neele
 */
public class EventCalendar {
    String _name, _location, _month;
    int _date, _year, eventnumber;
    File f = new File("C:\\Users\\Neele\\Documents\\GitHub\\Homework3\\EventPlanner\\planner.txt");
    ArrayList<String> savedEvents = new ArrayList<String>();
    
    
    EventCalendar(){
    }
    

    public void setName(String name){
        _name = name;
    }
    
    public String getName(){
        return _name;
    }
    
    public void setLocation(String location){
        _location = location;
    }
    
    public String getLocation(){
        return _location;
    }
    
    public void setMonth(String month){
        _month = month;
    }
    
    public String getMonth(){
        return _month;
    }
    
    public void setDate(int date){
        _date = date;
    }
    
    public String getDate(){
        return String.valueOf(_date);
    }
    
    public void setYear(int year){
        _year = year;
    }
    public String getYear(){
         return String.valueOf(_year);
    }
    
    public void readFile(){
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(f));
            String line;
            while ((line = rdr.readLine()) != null)
                savedEvents.add(0,line);
            rdr.close();
        }
        catch (Exception ex) {
            System.out.println("I was hoping that we wouldn't get here.");
        }
    }
    
    
    public void writeFile(){
        try(PrintWriter wrtr = new PrintWriter(new BufferedWriter(new FileWriter(f, true)))) {
                wrtr.append(_name + " at " + _location + " on " + _month + " " + String.valueOf(_date) + ", " + String.valueOf(_year)
                + "\n");
        }catch (IOException e) {
            System.err.println(e);
        }
    } 
    
    public int size(){
        return eventnumber;
    }
   

}
