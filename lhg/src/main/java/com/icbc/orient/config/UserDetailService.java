package com.icbc.orient.config;//package com.acong.ssoserver.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.authority.AuthorityUtils;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Component;
//
//@Component
//public class UserDetailService implements UserDetailsService{
//
//	@Autowired
//	private PasswordEncoder passwordEncoder;
//	
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//	
//		return new User(username, passwordEncoder.encode("123456"), 
//				AuthorityUtils.commaSeparatedStringToAuthorityList("ROLE_USER"));
//		
//	}
//	
//}
