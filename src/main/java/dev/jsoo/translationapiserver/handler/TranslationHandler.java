package dev.jsoo.translationapiserver.handler;

import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@Component
public class TranslationHandler {
    public Mono<ServerResponse> translation(ServerRequest request) {
        return ServerResponse.ok().build();
    }
}
