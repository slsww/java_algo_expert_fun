import java.util.*;

class Program {
  static class Node {
    String name;
    List<Node> children = new ArrayList<Node>();

    public Node(String name) {
      this.name = name;
    }

    public List<String> depthFirstSearch(List<String> array) {
      array.add(this.name);
			for(int i=0;i<this.children.size();i++){
				this.children.get(i).depthFirstSearch(array);
			}
      return array;
    }

    public Node addChild(String name) {
      Node child = new Node(name);
      children.add(child);
      return this;
    }
  }
}
