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

package ims.scheduling.vo.beans;

public class TheatreProcedureLiteVoBean extends ims.vo.ValueObjectBean
{
	public TheatreProcedureLiteVoBean()
	{
	}
	public TheatreProcedureLiteVoBean(ims.scheduling.vo.TheatreProcedureLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.procedure = vo.getProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getProcedure().getBean();
		this.session = vo.getSession() == null ? null : (ims.scheduling.vo.beans.SessionTheatreVoBean)vo.getSession().getBean();
		this.islimited = vo.getIsLimited();
		this.numberofproceduresleft = vo.getNumberOfProceduresLeft();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.TheatreProcedureLiteVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.procedure = vo.getProcedure() == null ? null : (ims.core.vo.beans.ProcedureLiteVoBean)vo.getProcedure().getBean(map);
		this.session = vo.getSession() == null ? null : (ims.scheduling.vo.beans.SessionTheatreVoBean)vo.getSession().getBean(map);
		this.islimited = vo.getIsLimited();
		this.numberofproceduresleft = vo.getNumberOfProceduresLeft();
	}

	public ims.scheduling.vo.TheatreProcedureLiteVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.TheatreProcedureLiteVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.TheatreProcedureLiteVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.TheatreProcedureLiteVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.TheatreProcedureLiteVo();
			map.addValueObject(this, vo);
			vo.populate(map, this);
		}
		return vo;
	}

	public Integer getId()
	{
		return this.id;
	}
	public void setId(Integer value)
	{
		this.id = value;
	}
	public int getVersion()
	{
		return this.version;
	}
	public void setVersion(int value)
	{
		this.version = value;
	}
	public ims.core.vo.beans.ProcedureLiteVoBean getProcedure()
	{
		return this.procedure;
	}
	public void setProcedure(ims.core.vo.beans.ProcedureLiteVoBean value)
	{
		this.procedure = value;
	}
	public ims.scheduling.vo.beans.SessionTheatreVoBean getSession()
	{
		return this.session;
	}
	public void setSession(ims.scheduling.vo.beans.SessionTheatreVoBean value)
	{
		this.session = value;
	}
	public Boolean getIsLimited()
	{
		return this.islimited;
	}
	public void setIsLimited(Boolean value)
	{
		this.islimited = value;
	}
	public Integer getNumberOfProceduresLeft()
	{
		return this.numberofproceduresleft;
	}
	public void setNumberOfProceduresLeft(Integer value)
	{
		this.numberofproceduresleft = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.ProcedureLiteVoBean procedure;
	private ims.scheduling.vo.beans.SessionTheatreVoBean session;
	private Boolean islimited;
	private Integer numberofproceduresleft;
}
