package com.buuk.gateways.db;

import com.buuk.domain.model.Book;
import com.buuk.domain.repository.FindBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;

@Component
public class FindBookOperations implements FindBookRepository {
    private EntityManager entityManager;
    @Autowired
    public FindBookOperations(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    @Override
    public Book findByTitle(String title) {
        TypedQuery<Book> userQuery = entityManager.createQuery("SELECT u FROM Book u WHERE u.title = :title", Book.class);
        userQuery.setParameter("title", title);
        return userQuery.getSingleResult();
    }
}
