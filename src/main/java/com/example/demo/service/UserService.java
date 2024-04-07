package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.demo.service.entity.Users;

@Service
public class UserService {
private List<Users> store=new ArrayList<>();
public UserService()
{
	store.add(new Users(UUID.randomUUID().toString(),"bhagyashri","deokar782@gmail.com"));
	store.add(new Users(UUID.randomUUID().toString(),"nita","nita782@gmail.com"));
	store.add(new Users(UUID.randomUUID().toString(),"suraj","suraj782@gmail.com"));
	store.add(new Users(UUID.randomUUID().toString(),"radhika","radha782@gmail.com"));
}
public List<Users> getUsers()
{
	return this.store;
}
}
