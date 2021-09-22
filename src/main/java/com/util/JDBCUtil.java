package com.util;

import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.sql.*;
import java.util.Properties;

/**
 * @author dqs
 * @description JDBC的工具类
 * @dateTime 2021/8/10 10:12
 **/
public class JDBCUtil {

    private static String url;
    private static String user;
    private static String password;

    static {
        try {
            Properties properties = new Properties();

            //通过类加载器ClassLoader加载字节码文件到内存中，获取src路径下的文件
            ClassLoader classLoader = JDBCUtil.class.getClassLoader();
            URL resource = classLoader.getResource("jdbc.properties");
            assert resource != null;
            String path = resource.getPath();

            //加载配置文件
            properties.load(new FileReader(path));

            url = properties.getProperty("url");
            user = properties.getProperty("user");
            password = properties.getProperty("password");
            String driver = properties.getProperty("driver");

            Class.forName(driver);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     * @return 返回数据库的连接对象
     * @throws SQLException sql异常
     */
    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, user, password);
    }

    /**
     * 释放数据库的资源(不包含ResultSet资源的情况)
     * @param stmt Statement对象
     * @param conn Connection对象
     */
    public static void close(Connection conn, Statement stmt) {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 释放数据库的资源(包含ResultSet资源的情况)
     * @param conn Connection对象
     * @param stmt Statement对象
     * @param rs ResultSet对象
     */
    public static void close(Connection conn, Statement stmt, ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close(conn, stmt);
    }
}
