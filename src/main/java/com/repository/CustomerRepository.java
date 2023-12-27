package com.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.bean.Customers;
@Repository
public interface CustomerRepository  extends JpaRepository<Customers, Integer> {
	
	@Query(value="select * from customers c where c.email = ?1",nativeQuery = true)
	Optional<Customers>  findEmailIid( String emailid);
	}

