package pers.dating.sso.enums;

import com.baomidou.mybatisplus.core.enums.IEnum;

/**
 * @author Gaofeng
 * @date 2021/1/19 下午8:36
 * @description: 性别枚举, 实现mybatis plus的IEnum接口
 */
public enum SexEnum implements IEnum<Integer> {

    MAN(1, "男"),
    WOMAN(2, "女"),
    UNKNOWN(3, "未知");

    private int value;
    private String desc;

    SexEnum(int value, String desc) {
        this.value = value;
        this.desc = desc;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    @Override
    public String toString() {
        return this.desc;
    }
}
