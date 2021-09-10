package com.matheusbonnet.dashMath.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.matheusbonnet.dashMath.dto.SaleSucessDTO;
import com.matheusbonnet.dashMath.dto.SaleSumDTO;
import com.matheusbonnet.dashMath.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{
	
	@Query("SELECT new com.matheusbonnet.dashMath.dto.SaleSumDTO(obj.seller, SUM(obj.amount))"
			+ " FROM Sale As obj GROUP BY obj.seller")
	List<SaleSumDTO> amountGroupedBySeller();

	@Query("SELECT new com.matheusbonnet.dashMath.dto.SaleSucessDTO(obj.seller, SUM(obj.visited), SUM(obj.visited))"
			+ " FROM Sale As obj GROUP BY obj.seller")
	List<SaleSucessDTO> sucessGroupedBySeller();
}
