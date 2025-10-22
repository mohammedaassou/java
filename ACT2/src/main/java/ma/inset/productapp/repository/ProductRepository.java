package ma.inset.productapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ma.inset.productapp.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
