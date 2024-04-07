package com.example.demo.service.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Users 
{
	private String userId;
	private String name;
	private String emailId;

}
