package com.liang.srping.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/11 16:33
 */
@Service("jedisConnectionFactory")
public class JedisConnectionFactory extends org.springframework.data.redis.connection.jedis.JedisConnectionFactory{
    private String hostName;
    private int port;
    @Autowired
    private redis.clients.jedis.JedisPoolConfig jedisPoolConfig;
}
