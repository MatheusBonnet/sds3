package com.matheusbonnet.dashMath.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matheusbonnet.dashMath.dto.SellerDTO;
import com.matheusbonnet.dashMath.entities.Seller;
import com.matheusbonnet.dashMath.repository.SellerRepository;

@Service
public class SellerService {

	@Autowired
	private SellerRepository repo;
	
	public List<SellerDTO> findAll(){
		List<Seller> seller = repo.findAll();
		return seller.stream().map(x -> new SellerDTO(x)).collect(Collectors.toList());
	}	
}
