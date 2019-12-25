package dataStructure;

public class mytest {

	public static void main(String[] args) {
		/*EdgeData a=new EdgeData(1,2,1);
		EdgeData b=new EdgeData();
		NodeData c=new NodeData(5,null,1.0,null,1);
		NodeData c1=new NodeData(2,null,2.0,null,2);
		NodeData c3=new NodeData(2,null,333.0,null,333);
		NodeData d=new NodeData();
	//	System.out.println("edgeData a="+a);
		//System.out.println("edgeData b="+b);
		//System.out.println("nodeData c="+c);
		//System.out.println("nodeData d="+d);
		
		DGraph a1 =new DGraph();
		a1.addNode(c);
	//	a1.addNode(c1);
		a1.addNode(c3);
	a1.connect(2, 54, 4);
		System.out.println(a1.getNode(2));
		//System.out.println(a1.removeEdge(2, 54));
		System.out.println(a1.getEdge(2,54));
		System.out.println(a1);
		System.out.println(a1.edgeSize());*/
		NodeData test=new NodeData(5,null,1.0,null,1);
		NodeData test1=new NodeData(2,null,2.0,null,2);
		NodeData test2=new NodeData(4,null,333.0,null,333);
	
		DGraph a1 =new DGraph();
		DGraph a2 =new DGraph();
		a1.addNode(test);
		a1.addNode(test1);
		a1.addNode(test2);
	    a1.connect(2, 54, 4);
	    a1.connect(2, 51, 4);
	    a1.connect(5, 51, 4);
	    a2.addNode(test);
		a2.addNode(test1);
		a2.addNode(test2);
	    a2.connect(2, 54, 4);
	 // a1.removeEdge(2, 54);
	    System.out.println(a1.getE(2));

	}

}
