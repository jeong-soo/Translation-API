package dev.jsoo.translationapiserver.router;

import dev.jsoo.translationapiserver.handler.TranslationHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.EnableWebFlux;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
@EnableWebFlux
public class ApiCallRouter implements WebFluxConfigurer {
    @Bean
    public RouterFunction<ServerResponse> boardsRouterBuilder(TranslationHandler translationHandler) {
        return RouterFunctions.route()
                .path("/api", builder -> builder
                        .GET("/translation", translationHandler::translation)
                ).build();
    }
}
