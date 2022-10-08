package com.loollablk.zoologicaldatamanager.Controller;

import com.loollablk.zoologicaldatamanager.ResponseModel.AllZoologicalEntity;
import com.loollablk.zoologicaldatamanager.ResponseModel.Treatment;
import com.loollablk.zoologicaldatamanager.ResponseModel.ZoologicalEntity;
import com.loollablk.zoologicaldatamanager.ResponseModel.ZoologicalEntityTreatment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("entity")
public class ZoologicalDataController {

    @GetMapping("/entityList")
    public ResponseEntity<AllZoologicalEntity> getEntityList(){
        //String response = "Sunimal";
        AllZoologicalEntity respose = new AllZoologicalEntity("101","Elepent01",
                "elipas maximus","ear damage");
        return new ResponseEntity<>(respose, HttpStatus.OK);
    }


    @PutMapping("/insertEntity")
    public ResponseEntity<ZoologicalEntity> putEntity(@RequestBody ZoologicalEntity zoologicalEntity){
        //String response = "Sunimal";
        ZoologicalEntity respose = new ZoologicalEntity("101","Elepent01",
                "elipas maximus",new Date());
        return new ResponseEntity<>(respose, HttpStatus.OK);
    }

    @RequestMapping(value = "/{Id}", method = RequestMethod.GET)
    public ResponseEntity<ZoologicalEntityTreatment> getEntityById(@RequestBody String entityId) {

        List<Treatment> treatmentList = new ArrayList<>();
        treatmentList.add(new Treatment("ear damage","oil",new Date()));
        treatmentList.add(new Treatment("Lag damage","bandage",new Date()));
        ZoologicalEntityTreatment respose = new ZoologicalEntityTreatment( entityId,"elephant01",treatmentList);
        return new ResponseEntity<>(respose, HttpStatus.OK);
    }

    @RequestMapping(value = "/{Id}/treatment", method = RequestMethod.POST)
    public ResponseEntity<Treatment> putEntityTreatmentById(@RequestBody Treatment treatment) {

        Treatment treatmentRes = new Treatment("ear damage","oil",new Date());
        return new ResponseEntity<>(treatmentRes, HttpStatus.OK);

    }
}
