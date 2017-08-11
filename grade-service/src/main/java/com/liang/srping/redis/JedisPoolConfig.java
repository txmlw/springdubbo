package com.liang.srping.redis;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author liang wei
 * @description 用一句话描述下该文件的作用
 * @date 2017/8/11 16:29
 */
@Service("jedisPoolConfig")
public class JedisPoolConfig extends redis.clients.jedis.JedisPoolConfig {
    @Value("${redis.pool.maxIdle}")
    private String  maxIdle;
    @Value("${redis.pool.maxWait}")
    private String  maxWaitMillis;
    @Value("${redis.pool.testOnBorrow}")
    private boolean  testOnBorrow;
}
