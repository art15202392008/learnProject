package study.modules;

import com.baomidou.mybatisplus.annotations.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;


/**
 * @author wenyi
 * @email 627062530@qq.com
 * @date 2019/3/8 12:39
 * @Description
 */
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName("user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;
}
