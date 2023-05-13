package az.tamerlan.mongodemo.category;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
//using lombok library for create automaticly constructor and builders methods
@Document
@Data
@AllArgsConstructor
@Builder
public class Category {

    @Id
    private String id;
    private String name;
    private String description;
}
