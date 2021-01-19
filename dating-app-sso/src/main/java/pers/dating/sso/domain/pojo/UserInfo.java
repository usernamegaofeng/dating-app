package pers.dating.sso.domain.pojo;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import pers.dating.sso.enums.SexEnum;

import java.io.Serializable;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo extends BasePojo implements Serializable {

    @ApiModelProperty(value = "ID")
    private Long id;
    @ApiModelProperty(value = "用户id")
    private Long userId;
    @ApiModelProperty(value = "昵称")
    private String nickName;
    @ApiModelProperty(value = "用户头像")
    private String logo;
    @ApiModelProperty(value = "用户标签：多个用逗号分隔")
    private String tags;
    @ApiModelProperty(value = "性别")
    private SexEnum sex;
    @ApiModelProperty(value = "年龄")
    private Integer age;
    @ApiModelProperty(value = "学历")
    private String edu;
    @ApiModelProperty(value = "城市")
    private String city;
    @ApiModelProperty(value = "生日")
    private String birthday;
    @ApiModelProperty(value = "封面图片")
    private String coverPic;
    @ApiModelProperty(value = "行业")
    private String industry;
    @ApiModelProperty(value = "收入")
    private String income;
    @ApiModelProperty(value = "婚姻状态")
    private String marriage;

}
