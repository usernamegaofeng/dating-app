package pers.dating.sso.domain.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User extends BasePojo implements Serializable {

    @ApiModelProperty(value = "ID")
    private Long id;
    @ApiModelProperty(value = "手机号")
    private String mobile;
    @JsonIgnore
    @ApiModelProperty(value = "密码，json序列化时忽略")
    private String password;

}
