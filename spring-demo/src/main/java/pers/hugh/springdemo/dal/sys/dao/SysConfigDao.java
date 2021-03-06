package pers.hugh.springdemo.dal.sys.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;
import pers.hugh.springdemo.dal.sys.entity.SysConfig;
import pers.hugh.springdemo.dal.sys.entity.SysConfigExample;

import java.util.List;

@Repository
public interface SysConfigDao {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    long countByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int deleteByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(String variable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int insert(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int insertSelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    List<SysConfig> selectByExampleWithRowbounds(SysConfigExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    List<SysConfig> selectByExample(SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    SysConfig selectByPrimaryKey(String variable);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") SysConfig record, @Param("example") SysConfigExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(SysConfig record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sys_config
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(SysConfig record);
}