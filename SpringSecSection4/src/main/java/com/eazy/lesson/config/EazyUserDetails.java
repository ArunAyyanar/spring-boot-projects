package com.eazy.lesson.config;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.eazy.lesson.model.Customer;
import com.eazy.lesson.repository.CustomerRepository;


@Service
public class EazyUserDetails implements UserDetailsService {

	@Autowired
	private CustomerRepository customerRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		String user, pwd = null;
		Set<GrantedAuthority> authorities = new HashSet<>();
		List<Customer> custList = customerRepo.findByEmail(username);

		if (custList.size() == 0) {
			throw new UsernameNotFoundException("User details are wrong");
		} else {
			user = custList.get(0).getEmail();
			pwd = custList.get(0).getPwd();
			authorities.add(new SimpleGrantedAuthority(custList.get(0).getRole()));
		}

		return new User(user, pwd, authorities);
	}

}
