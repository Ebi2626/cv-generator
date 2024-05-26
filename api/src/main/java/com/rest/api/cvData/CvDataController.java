package com.rest.api.cvData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CvDataController {

    CvDataRepository cvDataRepository;

    @Autowired
    public CvDataController(CvDataRepository cvDataRepository) {
        this.cvDataRepository = cvDataRepository;
    }

    @GetMapping("/cv-data")
    List<CvData> getAll() {
        return cvDataRepository.findAll();
    }

    @PostMapping(path = "/cv-data", produces = MediaType.APPLICATION_JSON_VALUE)
    void addOne(@RequestBody CvData cvData) {
        cvDataRepository.insert(cvData);
    }
}
