package com.imti.sb.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.imti.sb.bean.BaseBean;

/**
 * 公共dao层接口
 * 继承JpaRepository接口
 * 创建一个公共接口来处理到数据库的请求，比如分页等，然后每个接口去继承它
 * 
 * @author Administrator
 * @param <T>
 */
@Repository
public interface CommonDao<T extends BaseBean> extends JpaRepository<T, Long> {

}
