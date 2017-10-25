package com.example.graphql.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Classe que representa ...
 * 
 * @author Rodrigo Gregorio Neri
 * @version 1.0
 * @since 2017-10-25
 *
 */

public class NomeDaClasse {
  
  
  @Autowired
  @Qualifier("UserBusiness")
  private static UserBusiness userBusiness;
	

	public static void main(String[] args) {
   // System.out.println(business.list());
   try{
     userBusiness.list();
      System.out.println("Valor ="+userBusiness.list());
   }catch( Exception e){
     System.out.println("Erro "+e.getMessage());
   }
// System.out.println("Valor ="+userBusiness.list());
	}
	
	

	
	
}
