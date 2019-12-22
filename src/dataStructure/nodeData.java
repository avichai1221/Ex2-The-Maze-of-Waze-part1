package dataStructure;

import utils.Point3D;

public class nodeData implements node_data{

	private int key;
	private Point3D location;
	private double weight;
	private String info;
	private int tag;
	
	public nodeData () 
	{
		this.info=null;
		this.key=0;
		this.location=null;
		this.tag=0;
		this.weight=0;
	}
	
	public nodeData (int key,Point3D location,double weight,String info,int tag) 
	{
		this.info=info;
		this.key=key;
		this.location=location;
		this.tag=tag;
		this.weight=weight;
	}
	@Override
	public int getKey() 
	{
		return this.key;
	}

	@Override
	public Point3D getLocation()
	{
		return this.location;
	}

	@Override
	public void setLocation(Point3D location) 
	{
		this.location=location;
		
	}

	@Override
	public double getWeight()
	{
		return this.weight;
	}

	@Override
	public void setWeight(double weight)
	{
		this.weight=weight;
		
	}

	@Override
	public String getInfo() 
	{
		return this.info;
	}

	@Override
	public void setInfo(String info)
	{
		this.info=info;
		
	}

	@Override
	public int getTag() 
	{
		return this.tag;
	}

	@Override
	public void setTag(int tag)
	{
		this.tag=tag;
		
	}

}
