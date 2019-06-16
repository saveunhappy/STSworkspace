package com.ssh.dao.impl;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.ssh.dao.IGenericDAO;
import com.ssh.query.PageResult;
import com.ssh.query.QueryObject;

public class GenericDAOImpl<T> implements IGenericDAO<T> {
	private Class<T> targetType;

	GenericDAOImpl() {
		ParameterizedType clz = (ParameterizedType) this.getClass().getGenericSuperclass();

		targetType = (Class<T>) clz.getActualTypeArguments()[0];
	}

	protected SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void save(T obj) {
		Session session = sessionFactory.getCurrentSession();
		session.save(obj);
	}

	public void update(T obj) {
		Session session = sessionFactory.getCurrentSession();
		session.update(obj);
	}

	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		T obj = (T) session.get(targetType, id);
		session.delete(obj);
	}

	public T get(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return (T) session.get(targetType, id);
	}

	public List<T> listAll() {
		Session session = sessionFactory.getCurrentSession();
		return session.createCriteria(targetType).list();
	}

	public PageResult query(QueryObject qo) {
		int pageSize = qo.getPageSize();
		int currentPage = qo.getCurrentPage();
		Session session = sessionFactory.getCurrentSession();
		String countHql = (new StringBuilder()).append("SELECT COUNT(obj) FROM  ").append(targetType.getSimpleName()).append(" obj").append(qo.getQuery()).toString();
		Query query = session.createQuery(countHql);
		setParameters(qo, query);
		int totalCount = ((Long)query.uniqueResult()).intValue();
		if (totalCount == 0)
			return PageResult.empty(qo.getPageSize());
		String resultHql = (new StringBuilder()).append("SELECT obj FROM ").append(targetType.getSimpleName()).append(" obj").append(qo.getQuery()).toString();
		query = session.createQuery(resultHql);
		setParameters(qo, query);
		if (qo.getPageSize() != -1) {
			
			query.setFirstResult((qo.getCurrentPage() - 1) * qo.getPageSize()).setMaxResults(qo.getPageSize()).list();
		}
		
		return new PageResult(totalCount, query.list(), currentPage, pageSize);
	}

	private void setParameters(QueryObject qo, Query query) {
		for (int index = 0; index < qo.getParameters().size(); index++) {
			query.setParameter(index, qo.getParameters().get(index));
		}

	}
}
