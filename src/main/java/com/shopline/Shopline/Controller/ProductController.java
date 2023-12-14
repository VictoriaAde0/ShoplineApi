package com.shopline.Shopline.Controller;
import com.shopline.Shopline.Dto.ProductDto;
import com.shopline.Shopline.Service.ProductService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
@RestController
@RequestMapping(value = "/api/product")
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }

    @PostMapping("/create")
    public Object CreateProduct (ProductDto productDto){
        return productService.CreateProduct(productDto);
    }

    public Object GetAllProduct(){return productService.GetAllProduct();}

    public Object GetProductById(@PathVariable Long id)
    {return productService.GetProductById(id);}


}
