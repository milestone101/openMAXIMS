//#############################################################################
//#                                                                           #
//#  Copyright (C) <2014>  <IMS MAXIMS>                                       #
//#                                                                           #
//#  This program is free software: you can redistribute it and/or modify     #
//#  it under the terms of the GNU Affero General Public License as           #
//#  published by the Free Software Foundation, either version 3 of the       #
//#  License, or (at your option) any later version.                          # 
//#                                                                           #
//#  This program is distributed in the hope that it will be useful,          #
//#  but WITHOUT ANY WARRANTY; without even the implied warranty of           #
//#  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the            #
//#  GNU Affero General Public License for more details.                      #
//#                                                                           #
//#  You should have received a copy of the GNU Affero General Public License #
//#  along with this program.  If not, see <http://www.gnu.org/licenses/>.    #
//#                                                                           #
//#############################################################################
//#EOH
/*
 * This code was generated
 * Copyright (C) 1995-2004 IMS MAXIMS plc. All rights reserved.
 * IMS Development Environment (version 1.80 build 5007.25751)
 * WARNING: DO NOT MODIFY the content of this file
 * Generated on 16/04/2014, 12:31
 *
 */
package ims.ocrr.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Daniel Laffan
 */
public class OrderResultHistoryVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.ocrr.vo.OrderResultHistoryVo copy(ims.ocrr.vo.OrderResultHistoryVo valueObjectDest, ims.ocrr.vo.OrderResultHistoryVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_OrderResultHistory(valueObjectSrc.getID_OrderResultHistory());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// RepDateTime
		valueObjectDest.setRepDateTime(valueObjectSrc.getRepDateTime());
		// RepTimeSupplied
		valueObjectDest.setRepTimeSupplied(valueObjectSrc.getRepTimeSupplied());
		// OrdInvStatus
		valueObjectDest.setOrdInvStatus(valueObjectSrc.getOrdInvStatus());
		// ResultStatus
		valueObjectDest.setResultStatus(valueObjectSrc.getResultStatus());
		// HistoryDateTime
		valueObjectDest.setHistoryDateTime(valueObjectSrc.getHistoryDateTime());
		// ResultDetail
		valueObjectDest.setResultDetail(valueObjectSrc.getResultDetail());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createOrderResultHistoryVoCollectionFromOrderResultHistory(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderResultHistory objects.
	 */
	public static ims.ocrr.vo.OrderResultHistoryVoCollection createOrderResultHistoryVoCollectionFromOrderResultHistory(java.util.Set domainObjectSet)	
	{
		return createOrderResultHistoryVoCollectionFromOrderResultHistory(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.ocrr.orderingresults.domain.objects.OrderResultHistory objects.
	 */
	public static ims.ocrr.vo.OrderResultHistoryVoCollection createOrderResultHistoryVoCollectionFromOrderResultHistory(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.ocrr.vo.OrderResultHistoryVoCollection voList = new ims.ocrr.vo.OrderResultHistoryVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory) iterator.next();
			ims.ocrr.vo.OrderResultHistoryVo vo = create(map, domainObject);
			
			if (vo != null)
				voList.add(vo);
				
			if (domainObject != null)
			{				
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderResultHistory objects.
	 */
	public static ims.ocrr.vo.OrderResultHistoryVoCollection createOrderResultHistoryVoCollectionFromOrderResultHistory(java.util.List domainObjectList) 
	{
		return createOrderResultHistoryVoCollectionFromOrderResultHistory(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.ocrr.orderingresults.domain.objects.OrderResultHistory objects.
	 */
	public static ims.ocrr.vo.OrderResultHistoryVoCollection createOrderResultHistoryVoCollectionFromOrderResultHistory(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.ocrr.vo.OrderResultHistoryVoCollection voList = new ims.ocrr.vo.OrderResultHistoryVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory) domainObjectList.get(i);
			ims.ocrr.vo.OrderResultHistoryVo vo = create(map, domainObject);

			if (vo != null)
				voList.add(vo);
			
			if (domainObject != null)
			{
				if (domainObject.getIsRIE() != null && domainObject.getIsRIE().booleanValue() == true)
					rieCount++;
				else
					activeCount++;
			}
		}
		
		voList.setRieCount(rieCount);
		voList.setActiveCount(activeCount);
		return voList;
	}

	/**
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderResultHistory set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractOrderResultHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderResultHistoryVoCollection voCollection) 
	 {
	 	return extractOrderResultHistorySet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractOrderResultHistorySet(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderResultHistoryVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderResultHistoryVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject = OrderResultHistoryVoAssembler.extractOrderResultHistory(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}
			
			//Trying to avoid the hibernate collection being marked as dirty via its public interface methods. (like add)
			if (!domainObjectSet.contains(domainObject)) domainObjectSet.add(domainObject);
			newSet.add(domainObject);			
		}
		java.util.Set removedSet = new java.util.HashSet();
		java.util.Iterator iter = domainObjectSet.iterator();
		//Find out which objects need to be removed
		while (iter.hasNext())
		{
			ims.domain.DomainObject o = (ims.domain.DomainObject)iter.next();			
			if ((o == null || o.getIsRIE() == null || !o.getIsRIE().booleanValue()) && !newSet.contains(o))
			{
				removedSet.add(o);
			}
		}
		iter = removedSet.iterator();
		//Remove the unwanted objects
		while (iter.hasNext())
		{
			domainObjectSet.remove(iter.next());
		}
		return domainObjectSet;	 
	 }


	/**
	 * Create the ims.ocrr.orderingresults.domain.objects.OrderResultHistory list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractOrderResultHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderResultHistoryVoCollection voCollection) 
	 {
	 	return extractOrderResultHistoryList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractOrderResultHistoryList(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderResultHistoryVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.ocrr.vo.OrderResultHistoryVo vo = voCollection.get(i);
			ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject = OrderResultHistoryVoAssembler.extractOrderResultHistory(domainFactory, vo, domMap);

			//TODO: This can only occur in the situation of a stale object exception. For now leave it to the Interceptor to handle it.
			if (domainObject == null)
			{
				continue;
			}

			int domIdx = domainObjectList.indexOf(domainObject);
			if (domIdx == -1)
			{
				domainObjectList.add(i, domainObject);
			}
			else if (i != domIdx && i < domainObjectList.size())
			{
				Object tmp = domainObjectList.get(i);
				domainObjectList.set(i, domainObjectList.get(domIdx));
				domainObjectList.set(domIdx, tmp);
			}
		}
		
		//Remove all ones in domList where index > voCollection.size() as these should
		//now represent the ones removed from the VO collection. No longer referenced.
		int i1=domainObjectList.size();
		while (i1 > size)
		{
			domainObjectList.remove(i1-1);
			i1=domainObjectList.size();
		}
		return domainObjectList;	 
	 }

 

	/**
	 * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderResultHistory object.
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderResultHistory
	 */
	 public static ims.ocrr.vo.OrderResultHistoryVo create(ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.ocrr.orderingresults.domain.objects.OrderResultHistory object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.ocrr.vo.OrderResultHistoryVo create(DomainObjectMap map, ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.ocrr.vo.OrderResultHistoryVo valueObject = (ims.ocrr.vo.OrderResultHistoryVo) map.getValueObject(domainObject, ims.ocrr.vo.OrderResultHistoryVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.ocrr.vo.OrderResultHistoryVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderResultHistory
	 */
	 public static ims.ocrr.vo.OrderResultHistoryVo insert(ims.ocrr.vo.OrderResultHistoryVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
		DomainObjectMap map = new DomainObjectMap();
		return insert(map, valueObject, domainObject);
	 }
	 
	/**
	 * Update the ValueObject with the Domain Object.
	 * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	 * @param valueObject to be updated
	 * @param domainObject ims.ocrr.orderingresults.domain.objects.OrderResultHistory
	 */
	 public static ims.ocrr.vo.OrderResultHistoryVo insert(DomainObjectMap map, ims.ocrr.vo.OrderResultHistoryVo valueObject, ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_OrderResultHistory(domainObject.getId());
		valueObject.setIsRIE(domainObject.getIsRIE());
		
		// If this is a recordedInError record, and the domainObject
		// value isIncludeRecord has not been set, then we return null and
		// not the value object
		if (valueObject.getIsRIE() != null && valueObject.getIsRIE().booleanValue() == true && !domainObject.isIncludeRecord())
			return null;
			
		// If this is not a recordedInError record, and the domainObject
		// value isIncludeRecord has been set, then we return null and
		// not the value object
		if ((valueObject.getIsRIE() == null || valueObject.getIsRIE().booleanValue() == false) && domainObject.isIncludeRecord())
			return null;
			
		// RepDateTime
		java.util.Date RepDateTime = domainObject.getRepDateTime();
		if ( null != RepDateTime ) 
		{
			valueObject.setRepDateTime(new ims.framework.utils.DateTime(RepDateTime) );
		}
		// RepTimeSupplied
		valueObject.setRepTimeSupplied( domainObject.isRepTimeSupplied() );
		// OrdInvStatus
		ims.domain.lookups.LookupInstance instance3 = domainObject.getOrdInvStatus();
		if ( null != instance3 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance3.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance3.getImage().getImageId(), instance3.getImage().getImagePath());
			}
			color = instance3.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.OrderInvStatus voLookup3 = new ims.ocrr.vo.lookups.OrderInvStatus(instance3.getId(),instance3.getText(), instance3.isActive(), null, img, color);
			ims.ocrr.vo.lookups.OrderInvStatus parentVoLookup3 = voLookup3;
			ims.domain.lookups.LookupInstance parent3 = instance3.getParent();
			while (parent3 != null)
			{
				if (parent3.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent3.getImage().getImageId(), parent3.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent3.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup3.setParent(new ims.ocrr.vo.lookups.OrderInvStatus(parent3.getId(),parent3.getText(), parent3.isActive(), null, img, color));
				parentVoLookup3 = parentVoLookup3.getParent();
								parent3 = parent3.getParent();
			}			
			valueObject.setOrdInvStatus(voLookup3);
		}
				// ResultStatus
		ims.domain.lookups.LookupInstance instance4 = domainObject.getResultStatus();
		if ( null != instance4 ) {
			ims.framework.utils.ImagePath img = null;
			ims.framework.utils.Color color = null;		
			img = null;
			if (instance4.getImage() != null) 
			{
				img = new ims.framework.utils.ImagePath(instance4.getImage().getImageId(), instance4.getImage().getImagePath());
			}
			color = instance4.getColor();
			if (color != null) 
				color.getValue();

			ims.ocrr.vo.lookups.ResultStatus voLookup4 = new ims.ocrr.vo.lookups.ResultStatus(instance4.getId(),instance4.getText(), instance4.isActive(), null, img, color);
			ims.ocrr.vo.lookups.ResultStatus parentVoLookup4 = voLookup4;
			ims.domain.lookups.LookupInstance parent4 = instance4.getParent();
			while (parent4 != null)
			{
				if (parent4.getImage() != null) 
				{
					img = new ims.framework.utils.ImagePath(parent4.getImage().getImageId(), parent4.getImage().getImagePath() );
				}
				else 
				{
					img = null;
				}
				color = parent4.getColor();
    			if (color != null) 
    				color.getValue();
								parentVoLookup4.setParent(new ims.ocrr.vo.lookups.ResultStatus(parent4.getId(),parent4.getText(), parent4.isActive(), null, img, color));
				parentVoLookup4 = parentVoLookup4.getParent();
								parent4 = parent4.getParent();
			}			
			valueObject.setResultStatus(voLookup4);
		}
				// HistoryDateTime
		java.util.Date HistoryDateTime = domainObject.getHistoryDateTime();
		if ( null != HistoryDateTime ) 
		{
			valueObject.setHistoryDateTime(new ims.framework.utils.DateTime(HistoryDateTime) );
		}
		// ResultDetail
		valueObject.setResultDetail(ims.ocrr.vo.domain.ResultDetailsForOrderResultHistoryVoAssembler.create(map, domainObject.getResultDetail()) );
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.ocrr.orderingresults.domain.objects.OrderResultHistory extractOrderResultHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderResultHistoryVo valueObject) 
	{
		return 	extractOrderResultHistory(domainFactory, valueObject, new HashMap());
	}

	public static ims.ocrr.orderingresults.domain.objects.OrderResultHistory extractOrderResultHistory(ims.domain.ILightweightDomainFactory domainFactory, ims.ocrr.vo.OrderResultHistoryVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_OrderResultHistory();
		ims.ocrr.orderingresults.domain.objects.OrderResultHistory domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderResultHistory)domMap.get(valueObject);
			}
			// ims.ocrr.vo.OrderResultHistoryVo ID_OrderResultHistory field is unknown
			domainObject = new ims.ocrr.orderingresults.domain.objects.OrderResultHistory();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_OrderResultHistory());
			if (domMap.get(key) != null)
			{
				return (ims.ocrr.orderingresults.domain.objects.OrderResultHistory)domMap.get(key);
			}
			domainObject = (ims.ocrr.orderingresults.domain.objects.OrderResultHistory) domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.OrderResultHistory.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_OrderResultHistory());

		ims.framework.utils.DateTime dateTime1 = valueObject.getRepDateTime();
		java.util.Date value1 = null;
		if ( dateTime1 != null ) 
		{
			value1 = dateTime1.getJavaDate();
		}
		domainObject.setRepDateTime(value1);
		domainObject.setRepTimeSupplied(valueObject.getRepTimeSupplied());
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value3 = null;
		if ( null != valueObject.getOrdInvStatus() ) 
		{
			value3 =
				domainFactory.getLookupInstance(valueObject.getOrdInvStatus().getID());
		}
		domainObject.setOrdInvStatus(value3);
		// create LookupInstance from vo LookupType
		ims.domain.lookups.LookupInstance value4 = null;
		if ( null != valueObject.getResultStatus() ) 
		{
			value4 =
				domainFactory.getLookupInstance(valueObject.getResultStatus().getID());
		}
		domainObject.setResultStatus(value4);
		ims.framework.utils.DateTime dateTime5 = valueObject.getHistoryDateTime();
		java.util.Date value5 = null;
		if ( dateTime5 != null ) 
		{
			value5 = dateTime5.getJavaDate();
		}
		domainObject.setHistoryDateTime(value5);
	// SaveAsRefVO - treated as a refVo in extract methods
	ims.ocrr.orderingresults.domain.objects.ResultDetails value6 = null;
		if ( null != valueObject.getResultDetail() ) 
		{
			if (valueObject.getResultDetail().getBoId() == null)
			{
				if (domMap.get(valueObject.getResultDetail()) != null)
				{
					value6 = (ims.ocrr.orderingresults.domain.objects.ResultDetails)domMap.get(valueObject.getResultDetail());
				}
			}
			else
			{
				value6 = (ims.ocrr.orderingresults.domain.objects.ResultDetails)domainFactory.getDomainObject(ims.ocrr.orderingresults.domain.objects.ResultDetails.class, valueObject.getResultDetail().getBoId());
			}
		}
		domainObject.setResultDetail(value6);

		return domainObject;
	}

}
