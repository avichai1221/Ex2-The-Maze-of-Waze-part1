package dataStructure;

public class EdgeData implements edge_data  {

	private int src; 
	private int dest; 
	private double w;
	private String info;
	private int tag;
	
	
	public EdgeData() {
		 this.src=0; 
		 this.dest=0; 
		 this.w=0; 
		 this.info=""; 
		 this.tag=0;
	}
	
	
	
	
	public EdgeData(int s, int d,double weight) {
		 this.src=s; 
		 this.dest=d;
		 this.w=weight;
	
	}
	
	@Override
	public int getSrc() {
		
		return this.src;
	}

	@Override
	public int getDest() {
		
		return this.dest;
	}

	@Override
	public double getWeight() {
		return this.w;
	}

	@Override
	public String getInfo() {
		return this.info;
	}

	@Override
	public void setInfo(String s) {
		this.info=s;
		
	}

	@Override
	public int getTag() {
	return this.tag;
	}

	@Override
	public void setTag(int t) {
		this.tag=t;
		
	}
	public String toString()
	{
		String s="";
		
	    s=s+"--src:"+ this.src+",dest:"+this.dest+",weight:"+this.w+",info:"+this.info+",tag:"+this.tag;
	
		return s;

	}
}
