/*******************************************************************************
 * Copyright (c) 2014 hangum.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Lesser Public License v2.1
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/old-licenses/gpl-2.0.html
 * 
 * Contributors:
 *     hangum - initial API and implementation
 ******************************************************************************/
package com.hangum.tadpole.rdb.core.editors.main;

import java.util.Date;

import com.hangum.tadpole.ace.editor.core.define.EditorDefine;

/**
 * 에디터에서 사용자가 실행하려는 쿼리 정보를 정의합니다. 
 * 
 * @author hangum
 *
 */
public class RequestQuery {
	
	/** use query */
	private String sql = "";
	
	/** Execute start time */
	private Date startDateExecute = new Date();
	
	/** 사용자 쿼리를 지정한다 */
	private EditorDefine.QUERY_MODE mode = EditorDefine.QUERY_MODE.QUERY;
			
	/** 사용자가 쿼리를 실행 하는 타입 */
	private EditorDefine.EXECUTE_TYPE type = EditorDefine.EXECUTE_TYPE.NONE;

	/**
	 * 
	 * @param sql 쿼리
	 * @param mode 전체인지, 부분인지 {@code EditorDefine.QUERY_MODE}
	 * @param type 쿼리, 실행 계획인지 {@code EditorDefine.EXECUTE_TYPE}
	 */
	public RequestQuery(String sql, EditorDefine.QUERY_MODE mode, EditorDefine.EXECUTE_TYPE type) {
		this.sql = sql;
		this.mode = mode;
		this.type = type;
	}

	/**
	 * @return the sql
	 */
	public String getSql() {
		return sql;
	}

	/**
	 * @param sql the sql to set
	 */
	public void setSql(String sql) {
		this.sql = sql;
	}

	/**
	 * @return the startDateExecute
	 */
	public Date getStartDateExecute() {
		return startDateExecute;
	}

	/**
	 * @param startDateExecute the startDateExecute to set
	 */
	public void setStartDateExecute(Date startDateExecute) {
		this.startDateExecute = startDateExecute;
	}

	/**
	 * @return the mode
	 */
	public EditorDefine.QUERY_MODE getMode() {
		return mode;
	}

	/**
	 * @param mode the mode to set
	 */
	public void setMode(EditorDefine.QUERY_MODE mode) {
		this.mode = mode;
	}

	/**
	 * @return the type
	 */
	public EditorDefine.EXECUTE_TYPE getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(EditorDefine.EXECUTE_TYPE type) {
		this.type = type;
	}

}
