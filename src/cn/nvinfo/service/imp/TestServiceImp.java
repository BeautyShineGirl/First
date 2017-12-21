package cn.nvinfo.service.imp;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.nvinfo.dao.TestDao;
import cn.nvinfo.domain.User;
import cn.nvinfo.service.TestService;


@Service
@Transactional
public class TestServiceImp implements TestService {

	@Resource
	private TestDao testDao;
	
	public void saveTwoUser() {
		
		testDao.saveTwoUser(new User());
		//int b=1/0;
		testDao.saveTwoUser(new User());
	}

}
