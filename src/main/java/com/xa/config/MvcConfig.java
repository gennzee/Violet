package com.xa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by anhnx on 13/04/2020.
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages = {"com.xa.*"})
public class MvcConfig implements WebMvcConfigurer {

    @Bean
    public InternalResourceViewResolver getInternalResourceViewResolver(){
        InternalResourceViewResolver resolver = new InternalResourceViewResolver();
        resolver.setPrefix("/WEB-INF/view/");
        resolver.setSuffix(".jsp");

        return resolver;
    }

    @Override
    public void addResourceHandlers(final ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/shop/**").addResourceLocations("/WEB-INF/static/shop/");
        registry.addResourceHandler("/admin/**").addResourceLocations("/WEB-INF/static/admin/");
        registry.addResourceHandler("/images/**").addResourceLocations("/WEB-INF/static/fileStorage/images/");
    }

}
