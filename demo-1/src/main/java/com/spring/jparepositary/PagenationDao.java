package com.spring.jparepositary;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.spring.entity.User;
@Repository
public interface PagenationDao extends PagingAndSortingRepository<User, Integer> {
	
	
	
	public Page<User> findByName(String name,Pageable pageRequest);
	
	
	
	
}
