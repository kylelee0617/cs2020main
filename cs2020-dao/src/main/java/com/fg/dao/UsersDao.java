package com.fg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.fg.entity.SampleEntity;
import com.fg.entity.UsersEntity;
import com.fg.utils.JpaUtils;

@Service
public class UsersDao {

	public List<UsersEntity> getAll() {
	    EntityManager em = JpaUtils.getEntityManager();
		Query query = em.createNativeQuery("select * from Users", UsersEntity.class);

		@SuppressWarnings("unchecked")
		List<UsersEntity> usersList = query.getResultList();
		em.close();

		return usersList;
	}
	
	public List<UsersEntity> getOneByUseracc(String useracc) {
		String sql = "select * from Users where useracc = '" + useracc + "'";
		
	    EntityManager em = JpaUtils.getEntityManager();
		Query query = em.createNativeQuery(sql , UsersEntity.class);

		@SuppressWarnings("unchecked")
		List<UsersEntity> usersList = query.getResultList();
		em.close();

		return usersList;
	}
	
	
}
