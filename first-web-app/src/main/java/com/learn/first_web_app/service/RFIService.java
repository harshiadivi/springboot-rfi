package com.learn.first_web_app.service;
import lombok.RequiredArgsConstructor;
import com.learn.first_web_app.model.RFI;
import com.learn.first_web_app.repository.RFIRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor // Lombok generates a constructor for final fields
public class RFIService {

    private final RFIRepo rfiRepository;

    public List<RFI> getAllRFIs() {
        List<RFI> rfis = rfiRepository.findAll();
        System.out.println("RFIs from DB: " + rfis);
        return rfis;
    }


    // Get an RFI by ID
    public Optional<RFI> getRFIById(Long id) {
        return rfiRepository.findById(id);
    }

    public List <RFI> getRFIByCompanyId(Integer companyId) {
        return rfiRepository.findBycompanyId(companyId);
    }

    public List<RFI> getRFIsBySubject(String subject) {
        return rfiRepository.findBySubject(subject);
    }

    // Create a new RFI
    public RFI addRFI(RFI rfi) {
        return rfiRepository.save(rfi);
    }

    // Update an existing RFI
    public RFI updateRFI(RFI updatedRFI) {
        return rfiRepository.findById(updatedRFI.getId())
                .map(existingRFI -> {
                    existingRFI.setSubject(updatedRFI.getSubject());
                    existingRFI.setQuestion(updatedRFI.getQuestion());
                    existingRFI.setStatus(updatedRFI.getStatus());
                    return rfiRepository.save(existingRFI);
                })
                .orElseThrow(() -> new RuntimeException("RFI Not Found"));
    }

    // Delete an RFI
    public void deleteRFI(Long id) {
        rfiRepository.deleteById(id);
    }



}
