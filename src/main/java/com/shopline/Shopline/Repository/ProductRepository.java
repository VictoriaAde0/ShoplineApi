package com.shopline.Shopline.Repository;
import com.shopline.Shopline.Model.Product;
import org.apache.tomcat.jni.Library;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProductRepository extends JpaRepository<Product, Long>{

}
