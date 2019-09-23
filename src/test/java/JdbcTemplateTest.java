import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class JdbcTemplateTest {

    @Test
    public void tt(){
        DriverManagerDataSource ds = new DriverManagerDataSource();
        ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
        ds.setUrl("jdbc:mysql://localhost:3306/mysql?serverTimezone=GMT%2B8");
        ds.setUsername("root");
        ds.setPassword("502213");
        //创建模板类
        JdbcTemplate jdbcTemplate = new JdbcTemplate(ds);
        int update = jdbcTemplate.update("update t_piece2 set fname = 9527 where fid = 3");
        System.out.println();
    }
}
