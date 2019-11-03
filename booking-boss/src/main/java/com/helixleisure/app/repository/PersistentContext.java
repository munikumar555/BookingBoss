package com.helixleisure.app.repository;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

/**
 * The Class PersistentContext.
 * 
 * @author munikumarchallagulla
 */
@Configuration
@ComponentScan
@EnableJpaRepositories
public class PersistentContext {
	
	/**
	 * Data source.
	 *
	 * @return the data source
	 */
	@Bean
	public DataSource dataSource() {
		return new EmbeddedDatabaseBuilder().setType(EmbeddedDatabaseType.H2).build();
	}

	/**
	 * Jpa vendor adapter.
	 *
	 * @return the jpa vendor adapter
	 */
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter bean = new HibernateJpaVendorAdapter();
		bean.setDatabase(Database.H2);
		bean.setGenerateDdl(true);
		return bean;
	}

/**
 * Entity manager factory.
 *
 * @param dataSource the data source
 * @param jpaVendorAdapter the jpa vendor adapter
 * @return the local container entity manager factory bean
 */
@Bean
public LocalContainerEntityManagerFactoryBean entityManagerFactory(
DataSource dataSource, JpaVendorAdapter jpaVendorAdapter) { 
	LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean(); 
	bean.setDataSource(dataSource); bean.setJpaVendorAdapter(jpaVendorAdapter); 
	bean.setPackagesToScan("com.helixleisure.app");
return bean; }

/**
 * Transaction manager.
 *
 * @param emf the emf
 * @return the jpa transaction manager
 */
@Bean public JpaTransactionManager transactionManager(EntityManagerFactory emf) {
return new JpaTransactionManager(emf);
}
}