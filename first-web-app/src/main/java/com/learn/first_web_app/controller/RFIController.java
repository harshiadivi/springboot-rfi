package com.learn.first_web_app.controller;

import com.learn.first_web_app.model.RFI;
import com.learn.first_web_app.service.RFIService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rfis")
@RequiredArgsConstructor // Lombok will generate a constructor for final fields
public class RFIController {

    private final RFIService service; // No need for @Autowired

    @GetMapping
    public List<RFI> getAllRFIs() {
        return service.getAllRFIs();
    }

    @GetMapping("/subject/{subject}")
    public List<RFI> getRFIsBySubject(@PathVariable String subject) {
        return service.getRFIsBySubject(subject);
    }

    @GetMapping("/{id}")
    public Optional<RFI> getRFIById(@PathVariable Long id) {
        return service.getRFIById(id);
    }

    @GetMapping("/company/{companyId}")
    public List<RFI> getRFIByCompanyId(@PathVariable Integer companyId) {
        return service.getRFIByCompanyId(companyId);
    }

    @PostMapping
    public RFI addRFI(@RequestBody RFI rfi) {
        return service.addRFI(rfi);
    }

    @PutMapping
    public RFI updateRFI(@RequestBody RFI rfi) {
        return service.updateRFI(rfi);
    }

    @DeleteMapping("/{id}")
    public void deleteRFI(@PathVariable Long id) {
        service.deleteRFI(id);
    }
}
