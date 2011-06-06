package com.ynotscript.trackme.api.db.ibatis.daos;

import com.ibatis.sqlmap.client.SqlMapClient;
import com.ynotscript.trackme.api.db.ibatis.models.Handset;
import com.ynotscript.trackme.api.db.ibatis.models.HandsetExample;
import java.sql.SQLException;
import java.util.List;

public class HandsetDAOImpl implements HandsetDAO {
    /**
     * This field was generated by Apache iBATIS ibator.
     * This field corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    private SqlMapClient sqlMapClient;

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public HandsetDAOImpl() {
        super();
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public void setSqlMapClient(SqlMapClient sqlMapClient) {
        this.sqlMapClient = sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public SqlMapClient getSqlMapClient() {
        return sqlMapClient;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int countByExample(HandsetExample example) throws SQLException {
        Integer count = (Integer)  sqlMapClient.queryForObject("$prefix$handset.ibatorgenerated_countByExample", example);
        return count;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int deleteByExample(HandsetExample example) throws SQLException {
        int rows = sqlMapClient.delete("$prefix$handset.ibatorgenerated_deleteByExample", example);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int deleteByPrimaryKey(Integer handsetId) throws SQLException {
        Handset key = new Handset();
        key.setHandsetId(handsetId);
        int rows = sqlMapClient.delete("$prefix$handset.ibatorgenerated_deleteByPrimaryKey", key);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public Integer insert(Handset record) throws SQLException {
        Object newKey = sqlMapClient.insert("$prefix$handset.ibatorgenerated_insert", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public Integer insertSelective(Handset record) throws SQLException {
        Object newKey = sqlMapClient.insert("$prefix$handset.ibatorgenerated_insertSelective", record);
        return (Integer) newKey;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    @SuppressWarnings("unchecked")
    public List<Handset> selectByExample(HandsetExample example) throws SQLException {
        List<Handset> list = sqlMapClient.queryForList("$prefix$handset.ibatorgenerated_selectByExample", example);
        return list;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public Handset selectByPrimaryKey(Integer handsetId) throws SQLException {
        Handset key = new Handset();
        key.setHandsetId(handsetId);
        Handset record = (Handset) sqlMapClient.queryForObject("$prefix$handset.ibatorgenerated_selectByPrimaryKey", key);
        return record;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int updateByExampleSelective(Handset record, HandsetExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("$prefix$handset.ibatorgenerated_updateByExampleSelective", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int updateByExample(Handset record, HandsetExample example) throws SQLException {
        UpdateByExampleParms parms = new UpdateByExampleParms(record, example);
        int rows = sqlMapClient.update("$prefix$handset.ibatorgenerated_updateByExample", parms);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int updateByPrimaryKeySelective(Handset record) throws SQLException {
        int rows = sqlMapClient.update("$prefix$handset.ibatorgenerated_updateByPrimaryKeySelective", record);
        return rows;
    }

    /**
     * This method was generated by Apache iBATIS ibator.
     * This method corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    public int updateByPrimaryKey(Handset record) throws SQLException {
        int rows = sqlMapClient.update("$prefix$handset.ibatorgenerated_updateByPrimaryKey", record);
        return rows;
    }

    /**
     * This class was generated by Apache iBATIS ibator.
     * This class corresponds to the database table trackme_handset
     *
     * @ibatorgenerated Wed Jun 01 13:12:44 CEST 2011
     */
    private static class UpdateByExampleParms extends HandsetExample {
        private Object record;

        public UpdateByExampleParms(Object record, HandsetExample example) {
            super(example);
            this.record = record;
        }

        public Object getRecord() {
            return record;
        }
    }
}