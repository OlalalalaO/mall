import com.olalalao.mall.coupon.CouponApplication;
import com.olalalao.mall.coupon.entity.HomeAdvEntity;
import com.olalalao.mall.coupon.service.HomeAdvService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = CouponApplication.class)
public class FirstTest {
    @Autowired
    HomeAdvService service;
    @Test
    public void test(){
        HomeAdvEntity homeAdvEntity = new HomeAdvEntity();
        homeAdvEntity.setName("测试");
        service.save(homeAdvEntity);
    }
}
