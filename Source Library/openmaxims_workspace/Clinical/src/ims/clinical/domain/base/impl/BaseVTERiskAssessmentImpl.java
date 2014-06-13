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

package ims.clinical.domain.base.impl;

import ims.domain.impl.DomainImpl;

public abstract class BaseVTERiskAssessmentImpl extends DomainImpl implements ims.clinical.domain.VTERiskAssessment, ims.domain.impl.Transactional
{
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	public void validatelistVTERiskAssessments(ims.core.vo.PatientShort patient)
	{
	}

	@SuppressWarnings("unused")
	public void validategetVTERiskAssessment(ims.core.clinical.vo.VTERiskAssessmentRefVo vTERiskAssRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetVTERiskAssessmentShortVo(ims.core.clinical.vo.VTERiskAssessmentRefVo vTERiskRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveVTERiskAssess(ims.clinical.vo.VTERiskAssessmentVo vteRiskAssess, ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo inpatEpisodeVTEriskAsses, ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo discharge)
	{
	}

	@SuppressWarnings("unused")
	public void validategetInpatientEpisodes(ims.core.admin.pas.vo.PASEventRefVo pasRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validatelistVTERiskAssessByPasId(ims.core.admin.pas.vo.PASEventRefVo pasRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetInProgressVTERiskAsessment(ims.core.admin.pas.vo.PASEventRefVo pasEventRefVo)
	{
	}

	@SuppressWarnings("unused")
	public void validategetCareContextByPasEventId(ims.core.admin.pas.vo.PASEventRefVo pasEventRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveInpatientEpisode(ims.clinical.vo.InpatientEpisodeForVTERiskAsessmentVo inpatientEpisode)
	{
	}

	@SuppressWarnings("unused")
	public void validategetVTERiskAssessmentShortVo(ims.core.admin.pas.vo.InpatientEpisodeRefVo inpatEpRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetDischargeEpisode(ims.core.admin.pas.vo.PASEventRefVo pasEvent)
	{
	}

	@SuppressWarnings("unused")
	public void validategetVTERiskAssessmentShortByDischargeEpisode(ims.core.admin.pas.vo.DischargedEpisodeRefVo dischargeRef)
	{
	}

	@SuppressWarnings("unused")
	public void validatesaveDischargeEpisode(ims.core.vo.DischargedEpisodeForVTERiskAssessmentWorklistVo discharge)
	{
	}

	@SuppressWarnings("unused")
	public void validategetInProgressVTERiskAssessmentFromDischargeEpisode(ims.core.admin.pas.vo.PASEventRefVo pasEventRef)
	{
	}

	@SuppressWarnings("unused")
	public void validategetDischargedEpisodeForVTERiskAssessmentWorklistVo(ims.core.admin.pas.vo.DischargedEpisodeRefVo dischargeRef)
	{
	}
}