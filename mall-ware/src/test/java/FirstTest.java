import com.olalalao.mall.ware.WareApplication;
import com.olalalao.mall.ware.entity.PurchaseEntity;
import com.olalalao.mall.ware.service.PurchaseService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = WareApplication.class)
public class FirstTest {
    @Autowired
    PurchaseService purchase;
    @Test
    public void test(){
        PurchaseEntity purchaseEntity = new PurchaseEntity();
        purchaseEntity.setPhone("12312");
        purchase.save(purchaseEntity);
    }
}
