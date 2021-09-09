package com.matheusbonnet.dashMath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusbonnet.dashMath.entities.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Long>{

}
