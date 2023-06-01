package com.project.music.vst.config.repositories;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@EnableJpaRepositories(basePackages = "com.project.music.vst.repositories")
public class PersistenceConfig {
    
}