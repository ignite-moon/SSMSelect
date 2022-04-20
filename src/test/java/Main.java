import com.ssm.dao.CharactorMapper;
import com.ssm.pojo.Charactor;
import com.ssm.service.CharactorService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Main {
    @Test
    public  void test(){
        ApplicationContext ap=new ClassPathXmlApplicationContext("applicationContext.xml");
//        CharactorMapper charactorMapper=(CharactorMapper) ap.getBean("charactorMapper");
//        List<Charactor> list=charactorMapper.findAll();
//        System.out.println(list);
        CharactorService charactorService=(CharactorService) ap.getBean("charactorService");
        List<Charactor> list=charactorService.findAll();
        System.out.println(list);
    }
}
