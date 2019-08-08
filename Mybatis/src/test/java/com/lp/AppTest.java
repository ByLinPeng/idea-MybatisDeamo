package com.lp;

import static org.junit.Assert.assertTrue;

import com.lp.pojo.Emp;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void findMethod() throws IOException {
        InputStream resource = Resources.getResourceAsStream ("jdbc.xml");
        SqlSessionFactory build = new SqlSessionFactoryBuilder ().build (resource);
        SqlSession session = build.openSession ();
        List<Emp> list = session.selectList ("find");
        for (Emp emp : list) {
            System.out.println (emp);
        }

    }
}
