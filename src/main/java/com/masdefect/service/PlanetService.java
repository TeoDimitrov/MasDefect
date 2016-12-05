package com.masdefect.service;

import com.masdefect.domain.dto.json.PlanetExportJSONDto;
import com.masdefect.domain.dto.json.PlanetImportJSONDto;
import com.masdefect.domain.entities.Planet;

import java.util.List;

public interface PlanetService {

    void create(PlanetImportJSONDto planetImportJSONDto);

    List<PlanetExportJSONDto> findAllPlanetsWithoutPeopleTeleportedFromThem();
}
