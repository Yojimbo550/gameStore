package store.service.interfaces;

import store.domain.ProductEntity;

import java.util.List;

public interface ProductService {
    List<ProductEntity> getProducts();
    void add(ProductEntity productEntity);

    void delete(ProductEntity productEntity);

    void edit(ProductEntity productEntity);

}
