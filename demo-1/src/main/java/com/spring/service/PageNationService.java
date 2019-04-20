package com.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.spring.entity.User;
import com.spring.jparepositary.PagenationDao;

@Service
public class PageNationService {
	@Autowired
	PagenationDao dao;

	/*
	 * public User save(User user) { // TODO Auto-generated method stub return
	 * dao.save(user); }
	 */

	public Page<User> pagenation(int page, int size, String sortBy, int searchBy) {
		Sort s = new Sort(Direction.DESC, "id");
		Pageable pageable = PageRequest.of(page, size, s);
		Page<User> findAll = null;
		if (searchBy != 5) {
			findAll = dao.findByName("suresh", pageable);
		} else {
			findAll = dao.findAll(pageable);
		}
		return findAll;
	}

}
