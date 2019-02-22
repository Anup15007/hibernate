package com.cg.studentadmission.daoservices;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.cg.studentadmission.beans.Student;

public class StudentDAOImpl implements StudentDAO{

	private EntityManagerFactory  entityManagerFactory =Persistence.createEntityManagerFactory("JPA-PU");
	@Override
	public Student save(Student student) {
		EntityManager   entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		return student;
	}

	@Override
	public boolean update(Student student) {
		EntityManager   entityManager=entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.merge(student);
		entityManager.getTransaction().commit();
		entityManager.close();
		return true;
	}

	@Override
	public Student findOne(int studentId) {
		return entityManagerFactory.createEntityManager().find(Student.class, studentId);
	}
	@SuppressWarnings("unchecked")
	@Override
	public List<Student> findAll() {
		Query query=entityManagerFactory.createEntityManager().createQuery("from student s");
		return query.getResultList();
	}


}
