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

package ims.therapies.forms.workonadmission;

public abstract class BaseLogic extends Handlers
{
	public final Class getDomainInterface() throws ClassNotFoundException
	{
		return ims.therapies.domain.WorkOnAdmission.class;
	}
	public final void setContext(ims.framework.UIEngine engine, GenForm form, ims.therapies.domain.WorkOnAdmission domain)
	{
		setContext(engine, form);
		this.domain = domain;
	}
	protected final void oncmbDEAReferralValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbDEAReferral().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbDEAReferralLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbDEAReferralLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbDEAReferral().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbDEAReferralLookup()
	{
		this.form.cmbDEAReferral().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbDEAReferral().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbDEAReferralLookupValue(int id)
	{
		ims.core.vo.lookups.YesNoUnknown instance = ims.core.vo.lookups.LookupHelper.getYesNoUnknownInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbDEAReferral().setValue(instance);
	}
	protected final void defaultcmbDEAReferralLookupValue()
	{
		this.form.cmbDEAReferral().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected final void oncmbWorkAssessmentValueSet(Object value)
	{
		java.util.ArrayList listOfValues = this.form.cmbWorkAssessment().getValues();

		if(value == null)
		{
			if(listOfValues != null && listOfValues.size() > 0)
			{
				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(!existingInstance.isActive())
					{
						bindcmbWorkAssessmentLookup();
						return;
					}
				}
			}
		}
		else if(value instanceof ims.core.vo.lookups.YesNoUnknown)
		{
			ims.core.vo.lookups.YesNoUnknown instance = (ims.core.vo.lookups.YesNoUnknown)value;

			if(listOfValues != null)
			{
				if(listOfValues.size() == 0)
					bindcmbWorkAssessmentLookup();

				for(int x = 0; x < listOfValues.size(); x++)
				{
					ims.core.vo.lookups.YesNoUnknown existingInstance = (ims.core.vo.lookups.YesNoUnknown)listOfValues.get(x);
					if(existingInstance.equals(instance))
						return;
				}
			}

			this.form.cmbWorkAssessment().newRow(instance, instance.getText(), instance.getImage(), instance.getTextColor());
		}
	}
	protected final void bindcmbWorkAssessmentLookup()
	{
		this.form.cmbWorkAssessment().clear();
		ims.core.vo.lookups.YesNoUnknownCollection lookupCollection = ims.core.vo.lookups.LookupHelper.getYesNoUnknown(this.domain.getLookupService());
		for(int x = 0; x < lookupCollection.size(); x++)
		{
			this.form.cmbWorkAssessment().newRow(lookupCollection.get(x), lookupCollection.get(x).getText(), lookupCollection.get(x).getImage(), lookupCollection.get(x).getTextColor());
		}
	}
	protected final void setcmbWorkAssessmentLookupValue(int id)
	{
		ims.core.vo.lookups.YesNoUnknown instance = ims.core.vo.lookups.LookupHelper.getYesNoUnknownInstance(this.domain.getLookupService(), id);
		if(instance != null)
			this.form.cmbWorkAssessment().setValue(instance);
	}
	protected final void defaultcmbWorkAssessmentLookupValue()
	{
		this.form.cmbWorkAssessment().setValue((ims.core.vo.lookups.YesNoUnknown)domain.getLookupService().getDefaultInstance(ims.core.vo.lookups.YesNoUnknown.class, engine.getFormName().getID(), ims.core.vo.lookups.YesNoUnknown.TYPE_ID));
	}
	protected void clearScreen()
	{
		this.form.dtimAuthoring().setValue(null);
		this.form.qmbAuthoringCP().setValue(null);
		this.form.txtPresentWork().setValue("");
		this.form.txtPastWork().setValue("");
		this.form.txtBenefitAdvice().setValue("");
		this.form.txtDEAReferralComment().setValue("");
		this.form.cmbDEAReferral().setValue(null);
		this.form.txtEmployerPhone().setValue("");
		this.form.txtEmployerAddress().setValue("");
		this.form.txtWorkAssessmentComment().setValue("");
		this.form.txtEmployerName().setValue("");
		this.form.cmbWorkAssessment().setValue(null);
	}
	protected void populateScreenFromData(ims.therapies.vo.WorkOnAdmissionVo value)
	{
		clearScreen();
		if(value == null)
			return;

		this.form.dtimAuthoring().setValue(value.getAuthoringDateTimeIsNotNull() ? value.getAuthoringDateTime() : null);
		this.form.qmbAuthoringCP().setValue(value.getAuthoringCPIsNotNull() ? value.getAuthoringCP() : null);
		this.form.txtPresentWork().setValue(value.getPresentCareerIsNotNull() ? value.getPresentCareer(): null);
		this.form.txtPastWork().setValue(value.getPastQualificationsIsNotNull() ? value.getPastQualifications(): null);
		this.form.txtBenefitAdvice().setValue(value.getBenefitAdviceIsNotNull() ? value.getBenefitAdvice(): null);
		this.form.txtDEAReferralComment().setValue(value.getDEACommentIsNotNull() ? value.getDEAComment(): null);
		this.form.cmbDEAReferral().setValue(value.getReferDEAIsNotNull() ? value.getReferDEA() : null);
		this.form.txtEmployerPhone().setValue(value.getEmployerPhoneIsNotNull() ? value.getEmployerPhone(): null);
		this.form.txtEmployerAddress().setValue(value.getEmployerAddressIsNotNull() ? value.getEmployerAddress(): null);
		this.form.txtWorkAssessmentComment().setValue(value.getWorkSiteAssessCommentIsNotNull() ? value.getWorkSiteAssessComment(): null);
		this.form.txtEmployerName().setValue(value.getEmployerNameIsNotNull() ? value.getEmployerName(): null);
		this.form.cmbWorkAssessment().setValue(value.getWorkSiteAssessmentIsNotNull() ? value.getWorkSiteAssessment() : null);
	}
	protected ims.therapies.vo.WorkOnAdmissionVo populateDataFromScreen(ims.therapies.vo.WorkOnAdmissionVo value)
	{
		if(value == null)
			value = new ims.therapies.vo.WorkOnAdmissionVo();

		value.setAuthoringDateTime(this.form.dtimAuthoring().getValue());
		value.setAuthoringCP(this.form.qmbAuthoringCP().getValue());
		value.setPresentCareer(this.form.txtPresentWork().getValue());
		value.setPastQualifications(this.form.txtPastWork().getValue());
		value.setBenefitAdvice(this.form.txtBenefitAdvice().getValue());
		value.setDEAComment(this.form.txtDEAReferralComment().getValue());
		value.setReferDEA(this.form.cmbDEAReferral().getValue());
		value.setEmployerPhone(this.form.txtEmployerPhone().getValue());
		value.setEmployerAddress(this.form.txtEmployerAddress().getValue());
		value.setWorkSiteAssessComment(this.form.txtWorkAssessmentComment().getValue());
		value.setEmployerName(this.form.txtEmployerName().getValue());
		value.setWorkSiteAssessment(this.form.cmbWorkAssessment().getValue());

		return value;
	}
	protected ims.therapies.vo.WorkOnAdmissionVo populateDataFromScreen()
	{
		return populateDataFromScreen(new ims.therapies.vo.WorkOnAdmissionVo());
	}
	public final void free()
	{
		super.free();
		domain = null;
	}
	
	protected ims.therapies.domain.WorkOnAdmission domain;
}