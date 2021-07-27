package com.learn.rule;

import com.learn.rule.dto.RuleDto;
import com.learn.rule.real.AddressRule;
import com.learn.rule.real.NationalityRule;
import com.learn.rule.service.RuleService;

import java.util.Arrays;

public class RuleTest {
    public static void main(String[] args) {
        //规则执行器
        //优点：比较简单，每个规则可以独立，将规则，数据，执行器拆分出来，调用方比较规整
        //缺点：数据依赖公共传输对象 dto

        NationalityRule nationalityRule = new NationalityRule();
        AddressRule addressRule = new AddressRule();

        //2. 构造需要的数据 create dto
        RuleDto dto = new RuleDto();
        dto.setAge(5);
        dto.setAddress("北京");

        //3. 通过以链式调用构建和执行 rule execute
        boolean ruleResult = RuleService
                .create()
                .and(Arrays.asList(nationalityRule, addressRule))
                .execute(dto);
        System.out.println("this student rule execute result :" + ruleResult);

    }
}
