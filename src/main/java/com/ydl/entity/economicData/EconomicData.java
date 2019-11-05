package com.ydl.entity.economicData;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

@Data
public class EconomicData {
    private String tableName;
    private String particularYear;
}
