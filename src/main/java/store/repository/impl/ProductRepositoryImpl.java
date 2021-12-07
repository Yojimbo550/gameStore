package store.repository.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import store.domain.ProductEntity;
import store.repository.interfaces.ProductRepository;

import java.util.List;

@Repository
public class ProductRepositoryImpl implements ProductRepository {
    private SessionFactory sessionFactory;

    @Autowired
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override

    @SuppressWarnings("unchecked")
    public List<ProductEntity> getProducts() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from ProductEntity").list();
    }



    @Override
    public void add(ProductEntity productEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(productEntity);

    }

    @Override
    public void delete(ProductEntity productEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.delete(productEntity);
    }

    @Override
    public void edit(ProductEntity productEntity) {
        Session session = sessionFactory.getCurrentSession();
        session.update(productEntity);
    }


}
