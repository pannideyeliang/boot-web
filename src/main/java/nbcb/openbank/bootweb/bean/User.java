package nbcb.openbank.bootweb.bean;

import lombok.Data;

/**
 * @author 陈佳乐
 * @create 2023-03-10-15:54
 */

//用于登录的用户
@Data
public class User {
    private String userName;
    private String passWord;
}
