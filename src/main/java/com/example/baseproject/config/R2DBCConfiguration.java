package com.example.baseproject.config;

import io.asyncer.r2dbc.mysql.MySqlConnectionConfiguration;
import io.asyncer.r2dbc.mysql.MySqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactories;
import io.r2dbc.spi.ConnectionFactory;
import io.r2dbc.spi.ConnectionFactoryOptions;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;

@Configuration
@EnableR2dbcRepositories
class R2DBCConfiguration extends AbstractR2dbcConfiguration {
    @Bean
    public ConnectionFactory connectionFactory() {
       /* MySqlConnectionConfiguration configuration = MySqlConnectionConfiguration.builder()
                .host("localhost")
                .port(3306)
                .user("beef")
                .password("beef123")
                .database("beef")

                .build();

        return MySqlConnectionFactory.from(configuration);*/

       return ConnectionFactories.get(
                "r2dbc:pool:mysql://beef:beef123@127.0.0.1:3306/beef?" +
                        "useLegacyDatetimeCode=false&" +
                        "serverTimezone=America/Bogota"
        );

    }
}
