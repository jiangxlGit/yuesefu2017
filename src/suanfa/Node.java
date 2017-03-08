package suanfa;

/**
 * 
 * @功能概要： <br>
 * @项目名称： MDOS<br>
 * @初创作者： jiangxl  email：836200494@qq.com <br>
 * @公司名称： ShenZhen Montnets Technology CO.,LTD.<br>
 * @创建时间： 2017-3-3 上午11:45:28<br>
 */
public class Node {

	// 节点编号
	public int node_id;
	// 创建下一个节点
	public Node next= null;
	
	public Node(int node_id){
		this.node_id = node_id;
	}
	
}
