package com.nhan.orm.repository.imp;

import com.nhan.orm.repository.ICustomerRepository;
import com.nhan.orm.repository.model.CustomerEDM;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@Transactional
public class CustomerRepository implements ICustomerRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<CustomerEDM> findAll() {
        TypedQuery<CustomerEDM> query = entityManager.createQuery
                ("select c from CustomerEDM c", CustomerEDM.class);
        return query.getResultList();
    }

    @Override
    public void save(CustomerEDM customerEDM) {
        entityManager.persist(customerEDM);
    }

    @Override
    public void update(CustomerEDM customerEDM) {
        entityManager.merge(customerEDM);
    }

    @Override
    public void deleteCustomer(CustomerEDM customerEDM) {
        entityManager.remove(entityManager.merge(customerEDM));
    }

    @Override
    public CustomerEDM findById(int id) {
        return entityManager.find(CustomerEDM.class, id);
    }
}
