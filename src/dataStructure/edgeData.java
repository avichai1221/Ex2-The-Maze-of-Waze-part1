package dataStructure;

public class edgeData implements edge_data{

	private int src;
	private int dest;
	private double weight;
	private String info;
	private int tag;
	
	public edgeData (int src,int dest,double weight,String info,int tag)
	{
		this.dest=dest;
		this.info=info;
		this.src=src;
		this.tag=tag;
		this.weight=weight;
	}
	public edgeData ()
	{
	this.dest=0;
	this.info=null;
	this.src=0;
	this.tag=0;
	this.weight=0;
	}
	
	@Override
	public int getSrc()
	{
		return this.src;
	}

	@Override
	public int getDest()
	{
		return this.dest;
	}

	@Override
	public double getWeight()
	{
		return this.weight;
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
