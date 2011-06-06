package com.ynotscript.trackme.api.db.ibatis.daos;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ynotscript.trackme.api.db.ibatis.models.HandsetHasApplication;
import com.ynotscript.trackme.api.db.ibatis.models.HandsetHasApplicationExample;
import java.sql.SQLException;
import java.util.List;

public class HandsetHasApplicationDAOImpl implements HandsetHasApplicationDAO {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public HandsetHasApplicationDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int countByExample(HandsetHasApplicationExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("$prefix$handset_has_application.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int deleteByExample(HandsetHasApplicationExample example) throws SQLException {
        int rows = sqlMapClient.delete("$prefix$handset_has_application.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int deleteByPrimaryKey(Integer applicationId, Integer handsetId) throws SQLException {
        HandsetHasApplication key = new HandsetHasApplication();
        key.setApplicationId(applicationId);
        key.setHandsetId(handsetId);
        int rows = sqlMapClient.delete("$prefix$handset_has_application.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public void insert(HandsetHasApplication record) throws SQLException {
        sqlMapClient.insert("$prefix$handset_has_application.ibatorgenerated_insert", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public void insertSelective(HandsetHasApplication record) throws SQLException {
        sqlMapClient.insert("$prefix$handset_has_application.ibatorgenerated_insertSelective", record);
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    @SuppressWarnings("unchecked")
    public List<HandsetHasApplication> selectByExample(HandsetHasApplicationExample example) throws SQLException {
        List<HandsetHasApplication> list = sqlMapClient.queryForList("$prefix$handset_has_application.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public HandsetHasApplication selectByPrimaryKey(Integer applicationId, Integer handsetId) throws SQLException {
        HandsetHasApplication key = new HandsetHasApplication();
        key.setApplicationId(applicationId);
        key.setHandsetId(handsetId);
        HandsetHasApplication record = (HandsetHasApplication) sqlMapClient.queryForObject("$prefix$handset_has_application.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int updateByExampleSelective(HandsetHasApplication record, HandsetHasApplicationExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("$prefix$handset_has_application.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int updateByExample(HandsetHasApplication record, HandsetHasApplicationExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("$prefix$handset_has_application.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int updateByPrimaryKeySelective(HandsetHasApplication record) throws SQLException {
        int rows = sqlMapClient.update("$prefix$handset_has_application.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    public int updateByPrimaryKey(HandsetHasApplication record) throws SQLException {
        int rows = sqlMapClient.update("$prefix$handset_has_application.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table trackme_handset_has_application
     *
     * @ibatorgenerated Wed Jun 01 13:30:44 CEST 2011
     */
    private static class UpdateByExampleParms extends HandsetHasApplicationExample {
        private Object record;

        public UpdateByExampleParms(Object record, HandsetHasApplicationExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}