package store.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import store.domain.ProductEntity;
import store.repository.impl.ProductRepositoryImpl;
import store.repository.interfaces.ProductRepository;
import store.service.interfaces.ProductService;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;


    public ProductRepository getProductRepository() {
        return productRepository;
    }

    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    @Transactional
    public List<ProductEntity> getProducts() {
        return productRepository.getProducts();
    }

    @Transactional
    @Override
    public void add(ProductEntity productEntity) {
        productRepository.add(productEntity);
    }

    @Transactional
    @Override
    public void delete(ProductEntity productEntity) {
        productRepository.delete(productEntity);
    }

    @Transactional
    @Override
    public void edit(ProductEntity productEntity) {
        productRepository.edit(productEntity);
    }





}
