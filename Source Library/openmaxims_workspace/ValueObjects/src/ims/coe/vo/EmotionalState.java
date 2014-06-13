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
// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.coe.vo;

/**
 * Linked to coe.assessment.Emotional State Assessment business object (ID: 1012100024).
 */
public class EmotionalState extends ims.coe.assessment.vo.EmotionalStateAssessmentRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public EmotionalState()
	{
	}
	public EmotionalState(Integer id, int version)
	{
		super(id, version);
	}
	public EmotionalState(ims.coe.vo.beans.EmotionalStateBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.assessment = bean.getAssessment() == null ? null : ims.coe.vo.lookups.EmotionalStateAssessment.buildLookup(bean.getAssessment());
		this.select = bean.getSelect() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getSelect());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.coe.vo.beans.EmotionalStateBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.assessment = bean.getAssessment() == null ? null : ims.coe.vo.lookups.EmotionalStateAssessment.buildLookup(bean.getAssessment());
		this.select = bean.getSelect() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getSelect());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.coe.vo.beans.EmotionalStateBean bean = null;
		if(map != null)
			bean = (ims.coe.vo.beans.EmotionalStateBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.coe.vo.beans.EmotionalStateBean();
			map.addValueObjectBean(this, bean);
			bean.populate(map, this);
		}
		return bean;
	}
	public Object getFieldValueByFieldName(String fieldName)
	{
		if(fieldName == null)
			throw new ims.framework.exceptions.CodingRuntimeException("Invalid field name");
		fieldName = fieldName.toUpperCase();
		if(fieldName.equals("ASSESSMENT"))
			return getAssessment();
		if(fieldName.equals("SELECT"))
			return getSelect();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getAssessmentIsNotNull()
	{
		return this.assessment != null;
	}
	public ims.coe.vo.lookups.EmotionalStateAssessment getAssessment()
	{
		return this.assessment;
	}
	public void setAssessment(ims.coe.vo.lookups.EmotionalStateAssessment value)
	{
		this.isValidated = false;
		this.assessment = value;
	}
	public boolean getSelectIsNotNull()
	{
		return this.select != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getSelect()
	{
		return this.select;
	}
	public void setSelect(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.select = value;
	}
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append(this.id);
		return sb.toString();
	}
	public boolean isValidated()
	{
		if(this.isBusy)
			return true;
		this.isBusy = true;
	
		if(!this.isValidated)
		{
			this.isBusy = false;
			return false;
		}
		this.isBusy = false;
		return true;
	}
	public String[] validate()
	{
		return validate(null);
	}
	public String[] validate(String[] existingErrors)
	{
		if(this.isBusy)
			return null;
		this.isBusy = true;
	
		java.util.ArrayList<String> listOfErrors = new java.util.ArrayList<String>();
		if(existingErrors != null)
		{
			for(int x = 0; x < existingErrors.length; x++)
			{
				listOfErrors.add(existingErrors[x]);
			}
		}
		int errorCount = listOfErrors.size();
		if(errorCount == 0)
		{
			this.isBusy = false;
			this.isValidated = true;
			return null;
		}
		String[] result = new String[errorCount];
		for(int x = 0; x < errorCount; x++)
			result[x] = (String)listOfErrors.get(x);
		this.isBusy = false;
		this.isValidated = false;
		return result;
	}
	public void clearIDAndVersion()
	{
		this.id = null;
		this.version = 0;
	}
	public Object clone()
	{
		if(this.isBusy)
			return this;
		this.isBusy = true;
	
		EmotionalState clone = new EmotionalState(this.id, this.version);
		
		if(this.assessment == null)
			clone.assessment = null;
		else
			clone.assessment = (ims.coe.vo.lookups.EmotionalStateAssessment)this.assessment.clone();
		if(this.select == null)
			clone.select = null;
		else
			clone.select = (ims.core.vo.lookups.YesNoUnknown)this.select.clone();
		clone.isValidated = this.isValidated;
		
		this.isBusy = false;
		return clone;
	}
	public int compareTo(Object obj)
	{
		return compareTo(obj, true);
	}
	public int compareTo(Object obj, boolean caseInsensitive)
	{
		if (obj == null)
		{
			return -1;
		}
		if(caseInsensitive); // this is to avoid eclipse warning only.
		if (!(EmotionalState.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A EmotionalState object cannot be compared an Object of type " + obj.getClass().getName());
		}
		EmotionalState compareObj = (EmotionalState)obj;
		int retVal = 0;
		if (retVal == 0)
		{
			if(this.getID_EmotionalStateAssessment() == null && compareObj.getID_EmotionalStateAssessment() != null)
				return -1;
			if(this.getID_EmotionalStateAssessment() != null && compareObj.getID_EmotionalStateAssessment() == null)
				return 1;
			if(this.getID_EmotionalStateAssessment() != null && compareObj.getID_EmotionalStateAssessment() != null)
				retVal = this.getID_EmotionalStateAssessment().compareTo(compareObj.getID_EmotionalStateAssessment());
		}
		return retVal;
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.assessment != null)
			count++;
		if(this.select != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 2;
	}
	protected ims.coe.vo.lookups.EmotionalStateAssessment assessment;
	protected ims.core.vo.lookups.YesNoUnknown select;
	private boolean isValidated = false;
	private boolean isBusy = false;
}