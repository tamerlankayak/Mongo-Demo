package az.tamerlan.mongodemo.category;

import org.springframework.data.mongodb.repository.MongoRepository;
//extending from MongoRepository class for inheritance and functionality of mongo
public interface CategoryRepository extends MongoRepository<Category,String> {
}
