package vn.codegym.repository;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import vn.codegym.model.Student;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.security.auth.login.Configuration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class StudentRepositoryImpl implements StudentRepository {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public Object save(Object entity) {
        return null;
    }

    @Override
    public Iterable save(Iterable entities) {
        return null;
    }

    @Override
    public Object findOne(Serializable serializable) {
        return null;
    }

    @Override
    public boolean exists(Serializable serializable) {
        return false;
    }

    @Override
    public List<Student> findAll() {
        TypedQuery<Student> query = entityManager.createQuery("select s from Student s", Student.class);
        return query.getResultList();
    }

    @Override
    public Iterable findAll(Iterable iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void delete(Serializable serializable) {

    }

    @Override
    public void delete(Object entity) {

    }

    @Override
    public void delete(Iterable entities) {

    }

    @Override
    public void deleteAll() {

    }

    public void save(Student student) {
        entityManager.persist(student);
    }

    public void update(Student student) {
        entityManager.merge(student);
    }

    public void delete(Student student) {
        entityManager.remove(entityManager.merge(student));
    }

    public Student findById(int id) {
        return entityManager.find(Student.class, id);
    }
}
