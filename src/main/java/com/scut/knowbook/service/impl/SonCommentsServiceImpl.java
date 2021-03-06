package com.scut.knowbook.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scut.knowbook.dao.ISonCommentsDao;
import com.scut.knowbook.model.Son_comments;
import com.scut.knowbook.service.ISonCommentsService;

@Service("sonCommentsService")
public class SonCommentsServiceImpl implements ISonCommentsService {

//	@Autowired
	private ISonCommentsDao sonCommentsDao;
	
	public Son_comments findById(Long id) {
		// TODO Auto-generated method stub
		return this.sonCommentsDao.findById(id);
	}

	public Son_comments save(Son_comments comments) {
		// TODO Auto-generated method stub
		return this.sonCommentsDao.save(comments);
	}

	public void delete(Son_comments son_comments) {
		// TODO Auto-generated method stub
		this.sonCommentsDao.delete(son_comments);
	}

}
