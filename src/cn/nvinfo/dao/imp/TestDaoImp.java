package cn.nvinfo.dao.imp;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import cn.nvinfo.dao.TestDao;
import cn.nvinfo.domain.User;


@Repository
public class TestDaoImp implements TestDao {

	@Resource
	private SessionFactory sf;
	
	public void saveTwoUser(User user) {
		Session session=sf.getCurrentSession();
		session.save(user);
	}
	
}
