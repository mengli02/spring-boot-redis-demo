package cn.com.ringo.redis.demo.service;

import cn.com.ringo.redis.demo.DTO.UserDTO;

public interface RedisOnlyService {

	UserDTO selectById(String id);
	
}
