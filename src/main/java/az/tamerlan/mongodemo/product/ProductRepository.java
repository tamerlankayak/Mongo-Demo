package az.tamerlan.mongodemo.product;

import org.springframework.data.mongodb.repository.MongoRepository;
//extendinng to MongoRepository for CRUD operations
public interface ProductRepository extends MongoRepository<Product, String> {

}
