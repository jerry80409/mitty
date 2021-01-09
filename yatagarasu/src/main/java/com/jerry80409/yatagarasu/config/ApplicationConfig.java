package com.jerry80409.yatagarasu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @EnableJpaRepositories 設定為 DEFERRED: 不會在 Spring 啟動後立刻初始化, 而是等待 ContextRefreshedEvent 事件完成才做初始化.
 * 該特性介於 Default 與 LAZY 之間. LAZY 感覺比較適合測試環境.
 */
@Configuration
@EnableJpaRepositories(
    value = "com.jerry80409.yatagarasu.repository",
    bootstrapMode = BootstrapMode.DEFERRED)
@EnableTransactionManagement
public class ApplicationConfig {
}
