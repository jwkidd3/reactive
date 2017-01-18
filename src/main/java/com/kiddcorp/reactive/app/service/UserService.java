package com.kiddcorp.reactive.app.service;

import org.springframework.stereotype.Component;

import com.kiddcorp.reactive.app.domain.User;

import rx.Observable;

@Component
public class UserService {
	
	public Observable<User> findAll() {
		return Observable.<User>from(new User[] {new User("UserOne", 50), new User("UserTwo", 45)});
	}
	
	public Observable<User> findByName(String name) {
		return findAll().filter(u -> u.getName().toLowerCase().contains(name.toLowerCase()));
	}
	
}
