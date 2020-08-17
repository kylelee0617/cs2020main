package com.fg.utils;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JpaUtils {
    /**
     * 解決實體管理器工廠的浪費資源和耗時問題
     * 通過靜態代碼塊的形式，當程序第一次訪問此工具類時，創建一一個公共的實體管理器工廠對象
     * 第一次訪問getEntityManager方法: 經過靜態代碼塊創建一 個factory對象， 再調用方法創建一 個EntityManager對象
     * 第二次方法getEntityManager方法: 直接通過一-個已經創建好的factory對象，創建EntityManager對象
     */
    private static EntityManagerFactory entityManagerFactory;

    static {
        entityManagerFactory = Persistence.createEntityManagerFactory("mydb");/*加載配置文件，創建 createEntityManagerFactory*/
    }

    public static EntityManager getEntityManager() {/*獲取 EntityManager 對象*/
        return entityManagerFactory.createEntityManager();
    }
}