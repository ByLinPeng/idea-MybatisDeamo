package com.lp.mapper;

import com.lp.pojo.Emp;

import java.util.List;

/**
 * @author 000
 * @date 2019/8/8
 */
public interface EmpMapper {
    /**
     *  查询所有员工属性
     * @return emp
     */
    List<Emp> find();
}
