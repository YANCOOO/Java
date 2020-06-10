package dao;

import com.dao.mybatisMainDao;
import com.source.mybatisMain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;


public class mybatisTest {
    public static void main(String[] args) throws IOException {
//        读取配置信息
        InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        创建sqlSessionFactory工厂
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory factory = builder.build(in);
//        使用工厂生产sqlSession创建Dao接口代理对象
        SqlSession session = factory.openSession();
//        使用SqlSession创建Dao接口的代理对象mybatisMain
        mybatisMainDao mybatisMainDao = session.getMapper(mybatisMainDao.class);
//        代理对象执行方法
        List<mybatisMain> users = mybatisMainDao.findAll();
        for (mybatisMain mybatisMain1 : users) {
            System.out.println(mybatisMain1);
        }
//        释放资源
        session.close();
        in.close();
    }
}
