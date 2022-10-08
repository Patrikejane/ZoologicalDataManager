package com.loollablk.zoologicaldatamanager.ResponseModel;

import java.sql.Timestamp;
import java.util.Date;

public class ZoologicalEntity {
    private String Name;
    private String Species;
    private String Condition;
    private Date date;

    public ZoologicalEntity(String name, String species, String condition, Date date) {
        Name = name;
        Species = species;
        Condition = condition;
        this.date = date;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String species) {
        Species = species;
    }

    public String getCondition() {
        return Condition;
    }

    public void setCondition(String condition) {
        Condition = condition;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }
}
