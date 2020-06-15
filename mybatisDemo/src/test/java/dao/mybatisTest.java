package dao;

import com.dao.mybatisMainDao;
import com.source.mybatisMain;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;


public class mybatisTest {
    private InputStream in;
    private SqlSession session;
    private mybatisMainDao mybatisMainDao;
@Before
    public void init() throws IOException {
//        读取配置信息
        in = Resources.getResourceAsStream("SqlMapConfig.xml");
//        创建sqlSessionFactory工厂
//        构建者模式 把对象创建细节隐藏 使用者直接调用方法即可拿到对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        工厂模式 优势解耦
        SqlSessionFactory factory = builder.build(in);
//        使用工厂生产sqlSession创建Dao接口代理对象
        session = factory.openSession();
//        使用SqlSession创建Dao接口的代理对象mybatisMain
//        mapper代理模式 不修改源码的基础上对已有方法增强
        mybatisMainDao = session.getMapper(mybatisMainDao.class);
    }
@After
    public void destroy() throws Exception {
        //        提交事务
        session.commit();
        //        释放资源
        session.close();
        in.close();
    }

    @Test
    public void selectAll() throws Exception {
//        代理对象执行方法
        List<mybatisMain> users = mybatisMainDao.findAll();
        for (mybatisMain mybatisMain1 : users) {
            System.out.println(mybatisMain1);
        }
    }

    @Test
    public void insertDb() {
        mybatisMain mybatisMain = new mybatisMain();
        mybatisMain.setId(6);
        mybatisMain.setUsername("老六");
        mybatisMain.setBirthday(new Date());
        mybatisMain.setSex("男");
        mybatisMain.setAdress("大连");

        mybatisMainDao.insertDb(mybatisMain);
    }

    @Test
    public void updateDb() {
        mybatisMain mybatisMain = new mybatisMain();
        mybatisMain.setId(6);
        mybatisMain.setUsername("老6");

        mybatisMainDao.updateDb(mybatisMain);
    }


    @Test
    public void deleteDb() {
        mybatisMain mybatisMain = new mybatisMain();
        mybatisMain.setId(6);

        mybatisMainDao.deleteDb(mybatisMain);
    }

}
