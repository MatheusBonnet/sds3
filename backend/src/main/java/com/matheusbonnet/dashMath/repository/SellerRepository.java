package com.matheusbonnet.dashMath.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.matheusbonnet.dashMath.entities.Seller;

@Repository
public interface SellerRepository extends JpaRepository<Seller, Long>{

}
