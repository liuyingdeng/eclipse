package cn.xupt.TestArrayList;
/**
 * 自定义实现Map功能
 *Map：存放键值对，根据键对象寻找值对象，键对象不能重复
 */
public class SxtMap001 {
	SxtEntry [] arr=new SxtEntry[900];
	int size;
	public void put(Object key,Object value) {
		SxtEntry e=new SxtEntry(key,value);
		for(int i=0;i<size;i++) {
			if(arr[i].key.equals(key)) {
				arr[i].value=value;
				return;
			}
		}
		arr[size++]=e;
	}
	public Object get(Object key) {
		for(int i=0;i<size;i++) {
			if(arr[i].key.equals(key)) {
				return arr[i].value;
			}
		}
		return null;
	}
	public boolean containsKey(Object key) {
		for(int i=0;i<size;i++) {
			if(arr[i].key.equals(key)) {
				return true;
			}
		}
		return false;
	}
	public boolean containsValue(Object value) {
		for(int i=0;i<size;i++) {
			if(arr[i].value.equals(value)) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		SxtMap001 m = new SxtMap001();
		m.put("高琪", new Wife("杨幂"));
		m.put("高琪", new Wife("李四"));
		Wife w = (Wife) m.get("高琪");
		System.out.println(w.name); 
	}

}
class SxtEntry {
	Object key;
	Object value;
	public SxtEntry(Object key,Object value) {
		super();
		this.key=key;
		this.value=value;
	}
}
class Wife{
	String name;
	
	public Wife(String name) {
		this.name=name;
	}
}