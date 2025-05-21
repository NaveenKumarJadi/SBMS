package com.naveen.config;

import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheConfiguration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.serializer.GenericJackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.RedisSerializationContext;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Configuration
@EnableCaching
public class RedisConfig {

//    @Bean
//    public CacheManager cacheManager(RedisConnectionFactory redisConnectionFactory) {
//        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
//            .entryTtl(Duration.ofMinutes(1)) // ⏱️ Set TTL = 10 minutes //Time to leave
//            .disableCachingNullValues();
//
//        return RedisCacheManager.builder(redisConnectionFactory)
//            .cacheDefaults(config)
//            .build();
//    }

//	  @Bean
//    public CacheManager cacheManagers(RedisConnectionFactory connectionFactory) {
//        RedisCacheConfiguration config = RedisCacheConfiguration.defaultCacheConfig()
//            .entryTtl(Duration.ofMinutes(10)) // TTL of 10 minutes
//            .serializeKeysWith(RedisSerializationContext.SerializationPair.fromSerializer(new StringRedisSerializer()))
//            .serializeValuesWith(RedisSerializationContext.SerializationPair.fromSerializer(new GenericJackson2JsonRedisSerializer()));
//
//        return RedisCacheManager.builder(connectionFactory)
//            .cacheDefaults(config)
//            .build();
//    }

	@Bean
	public CacheManager cacheManager(RedisConnectionFactory connectionFactory) {
		Map<String, RedisCacheConfiguration> cacheConfigs = new HashMap<>();

		log.info("Entering into RedisConfig.cacheManager() method");
		System.out.println("Entering into RedisConfig.cacheManager() method");
		cacheConfigs.put("users", RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofMinutes(1)));
		
//      cacheConfigs.put("products", RedisCacheConfiguration.defaultCacheConfig().entryTtl(Duration.ofHours(1)));

		return RedisCacheManager.builder(connectionFactory).withInitialCacheConfigurations(cacheConfigs).build();
	}
}
