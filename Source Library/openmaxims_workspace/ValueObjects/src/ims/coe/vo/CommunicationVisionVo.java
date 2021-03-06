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
 * Linked to coe.assessment.Communication Vision business object (ID: 1012100016).
 */
public class CommunicationVisionVo extends ims.coe.assessment.vo.CommunicationVisionRefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public CommunicationVisionVo()
	{
	}
	public CommunicationVisionVo(Integer id, int version)
	{
		super(id, version);
	}
	public CommunicationVisionVo(ims.coe.vo.beans.CommunicationVisionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.visualimpairment = bean.getVisualImpairment() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getVisualImpairment());
		this.effectedeyes = bean.getEffectedEyes() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getEffectedEyes());
		this.wearglasses = bean.getWearGlasses() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getWearGlasses());
		this.numberofglasses = bean.getNumberOfGlasses();
		this.wearlenses = bean.getWearLenses() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getWearLenses());
		this.other = bean.getOther();
		this.yearlasteyetest = bean.getYearLastEyeTest();
		this.registeredblind = bean.getRegisteredBlind() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getRegisteredBlind());
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.coe.vo.beans.CommunicationVisionVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.visualimpairment = bean.getVisualImpairment() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getVisualImpairment());
		this.effectedeyes = bean.getEffectedEyes() == null ? null : ims.core.vo.lookups.LateralityLRB.buildLookup(bean.getEffectedEyes());
		this.wearglasses = bean.getWearGlasses() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getWearGlasses());
		this.numberofglasses = bean.getNumberOfGlasses();
		this.wearlenses = bean.getWearLenses() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getWearLenses());
		this.other = bean.getOther();
		this.yearlasteyetest = bean.getYearLastEyeTest();
		this.registeredblind = bean.getRegisteredBlind() == null ? null : ims.core.vo.lookups.YesNoUnknown.buildLookup(bean.getRegisteredBlind());
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.coe.vo.beans.CommunicationVisionVoBean bean = null;
		if(map != null)
			bean = (ims.coe.vo.beans.CommunicationVisionVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.coe.vo.beans.CommunicationVisionVoBean();
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
		if(fieldName.equals("VISUALIMPAIRMENT"))
			return getVisualImpairment();
		if(fieldName.equals("EFFECTEDEYES"))
			return getEffectedEyes();
		if(fieldName.equals("WEARGLASSES"))
			return getWearGlasses();
		if(fieldName.equals("NUMBEROFGLASSES"))
			return getNumberOfGlasses();
		if(fieldName.equals("WEARLENSES"))
			return getWearLenses();
		if(fieldName.equals("OTHER"))
			return getOther();
		if(fieldName.equals("YEARLASTEYETEST"))
			return getYearLastEyeTest();
		if(fieldName.equals("REGISTEREDBLIND"))
			return getRegisteredBlind();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getVisualImpairmentIsNotNull()
	{
		return this.visualimpairment != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getVisualImpairment()
	{
		return this.visualimpairment;
	}
	public void setVisualImpairment(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.visualimpairment = value;
	}
	public boolean getEffectedEyesIsNotNull()
	{
		return this.effectedeyes != null;
	}
	public ims.core.vo.lookups.LateralityLRB getEffectedEyes()
	{
		return this.effectedeyes;
	}
	public void setEffectedEyes(ims.core.vo.lookups.LateralityLRB value)
	{
		this.isValidated = false;
		this.effectedeyes = value;
	}
	public boolean getWearGlassesIsNotNull()
	{
		return this.wearglasses != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getWearGlasses()
	{
		return this.wearglasses;
	}
	public void setWearGlasses(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.wearglasses = value;
	}
	public boolean getNumberOfGlassesIsNotNull()
	{
		return this.numberofglasses != null;
	}
	public Integer getNumberOfGlasses()
	{
		return this.numberofglasses;
	}
	public void setNumberOfGlasses(Integer value)
	{
		this.isValidated = false;
		this.numberofglasses = value;
	}
	public boolean getWearLensesIsNotNull()
	{
		return this.wearlenses != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getWearLenses()
	{
		return this.wearlenses;
	}
	public void setWearLenses(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.wearlenses = value;
	}
	public boolean getOtherIsNotNull()
	{
		return this.other != null;
	}
	public String getOther()
	{
		return this.other;
	}
	public static int getOtherMaxLength()
	{
		return 255;
	}
	public void setOther(String value)
	{
		this.isValidated = false;
		this.other = value;
	}
	public boolean getYearLastEyeTestIsNotNull()
	{
		return this.yearlasteyetest != null;
	}
	public Integer getYearLastEyeTest()
	{
		return this.yearlasteyetest;
	}
	public void setYearLastEyeTest(Integer value)
	{
		this.isValidated = false;
		this.yearlasteyetest = value;
	}
	public boolean getRegisteredBlindIsNotNull()
	{
		return this.registeredblind != null;
	}
	public ims.core.vo.lookups.YesNoUnknown getRegisteredBlind()
	{
		return this.registeredblind;
	}
	public void setRegisteredBlind(ims.core.vo.lookups.YesNoUnknown value)
	{
		this.isValidated = false;
		this.registeredblind = value;
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
	
		CommunicationVisionVo clone = new CommunicationVisionVo(this.id, this.version);
		
		if(this.visualimpairment == null)
			clone.visualimpairment = null;
		else
			clone.visualimpairment = (ims.core.vo.lookups.YesNoUnknown)this.visualimpairment.clone();
		if(this.effectedeyes == null)
			clone.effectedeyes = null;
		else
			clone.effectedeyes = (ims.core.vo.lookups.LateralityLRB)this.effectedeyes.clone();
		if(this.wearglasses == null)
			clone.wearglasses = null;
		else
			clone.wearglasses = (ims.core.vo.lookups.YesNoUnknown)this.wearglasses.clone();
		clone.numberofglasses = this.numberofglasses;
		if(this.wearlenses == null)
			clone.wearlenses = null;
		else
			clone.wearlenses = (ims.core.vo.lookups.YesNoUnknown)this.wearlenses.clone();
		clone.other = this.other;
		clone.yearlasteyetest = this.yearlasteyetest;
		if(this.registeredblind == null)
			clone.registeredblind = null;
		else
			clone.registeredblind = (ims.core.vo.lookups.YesNoUnknown)this.registeredblind.clone();
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
		if (!(CommunicationVisionVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A CommunicationVisionVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((CommunicationVisionVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((CommunicationVisionVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.visualimpairment != null)
			count++;
		if(this.effectedeyes != null)
			count++;
		if(this.wearglasses != null)
			count++;
		if(this.numberofglasses != null)
			count++;
		if(this.wearlenses != null)
			count++;
		if(this.other != null)
			count++;
		if(this.yearlasteyetest != null)
			count++;
		if(this.registeredblind != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 8;
	}
	protected ims.core.vo.lookups.YesNoUnknown visualimpairment;
	protected ims.core.vo.lookups.LateralityLRB effectedeyes;
	protected ims.core.vo.lookups.YesNoUnknown wearglasses;
	protected Integer numberofglasses;
	protected ims.core.vo.lookups.YesNoUnknown wearlenses;
	protected String other;
	protected Integer yearlasteyetest;
	protected ims.core.vo.lookups.YesNoUnknown registeredblind;
	private boolean isValidated = false;
	private boolean isBusy = false;
}
