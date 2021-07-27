package com.learn.rule.inter;

import com.learn.rule.dto.RuleDto;

//规则抽象
public interface BaseRule {
    boolean execute(RuleDto dto);
}
