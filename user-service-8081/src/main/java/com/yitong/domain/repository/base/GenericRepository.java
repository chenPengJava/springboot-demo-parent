package com.yitong.domain.repository.base;

import java.util.List;

/**
 * 提取基本的增删改查接口,供mapper继承
 * @param <E> 要操作的实体
 */
public interface GenericRepository<E> {
    boolean create(E var1);
    List<E> read(E var1);
    boolean update(E var1);
    boolean delete(E var1);
}
