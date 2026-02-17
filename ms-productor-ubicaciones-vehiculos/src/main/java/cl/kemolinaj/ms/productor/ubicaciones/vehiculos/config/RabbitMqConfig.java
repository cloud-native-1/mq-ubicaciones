package cl.kemolinaj.ms.productor.ubicaciones.vehiculos.config;

import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    public static final String EXCHANGE = "exchange.ubicaciones";
    public static final String KEY = "myKeyUbicacion";

    @Bean
    Jackson2JsonMessageConverter messageConverter() {

        return new Jackson2JsonMessageConverter();
    }
}
