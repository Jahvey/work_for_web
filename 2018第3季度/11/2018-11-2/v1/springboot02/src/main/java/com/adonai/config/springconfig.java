package com.adonai.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;


import com.adonai.test1.UserDao;
import com.jolbox.bonecp.BoneCPDataSource;

@Configuration  //使用这个配置来表明这个东西是一个xml配置文件的存在
@ComponentScan(basePackages="com.adonai")   //配置扫描包的路径
@PropertySource(value= {"classpath:jdbc.properties"},ignoreResourceNotFound=true)
public class springconfig {
	
	@Value("${jdbc.url}")
	private String jdbcUrl;
	
    @Value("${jdbc.driver}")
    private String jdbcDriver;

    @Value("${jdbc.username}")
    private String jdbcUsername;

    @Value("${jdbc.password}")
    private String jdbcPassword;
	
    @Bean(destroyMethod="close")
    public DataSource dataSource() {
    	
    	BoneCPDataSource boneCPDataSource=new BoneCPDataSource();
    	
    	//设置相应的参数信息
    	boneCPDataSource.setDriverClass(jdbcDriver);
    	
    	boneCPDataSource.setJdbcUrl(jdbcUrl);
    	boneCPDataSource.setUsername(jdbcUsername);
    	
    	boneCPDataSource.setPassword(jdbcPassword);
    	// 检查数据库连接池中空闲连接的间隔时间，单位是分，默认值：240，如果要取消则设置为0
    	
    	boneCPDataSource.setIdleConnectionTestPeriodInMinutes(60);
    	
    	// 连接池中未使用的链接最大存活时间，单位是分，默认值：60，如果要永远存活设置为0
        boneCPDataSource.setIdleMaxAgeInMinutes(30);
        // 每个分区最大的连接数
        boneCPDataSource.setMaxConnectionsPerPartition(100);
        // 每个分区最小的连接数    
        boneCPDataSource.setMinConnectionsPerPartition(5);
        
        boneCPDataSource.setPartitionCount(5);
        System.out.println(boneCPDataSource);
        
        return boneCPDataSource;

	}
    
    
    
	
	@Bean
	public UserDao	 getUserDao() {
		System.out.println(jdbcUrl);
		return new UserDao();
	}
	
	
	
	
	
	
	

}
