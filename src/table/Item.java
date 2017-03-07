/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package table;

/**
 *
 * @author mo3tamed
 */
public class Item {
    
    private int month ;
    private int day ;
    private String type ;
    private double cost ; 
    

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }
    
    public  Item()
    {
     this.month = 0;
        this.type = "";
        this.cost = 0;
        this.day = 0;
    }

    public Item(int month,int day, String type, double cost ) {
        this.month = month;
        this.type = type;
        this.cost = cost;
        this.day = day;
    }

public static void main(String[] args) {
        
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

}
