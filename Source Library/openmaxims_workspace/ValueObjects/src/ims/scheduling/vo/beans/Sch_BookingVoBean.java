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

public class Sch_BookingVoBean extends ims.vo.ValueObjectBean
{
	public Sch_BookingVoBean()
	{
	}
	public Sch_BookingVoBean(ims.scheduling.vo.Sch_BookingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean();
		this.bookingcomments = vo.getBookingComments();
		this.ubrn = vo.getUBRN();
		this.referrersdsid = vo.getReferrerSdsId();
		this.referrersdsroleid = vo.getReferrerSdsRoleId();
		this.referrersdsorgid = vo.getReferrerSdsOrgId();
		this.appointments = vo.getAppointments() == null ? null : vo.getAppointments().getBeanCollection();
		this.sessionslotdna = vo.getSessionSlotDNA() == null ? null : (ims.scheduling.vo.beans.SessionSlotVoBean)vo.getSessionSlotDNA().getBean();
	}

	public void populate(ims.vo.ValueObjectBeanMap map, ims.scheduling.vo.Sch_BookingVo vo)
	{
		this.id = vo.getBoId();
		this.version = vo.getBoVersion();
		this.patient = vo.getPatient() == null ? null : (ims.core.vo.beans.PatientShortBean)vo.getPatient().getBean(map);
		this.bookingcomments = vo.getBookingComments();
		this.ubrn = vo.getUBRN();
		this.referrersdsid = vo.getReferrerSdsId();
		this.referrersdsroleid = vo.getReferrerSdsRoleId();
		this.referrersdsorgid = vo.getReferrerSdsOrgId();
		this.appointments = vo.getAppointments() == null ? null : vo.getAppointments().getBeanCollection();
		this.sessionslotdna = vo.getSessionSlotDNA() == null ? null : (ims.scheduling.vo.beans.SessionSlotVoBean)vo.getSessionSlotDNA().getBean(map);
	}

	public ims.scheduling.vo.Sch_BookingVo buildVo()
	{
		return this.buildVo(new ims.vo.ValueObjectBeanMap());
	}

	public ims.scheduling.vo.Sch_BookingVo buildVo(ims.vo.ValueObjectBeanMap map)
	{
		ims.scheduling.vo.Sch_BookingVo vo = null;
		if(map != null)
			vo = (ims.scheduling.vo.Sch_BookingVo)map.getValueObject(this);
		if(vo == null)
		{
			vo = new ims.scheduling.vo.Sch_BookingVo();
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
	public ims.core.vo.beans.PatientShortBean getPatient()
	{
		return this.patient;
	}
	public void setPatient(ims.core.vo.beans.PatientShortBean value)
	{
		this.patient = value;
	}
	public String getBookingComments()
	{
		return this.bookingcomments;
	}
	public void setBookingComments(String value)
	{
		this.bookingcomments = value;
	}
	public String getUBRN()
	{
		return this.ubrn;
	}
	public void setUBRN(String value)
	{
		this.ubrn = value;
	}
	public String getReferrerSdsId()
	{
		return this.referrersdsid;
	}
	public void setReferrerSdsId(String value)
	{
		this.referrersdsid = value;
	}
	public String getReferrerSdsRoleId()
	{
		return this.referrersdsroleid;
	}
	public void setReferrerSdsRoleId(String value)
	{
		this.referrersdsroleid = value;
	}
	public String getReferrerSdsOrgId()
	{
		return this.referrersdsorgid;
	}
	public void setReferrerSdsOrgId(String value)
	{
		this.referrersdsorgid = value;
	}
	public ims.scheduling.vo.beans.Booking_AppointmentVoBean[] getAppointments()
	{
		return this.appointments;
	}
	public void setAppointments(ims.scheduling.vo.beans.Booking_AppointmentVoBean[] value)
	{
		this.appointments = value;
	}
	public ims.scheduling.vo.beans.SessionSlotVoBean getSessionSlotDNA()
	{
		return this.sessionslotdna;
	}
	public void setSessionSlotDNA(ims.scheduling.vo.beans.SessionSlotVoBean value)
	{
		this.sessionslotdna = value;
	}

	private Integer id;
	private int version;
	private ims.core.vo.beans.PatientShortBean patient;
	private String bookingcomments;
	private String ubrn;
	private String referrersdsid;
	private String referrersdsroleid;
	private String referrersdsorgid;
	private ims.scheduling.vo.beans.Booking_AppointmentVoBean[] appointments;
	private ims.scheduling.vo.beans.SessionSlotVoBean sessionslotdna;
}