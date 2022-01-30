package com.pro.messanger.serviceImpl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pro.messanger.dao.MessangerDao;
import com.pro.messanger.service.MessangerService;

@Service
public class MessangerviceImpl implements MessangerService {

	@Autowired
	private MessangerDao messangerDao;
	
	@Override
	public List<Map<String, Object>> getMessageList() {
		// TODO Auto-generated method stub
		return messangerDao.selectMessageList();
	}

}
