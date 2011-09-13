/**
 * Copyright (c) 2010-2009 The Sakai Foundation
 *
 * Licensed under the Educational Community License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *             http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.sakaiproject.bbb.impl.sql;

/**
 * HSQLDB Database implementation for Sakai BigBlueButton persistence.
 * @author Adrian Fish, Nuno Fernandes
 */
public class HypersonicGenerator extends DefaultSqlGenerator
{
	public HypersonicGenerator()
	{
		CHAR		= "CHAR";
		VARCHAR    	= "VARCHAR";
		TIMESTAMP  	= "TIMESTAMP";
		TEXT       	= "LONGVARCHAR";
		BOOL 		= "BOOLEAN";
		MEDIUMTEXT 	= "LONGVARCHAR";
	}
	
	public String getShowTableStatement(String table)
	{
		return "select TABLE_NAME from INFORMATION_SCHEMA.SYSTEM_TABLES where TABLE_NAME='" + table + "'";
	}
}
