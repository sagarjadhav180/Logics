package trees;

import org.testng.annotations.Test;

public class Main {

	@Test
	public void test1() {
		
		Tree intTree = new Tree();
	    intTree.insert(25);
	    intTree.insert(20);
	    intTree.insert(15);
	    intTree.insert(27);
	    intTree.insert(30);
	    intTree.insert(29);
	    intTree.insert(26);
	    intTree.insert(22);
	    intTree.insert(32);
	    intTree.insert(17);

        intTree.traverseInOrder();

        System.out.println();

        intTree.delete(27);
        intTree.traverseInOrder();
        System.out.println();
	}
	
}
