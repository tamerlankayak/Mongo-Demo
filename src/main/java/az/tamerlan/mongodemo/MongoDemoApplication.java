package az.tamerlan.mongodemo;

import az.tamerlan.mongodemo.category.Category;
import az.tamerlan.mongodemo.category.CategoryRepository;
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


    //@Bean
    public CommandLineRunner commandLineRunner(ProductRepository productRepository,
                                               CategoryRepository categoryRepository) {

        return args -> {

            var category= Category.builder()
                    .name("cat 1")
                    .description("cat 1")
                    .build();


            var category2= Category.builder()
                    .name("cat 2")
                    .description("cat 2")
                    .build();

            categoryRepository.insert(category);
            categoryRepository.insert(category2);

            var product = Product.builder()
                    .name("Samsung")
                    .description("Android Phone")
                    .build();
            //productRepository.insert(product);
        };
    }



}
