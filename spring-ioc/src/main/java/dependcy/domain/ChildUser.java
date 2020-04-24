package dependcy.domain;

import annotation.Super;
import lombok.Data;
import lombok.ToString;

/**
 * @author gn
 * @desc TODO
 * @className ChildUser
 * @createTime 2020/3/30 15:28
 */
@Data
@ToString(callSuper = true)  //显示父类toString信息
@Super
public class ChildUser extends User {

    private String address;
}
