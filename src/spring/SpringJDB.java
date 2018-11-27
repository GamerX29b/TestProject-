package spring;

import oracle.jdbc.pool.OracleDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.SQLException;

@Configuration
@ConfigurationProperties("oracle")
@Component
public class SpringJDB implements Test {

    //@Bean
    public DataSource getDataSource() throws SQLException {
        OracleDataSource dataSource = new OracleDataSource();
        dataSource.setURL("jdbc:oracle:thin:@192.168.126.50:1521:fkszdb");
        dataSource.setUser("WIDGET_Z");
        dataSource.setPassword("WIDGET_Z");
        dataSource.setImplicitCachingEnabled(true);
        dataSource.setFastConnectionFailoverEnabled(true);
        return dataSource;
    }
}
