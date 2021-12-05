import com.olalalao.mall.member.MemberApplication;
import com.olalalao.mall.member.entity.MemberEntity;
import com.olalalao.mall.member.service.MemberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MemberApplication.class)
public class FirstTest {
    @Autowired
    MemberService member;
    @Test
    public void test(){
        MemberEntity memberEntity = new MemberEntity();
        memberEntity.setUsername("测试");
        member.save(memberEntity);
    }
}
