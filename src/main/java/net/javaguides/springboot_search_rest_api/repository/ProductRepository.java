package net.javaguides.springboot_search_rest_api.repository;

import net.javaguides.springboot_search_rest_api.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE " +
            "p.name LIKE CONCAT('%',:query, '%')" +
             "Or p.description LIKE CONCAT('%', :query, '%')")

            //we can also use the code below which is known as sql native query
//    @Query(value = "SELECT * FROM products p WHERE " +
//            "p.name LIKE CONCAT('%',:query, '%')" +
//            "Or p.description LIKE CONCAT('%', :query, '%')", nativeQuery = true)
    List<Product> searchProducts(String query);


}
