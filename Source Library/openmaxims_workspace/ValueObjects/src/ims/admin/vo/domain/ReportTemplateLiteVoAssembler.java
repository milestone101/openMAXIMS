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
package ims.admin.vo.domain;

import ims.vo.domain.DomainObjectMap;
import java.util.HashMap;

import org.hibernate.proxy.HibernateProxy;

/**
 * @author Alexie Ursache
 */
public class ReportTemplateLiteVoAssembler
{
  	/**
	 * Copy one ValueObject to another
	 * @param valueObjectDest to be updated
	 * @param valueObjectSrc to copy values from
	 */
	 public static ims.admin.vo.ReportTemplateLiteVo copy(ims.admin.vo.ReportTemplateLiteVo valueObjectDest, ims.admin.vo.ReportTemplateLiteVo valueObjectSrc) 
	 {
	 	if (null == valueObjectSrc) 
		{
			return valueObjectSrc;
		}
		valueObjectDest.setID_TemplateBo(valueObjectSrc.getID_TemplateBo());
	    valueObjectDest.setIsRIE(valueObjectSrc.getIsRIE());
		// name
		valueObjectDest.setName(valueObjectSrc.getName());
		// description
		valueObjectDest.setDescription(valueObjectSrc.getDescription());
		// isActive
		valueObjectDest.setIsActive(valueObjectSrc.getIsActive());
		// report
		valueObjectDest.setReport(valueObjectSrc.getReport());
	 	return valueObjectDest;
	 }

 
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * This is a convenience method only.
	 * It is intended to be used when one called to an Assembler is made.
 	 * If more than one call to an Assembler is made then #createReportTemplateLiteVoCollectionFromTemplateBo(DomainObjectMap, Set) should be used.
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TemplateBo objects.
	 */
	public static ims.admin.vo.ReportTemplateLiteVoCollection createReportTemplateLiteVoCollectionFromTemplateBo(java.util.Set domainObjectSet)	
	{
		return createReportTemplateLiteVoCollectionFromTemplateBo(new DomainObjectMap(), domainObjectSet);
	}
	
