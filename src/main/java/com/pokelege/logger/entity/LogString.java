package com.pokelege.logger.entity;

import sun.rmi.runtime.Log;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.io.StreamCorruptedException;

/**
 * Created by andre on 16/11/22.
 */
@Entity
public class LogString implements Serializable
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
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

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}
}
