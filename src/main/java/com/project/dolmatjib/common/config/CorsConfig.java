package com.project.dolmatjib.common.config;

import org.springframework.cache.interceptor.CacheInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class CorsConfig implements WebMvcConfigurer {

//    @Override
//    public void addInterceptors(InterceptorRegistry registry){
//        registry.addInterceptor(new CacheIntercepter()).excludePathPatterns("/css/**", "/images/**", "/js/**", "/menu/*", "/log/*");
//    }
    /**
     * CORS 설정
     *
     * @param registry
     */
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowedOrigins(
                        "http://localhost:3000",
                        "http://localhost"
                )
                .allowedMethods("*");
    }
}
