package com.shopline.Shopline.controller;
import com.shopline.Shopline.dto.ProductDto;
import com.shopline.Shopline.service.ProductService;
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

    @PostMapping("")
    public Object CreateProduct (ProductDto productDto){
        return productService.CreateProduct(productDto);
    }

    @GetMapping("")
    public Object GetAllProduct(){return productService.GetAllProduct();}
    @GetMapping("/get/{id}")
    public Object GetProductById(@PathVariable Long id)
    {return productService.GetProductById(id);}

    @PutMapping("/{id")
    public Object UpdateProduct(@RequestBody ProductDto productDto, @PathVariable Long id) {
        return  ProductService.updateProduct(productDto, id);
    }
}
