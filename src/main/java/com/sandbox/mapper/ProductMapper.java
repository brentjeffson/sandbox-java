package com.sandbox.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.sandbox.model.Product;

@Mapper
public interface ProductMapper {
    @Select("SELECT * FROM products")
    List<Product> getAllProducts();

    @Select("SELECT * FROM products WHERE id = #{id}")
    Product getProductById(int id);

    @Insert("INSERT INTO products(name) VALUES(#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id")
    void insertProduct(Product product);

    @Update("UPDATE products SET name=#{name} WHERE id=#{id}")
    void updateProduct(Product product);

    @Delete("DELETE FROM products WHERE id=#{id}")
    void deleteProduct(int id);
}
