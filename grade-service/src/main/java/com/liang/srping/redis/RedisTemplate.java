package com.liang.srping.redis;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/11 16:36
 */
public class RedisTemplate extends org.springframework.data.redis.core.RedisTemplate {
    @Autowired
    private org.springframework.data.redis.connection.jedis.JedisConnectionFactory jedisConnectionFactory;
}
