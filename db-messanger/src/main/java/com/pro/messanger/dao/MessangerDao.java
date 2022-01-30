package com.pro.messanger.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MessangerDao {

	public List<Map<String,Object>> selectMessageList();
}
