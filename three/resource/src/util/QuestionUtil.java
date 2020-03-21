
package util;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuestionUtil {
	
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("王卓");
		list.add("谢潇");
		list.add("周翔");
		list.add("顾江");
		list.add("蒋楠");
		list.add("卢建宇");
		list.add("赵则旸");
		list.add("胡鹏");
		list.add("张晓峰");
		list.add("邵晨成");
		list.add("蒋帅");
		list.add("滕杨");
		list.add("沈佳浩");
		list.add("李智");
		list.add("王硕济");
		list.add("严建国");
		list.add("饶帆");
		list.add("陈晨");
		list.add("赵行保");
//		System.out.println(list.size());
		System.out.println(list.get(new Random().nextInt(list.size())));
	}
	

}
