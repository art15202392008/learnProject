package com.learn.rule.real;

import com.learn.rule.constant.RuleConstant;
import com.learn.rule.dto.NationalityRuleDto;
import com.learn.rule.dto.RuleDto;
import com.learn.rule.inter.AbstractRule;

public class NationalityRule extends AbstractRule {

    @Override
    protected <T> T convert(RuleDto dto) {
        NationalityRuleDto nationalityRuleDto = new NationalityRuleDto();
        if(dto.getAddress().startsWith(RuleConstant.MATCH_ADDRESS_START)){
            nationalityRuleDto.setNationality(RuleConstant.MATCH_NATIONALITY_START);
        }
        return (T) nationalityRuleDto;
    }

    @Override
    protected <T> boolean executeRule(T t) {
        System.out.println("NationalityRule invoke!");
        NationalityRuleDto nationalityRuleDto = (NationalityRuleDto) t;
        if (nationalityRuleDto.getNationality().startsWith(RuleConstant.MATCH_NATIONALITY_START)) {
            return true;
        }
        return false;
    }
}
