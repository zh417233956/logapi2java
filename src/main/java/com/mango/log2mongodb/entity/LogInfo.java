package com.mango.log2mongodb.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Document(collection = "Log_Info")
public class LogInfo {
    @Id // 指定ID
    private String id;

//    @Field("LogMemo")
//    private String LogMemo;

    @Field("LogClassID")
    private int LogClassID;
    @Field("LogTypeId")
    private int LogTypeId;
    @Field("mapid")
    private int MapId;
    @Field("mapid2")
    private int MapId2;
    @Field("LogMemo")
    private String LogMemo;
    @Field("IsStar")
    private boolean IsStar;
    @Field("AddTime")
    private Date AddTime;
    @Field("userid")
    private int UserId;
    @Field("orgid")
    private int OrgId;
    @Field("cityid")
    private int CityId;
    @Field("isdel")
    private int IsDel;
    @Field("isadmin")
    private int IsAdmin;
    @Field("DBSource")
    private int DBSource;
    @Field("AddFromMethod")
    private String AddFromMethod;
//    @Field("AddDate")
//    private Date AddDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getLogClassID() {
        return LogClassID;
    }

    public void setLogClassID(int logClassID) {
        LogClassID = logClassID;
    }

    public int getLogTypeId() {
        return LogTypeId;
    }

    public void setLogTypeId(int logTypeId) {
        LogTypeId = logTypeId;
    }

    public int getMapId() {
        return MapId;
    }

    public void setMapId(int mapId) {
        MapId = mapId;
    }

    public int getMapId2() {
        return MapId2;
    }

    public void setMapId2(int mapId2) {
        MapId2 = mapId2;
    }

    public String getLogMemo() {
        return LogMemo;
    }

    public void setLogMemo(String logMemo) {
        LogMemo = logMemo;
    }

    public boolean isStar() {
        return IsStar;
    }

    public void setStar(boolean star) {
        IsStar = star;
    }

    public Date getAddTime() {
        return AddTime;
    }

    public void setAddTime(Date addTime) {
        AddTime = addTime;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getOrgId() {
        return OrgId;
    }

    public void setOrgId(int orgId) {
        OrgId = orgId;
    }

    public int getCityId() {
        return CityId;
    }

    public void setCityId(int cityId) {
        CityId = cityId;
    }

    public int getIsDel() {
        return IsDel;
    }

    public void setIsDel(int isDel) {
        IsDel = isDel;
    }

    public int getIsAdmin() {
        return IsAdmin;
    }

    public void setIsAdmin(int isAdmin) {
        IsAdmin = isAdmin;
    }

    public int getDBSource() {
        return DBSource;
    }

    public void setDBSource(int DBSource) {
        this.DBSource = DBSource;
    }

    public String getAddFromMethod() {
        return AddFromMethod;
    }

    public void setAddFromMethod(String addFromMethod) {
        AddFromMethod = addFromMethod;
    }

//    public Date getAddDate() {
//        return AddDate;
//    }
//
//    public void setAddDate(Date addDate) {
//        AddDate = addDate;
//    }
}
