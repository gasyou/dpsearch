package com.gasyou.dpsearch.filesearch.service;

import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.gasyou.dpsearch.filesearch.entity.User;

@RequestScoped
public class FileSearchService {

    @PersistenceContext(unitName = "dpsearchPU")
    private EntityManager manager;

	public String createHelloMessage(String name) {
		return "Hello " + name + "!";
	}

    @Transactional(Transactional.TxType.REQUIRED)
    public User findById(int id) {
        User user = manager.find(User.class, id);
        return user;
    }
}