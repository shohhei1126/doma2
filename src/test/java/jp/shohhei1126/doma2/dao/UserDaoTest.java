package jp.shohhei1126.doma2.dao;

import jp.shohhei1126.doma2.Doma2Config;
import jp.shohhei1126.doma2.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.seasar.doma.jdbc.tx.TransactionManager;

public class UserDaoTest {

    private UserDao dao = new UserDaoImpl();

    @Test
    public void testFind() {
        TransactionManager tm = Doma2Config.singleton().getTransactionManager();
        tm.required(dao::init);

        tm.required(() -> {
            User user = dao.find(1);
            Assert.assertEquals("swift", user.name);
        });
    }
}
