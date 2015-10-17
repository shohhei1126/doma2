package jp.shohhei1126.doma2.entity;

import jp.shohhei1126.doma2.enums.Gender;
import org.seasar.doma.Entity;
import org.seasar.doma.Id;

@Entity
public class User {

    @Id
    public Integer id;

    public String name;

    // public Gender gender;

}
