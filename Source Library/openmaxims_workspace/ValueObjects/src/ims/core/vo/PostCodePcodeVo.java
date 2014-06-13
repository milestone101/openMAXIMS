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

package ims.core.vo;

/**
 * Linked to core.configuration.PCODE business object (ID: 1028100068).
 */
public class PostCodePcodeVo extends ims.core.configuration.vo.PCODERefVo implements ims.vo.ImsCloneable, Comparable
{
	private static final long serialVersionUID = 1L;

	public PostCodePcodeVo()
	{
	}
	public PostCodePcodeVo(Integer id, int version)
	{
		super(id, version);
	}
	public PostCodePcodeVo(ims.core.vo.beans.PostCodePcodeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.postcode = bean.getPostCode();
		this.harcode = bean.getHarCode();
		this.pcorcode = bean.getPcorCode();
	}
	public void populate(ims.vo.ValueObjectBeanMap map, ims.core.vo.beans.PostCodePcodeVoBean bean)
	{
		this.id = bean.getId();
		this.version = bean.getVersion();
		this.postcode = bean.getPostCode();
		this.harcode = bean.getHarCode();
		this.pcorcode = bean.getPcorCode();
	}
	public ims.vo.ValueObjectBean getBean()
	{
		return this.getBean(new ims.vo.ValueObjectBeanMap());
	}
	public ims.vo.ValueObjectBean getBean(ims.vo.ValueObjectBeanMap map)
	{
		ims.core.vo.beans.PostCodePcodeVoBean bean = null;
		if(map != null)
			bean = (ims.core.vo.beans.PostCodePcodeVoBean)map.getValueObjectBean(this);
		if (bean == null)
		{
			bean = new ims.core.vo.beans.PostCodePcodeVoBean();
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
		if(fieldName.equals("POSTCODE"))
			return getPostCode();
		if(fieldName.equals("HARCODE"))
			return getHarCode();
		if(fieldName.equals("PCORCODE"))
			return getPcorCode();
		return super.getFieldValueByFieldName(fieldName);
	}
	public boolean getPostCodeIsNotNull()
	{
		return this.postcode != null;
	}
	public String getPostCode()
	{
		return this.postcode;
	}
	public static int getPostCodeMaxLength()
	{
		return 8;
	}
	public void setPostCode(String value)
	{
		this.isValidated = false;
		this.postcode = value;
	}
	public boolean getHarCodeIsNotNull()
	{
		return this.harcode != null;
	}
	public String getHarCode()
	{
		return this.harcode;
	}
	public static int getHarCodeMaxLength()
	{
		return 3;
	}
	public void setHarCode(String value)
	{
		this.isValidated = false;
		this.harcode = value;
	}
	public boolean getPcorCodeIsNotNull()
	{
		return this.pcorcode != null;
	}
	public String getPcorCode()
	{
		return this.pcorcode;
	}
	public static int getPcorCodeMaxLength()
	{
		return 3;
	}
	public void setPcorCode(String value)
	{
		this.isValidated = false;
		this.pcorcode = value;
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
		if(this.postcode != null)
			if(this.postcode.length() > 8)
				listOfErrors.add("The length of the field [postcode] in the value object [ims.core.vo.PostCodePcodeVo] is too big. It should be less or equal to 8");
		if(this.harcode != null)
			if(this.harcode.length() > 3)
				listOfErrors.add("The length of the field [harcode] in the value object [ims.core.vo.PostCodePcodeVo] is too big. It should be less or equal to 3");
		if(this.pcorcode != null)
			if(this.pcorcode.length() > 3)
				listOfErrors.add("The length of the field [pcorcode] in the value object [ims.core.vo.PostCodePcodeVo] is too big. It should be less or equal to 3");
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
	
		PostCodePcodeVo clone = new PostCodePcodeVo(this.id, this.version);
		
		clone.postcode = this.postcode;
		clone.harcode = this.harcode;
		clone.pcorcode = this.pcorcode;
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
		if (!(PostCodePcodeVo.class.isAssignableFrom(obj.getClass())))
		{
			throw new ClassCastException("A PostCodePcodeVo object cannot be compared an Object of type " + obj.getClass().getName());
		}
		if (this.id == null)
			return 1;
		if (((PostCodePcodeVo)obj).getBoId() == null)
			return -1;
		return this.id.compareTo(((PostCodePcodeVo)obj).getBoId());
	}
	public synchronized static int generateValueObjectUniqueID()
	{
		return ims.vo.ValueObject.generateUniqueID();
	}
	public int countFieldsWithValue()
	{
		int count = 0;
		if(this.postcode != null)
			count++;
		if(this.harcode != null)
			count++;
		if(this.pcorcode != null)
			count++;
		return count;
	}
	public int countValueObjectFields()
	{
		return 3;
	}
	protected String postcode;
	protected String harcode;
	protected String pcorcode;
	private boolean isValidated = false;
	private boolean isBusy = false;
}