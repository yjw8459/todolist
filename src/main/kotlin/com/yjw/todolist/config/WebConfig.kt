package com.yjw.todolist.config

import org.springframework.context.annotation.Configuration
import org.springframework.http.HttpMethod
import org.springframework.web.servlet.config.annotation.CorsRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer

@Configuration
class WebConfig : WebMvcConfigurer{

    /**
     * 즉, localhost:3000의 모든 경로를 혀용한다.
     * Method Type은 GET, POST, PUT, DELETE를 허용한다.
     */
    override fun addCorsMappings(registry: CorsRegistry) {
        registry
                .addMapping("/**")//모든경로를 허용하겠다.
                .allowedOrigins("http://localhost:3000")//localhost:3000은 허용하겠다.
                .allowedMethods(
                        HttpMethod.GET.name,
                        HttpMethod.POST.name,
                        HttpMethod.PUT.name,
                        HttpMethod.DELETE.name,//Kotlin은 마지막에 ,를 붙여도 에러가 안남. TypeScript랑 비슷하다.
                )
    }

}