package tn.enig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;

import tn.enig.dao.CategorieDao;
import tn.enig.dao.ProduitDao;
import tn.enig.resolver.Mutation;
import tn.enig.resolver.Query;

@CrossOrigin("*")
@SpringBootApplication
public class App5GraphQlApplication {

	public static void main(String[] args) {
		SpringApplication.run(App5GraphQlApplication.class, args);
	}	
	
	@Bean
	public Query query(CategorieDao daocat, ProduitDao daoprod ) {
		return new Query(daocat, daoprod);		
	}
	
	@Bean
	public Mutation mutation(CategorieDao daocat, ProduitDao daoprod ) {
		return new Mutation(daocat, daoprod);
	}
	
}
