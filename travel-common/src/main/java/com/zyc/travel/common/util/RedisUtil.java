package com.zyc.travel.common.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

/**
 * Created by songxinlei on 2016/5/18.
 */
public class RedisUtil {

    //Redis服务器IP
    public String address;

    public int port;
    //访问密码
    public String auth;

    //可用连接实例的最大数目，默认值为8；
    //如果赋值为-1，则表示不限制；如果pool已经分配了maxActive个jedis实例，则此时pool的状态为exhausted(耗尽)。
    public int maxActive;

    //控制一个pool最多有多少个状态为idle(空闲的)的jedis实例，默认值也是8。
    public int maxIdle;

    //等待可用连接的最大时间，单位毫秒，默认值为-1，表示永不超时。如果超过等待时间，则直接抛出JedisConnectionException；
    public int maxWait;

    public int timeout;

    //在borrow一个jedis实例时，是否提前进行validate操作；如果为true，则得到的jedis实例均是可用的；
    public boolean TEST_ON_BORROW = true;

    public JedisPool jedisPool = null;

    public void init(){
        try {
            JedisPoolConfig config = new JedisPoolConfig();
            config.setMaxActive(maxActive);
            config.setMaxIdle(maxIdle);
            config.setMaxWait(maxWait);
            config.setTestOnBorrow(TEST_ON_BORROW);
            if (auth != null && !auth.equals(""))
                jedisPool = new JedisPool(config, address, port, timeout, auth);
            else
                jedisPool = new JedisPool(config, address, port, timeout);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 初始化Redis连接池
     */
    public RedisUtil() {

    }

    /**
     * 获取Jedis实例
     *
     * @return
     */
    public synchronized Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 释放jedis资源
     *
     * @param jedis
     */
    public void returnResource(final Jedis jedis) {
        if (jedis != null) {
            jedisPool.returnResource(jedis);
        }
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getPort() {
        return port;
    }

    public void setPort(int port) {
        this.port = port;
    }

    public String getAuth() {
        return auth;
    }

    public void setAuth(String auth) {
        this.auth = auth;
    }

    public int getMaxActive() {
        return maxActive;
    }

    public void setMaxActive(int maxActive) {
        this.maxActive = maxActive;
    }

    public int getMaxIdle() {
        return maxIdle;
    }

    public void setMaxIdle(int maxIdle) {
        this.maxIdle = maxIdle;
    }

    public int getMaxWait() {
        return maxWait;
    }

    public void setMaxWait(int maxWait) {
        this.maxWait = maxWait;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }
}
