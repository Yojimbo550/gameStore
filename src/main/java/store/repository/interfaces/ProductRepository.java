package store.repository.interfaces;

import store.domain.ProductEntity;

import java.util.List;

public interface ProductRepository extends List<ProductEntity> {




     List<ProductEntity> getProducts();

     void add(ProductEntity productEntity);

    void delete(ProductEntity productEntity);

    void edit(ProductEntity productEntity);




}