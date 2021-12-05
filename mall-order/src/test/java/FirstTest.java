import com.olalalao.mall.order.OrderApplication;
import com.olalalao.mall.order.entity.OrderEntity;
import com.olalalao.mall.order.service.OrderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = OrderApplication.class)
public class FirstTest {
    @Autowired
    OrderService orderService;

    @Test
    public void test() {
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setPayType(123);
        orderService.save(orderEntity);
    }
}
