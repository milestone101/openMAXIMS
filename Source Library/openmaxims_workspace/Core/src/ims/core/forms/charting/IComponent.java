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

package ims.core.forms.charting;

import ims.framework.enumerations.FormMode;

public interface IComponent
{
	public void setMode(FormMode mode);
	public FormMode getMode();
	/**
	* Sets the value
	*/
	public void setValue(ims.vo.interfaces.IChartValueSet value);

	public void switchToGraphicalView();

	public void switchToTabularView();

	public void selectGroups();

	public Boolean canSelectGroups();

	public void readOnlyDynGrid(Boolean enable);

	public void setOrder(ims.framework.enumerations.SortOrder order);

	/**
	* Gets the custom event.
	*/
	public ims.core.vo.enums.ChartingEvents getCustomEvent();

	public void clearCustomEvent();

	public void initialize(Boolean usedInDialog);
}