	/**
	 * Create the ValueObject collection to hold the set of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectSet - Set of ims.core.admin.domain.objects.TemplateBo objects.
	 */
	public static ims.admin.vo.ReportTemplateLiteVoCollection createReportTemplateLiteVoCollectionFromTemplateBo(DomainObjectMap map, java.util.Set domainObjectSet)	
	{
		ims.admin.vo.ReportTemplateLiteVoCollection voList = new ims.admin.vo.ReportTemplateLiteVoCollection();
		if ( null == domainObjectSet ) 
		{
			return voList;
		}
		int rieCount=0;
		int activeCount=0;
		java.util.Iterator iterator = domainObjectSet.iterator();
		while( iterator.hasNext() ) 
		{
			ims.core.admin.domain.objects.TemplateBo domainObject = (ims.core.admin.domain.objects.TemplateBo) iterator.next();
			ims.admin.vo.ReportTemplateLiteVo vo = create(map, domainObject);
			
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
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TemplateBo objects.
	 */
	public static ims.admin.vo.ReportTemplateLiteVoCollection createReportTemplateLiteVoCollectionFromTemplateBo(java.util.List domainObjectList) 
	{
		return createReportTemplateLiteVoCollectionFromTemplateBo(new DomainObjectMap(), domainObjectList);
	}
	
	/**
	 * Create the ValueObject collection to hold the list of DomainObjects.
	 * @param map - maps DomainObjects to created ValueObjects
	 * @param domainObjectList - List of ims.core.admin.domain.objects.TemplateBo objects.
	 */
	public static ims.admin.vo.ReportTemplateLiteVoCollection createReportTemplateLiteVoCollectionFromTemplateBo(DomainObjectMap map, java.util.List domainObjectList) 
	{
		ims.admin.vo.ReportTemplateLiteVoCollection voList = new ims.admin.vo.ReportTemplateLiteVoCollection();
		if ( null == domainObjectList ) 
		{
			return voList;
		}		
		int rieCount=0;
		int activeCount=0;
		for (int i = 0; i < domainObjectList.size(); i++)
		{
			ims.core.admin.domain.objects.TemplateBo domainObject = (ims.core.admin.domain.objects.TemplateBo) domainObjectList.get(i);
			ims.admin.vo.ReportTemplateLiteVo vo = create(map, domainObject);

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
	 * Create the ims.core.admin.domain.objects.TemplateBo set from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.Set extractTemplateBoSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportTemplateLiteVoCollection voCollection) 
	 {
	 	return extractTemplateBoSet(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.Set extractTemplateBoSet(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportTemplateLiteVoCollection voCollection, java.util.Set domainObjectSet, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectSet == null)
		{
			domainObjectSet = new java.util.HashSet();			
		}
		java.util.Set newSet = new java.util.HashSet();
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ReportTemplateLiteVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TemplateBo domainObject = ReportTemplateLiteVoAssembler.extractTemplateBo(domainFactory, vo, domMap);

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
	 * Create the ims.core.admin.domain.objects.TemplateBo list from the value object collection.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param voCollection - the collection of value objects	 
	 */
	 public static java.util.List extractTemplateBoList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportTemplateLiteVoCollection voCollection) 
	 {
	 	return extractTemplateBoList(domainFactory, voCollection, null, new HashMap());
	 }
	 
	 public static java.util.List extractTemplateBoList(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportTemplateLiteVoCollection voCollection, java.util.List domainObjectList, HashMap domMap) 
	 {
	 	int size = (null == voCollection) ? 0 : voCollection.size();
		if (domainObjectList == null)
		{
			domainObjectList = new java.util.ArrayList();			
		}
		for(int i=0; i<size; i++) 
		{
			ims.admin.vo.ReportTemplateLiteVo vo = voCollection.get(i);
			ims.core.admin.domain.objects.TemplateBo domainObject = ReportTemplateLiteVoAssembler.extractTemplateBo(domainFactory, vo, domMap);

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
	 * Create the ValueObject from the ims.core.admin.domain.objects.TemplateBo object.
	 * @param domainObject ims.core.admin.domain.objects.TemplateBo
	 */
	 public static ims.admin.vo.ReportTemplateLiteVo create(ims.core.admin.domain.objects.TemplateBo domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return null;
		}
		DomainObjectMap map = new DomainObjectMap();
		return create(map, domainObject);
	 }
	 
	 /**
	  * Create the ValueObject from the ims.core.admin.domain.objects.TemplateBo object.
	  * @param map DomainObjectMap of DomainObjects to already created ValueObjects.
	  * @param domainObject
	  */
	  public static ims.admin.vo.ReportTemplateLiteVo create(DomainObjectMap map, ims.core.admin.domain.objects.TemplateBo domainObject) 
	  {
	  		if (null == domainObject) 
	  		{
				return null;
			}
			// check if the domainObject already has a valueObject created for it
			ims.admin.vo.ReportTemplateLiteVo valueObject = (ims.admin.vo.ReportTemplateLiteVo) map.getValueObject(domainObject, ims.admin.vo.ReportTemplateLiteVo.class);
			if ( null == valueObject ) 
			{
				valueObject = new ims.admin.vo.ReportTemplateLiteVo(domainObject.getId(), domainObject.getVersion());
				map.addValueObject(domainObject, valueObject);

				valueObject = insert(map, valueObject, domainObject);
				
			}
	 		return valueObject;
	  }

	/**
	 * Update the ValueObject with the Domain Object.
	 * @param valueObject to be updated
	 * @param domainObject ims.core.admin.domain.objects.TemplateBo
	 */
	 public static ims.admin.vo.ReportTemplateLiteVo insert(ims.admin.vo.ReportTemplateLiteVo valueObject, ims.core.admin.domain.objects.TemplateBo domainObject) 
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
	 * @param domainObject ims.core.admin.domain.objects.TemplateBo
	 */
	 public static ims.admin.vo.ReportTemplateLiteVo insert(DomainObjectMap map, ims.admin.vo.ReportTemplateLiteVo valueObject, ims.core.admin.domain.objects.TemplateBo domainObject) 
	 {
	 	if (null == domainObject) 
	 	{
			return valueObject;
		}
	 	if (null == map) 
	 	{
			map = new DomainObjectMap();
		}

		valueObject.setID_TemplateBo(domainObject.getId());
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
			
		// name
		valueObject.setName(domainObject.getName());
		// description
		valueObject.setDescription(domainObject.getDescription());
		// isActive
		valueObject.setIsActive( domainObject.isIsActive() );
		// report
		if (domainObject.getReport() != null)
		{
			if(domainObject.getReport() instanceof HibernateProxy) // If the proxy is set, there is no need to lazy load, the proxy knows the id already. 
			{
				HibernateProxy p = (HibernateProxy) domainObject.getReport();
				int id = Integer.parseInt(p.getHibernateLazyInitializer().getIdentifier().toString());				
				valueObject.setReport(new ims.core.admin.vo.ReportBoRefVo(id, -1));				
			}
			else
			{
				valueObject.setReport(new ims.core.admin.vo.ReportBoRefVo(domainObject.getReport().getId(), domainObject.getReport().getVersion()));
			}
		}
 		return valueObject;
	 }


	/**
	 * Create the domain object from the value object.
	 * @param domainFactory - used to create existing (persistent) domain objects.
	 * @param valueObject - extract the domain object fields from this.
	 */
	public static ims.core.admin.domain.objects.TemplateBo extractTemplateBo(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportTemplateLiteVo valueObject) 
	{
		return 	extractTemplateBo(domainFactory, valueObject, new HashMap());
	}

	public static ims.core.admin.domain.objects.TemplateBo extractTemplateBo(ims.domain.ILightweightDomainFactory domainFactory, ims.admin.vo.ReportTemplateLiteVo valueObject, HashMap domMap) 
	{
		if (null == valueObject) 
		{
			return null;
		}
		Integer id = valueObject.getID_TemplateBo();
		ims.core.admin.domain.objects.TemplateBo domainObject = null;
		if ( null == id) 
		{
			if (domMap.get(valueObject) != null)
			{
				return (ims.core.admin.domain.objects.TemplateBo)domMap.get(valueObject);
			}
			// ims.admin.vo.ReportTemplateLiteVo ID_TemplateBo field is unknown
			domainObject = new ims.core.admin.domain.objects.TemplateBo();
			domMap.put(valueObject, domainObject);
		}
		else 
		{
			String key = (valueObject.getClass().getName() + "__" + valueObject.getID_TemplateBo());
			if (domMap.get(key) != null)
			{
				return (ims.core.admin.domain.objects.TemplateBo)domMap.get(key);
			}
			domainObject = (ims.core.admin.domain.objects.TemplateBo) domainFactory.getDomainObject(ims.core.admin.domain.objects.TemplateBo.class, id );
			
			//TODO: Not sure how this should be handled. Effectively it must be a staleobject exception, but maybe should be handled as that further up.
			if (domainObject == null) 
				return null;

			domMap.put(key, domainObject);
		}
		domainObject.setVersion(valueObject.getVersion_TemplateBo());

		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getName() != null && valueObject.getName().equals(""))
		{
			valueObject.setName(null);
		}
		domainObject.setName(valueObject.getName());
		//This is to overcome a bug in both Sybase and Oracle which prevents them from storing an empty string correctly
		//Sybase stores it as a single space, Oracle stores it as NULL. This fix will make them consistent at least.
		if (valueObject.getDescription() != null && valueObject.getDescription().equals(""))
		{
			valueObject.setDescription(null);
		}
		domainObject.setDescription(valueObject.getDescription());
		domainObject.setIsActive(valueObject.getIsActive());
		ims.core.admin.domain.objects.ReportBo value4 = null;
		if ( null != valueObject.getReport() ) 
		{
			if (valueObject.getReport().getBoId() == null)
			{
				if (domMap.get(valueObject.getReport()) != null)
				{
					value4 = (ims.core.admin.domain.objects.ReportBo)domMap.get(valueObject.getReport());
				}
			}
			else if (valueObject.getBoVersion() == -1) // RefVo was not modified since obtained from the Assembler, no need to update the BO field
			{
				value4 = domainObject.getReport();	
			}
			else
			{
				value4 = (ims.core.admin.domain.objects.ReportBo)domainFactory.getDomainObject(ims.core.admin.domain.objects.ReportBo.class, valueObject.getReport().getBoId());
			}
		}
		domainObject.setReport(value4);

		return domainObject;
	}

}
