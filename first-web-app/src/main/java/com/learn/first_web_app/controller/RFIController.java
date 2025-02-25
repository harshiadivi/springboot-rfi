package com.learn.first_web_app.controller;

import com.learn.first_web_app.model.RFI;
import com.learn.first_web_app.service.RFIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rfis")
public class RFIController {

    @Autowired
    private RFIService service;

    // Get all RFIs
    @GetMapping
    public List<RFI> getAllRFIs() {
        return service.getAllRFIs();
    }

    @GetMapping("/subject/{subject}")
    public List<RFI> getRFIsBySubject(@PathVariable String subject) {
        return service.getRFIsBySubject(subject);
    }

    // Get RFI by ID
    //Extracts {id} from the URL and passes it to the method.
    @GetMapping("/{id}")
    public Optional<RFI> getRFIById(@PathVariable Long id) {
        return service.getRFIById(id);
    }

    @GetMapping("/company/{companyId}")
    public List<RFI> getRFIBycompanyId(@PathVariable Integer companyId) {
        return service.getRFIBycompanyId(companyId);
    }

    // Add a new RFI
    @PostMapping
    public RFI addRFI(@RequestBody RFI rfi) {
        return service.addRFI(rfi);
    }



    // Update an existing RFI
    @PutMapping
    public RFI updateRFI(@RequestBody RFI rfi) {
        return service.updateRFI(rfi);
    }

    // Delete an RFI by ID
    @DeleteMapping("/{id}")
    public void deleteRFI(@PathVariable Long id) {
        service.deleteRFI(id);
    }



}
