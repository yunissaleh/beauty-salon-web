//package com.wad.firstmvc.services;
//
//import com.wad.firstmvc.domain.Product;
//import jakarta.persistence.EntityManager;
//import jakarta.persistence.PersistenceContext;
//import jakarta.persistence.TypedQuery;
//import jakarta.transaction.Transactional;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class ProductServiceEm implements ProductService {
//    @PersistenceContext
//    private EntityManager em;
//
//    @Override
//    @Transactional
//    public Product save(Product f) {
//        em.persist(f);
//        return f; }
//    @Override
//    public List<Product> findAll() {
//        TypedQuery<Product> query = em.createQuery("select f from Product f",Product.class);
//        return query.getResultList();
//    }
//
//    @Override
//    public List<Product> findProductsByName(String name) {
//        TypedQuery<Product> query = em.createQuery("select f from Product f " +
//                "where f.name = :name",Product.class);
//        query.setParameter("name",name);
//        return query.getResultList();
//    }
//}
