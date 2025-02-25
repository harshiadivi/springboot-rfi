package com.learn.first_web_app.repository;

import com.learn.first_web_app.model.RFI;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface RFIRepo extends JpaRepository<RFI, Long> {

    List<RFI> findBySubject(String subject);
    List<RFI> findBycompanyId(Integer companyId);
}
