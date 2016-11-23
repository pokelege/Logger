package com.pokelege.logger.entity;

import sun.rmi.runtime.Log;

import javax.persistence.Entity;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/**
 * Created by andre on 16/11/22.
 */
@Entity
public class LogString implements Serializable
{
	private String instanceId;
	private String message;

	public LogString()
	{

	}

	public LogString(String instanceId, String message){
		this.instanceId = instanceId;
		this.message = message;
	}

	public String getInstanceId()
	{
		return instanceId;
	}

	public void setInstanceId(String instanceId)
	{
		this.instanceId = instanceId;
	}

	public String getMessage()
	{
		return message;
	}

	public void setMessage(String message)
	{
		this.message = message;
	}
}
