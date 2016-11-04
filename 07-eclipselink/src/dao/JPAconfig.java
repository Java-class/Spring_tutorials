package dao;

//// with ExceptionHandlingConfiguration

import javax.sql.DataSource;

import org.eclipse.persistence.sdo.types.SDOWrapperType.TimeWrapperImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableLoadTimeWeaving;
import org.springframework.context.annotation.ImportResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.instrument.classloading.LoadTimeWeaver;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

@Configuration
@ComponentScan({"dao","service"})
@ImportResource("dataconfig.xml") 
public class JPAconfig {

	/*@Bean
    public DataSource dataSource() 
	{
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		dataSource.setUrl("jdbc:postgresql://127.0.0.1:5432/postgres");
		dataSource.setUsername("postgres");
		dataSource.setPassword("123");
        return dataSource;
    }
	
	
	@Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory() {
        LocalContainerEntityManagerFactoryBean factoryBean = 
            new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource());
        factoryBean.setPersistenceUnitName("eclipelink");
        factoryBean.setJpaVendorAdapter(jpaVendorAdapter());
        
        return factoryBean;
    }
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
	EclipseLinkJpaVendorAdapter jpaVendorAdapter = new EclipseLinkJpaVendorAdapter();
	jpaVendorAdapter.setGenerateDdl(true);
	jpaVendorAdapter.setDatabase(Database.POSTGRESQL);
	jpaVendorAdapter.setShowSql(true);
	
	
	return jpaVendorAdapter;
	}
	
	
	 @Bean
	    public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
	        return new PersistenceExceptionTranslationPostProcessor();
	    }
*/
   
	
}
