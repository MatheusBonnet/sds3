package com.matheusbonnet.dashMath.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.matheusbonnet.dashMath.dto.SaleDTO;
import com.matheusbonnet.dashMath.dto.SaleSucessDTO;
import com.matheusbonnet.dashMath.dto.SaleSumDTO;
import com.matheusbonnet.dashMath.services.SaleService;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

	@Autowired
	private SaleService saleService;
	
	@GetMapping
	public ResponseEntity<Page<SaleDTO>> findAll(Pageable pageable){
		Page<SaleDTO> result = saleService.findAll(pageable);
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/sum-by-seller")
	public ResponseEntity<List<SaleSumDTO>> amountGroupedBySeller(){
		List<SaleSumDTO> result = saleService.amountGroupedBySeller();
		return ResponseEntity.ok(result);
	}
	
	@GetMapping(value = "/sucess-by-seller")
	public ResponseEntity<List<SaleSucessDTO>> sucessGroupedBySeller(){
		List<SaleSucessDTO> result = saleService.sucessGroupedBySeller();
		return ResponseEntity.ok(result);
	}
 }
