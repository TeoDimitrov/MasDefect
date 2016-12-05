package com.masdefect.service;

import com.google.gson.annotations.SerializedName;
import com.masdefect.domain.dto.json.StarImportJSONDto;
import org.springframework.stereotype.Service;

public interface StarService {

    void create(StarImportJSONDto starImportJSONDto);
}
