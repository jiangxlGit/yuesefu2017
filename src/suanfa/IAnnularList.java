package suanfa;


/**
 * 
 * @功能概要： 环形链表的接口<br>
 * @项目名称： <br>
 * @初创作者： jiangxl  email：836200494@qq.com <br>
 * @公司名称： ShenZhen Montnets Technology CO.,LTD.<br>
 * @创建时间： 2017-3-3 上午11:25:52<br>
 */
public interface IAnnularList {

	// 创建环形链表方法
	public void createList();
	
	// 删除指定节点方法
	public void removeList(Node node);
	
	// 执行计划的方法
	public void action();
	
	// 打印链表的方法
	public void showList();
	
}
