package com.example.graphql.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.example.graphql.dao.UserDAO;
import com.example.graphql.entity.User;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-10-25
 *
 */
 
@Service("UserBusiness")
public class UserBusiness {


  @Autowired
  @Qualifier("UserDAO")
  protected UserDAO repository;



  public List<User> list() throws Exception{
    List<User> result = repository.list();
    System.out.println("entrou");
    return result;
  }


}
