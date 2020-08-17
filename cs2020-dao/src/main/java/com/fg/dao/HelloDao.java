package com.fg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Service;

import com.fg.entity.SampleEntity;
import com.fg.utils.JpaUtils;

@Service
public class HelloDao {

	public String getHelloDao() {

//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mydb");
//		EntityManager em = emf.createEntityManager();
	    EntityManager em = JpaUtils.getEntityManager();
		Query query = em.createNativeQuery("select * from Sample", SampleEntity.class);

		@SuppressWarnings("unchecked")
		List<SampleEntity> sampleList = query.getResultList();
		System.out.println("dao sample >>>" + sampleList.size());

		em.close();

		return "HelloDao ==> " + sampleList.size();
	}
}
