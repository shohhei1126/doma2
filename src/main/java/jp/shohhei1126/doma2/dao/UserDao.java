package jp.shohhei1126.doma2.dao;

import jp.shohhei1126.doma2.Doma2Config;
import jp.shohhei1126.doma2.entity.User;
import org.seasar.doma.Dao;
import org.seasar.doma.Script;
import org.seasar.doma.Select;

@Dao(config = Doma2Config.class)
public interface UserDao {

    @Script
    void init();

    @Select
    User find(int id);

}
