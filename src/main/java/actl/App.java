package actl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication()
//     // exclude = {DataSourceAutoConfiguration.class},
//     scanBasePackages = { "actl.api", "actl.lib.entity" })
// @EnableJpaRepositories(basePackages = { "actl.lib.entity" })
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class, args);
    }
}
