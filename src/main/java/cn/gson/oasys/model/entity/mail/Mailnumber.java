package cn.gson.oasys.model.entity.mail;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aoa_mailnumber")
//邮箱账号表
public class Mailnumber {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="mail_number_id")
	private Long mailNumberId; //邮箱的主键id
	
	@Column(name="mail_type")
	private Long mailType;//邮件账号类型
	
	@Column(name="status")
	private Long status;//邮件状态（是否可用）
	
	@Column(name="mail_user_id")
	private Long mailUserId;//用户id
	
	@Column(name="mail_user_name",nullable=false)
	private String mailUserName;//用户别名
	
	@Column(name="mail_create_time")
	private Date mailCreateTime;//账号创建时间
	
	@Column(name="mail_account",nullable=false)
	private String mailAccount;//邮件账号
	
	public Mailnumber(){}
	
	public Mailnumber( Long mailType, Long status, Long mailUserId, String mailUserName,
			Date mailCreateTime, String mailAccount, String password, String mailDes) {
		super();
		
		this.mailType = mailType;
		this.status = status;
		this.mailUserId = mailUserId;
		this.mailUserName = mailUserName;
		this.mailCreateTime = mailCreateTime;
		this.mailAccount = mailAccount;
		this.password = password;
		this.mailDes = mailDes;
	}

	@Column(name="password",nullable=false)
	private String password;//账号授权码
	
	@Column(name="mail_des")
	private String mailDes;//账号信息备注
	

	public Long getMailNumberId() {
		return mailNumberId;
	}

	public void setMailNumberId(Long mailNumberId) {
		this.mailNumberId = mailNumberId;
	}

	public Long getMailType() {
		return mailType;
	}

	public void setMailType(Long mailType) {
		this.mailType = mailType;
	}

	public Long getStatus() {
		return status;
	}

	public void setStatus(Long status) {
		this.status = status;
	}

	public Long getMailUserId() {
		return mailUserId;
	}

	public void setMailUserId(Long mailUserId) {
		this.mailUserId = mailUserId;
	}

	public String getMailUserName() {
		return mailUserName;
	}

	public void setMailUserName(String mailUserName) {
		this.mailUserName = mailUserName;
	}

	public Date getMailCreateTime() {
		return mailCreateTime;
	}

	public void setMailCreateTime(Date mailCreateTime) {
		this.mailCreateTime = mailCreateTime;
	}

	public String getMailAccount() {
		return mailAccount;
	}

	public void setMailAccount(String mailAccount) {
		this.mailAccount = mailAccount;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getMailDes() {
		return mailDes;
	}

	public void setMailDes(String mailDes) {
		this.mailDes = mailDes;
	}

	@Override
	public String toString() {
		return "Mailnumber [mailNumberId=" + mailNumberId + ", mailType=" + mailType + ", status=" + status
				+ ", mailUserId=" + mailUserId + ", mailUserName=" + mailUserName + ", mailCreateTime=" + mailCreateTime
				+ ", mailAccount=" + mailAccount + ", password=" + password + ", mailDes=" + mailDes + "]";
	}
	
	
}
