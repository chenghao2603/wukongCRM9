package com.kakarote.crm9.erp.crm.entity.base;

import com.jfinal.plugin.activerecord.IBean;
import com.jfinal.plugin.activerecord.Model;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseCrmLeads<M extends BaseCrmLeads<M>> extends Model<M> implements IBean {

	public void setLeadsId(Integer leadsId) {
		set("leads_id", leadsId);
	}

	public Integer getLeadsId() {
		return getInt("leads_id");
	}

	public void setIsTransform(Integer isTransform) {
		set("is_transform", isTransform);
	}

	public Integer getIsTransform() {
		return getInt("is_transform");
	}

	public void setLeadsName(String leadsName) {
		set("leads_name", leadsName);
	}

	public String getLeadsName() {
		return getStr("leads_name");
	}

	public void setCustomerId(Integer customerId) {
		set("customer_id", customerId);
	}

	public Integer getCustomerId() {
		return getInt("customer_id");
	}

	public void setNextTime(java.util.Date nextTime) {
		set("next_time", nextTime);
	}

	public java.util.Date getNextTime() {
		return get("next_time");
	}

	public void setSource(String source) {
		set("source", source);
	}

	public String getSource() {
		return getStr("source");
	}

	public void setTelephone(String telephone) {
		set("telephone", telephone);
	}

	public String getTelephone() {
		return getStr("telephone");
	}

	public void setMobile(String mobile) {
		set("mobile", mobile);
	}

	public String getMobile() {
		return getStr("mobile");
	}

	public void setAddress(String address) {
		set("address", address);
	}

	public String getAddress() {
		return getStr("address");
	}

	public void setRemark(String remark){
		set("remark", remark);
	}

	public String getRemark(){
		return getStr("remark");
	}

	public void setCreateUserId(Integer createUserId) {
		set("create_user_id", createUserId);
	}

	public Integer getCreateUserId() {
		return getInt("create_user_id");
	}

	public void setOwnerUserId(Integer ownerUserId) {
		set("owner_user_id", ownerUserId);
	}

	public Integer getOwnerUserId() {
		return getInt("owner_user_id");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}

	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdateTime(java.util.Date updateTime) {
		set("update_time", updateTime);
	}

	public java.util.Date getUpdateTime() {
		return get("update_time");
	}

	public void setBatchId(String batchId) {
		set("batch_id", batchId);
	}

	public String getBatchId() {
		return getStr("batch_id");
	}

}
