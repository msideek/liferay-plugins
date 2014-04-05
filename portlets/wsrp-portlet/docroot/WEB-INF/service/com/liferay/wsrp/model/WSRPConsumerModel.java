/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.wsrp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the WSRPConsumer service. Represents a row in the &quot;WSRP_WSRPConsumer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.liferay.wsrp.model.impl.WSRPConsumerModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.liferay.wsrp.model.impl.WSRPConsumerImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see WSRPConsumer
 * @see com.liferay.wsrp.model.impl.WSRPConsumerImpl
 * @see com.liferay.wsrp.model.impl.WSRPConsumerModelImpl
 * @generated
 */
public interface WSRPConsumerModel extends BaseModel<WSRPConsumer> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a w s r p consumer model instance should use the {@link WSRPConsumer} interface instead.
	 */

	/**
	 * Returns the primary key of this w s r p consumer.
	 *
	 * @return the primary key of this w s r p consumer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this w s r p consumer.
	 *
	 * @param primaryKey the primary key of this w s r p consumer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this w s r p consumer.
	 *
	 * @return the uuid of this w s r p consumer
	 */
	@AutoEscape
	public String getUuid();

	/**
	 * Sets the uuid of this w s r p consumer.
	 *
	 * @param uuid the uuid of this w s r p consumer
	 */
	public void setUuid(String uuid);

	/**
	 * Returns the wsrp consumer ID of this w s r p consumer.
	 *
	 * @return the wsrp consumer ID of this w s r p consumer
	 */
	public long getWsrpConsumerId();

	/**
	 * Sets the wsrp consumer ID of this w s r p consumer.
	 *
	 * @param wsrpConsumerId the wsrp consumer ID of this w s r p consumer
	 */
	public void setWsrpConsumerId(long wsrpConsumerId);

	/**
	 * Returns the company ID of this w s r p consumer.
	 *
	 * @return the company ID of this w s r p consumer
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this w s r p consumer.
	 *
	 * @param companyId the company ID of this w s r p consumer
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the create date of this w s r p consumer.
	 *
	 * @return the create date of this w s r p consumer
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this w s r p consumer.
	 *
	 * @param createDate the create date of this w s r p consumer
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this w s r p consumer.
	 *
	 * @return the modified date of this w s r p consumer
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this w s r p consumer.
	 *
	 * @param modifiedDate the modified date of this w s r p consumer
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this w s r p consumer.
	 *
	 * @return the name of this w s r p consumer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this w s r p consumer.
	 *
	 * @param name the name of this w s r p consumer
	 */
	public void setName(String name);

	/**
	 * Returns the url of this w s r p consumer.
	 *
	 * @return the url of this w s r p consumer
	 */
	@AutoEscape
	public String getUrl();

	/**
	 * Sets the url of this w s r p consumer.
	 *
	 * @param url the url of this w s r p consumer
	 */
	public void setUrl(String url);

	/**
	 * Returns the wsdl of this w s r p consumer.
	 *
	 * @return the wsdl of this w s r p consumer
	 */
	@AutoEscape
	public String getWsdl();

	/**
	 * Sets the wsdl of this w s r p consumer.
	 *
	 * @param wsdl the wsdl of this w s r p consumer
	 */
	public void setWsdl(String wsdl);

	/**
	 * Returns the registration context string of this w s r p consumer.
	 *
	 * @return the registration context string of this w s r p consumer
	 */
	@AutoEscape
	public String getRegistrationContextString();

	/**
	 * Sets the registration context string of this w s r p consumer.
	 *
	 * @param registrationContextString the registration context string of this w s r p consumer
	 */
	public void setRegistrationContextString(String registrationContextString);

	/**
	 * Returns the registration properties string of this w s r p consumer.
	 *
	 * @return the registration properties string of this w s r p consumer
	 */
	@AutoEscape
	public String getRegistrationPropertiesString();

	/**
	 * Sets the registration properties string of this w s r p consumer.
	 *
	 * @param registrationPropertiesString the registration properties string of this w s r p consumer
	 */
	public void setRegistrationPropertiesString(
		String registrationPropertiesString);

	/**
	 * Returns the forward cookies of this w s r p consumer.
	 *
	 * @return the forward cookies of this w s r p consumer
	 */
	@AutoEscape
	public String getForwardCookies();

	/**
	 * Sets the forward cookies of this w s r p consumer.
	 *
	 * @param forwardCookies the forward cookies of this w s r p consumer
	 */
	public void setForwardCookies(String forwardCookies);

	/**
	 * Returns the forward headers of this w s r p consumer.
	 *
	 * @return the forward headers of this w s r p consumer
	 */
	@AutoEscape
	public String getForwardHeaders();

	/**
	 * Sets the forward headers of this w s r p consumer.
	 *
	 * @param forwardHeaders the forward headers of this w s r p consumer
	 */
	public void setForwardHeaders(String forwardHeaders);

	/**
	 * Returns the markup character sets of this w s r p consumer.
	 *
	 * @return the markup character sets of this w s r p consumer
	 */
	@AutoEscape
	public String getMarkupCharacterSets();

	/**
	 * Sets the markup character sets of this w s r p consumer.
	 *
	 * @param markupCharacterSets the markup character sets of this w s r p consumer
	 */
	public void setMarkupCharacterSets(String markupCharacterSets);

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public Serializable getPrimaryKeyObj();

	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(WSRPConsumer wsrpConsumer);

	public int hashCode();

	public CacheModel<WSRPConsumer> toCacheModel();

	public WSRPConsumer toEscapedModel();

	public WSRPConsumer toUnescapedModel();

	public String toString();

	public String toXmlString();
}