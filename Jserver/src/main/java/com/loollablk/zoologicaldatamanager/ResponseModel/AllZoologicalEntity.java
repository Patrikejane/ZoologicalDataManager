package com.loollablk.zoologicaldatamanager.ResponseModel;

import java.io.Serializable;

public class AllZoologicalEntity implements Serializable {

    private String Id;
    private String Name;
    private String Species;
    private String Condition;

    public AllZoologicalEntity(String id, String name, String species, String condition) {
        Id = id;
        Name = name;
        Species = species;
        Condition = condition;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
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
}

