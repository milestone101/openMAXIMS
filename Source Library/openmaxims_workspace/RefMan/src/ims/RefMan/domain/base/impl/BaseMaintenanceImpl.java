// This code was generated by Barbara Worwood using IMS Development Environment (version 1.80 build 5007.25751)
// Copyright (C) 1995-2014 IMS MAXIMS. All rights reserved.
// WARNING: DO NOT MODIFY the content of this file

package ims.RefMan.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseMaintenanceImpl extends DomainImpl implements ims.RefMan.domain.Maintenance, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistProfileLiteByService(ims.core.clinical.vo.ServiceRefVo service)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistSessionSlots(ims.core.clinical.vo.ServiceRefVo service, ims.scheduling.vo.Sch_ProfileRefVo profile, ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo, Integer slotType)
	{
	}

	@SuppressWarnings("unused")
	public void validategetBookingPatient(ims.scheduling.vo.Booking_AppointmentVo appointment)
	{
	}

	@SuppressWarnings("unused")
	public void validatecancelSlot(ims.scheduling.vo.Session_SlotRefVo sessionSlot)
	{
	}

	@SuppressWarnings("unused")
	public void validatecancelAppt(ims.scheduling.vo.Booking_AppointmentVo appt)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveSlot(ims.scheduling.vo.SessionSlotVo slot)
	{
		if(slot == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'slot' of type 'ims.scheduling.vo.SessionSlotVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatelistSlotPolls(ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo)
	{
	}

	@SuppressWarnings("unused")
	public void validateresubmitSlotPoll(ims.choose_book.vo.ActionRequestRefVo request)
	{
		if(request == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'request' of type 'ims.choose_book.vo.ActionRequestRefVo' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validateresubmitPdsRequest(ims.choose_book.vo.PdsRequestRefVoCollection request)
	{
		if(request == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'request' of type 'ims.choose_book.vo.PdsRequestRefVoCollection' cannot be null.");
	}

	@SuppressWarnings("unused")
	public void validatelistPdsRequests(ims.framework.utils.Date dateFrom, ims.framework.utils.Date dateTo, Boolean failedRequestsOnly, String nhsn, ims.framework.utils.Date dateUpdatedFrom, ims.framework.utils.Date dateUpdatedTo)
	{
	}

	@SuppressWarnings("unused")
	public void validateconfirmAppt(ims.scheduling.vo.SessionSlotVo slot)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistSdsRequest(ims.framework.utils.Date dateFrom, ims.framework.utils.Date dteTo, ims.framework.utils.Date dateUpdatedFrom, ims.framework.utils.Date dateUpdatedTo)
	{
	}

	@SuppressWarnings("unused")
	public void validateresubmitSdsRequest(ims.choose_book.vo.SdsRequestRefVoCollection request)
	{
		if(request == null)
			throw new ims.domain.exceptions.DomainRuntimeException("The parameter 'request' of type 'ims.choose_book.vo.SdsRequestRefVoCollection' cannot be null.");
	}
}
