package test;

import com.sao.mybatis.dao.StudentDao;
import com.sao.mybatis.entity.Student;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.apache.log4j.Logger;

/**
 * Created by navia on 2015/2/14.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:mybatis-context.xml"})
@Transactional
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
public class DaoTest extends AbstractTransactionalJUnit4SpringContextTests {
    private static Logger logger = Logger.getLogger(DaoTest.class);

    @Autowired
    private StudentDao studentDao;

    @Test
    public void test1(){
        Student s = new Student();
        s.setName("caonima");
        s.setAge(999);
        studentDao.insertStudent2(s);

        logger.debug("---------------------fdsafdsafdsa:  " + s.getId());
    }
}
