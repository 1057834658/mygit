package com.tan.test.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * 
 * @Project: schollmallsuper2.0
 * @ClassName: AppManager
 * @Description: app管理实体类
 * @Author:	田超
 * @Date:	日期：2016年8月17日  时间：下午4:57:39
 * @Version 1.0.0
 */
public class AppManager implements Serializable{

	/**
	 * @Fields: serialVersionUID
	   @Description: 
	 */
	private static final long serialVersionUID = 4382932941782298323L;
	
	/**
	 * @Fields: id
	 * @Description: 主键
	 */
	private Integer id;
	/**
	 * @Fields: appSign
	 * @Description: 签名
	 */
	private String appSign;

	/**
	 * @Fields: name
	 * @Description: app名称
	 */
	private String name;

	/**
	 * @Fields: iconUrl
	 * @Description: 应用图标地址
	 */
	private String iconUrl;

	/**
	 * @Fields: version
	 * @Description:版本号
	 */
	private String version;

	/**
	 * @Fields: detail
	 * @Description:升级说明
	 */
	private String detail;

	/**
	 * @Fields: isNow
	 * @Description:状态 N 历史 Y 当前
	 */
	private String isNow;
	
	/**
	 * @Fields: appName
	   @Description: APP名称
	 */
	private String appName;

	/**
	 * @Fields: networkType
	 * @Description: 网络类型 (0为本地，1为网络)
	 */
	private Integer networkType;

	/**
	 * @Fields: networkUrl
	 * @Description: 网络地址
	 */
	private String networkUrl;
	
	/**
	 * @Fields: localUrl
	 * @Description:本地地址
	 */
	private String localUrl;

	/**
	 * @Fields: mobileSysType
	 * @Description: 手机APP系统类型 1 安卓 2 苹果
	 */
	private Integer mobileSysType;

	/**
	 * @Fields: release
	 * @Description: 是否上架，Y为是，N为否
	 */
	private String verStatus;
	
	/**
	 * @Fields: createUser
	 * @Description:创建人
	 */
	private Integer createUser;

	/**
	 * @Fields: createDate
	 * @Description:创建时间
	 */
	private Date createDate;

	/**
	 * @Fields: updateDate
	 * @Description:修改时间
	 */
	private Date updateDate;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getIconUrl() {
		return iconUrl;
	}

	public void setIconUrl(String iconUrl) {
		this.iconUrl = iconUrl;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getIsNow() {
		return isNow;
	}

	public void setIsNow(String isNow) {
		this.isNow = isNow;
	}

	public Integer getNetworkType() {
		return networkType;
	}

	public void setNetworkType(Integer networkType) {
		this.networkType = networkType;
	}

	public String getNetworkUrl() {
		return networkUrl;
	}

	public void setNetworkUrl(String networkUrl) {
		this.networkUrl = networkUrl;
	}

	public String getLocalUrl() {
		return localUrl;
	}

	public void setLocalUrl(String localUrl) {
		this.localUrl = localUrl;
	}

	public Integer getMobileSysType() {
		return mobileSysType;
	}

	public void setMobileSysType(Integer mobileSysType) {
		this.mobileSysType = mobileSysType;
	}

	public String getVerStatus() {
		return verStatus;
	}

	public void setVerStatus(String verStatus) {
		this.verStatus = verStatus;
	}

	public Integer getCreateUser() {
		return createUser;
	}

	public void setCreateUser(Integer createUser) {
		this.createUser = createUser;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getAppSign() {
		return appSign;
	}

	public void setAppSign(String appSign) {
		this.appSign = appSign;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}
}
