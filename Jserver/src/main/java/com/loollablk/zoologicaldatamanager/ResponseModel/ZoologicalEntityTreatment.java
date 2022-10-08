package com.loollablk.zoologicaldatamanager.ResponseModel;
import java.util.List;

public class ZoologicalEntityTreatment {
    private String Id;
    private String Name;
    private List<Treatment> treatmentList;

    public ZoologicalEntityTreatment(String id, String name, List<Treatment> treatmentList) {
        Id = id;
        Name = name;
        this.treatmentList = treatmentList;
    }
}
