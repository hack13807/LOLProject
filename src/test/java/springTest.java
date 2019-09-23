import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring.xml")
public class springTest {
    @Resource(name="jdbcTemplate")
//    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void run(){
        jdbcTemplate.update("insert into t_piece2 (fid,fname,fnumber) values (?,?,?)", 99,"¹þ¹þ","asddsa");
    }

}
