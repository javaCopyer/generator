package com.mh.entity;

import java.math.BigDecimal;
import java.util.Date;

public class User {
    private Long id;

    private String name;

    private String loginname;

    private Date birthday;

    private String idcard;

    private String pwd;

    private String nick;

    private Integer usertype;

    private String orderpoolstatus;

    private Boolean sex;

    private String education;

    private String job;

    private BigDecimal salary;

    private String phone;

    private String qq;

    private String weixin;

    private Date createtime;

    private Date updatetime;

    private String minzu;

    private String address;

    private Long accessuserid;

    private String islocal;

    private Long acccompanyid;

    private String isdeformity;

    private String isstudent;

    private String yaoqingma;

    private String inviter;

    private Long channelid;

    private Long account;

    private Long fund;

    private Integer loginstatus;

    private String belongcity;

    private String expectedworkcity;

    private Boolean isvalidate;

    private String os;

    private String source;

    private String subsource;

    private String ip;

    private String isinviter;

    private Integer invitednumber;

    private String clientid;

    private String tattoo;

    private String disability;

    private String certificate;

    private Long parentid;

    private String provinceid;

    private String cityid;

    private String districtid;

    private String townid;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getLoginname() {
        return loginname;
    }

    public void setLoginname(String loginname) {
        this.loginname = loginname == null ? null : loginname.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getUsertype() {
        return usertype;
    }

    public void setUsertype(Integer usertype) {
        this.usertype = usertype;
    }

    public String getOrderpoolstatus() {
        return orderpoolstatus;
    }

    public void setOrderpoolstatus(String orderpoolstatus) {
        this.orderpoolstatus = orderpoolstatus == null ? null : orderpoolstatus.trim();
    }

    public Boolean getSex() {
        return sex;
    }

    public void setSex(Boolean sex) {
        this.sex = sex;
    }

    public String getEducation() {
        return education;
    }

    public void setEducation(String education) {
        this.education = education == null ? null : education.trim();
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job == null ? null : job.trim();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getQq() {
        return qq;
    }

    public void setQq(String qq) {
        this.qq = qq == null ? null : qq.trim();
    }

    public String getWeixin() {
        return weixin;
    }

    public void setWeixin(String weixin) {
        this.weixin = weixin == null ? null : weixin.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }

    public String getMinzu() {
        return minzu;
    }

    public void setMinzu(String minzu) {
        this.minzu = minzu == null ? null : minzu.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public Long getAccessuserid() {
        return accessuserid;
    }

    public void setAccessuserid(Long accessuserid) {
        this.accessuserid = accessuserid;
    }

    public String getIslocal() {
        return islocal;
    }

    public void setIslocal(String islocal) {
        this.islocal = islocal == null ? null : islocal.trim();
    }

    public Long getAcccompanyid() {
        return acccompanyid;
    }

    public void setAcccompanyid(Long acccompanyid) {
        this.acccompanyid = acccompanyid;
    }

    public String getIsdeformity() {
        return isdeformity;
    }

    public void setIsdeformity(String isdeformity) {
        this.isdeformity = isdeformity == null ? null : isdeformity.trim();
    }

    public String getIsstudent() {
        return isstudent;
    }

    public void setIsstudent(String isstudent) {
        this.isstudent = isstudent == null ? null : isstudent.trim();
    }

    public String getYaoqingma() {
        return yaoqingma;
    }

    public void setYaoqingma(String yaoqingma) {
        this.yaoqingma = yaoqingma == null ? null : yaoqingma.trim();
    }

    public String getInviter() {
        return inviter;
    }

    public void setInviter(String inviter) {
        this.inviter = inviter == null ? null : inviter.trim();
    }

    public Long getChannelid() {
        return channelid;
    }

    public void setChannelid(Long channelid) {
        this.channelid = channelid;
    }

    public Long getAccount() {
        return account;
    }

    public void setAccount(Long account) {
        this.account = account;
    }

    public Long getFund() {
        return fund;
    }

    public void setFund(Long fund) {
        this.fund = fund;
    }

    public Integer getLoginstatus() {
        return loginstatus;
    }

    public void setLoginstatus(Integer loginstatus) {
        this.loginstatus = loginstatus;
    }

    public String getBelongcity() {
        return belongcity;
    }

    public void setBelongcity(String belongcity) {
        this.belongcity = belongcity == null ? null : belongcity.trim();
    }

    public String getExpectedworkcity() {
        return expectedworkcity;
    }

    public void setExpectedworkcity(String expectedworkcity) {
        this.expectedworkcity = expectedworkcity == null ? null : expectedworkcity.trim();
    }

    public Boolean getIsvalidate() {
        return isvalidate;
    }

    public void setIsvalidate(Boolean isvalidate) {
        this.isvalidate = isvalidate;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os == null ? null : os.trim();
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
    }

    public String getSubsource() {
        return subsource;
    }

    public void setSubsource(String subsource) {
        this.subsource = subsource == null ? null : subsource.trim();
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip == null ? null : ip.trim();
    }

    public String getIsinviter() {
        return isinviter;
    }

    public void setIsinviter(String isinviter) {
        this.isinviter = isinviter == null ? null : isinviter.trim();
    }

    public Integer getInvitednumber() {
        return invitednumber;
    }

    public void setInvitednumber(Integer invitednumber) {
        this.invitednumber = invitednumber;
    }

    public String getClientid() {
        return clientid;
    }

    public void setClientid(String clientid) {
        this.clientid = clientid == null ? null : clientid.trim();
    }

    public String getTattoo() {
        return tattoo;
    }

    public void setTattoo(String tattoo) {
        this.tattoo = tattoo == null ? null : tattoo.trim();
    }

    public String getDisability() {
        return disability;
    }

    public void setDisability(String disability) {
        this.disability = disability == null ? null : disability.trim();
    }

    public String getCertificate() {
        return certificate;
    }

    public void setCertificate(String certificate) {
        this.certificate = certificate == null ? null : certificate.trim();
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public String getProvinceid() {
        return provinceid;
    }

    public void setProvinceid(String provinceid) {
        this.provinceid = provinceid == null ? null : provinceid.trim();
    }

    public String getCityid() {
        return cityid;
    }

    public void setCityid(String cityid) {
        this.cityid = cityid == null ? null : cityid.trim();
    }

    public String getDistrictid() {
        return districtid;
    }

    public void setDistrictid(String districtid) {
        this.districtid = districtid == null ? null : districtid.trim();
    }

    public String getTownid() {
        return townid;
    }

    public void setTownid(String townid) {
        this.townid = townid == null ? null : townid.trim();
    }
}