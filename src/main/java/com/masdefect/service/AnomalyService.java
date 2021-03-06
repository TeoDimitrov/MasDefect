package com.masdefect.service;

import com.masdefect.domain.dto.json.AnomalyExportJSONDto;
import com.masdefect.domain.dto.json.AnomalyImpotJSONDto;
import com.masdefect.domain.dto.json.AnomalyVictimsJSONDto;
import com.masdefect.domain.dto.xml.AnomaliesXMLDto;
import com.masdefect.domain.dto.xml.AnomalyXMLDto;

public interface AnomalyService {

    void create(AnomalyImpotJSONDto anomalyImpotJSONDto);

    void create(AnomalyVictimsJSONDto anomalyVictimsDto);

    void create(AnomalyXMLDto anomalyImportXMLDto);

    AnomalyExportJSONDto findMostAffectingAnomalies();

    AnomaliesXMLDto finaAllAnomalies();
}
