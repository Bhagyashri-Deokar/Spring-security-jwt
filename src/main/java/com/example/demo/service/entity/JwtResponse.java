package com.example.demo.service.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@ToString
@Data
@Builder
public class JwtResponse {
	private String jwtToken;
	private String userName;

}
