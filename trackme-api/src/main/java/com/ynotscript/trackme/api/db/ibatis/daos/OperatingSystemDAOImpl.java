package com.ynotscript.trackme.api.db.ibatis.daos;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ynotscript.trackme.api.db.ibatis.models.OperatingSystem;
import com.ynotscript.trackme.api.db.ibatis.models.OperatingSystemExample;
import java.sql.SQLException;
import java.util.List;

public class OperatingSystemDAOImpl implements OperatingSystemDAO {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public OperatingSystemDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int countByExample(OperatingSystemExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("$prefix$operating_system.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int deleteByExample(OperatingSystemExample example) throws SQLException {
        int rows = sqlMapClient.delete("$prefix$operating_system.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int deleteByPrimaryKey(Integer operatingSystemId) throws SQLException {
        OperatingSystem key = new OperatingSystem();
        key.setOperatingSystemId(operatingSystemId);
        int rows = sqlMapClient.delete("$prefix$operating_system.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public Integer insert(OperatingSystem record) throws SQLException {
        Object newKey = sqlMapClient.insert("$prefix$operating_system.ibatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public Integer insertSelective(OperatingSystem record) throws SQLException {
        Object newKey = sqlMapClient.insert("$prefix$operating_system.ibatorgenerated_insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    @SuppressWarnings("unchecked")
    public List<OperatingSystem> selectByExample(OperatingSystemExample example) throws SQLException {
        List<OperatingSystem> list = sqlMapClient.queryForList("$prefix$operating_system.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public OperatingSystem selectByPrimaryKey(Integer operatingSystemId) throws SQLException {
        OperatingSystem key = new OperatingSystem();
        key.setOperatingSystemId(operatingSystemId);
        OperatingSystem record = (OperatingSystem) sqlMapClient.queryForObject("$prefix$operating_system.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int updateByExampleSelective(OperatingSystem record, OperatingSystemExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("$prefix$operating_system.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int updateByExample(OperatingSystem record, OperatingSystemExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("$prefix$operating_system.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int updateByPrimaryKeySelective(OperatingSystem record) throws SQLException {
        int rows = sqlMapClient.update("$prefix$operating_system.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    public int updateByPrimaryKey(OperatingSystem record) throws SQLException {
        int rows = sqlMapClient.update("$prefix$operating_system.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table trackme_operating_system
     *
     * @ibatorgenerated Wed Jun 01 13:12:47 CEST 2011
     */
    private static class UpdateByExampleParms extends OperatingSystemExample {
        private Object record;

        public UpdateByExampleParms(Object record, OperatingSystemExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}