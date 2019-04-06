package cn.com.ringo.redis.demo.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import cn.com.ringo.redis.demo.DTO.UserDTO;
import cn.com.ringo.redis.demo.service.RedisOnlyService;

@RequestMapping("/redisOnly")
@RestController()
public class RedisOnlyController {

	@Resource
	RedisOnlyService redisOnlyService;

	@RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
	public UserDTO getById(@PathVariable("id") String id) {
		
		return redisOnlyService.selectById(id);
	}

}
