/**
 *  Catroid: An on-device graphical programming language for Android devices
 *  Copyright (C) 2010  Catroid development team 
 *  (<http://code.google.com/p/catroid/wiki/Credits>)
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package at.tugraz.ist.catroid.xml;

/**
 * @author Samitha
 * 
 */
public enum SetterNames {

	ANDROIDVERSION("setAndroidVersion"), CATROIDVERSIONCODE("setCatroidVersionCode"), CATROIDVERSIONNAME(
			"setCatroidVersionName"), DEVICENAME("setDeviceName"), PROJECTNAME("setProjectName"), SCREENHEIGHT(
			"setVirtualScreenHeight"), SCREENWIDTH("setVirtualScreenWidth");

	private String setterName;

	SetterNames(String name) {
		setName(name);
	}

	/**
	 * @param givenName
	 * 
	 */
	public void setName(String givenName) {
		this.setterName = givenName;
	}

	/**
	 * @return the setterName
	 */
	public String getsetterName() {
		return setterName;
	}

}