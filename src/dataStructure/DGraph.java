package dataStructure;
import java.io.Serializable;
import java.util.*;
import java.util.Map.Entry;

public class DGraph implements graph,Serializable{

	private static final long serialVersionUID = 1L;
	private HashMap<Integer,node_data> nodeCol=new HashMap<Integer,node_data>();
	private HashMap<Integer,HashMap<Integer,edge_data>> edgeCol=new HashMap<Integer,HashMap<Integer,edge_data>>();
	int MC=0;
	/*
	 *  Default Contractor
	 */
	public DGraph() {
		
	}
	/*
	 *  Contractor
	 */
	public DGraph(HashMap<Integer,node_data> n,HashMap<Integer,HashMap<Integer,edge_data>> edgeCol1) {
		
		nodeCol=(HashMap<Integer, node_data>) n;
		edgeCol=(HashMap<Integer,HashMap<Integer,edge_data>>) edgeCol1;
	}
	
	/*
	 *  Contractor
	 */
	@SuppressWarnings("unchecked")
	public DGraph(DGraph g) 
	{
		nodeCol=(HashMap<Integer, node_data>) g.nodeCol.clone();
		edgeCol=(HashMap<Integer, HashMap<Integer, edge_data>>) g.edgeCol.clone();
	}
	/**
	 * return the node_data by the node_id,
	 * @param key - the node_id
	 * @return the node_data by the node_id, null if none.
	 */
	@Override
	public node_data getNode(int key) {
		
			return nodeCol.get(key);
		
	}
	/**
	 * return the data of the edge (src,dest), null if none.
	 * Note: this method should run in O(1) time.
	 * @param src
	 * @param dest
	 * @return
	 */
	@Override
	public edge_data getEdge(int src, int dest) {
		
			return edgeCol.get(src).get(dest);
	
	}
	/**
	 * add a new node to the graph with the given node_data.
	 * Note: this method should run in O(1) time.
	 * @param n
	 */
	@Override
	public void addNode(node_data n) {
	
		if(!nodeCol.containsKey(n.getKey())) {	
		nodeCol.put(n.getKey(),(node_data) n);
		MC++;
		}
	}
	/**
	 * Connect an edge with weight w between node src to node dest.
	 * * Note: this method should run in O(1) time.
	 * @param src - the source of the edge.
	 * @param dest - the destination of the edge.
	 * @param w - positive weight representing the cost (aka time, price, etc) between src-->dest.
	 */
	@Override
	public void connect(int src, int dest, double w) {
		
		EdgeData newedge =new EdgeData(src,dest,w);
		if(edgeCol.containsKey(src)) {
			if(!edgeCol.get(src).containsKey(dest)) {
				edgeCol.get(src).put(dest,newedge);
				MC++;
			}
		}
			
		else {
			
			HashMap<Integer,edge_data> help=new HashMap<Integer,edge_data>();
			help.put(dest, newedge);
			edgeCol.put(src, help);
			MC++;
		
		}
	
	}
	/**
	 * This method return a pointer (shallow copy) for the
	 * collection representing all the nodes in the graph. 
	 * Note: this method should run in O(1) time.
	 * @return Collection<node_data>
	 */
	@Override
	public Collection<node_data> getV() {
		
		
		return nodeCol.values();
		
	}
	/**
	 * This method return a pointer (shallow copy) for the
	 * collection representing all the edges getting out of 
	 * the given node (all the edges starting (source) at the given node). 
	 * Note: this method should run in O(1) time.
	 * @return Collection<edge_data>
	 */
	@Override
	public Collection<edge_data> getE(int node_id) {
		
		if(edgeCol.get(node_id)!=null)
			return edgeCol.get(node_id).values();
	return null;
	
	}
	/**
	 * Delete the node (with the given ID) from the graph -
	 * and removes all edges which starts or ends at this node.
	 * This method should run in O(n), |V|=n, as all the edges should be removed.
	 * @return the data of the removed node (null if none). 
	 * @param key
	 */
	@Override
	public node_data removeNode(int key) {
		for ( Map.Entry<Integer,node_data> e: nodeCol.entrySet()) {
				if(edgeCol.get(e)!=null) {
					if(edgeCol.get(e).get(key)!=null) {
						 edgeCol.get(e).remove(key);
						 MC++;
					}
			 	}
		}
		return nodeCol.remove(key);
		
	}
	/**
	 * Delete the edge from the graph, 
	 * Note: this method should run in O(1) time.
	 * @param src
	 * @param dest
	 * @return the data of the removed edge (null if none).
	 */
	@Override
	public edge_data removeEdge(int src, int dest) {
		
		if(edgeCol.get(src)!=null) {
		if(edgeCol.get(src).get(dest)!=null) {
			MC++;
			return edgeCol.get(src).remove(dest);
			
		}
		}
		return null;
	}
	/** return the number of vertices (nodes) in the graph.
	 * Note: this method should run in O(1) time. 
	 * @return
	 */
	@Override
	public int nodeSize() {
	
		return nodeCol.size();
	}
	/** 
	 * return the number of edges (assume directional graph).
	 * Note: this method should run in O(1) time.
	 * @return
	 */
	@Override
	public int edgeSize() {
	
		return edgeCol.size();
	}
	/**
	 * return the Mode Count - for testing changes in the graph.
	 * @return
	 */
	@Override
	public int getMC() {
		
		return MC;
	}

}
