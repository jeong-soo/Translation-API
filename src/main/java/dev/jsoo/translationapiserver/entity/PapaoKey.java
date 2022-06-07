package dev.jsoo.translationapiserver.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Getter
@Setter
public class PapaoKey {
    @Id
    private Long id;
    private String clientId;
    private String clientSecret;
}
