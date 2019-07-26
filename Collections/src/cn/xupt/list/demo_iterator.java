package cn.xupt.list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.xupt.bean.Student;
import cn.xupt.bean.Student01;

public class demo_iterator {
	public static void main(String[] args) {
		Collection<Student01> c=new ArrayList<>();
		c.add(new Student01("张三",23));
		c.add(new Student01("李四",24));
		c.add(new Student01("王五",25));
		c.add(new Student01("赵六",26));
		
		Iterator<Student01> it=c.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
