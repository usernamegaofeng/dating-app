package pers.dating.sso.domain.pojo;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;

import java.util.Date;

/**
 * 需要自动填充的字段,在MyMetaObjectHandler类中进行赋值
 */
public abstract class BasePojo {

    @TableField(fill = FieldFill.INSERT) //自动填充
    private Date created;
    @TableField(fill = FieldFill.INSERT_UPDATE) //自动填充
    private Date updated;

}
