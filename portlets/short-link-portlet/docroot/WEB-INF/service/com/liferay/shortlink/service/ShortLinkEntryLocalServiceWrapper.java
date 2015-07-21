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

package com.liferay.shortlink.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * <p>
 * This class is a wrapper for {@link ShortLinkEntryLocalService}.
 * </p>
 *
 * @author    Brian Wing Shun Chan
 * @see       ShortLinkEntryLocalService
 * @generated
 */
public class ShortLinkEntryLocalServiceWrapper
	implements ShortLinkEntryLocalService,
		ServiceWrapper<ShortLinkEntryLocalService> {
	public ShortLinkEntryLocalServiceWrapper(
		ShortLinkEntryLocalService shortLinkEntryLocalService) {
		_shortLinkEntryLocalService = shortLinkEntryLocalService;
	}

	/**
	* Adds the short link entry to the database. Also notifies the appropriate model listeners.
	*
	* @param shortLinkEntry the short link entry
	* @return the short link entry that was added
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shortlink.model.ShortLinkEntry addShortLinkEntry(
		com.liferay.shortlink.model.ShortLinkEntry shortLinkEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.addShortLinkEntry(shortLinkEntry);
	}

	/**
	* Creates a new short link entry with the primary key. Does not add the short link entry to the database.
	*
	* @param shortLinkEntryId the primary key for the new short link entry
	* @return the new short link entry
	*/
	public com.liferay.shortlink.model.ShortLinkEntry createShortLinkEntry(
		long shortLinkEntryId) {
		return _shortLinkEntryLocalService.createShortLinkEntry(shortLinkEntryId);
	}

	/**
	* Deletes the short link entry with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param shortLinkEntryId the primary key of the short link entry
	* @return the short link entry that was removed
	* @throws PortalException if a short link entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shortlink.model.ShortLinkEntry deleteShortLinkEntry(
		long shortLinkEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.deleteShortLinkEntry(shortLinkEntryId);
	}

	/**
	* Deletes the short link entry from the database. Also notifies the appropriate model listeners.
	*
	* @param shortLinkEntry the short link entry
	* @return the short link entry that was removed
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shortlink.model.ShortLinkEntry deleteShortLinkEntry(
		com.liferay.shortlink.model.ShortLinkEntry shortLinkEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.deleteShortLinkEntry(shortLinkEntry);
	}

	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _shortLinkEntryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.dynamicQuery(dynamicQuery, start,
			end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.dynamicQueryCount(dynamicQuery);
	}

	public com.liferay.shortlink.model.ShortLinkEntry fetchShortLinkEntry(
		long shortLinkEntryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.fetchShortLinkEntry(shortLinkEntryId);
	}

	/**
	* Returns the short link entry with the primary key.
	*
	* @param shortLinkEntryId the primary key of the short link entry
	* @return the short link entry
	* @throws PortalException if a short link entry with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shortlink.model.ShortLinkEntry getShortLinkEntry(
		long shortLinkEntryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.getShortLinkEntry(shortLinkEntryId);
	}

	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the short link entries.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of short link entries
	* @param end the upper bound of the range of short link entries (not inclusive)
	* @return the range of short link entries
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.liferay.shortlink.model.ShortLinkEntry> getShortLinkEntries(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.getShortLinkEntries(start, end);
	}

	/**
	* Returns the number of short link entries.
	*
	* @return the number of short link entries
	* @throws SystemException if a system exception occurred
	*/
	public int getShortLinkEntriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.getShortLinkEntriesCount();
	}

	/**
	* Updates the short link entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shortLinkEntry the short link entry
	* @return the short link entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shortlink.model.ShortLinkEntry updateShortLinkEntry(
		com.liferay.shortlink.model.ShortLinkEntry shortLinkEntry)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.updateShortLinkEntry(shortLinkEntry);
	}

	/**
	* Updates the short link entry in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param shortLinkEntry the short link entry
	* @param merge whether to merge the short link entry with the current session. See {@link com.liferay.portal.service.persistence.BatchSession#update(com.liferay.portal.kernel.dao.orm.Session, com.liferay.portal.model.BaseModel, boolean)} for an explanation.
	* @return the short link entry that was updated
	* @throws SystemException if a system exception occurred
	*/
	public com.liferay.shortlink.model.ShortLinkEntry updateShortLinkEntry(
		com.liferay.shortlink.model.ShortLinkEntry shortLinkEntry, boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.updateShortLinkEntry(shortLinkEntry,
			merge);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	public java.lang.String getBeanIdentifier() {
		return _shortLinkEntryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_shortLinkEntryLocalService.setBeanIdentifier(beanIdentifier);
	}

	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _shortLinkEntryLocalService.invokeMethod(name, parameterTypes,
			arguments);
	}

	public com.liferay.shortlink.model.ShortLinkEntry addShortLinkEntry(
		java.lang.String originalURL, java.lang.String shortURL,
		boolean autogenerated)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.addShortLinkEntry(originalURL,
			shortURL, autogenerated);
	}

	public void deleteShortLinkEntries(java.util.Date modifiedDate)
		throws com.liferay.portal.kernel.exception.SystemException {
		_shortLinkEntryLocalService.deleteShortLinkEntries(modifiedDate);
	}

	public java.util.List<com.liferay.shortlink.model.ShortLinkEntry> getShortLinkEntries(
		boolean autogenerated, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.getShortLinkEntries(autogenerated,
			start, end);
	}

	public com.liferay.shortlink.model.ShortLinkEntry getShortLinkEntry(
		java.lang.String shortURL, boolean autogenerated)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.getShortLinkEntry(shortURL,
			autogenerated);
	}

	public com.liferay.shortlink.model.ShortLinkEntry updateShortLinkEntry(
		long shortLinkEntryId, java.lang.String originalURL,
		java.lang.String shortURL, boolean active)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _shortLinkEntryLocalService.updateShortLinkEntry(shortLinkEntryId,
			originalURL, shortURL, active);
	}

	/**
	 * @deprecated Renamed to {@link #getWrappedService}
	 */
	public ShortLinkEntryLocalService getWrappedShortLinkEntryLocalService() {
		return _shortLinkEntryLocalService;
	}

	/**
	 * @deprecated Renamed to {@link #setWrappedService}
	 */
	public void setWrappedShortLinkEntryLocalService(
		ShortLinkEntryLocalService shortLinkEntryLocalService) {
		_shortLinkEntryLocalService = shortLinkEntryLocalService;
	}

	public ShortLinkEntryLocalService getWrappedService() {
		return _shortLinkEntryLocalService;
	}

	public void setWrappedService(
		ShortLinkEntryLocalService shortLinkEntryLocalService) {
		_shortLinkEntryLocalService = shortLinkEntryLocalService;
	}

	private ShortLinkEntryLocalService _shortLinkEntryLocalService;
}