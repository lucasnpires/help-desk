package br.com.lucasnp.helpdesk.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.lucasnp.helpdesk.api.entity.User;

public interface UserRepository extends MongoRepository<User, String> {
	
	public User findOneByEmail(String email);

	public User findByEmail(String email);

}
