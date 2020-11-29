package com.playsafe.part1.controller;

import com.playsafe.part1.model.Unit;
import com.playsafe.part1.service.UnitConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/conversions")
public class UnitConversionController {

	private final UnitConversionService conversionService;

	public UnitConversionController(UnitConversionService conversionService) {
		this.conversionService = conversionService;
	}

	@PostMapping("/ktoc")
	public ResponseEntity<Double> kelvinToCelsius(@RequestBody Unit kelvin) {
		return new ResponseEntity<>(conversionService.ktoc(kelvin), HttpStatus.OK);
	}

	@PostMapping("/ctok")
	public ResponseEntity<Double> celsiusToKelvin(@RequestBody Unit celsius) {
		return new ResponseEntity<>(conversionService.ctok(celsius), HttpStatus.OK);
	}

	@PostMapping("/mtok")
	public ResponseEntity<Double> mileToKilometer(@RequestBody Unit mile) throws Exception {
		return new ResponseEntity<>(conversionService.mtok(mile), HttpStatus.OK);
	}

	@PostMapping("/ktom")
	public ResponseEntity<Double> kilometerToMile(@RequestBody Unit kilometer) throws Exception {
		return new ResponseEntity<>(conversionService.ktom(kilometer), HttpStatus.OK);
	}
}
