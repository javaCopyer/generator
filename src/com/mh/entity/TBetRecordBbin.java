package com.mh.entity;

import java.util.Date;

public class TBetRecordBbin {
    private Integer id;

    private String webFlag;

    private String webRemark;

    private String betUserName;

    private String betFlatAccount;

    private String betGameContent;

    private String betGameResult;

    private String betContent;

    private String betGameHall;

    private String betGameRoom;

    private String betGameTable;

    private String betGameCode;

    private String betWagersId;

    private Double betIn;

    private Double betIncome;

    private Double betUsrWin;

    private Double betNetWin;

    private Date betTime;

    private Integer status;

    private String backWater;

    private Integer backWaterStatus;

    private Date backWaterTime;

    private String backSysUserName;

    private Date createTime;

    private Date modifyTime;

    private String betLoginIp;

    private String betUserAgent;

    private Integer syncFlag;

    private Date betSettled;

    private String betDevice;

    private Integer isWater;

    private String betGameType;

    private Integer settleStatus;

    private String userNodeFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWebFlag() {
        return webFlag;
    }

    public void setWebFlag(String webFlag) {
        this.webFlag = webFlag == null ? null : webFlag.trim();
    }

    public String getWebRemark() {
        return webRemark;
    }

    public void setWebRemark(String webRemark) {
        this.webRemark = webRemark == null ? null : webRemark.trim();
    }

    public String getBetUserName() {
        return betUserName;
    }

    public void setBetUserName(String betUserName) {
        this.betUserName = betUserName == null ? null : betUserName.trim();
    }

    public String getBetFlatAccount() {
        return betFlatAccount;
    }

    public void setBetFlatAccount(String betFlatAccount) {
        this.betFlatAccount = betFlatAccount == null ? null : betFlatAccount.trim();
    }

    public String getBetGameContent() {
        return betGameContent;
    }

    public void setBetGameContent(String betGameContent) {
        this.betGameContent = betGameContent == null ? null : betGameContent.trim();
    }

    public String getBetGameResult() {
        return betGameResult;
    }

    public void setBetGameResult(String betGameResult) {
        this.betGameResult = betGameResult == null ? null : betGameResult.trim();
    }

    public String getBetContent() {
        return betContent;
    }

    public void setBetContent(String betContent) {
        this.betContent = betContent == null ? null : betContent.trim();
    }

    public String getBetGameHall() {
        return betGameHall;
    }

    public void setBetGameHall(String betGameHall) {
        this.betGameHall = betGameHall == null ? null : betGameHall.trim();
    }

    public String getBetGameRoom() {
        return betGameRoom;
    }

    public void setBetGameRoom(String betGameRoom) {
        this.betGameRoom = betGameRoom == null ? null : betGameRoom.trim();
    }

    public String getBetGameTable() {
        return betGameTable;
    }

    public void setBetGameTable(String betGameTable) {
        this.betGameTable = betGameTable == null ? null : betGameTable.trim();
    }

    public String getBetGameCode() {
        return betGameCode;
    }

    public void setBetGameCode(String betGameCode) {
        this.betGameCode = betGameCode == null ? null : betGameCode.trim();
    }

    public String getBetWagersId() {
        return betWagersId;
    }

    public void setBetWagersId(String betWagersId) {
        this.betWagersId = betWagersId == null ? null : betWagersId.trim();
    }

    public Double getBetIn() {
        return betIn;
    }

    public void setBetIn(Double betIn) {
        this.betIn = betIn;
    }

    public Double getBetIncome() {
        return betIncome;
    }

    public void setBetIncome(Double betIncome) {
        this.betIncome = betIncome;
    }

    public Double getBetUsrWin() {
        return betUsrWin;
    }

    public void setBetUsrWin(Double betUsrWin) {
        this.betUsrWin = betUsrWin;
    }

    public Double getBetNetWin() {
        return betNetWin;
    }

    public void setBetNetWin(Double betNetWin) {
        this.betNetWin = betNetWin;
    }

    public Date getBetTime() {
        return betTime;
    }

    public void setBetTime(Date betTime) {
        this.betTime = betTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getBackWater() {
        return backWater;
    }

    public void setBackWater(String backWater) {
        this.backWater = backWater == null ? null : backWater.trim();
    }

    public Integer getBackWaterStatus() {
        return backWaterStatus;
    }

    public void setBackWaterStatus(Integer backWaterStatus) {
        this.backWaterStatus = backWaterStatus;
    }

    public Date getBackWaterTime() {
        return backWaterTime;
    }

    public void setBackWaterTime(Date backWaterTime) {
        this.backWaterTime = backWaterTime;
    }

    public String getBackSysUserName() {
        return backSysUserName;
    }

    public void setBackSysUserName(String backSysUserName) {
        this.backSysUserName = backSysUserName == null ? null : backSysUserName.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getBetLoginIp() {
        return betLoginIp;
    }

    public void setBetLoginIp(String betLoginIp) {
        this.betLoginIp = betLoginIp == null ? null : betLoginIp.trim();
    }

    public String getBetUserAgent() {
        return betUserAgent;
    }

    public void setBetUserAgent(String betUserAgent) {
        this.betUserAgent = betUserAgent == null ? null : betUserAgent.trim();
    }

    public Integer getSyncFlag() {
        return syncFlag;
    }

    public void setSyncFlag(Integer syncFlag) {
        this.syncFlag = syncFlag;
    }

    public Date getBetSettled() {
        return betSettled;
    }

    public void setBetSettled(Date betSettled) {
        this.betSettled = betSettled;
    }

    public String getBetDevice() {
        return betDevice;
    }

    public void setBetDevice(String betDevice) {
        this.betDevice = betDevice == null ? null : betDevice.trim();
    }

    public Integer getIsWater() {
        return isWater;
    }

    public void setIsWater(Integer isWater) {
        this.isWater = isWater;
    }

    public String getBetGameType() {
        return betGameType;
    }

    public void setBetGameType(String betGameType) {
        this.betGameType = betGameType == null ? null : betGameType.trim();
    }

    public Integer getSettleStatus() {
        return settleStatus;
    }

    public void setSettleStatus(Integer settleStatus) {
        this.settleStatus = settleStatus;
    }

    public String getUserNodeFlag() {
        return userNodeFlag;
    }

    public void setUserNodeFlag(String userNodeFlag) {
        this.userNodeFlag = userNodeFlag == null ? null : userNodeFlag.trim();
    }
}