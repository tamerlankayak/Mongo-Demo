package az.tamerlan.mongodemo;

import az.tamerlan.mongodemo.product.Product;
import az.tamerlan.mongodemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoDemoApplication.class, args);
    }

    /*
    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository) {

        return args -> {
            var product = Product.builder()
                    .name("Samsung")
                    .description("Android Phone")
                    .build();
            productRepository.insert(product);
        };
    }

     */

}
