package com.loollablk.zoologicaldatamanager.ResponseModel;

import java.util.Date;

public class Treatment {

    private String Condition;
    private String Treatment;
    private Date TreatmentDate;

    public Treatment(String condition, String treatment,Date treatmentDate) {
        Condition = condition;
        Treatment = treatment;
        TreatmentDate = treatmentDate;
    }

}
