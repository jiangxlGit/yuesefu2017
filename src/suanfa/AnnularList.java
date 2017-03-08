package suanfa;

public class AnnularList implements IAnnularList {

	private Node firstNode = null;
	private Node temp = null;

	private int start;
	private int step;
	private int len;

	public AnnularList(int start, int step, int len) {
		this.start = start;
		this.step = step;
		this.len = len;
	}

	// 创建链表
	public void createList() {

		for (int i = 1; i <= len; i++) {

			if (i == 1) {
				Node node = new Node(i);
				firstNode = node;
				node.next = node;
				temp = node;
			} else {

				if (i != len) {
					Node node = new Node(i);
					temp.next = node;
					temp = node;
				} else {
					Node node = new Node(i);
					temp.next = node;
					temp = node;
					node.next = firstNode;
				}
			}
		}
	}

	// 删除链表指定节点
	public void removeList(Node node) {

		if (node == null || node.next == node) {
			return;
		}
		
		// 找到node上一个节点
		Node temp1 = node;
		while (temp1.next != node) {
			temp1 = temp1.next;
		}
		
		// 把node上一个节点的next改变为node的下一个节点
		temp1.next = node.next;
		
		System.out.println("出圈的节点是：" + node.node_id);
		
		// 删一个节点链表长度减一
		this.len--;

	}

	public void action() {

		int id = start;

		if (this.start > this.len) {
			System.out.println("删除起始点超出范围");
			return;
		}

		Node temp3 = this.firstNode;
		while (temp3.next != null && temp3.next != temp3) {
			temp3 = temp3.next;
			if (temp3.node_id == id) {
				break;
			}
		}

		do {

			Node temp4 = temp3;

			this.removeList(temp3);

			for (int j = 0; j < step; j++) {
				temp4 = temp4.next;
			}

			temp3 = temp4;

		} while (temp3.next != temp3);
		
		this.firstNode = temp3;
		this.temp = temp3;
		
	}

	public void showList() {

		Node temp = this.firstNode;
		System.out.print("打印链表：");
		if (temp.next.node_id == 1) {
			System.out.print(temp.node_id + " ");
		} else {
			while (temp.next != firstNode) {
				System.out.print(temp.node_id + " ");
				temp = temp.next;
			}
		}
		System.out.println(temp.node_id);
	}
	
	public static void main(String[] args) {

		AnnularList list = new AnnularList(1, 3, 10);

		list.createList();

		list.showList();

		list.action();

		list.showList();
		
		list = null;

	}

	public String toString() {
		return "AnnularList [firstNode=" + firstNode + ", temp=" + temp
				+ ", start=" + start + ", step=" + step + ", len=" + len + "]";
	}

}
