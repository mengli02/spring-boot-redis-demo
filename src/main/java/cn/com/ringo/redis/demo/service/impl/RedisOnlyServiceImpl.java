package cn.com.ringo.redis.demo.service.impl;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import cn.com.ringo.redis.demo.DTO.UserDTO;
import cn.com.ringo.redis.demo.service.RedisOnlyService;

@Service
public class RedisOnlyServiceImpl implements RedisOnlyService {

	
	/**
     *  先用id生成key，在用这个key查询redis中有无缓存到对应的值
     *
     *  若无缓存，则执行方法selectById，并把方法返回的值缓存到redis
     *
     *  若有缓存，则直接把redis缓存的值返回给用户，不执行方法
     */
    @Cacheable(cacheNames="user", key="#id")
    @Override
    public UserDTO selectById(String id) {
        //直接new一个给定id的用户对象，来返回给用户
        return new UserDTO(id,"redisOnly","password");
    }
	
}
