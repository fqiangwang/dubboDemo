package com.demoProvider.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demoApi.Iservice.ItestService;
import com.demoApi.domain.Tuser;
import com.demoProvider.dao.TUserMapper;

@Service("testService")
public class testServiceImpl implements ItestService {

	@Autowired
	private TUserMapper userDao;
	
	public String sayHelloy(String name) {
		
		return "hello："+name;
	}

	public int insert(Tuser record) {
		// TODO Auto-generated method stub
		return userDao.insert(record);
	}

}
