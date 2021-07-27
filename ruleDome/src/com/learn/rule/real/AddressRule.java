package com.learn.rule.real;

import com.learn.rule.constant.RuleConstant;
import com.learn.rule.dto.RuleDto;
import com.learn.rule.inter.AbstractRule;
// 具体规则- 例子1
public class AddressRule extends AbstractRule {

    @Override
    public boolean execute(RuleDto dto) {
        System.out.println("AddressRule invoke!");
        if (dto.getAddress().startsWith(RuleConstant.MATCH_ADDRESS_START)) {
            return true;
        }
        return false;
    }
}
