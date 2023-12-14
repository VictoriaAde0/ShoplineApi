package com.shopline.Shopline.Service;
import com.shopline.Shopline.Dto.ProductDto;
import com.shopline.Shopline.Model.Product;
import com.shopline.Shopline.Repository.ProductRepository;
import jakarta.persistence.Id;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService (ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    public Object CreateProduct (ProductDto productDto){
        Product product = new Product();

        product.setName(productDto.getName());
        product.setPrice(productDto.getPrice());
        product.setDescription(productDto.getDescription());
        product.setStockQuantity(productDto.getStockQuantity());

        return productRepository.save(product);
    }

    public Object GetAllProduct() {return productRepository.findAll();}

    public Object GetProductById(Long id) {return productRepository.findById(id);}
}
