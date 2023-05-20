package jdbc;

import com.alibaba.druid.pool.DruidDataSource;

public class TestJdbc {
    public void demo1() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql://localhost:3306/spring?schema=spring6");
        dataSource.setUsername("root");
        dataSource.setPassword("220531");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
    }
}
