package com.example.graphql.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.graphql.entity.User;




/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-10-25
 *
 */
 
@Repository("UserDAO")
@Transactional(transactionManager="app-TransactionManager") 
public interface UserDAO extends JpaRepository<User, java.lang.String> {



}
