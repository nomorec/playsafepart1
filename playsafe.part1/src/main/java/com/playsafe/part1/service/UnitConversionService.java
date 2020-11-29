package com.playsafe.part1.service;

import com.playsafe.part1.model.Unit;

public interface UnitConversionService {

    double ktoc(Unit kelvin);
    double ctok(Unit celsius);
    double mtok(Unit miles) throws Exception;
    double ktom(Unit kilometers) throws Exception;
}
