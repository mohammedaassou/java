package ma.inset.productapp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ma.inset.productapp.entities.Product;
import ma.inset.productapp.repository.ProductRepository;

@SpringBootApplication
public class ProductAppApplication implements  CommandLineRunner {
    @Autowired
    ProductRepository productRepository;
    public static void main(String[] args) {
        SpringApplication.run(ProductAppApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null,"Computer",4500.0,5));
        productRepository.save(new Product(null,"Printer",800.0,8));
        productRepository.save(new Product(null,"Smartphone",1200.0,15));

        productRepository.findAll().forEach(p->{
            System.out.println(p.toString());
        });
        

        Product product = productRepository.findById(Long.valueOf(1)).get();
        System.out.println("**************");
        System.out.println(product.toString());
        System.out.println("**************");


        List<Product> productsList =  productRepository.findByNameContains("c");

        productsList.forEach(p -> System.out.println(p.toString()));
    }

}
