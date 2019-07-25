package com.xupt.TestIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.TreeMap;

public class Demo01 {
	/**
	 * ��ȡ�ı���ÿ���ַ����ֵ������������д��time.txt��
	 * 
	 * ������
	 * 1�����������������������
	 * 2������˫�м��϶���TreeMap��
	 * 3�����������ַ��洢��˫�м����У��洢ʱҪ�жϣ������������������ͽ���1�洢�����������������ͽ��ü���ֵ��һ�洢��
	 * 4���ر���������
	 * 5���������������
	 * 6���������Ͻ������е�����д��times.txt�С�
	 * 7���ر��������
	 * @throws FileNotFoundException 
	 * 
	 */
	public static void main(String[] args) throws Exception {
		BufferedReader br =new BufferedReader(new FileReader("D:\\Administrator\\eclipse-workspace\\FileReader\\bin\\zzz.txt"));
		TreeMap<Character,Integer> tm=new TreeMap<>();
		int ch;
		while((ch=br.read()) !=-1 ) {
			char c=(char)ch;
			if(!tm.containsKey(c)) {
				tm.put(c, 1);
			}else {
				tm.put(c, tm.get(c)+1);
			}
			//tm.put(c,!tm.containsKey(c)?1:tm.get(c)+1);
		}
		br.close();
		BufferedWriter bw=new BufferedWriter(new FileWriter("times.txt"));
		for(Character key: tm.keySet()) {
			switch(key){
			case '\t':
				bw.write("\\t"+"="+tm.get(key));
				break;
			case '\n':
				bw.write("\\n"+"="+tm.get(key));
				break;
			case '\r':
				bw.write("\\r"+"="+tm.get(key));
				break;
			default:
				bw.write(key+"="+tm.get(key));
			}
			bw.newLine();
		}
		bw.close();
	}
}
