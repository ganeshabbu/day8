package day8;
import java.util.*;;

public class AdvanceGraph {
	static class graph{
		private Map<Integer, List<Integer>> adjlist = new HashMap<Integer, List<Integer>>();
		void addEdge(int u,int v) {
			adjlist.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
			adjlist.computeIfAbsent(v, k -> new ArrayList<>()).add(u);
		}
		void printGraph() {
			for(int node: adjlist.keySet()) {
				System.out.println("Node "+node+" is connected to :");
				for(int neighbour : adjlist.get(node)) {
					System.out.println(neighbour+" ");
				}
				System.out.println(" ");
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		graph s = new graph();
		s.addEdge(1, 2);
		s.addEdge(1, 3);
		s.addEdge(1, 4);
		s.printGraph();
	}

}
