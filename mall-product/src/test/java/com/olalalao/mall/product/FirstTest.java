package com.olalalao.mall.product;
import com.olalalao.mall.product.entity.BrandEntity;
import com.olalalao.mall.product.service.BrandService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FirstTest {
    @Autowired
    BrandService service;

    @Test
    public void test(){
        BrandEntity brandEntity = new BrandEntity();
        brandEntity.setName("华为");
        service.save(brandEntity);
    }
}
