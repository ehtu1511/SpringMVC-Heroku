package com.in28minutes.jpa.hibernate.demo.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.in28minutes.jpa.hibernate.demo.entity.Courses;

@Repository
@Transactional
public class CourseRepository {
	@Autowired
	EntityManager em;
	
//	public Courses findById(Long id) {
//		return em.find(Courses.class, id);
//	}
//	
//	public void deleteById(Long id) {
//		Courses course = findById(id);
//		em.remove(course);
//		
//	}
//	
//	public Courses save(Courses course) {
//		if(course.equals(null)) {
//			em.persist(course);
//		}else {
//			em.merge(course);
//		}
//		return course;
//	}
	
	public void entityManager() {
		
		Courses course =new Courses("Angular js in 100 steps");
		Courses course1 =new Courses("ReactJs js in 100 steps");
		em.persist(course);
		em.persist(course1);
		
		
		em.flush();
		
		//em.detach(course);
		em.clear();
		
		course.setName("Angular js in 100 steps - Updated");
		course1.setName("hffhfffyyfffffyff");
		
		//em.refresh(course1);
		em.flush();
		
		
		
		
	}

}
