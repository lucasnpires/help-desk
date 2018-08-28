package br.com.lucasnp.helpdesk.api.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import br.com.lucasnp.helpdesk.api.entity.User;
import br.com.lucasnp.helpdesk.api.security.jwt.JwtUserFactory;
import br.com.lucasnp.helpdesk.api.service.UserService;

@Service
public class JwtUserDetailServiceImpl implements UserDetailsService {

	@Autowired
	private UserService userService;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		User user = userService.findByEmail(email);

		if (user == null) {
			throw new UsernameNotFoundException(
					String.format("Não existe nenhum usuário com este e-mail: '%s'.", email));
		} else {
			return JwtUserFactory.create(user);
		}
	}
}
