package cn.nvinfo.base;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.annotation.Resource;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class BaseDaoImp<T> implements BaseDao<T>{
	
	@Resource
	protected SessionFactory sessionFactory;
	
	protected Session getSession(){
		return sessionFactory.getCurrentSession();
	}
	
	public Class<?> clazz;
	
	
	public BaseDaoImp() {
		
		ParameterizedType pt =(ParameterizedType) this.getClass().getGenericSuperclass();
		this.clazz=(Class<?>) pt.getActualTypeArguments()[0];
	}
	
	public List<T> findAll() {
		//**
		String hql="from "+clazz.getSimpleName();
		
		Query query=getSession().createQuery(hql);
		List<T> list=query.list();
		return list;
	}


	public T getById(int id) {
		//**
		T obj=(T) getSession().get(clazz, id);
		
		return obj;
	}

	public void update(T t) {
		getSession().update(t);
	}

	public void save(T t) {
		getSession().save(t);
	}

	public void delete(int id) {
		
	}
	
}
