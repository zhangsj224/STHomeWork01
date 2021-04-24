package StudentJavaSE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
	static ArrayList<Student> array = new ArrayList<Student>();
	public static void App() {
		while(true) {
			//这是成绩管理系统的主界面
			System.out.println("请选择操作：");
			System.out.println("***************************");
			System.out.println("*          1.插入                            *");
			System.out.println("*          2.查找                            *");
			System.out.println("*          3.删除                            *");
			System.out.println("*          4.修改                            *");
			System.out.println("*          5.输出                            *");
			System.out.println("*          6.退出                            *");
			System.out.println("***************************");
			Scanner sc =new Scanner(System.in);
			System.out.println("请输入序号选择相应的功能：");
			String stufunction = sc.nextLine();
			switch (stufunction) {
			case "1":
				//增加学生
				StudentManager studentManager=new StudentManager();
				studentManager.addstudent(array);
				break;
			case "2":
				//查找学生
				StudentManager studentManager1=new StudentManager();
				studentManager1.findstudent(array);
				break;
			case "3":
				//删除学生
				StudentManager studentManager2=new StudentManager();
				studentManager2.deletestudent(array);
				break;
			case "4":
				//修改学生
				StudentManager studentManager3=new StudentManager();
				studentManager3.changestudent(array);
				break;
			case "5":
				//输出学生
				StudentManager studentManager4=new StudentManager();
				studentManager4.printstudent(array);
				break;
			case "6":
				//退出
			default:
				System.out.println("谢谢你的使用.");
				System.exit(0);//退出JVM
				break;
			}
		}
		
	}
	//查找类
	public static void findstudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		if(arry.size()==0) {
			System.out.println("不好意思，目前还没有学生的信息可供查询，请返回重新操作！");
			return;
		}
		Collections.sort(arry);
		int count = 0;
		System.out.println("请输入姓名：");
		String selectName = sc.nextLine();
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getName().equals(selectName)) {
				System.out.println(s.getStdId()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+s.getGender());
				count++;
			}
		}
		if(count == 0){
			System.out.println("未找到这个学生,请查证后再找!");
		}		
	}
	//输出类
	public static void printstudent(ArrayList<Student> arry) {
		if(arry.size()==0) {
			System.out.println("不好意思，目前还没有学生的信息可供查询，请返回重新操作！");
			return;
		}
		Collections.sort(arry);
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			System.out.println(s.getStdId()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+s.getGender());
		}
	}
	//添加类
	public static void addstudent(ArrayList<Student> arry) {
		//创建键盘录入对象
		Scanner sc= new Scanner(System.in);
		String stuId;
		while(true) {
			System.out.println("请输入学号：");
			stuId = sc.nextLine();
			boolean flag = false;
			for(int i=0;i<arry.size();i++) {
				Student s = arry.get(i);
				if(s.getStdId().equals(stuId)) {		
					flag = true;			
					break;
				}
			}
			if(flag) {
				System.out.println("您输入的账号被占用！！！");
			}else {
				break;
			}
		}
		System.out.println("请输入姓名：");
		String name = sc.nextLine();
		System.out.println("请输入出生日期：");
		String birDate = sc.nextLine();
		System.out.println("请输入性别：");
		String gender = sc.nextLine();
		//创建学生对象
		Student s = new Student();
		s.setStdId(stuId);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		//把学生对象添加到集合
		arry.add(s);
		System.out.println("添加学生成功！");
	}
	//删除类
	public static void deletestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("请输入要删除的姓名：");
		String deleName = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getName().equals(deleName)) {		
				index=i;					
			}			
			if (index == -1) {
				System.out.println("你要删除的学生不存在，请重新选择！");
			} else {
				arry.remove(index);
				System.out.println("删除学生成功！！");
			}
		} 
	}
	//修改类
	public static void changestudent(ArrayList<Student> arry) {
		Scanner sc= new Scanner(System.in);
		System.out.print("请输入要改变的姓名：");
		String changeName = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getName().equals(changeName)) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("您要改变的学生不存在，请重新操作！");
		} else {
			System.out.println("请输入新学号：");
			String stuId = sc.nextLine();
			System.out.println("请输入新出生日期：");
			String birDate = sc.nextLine();
			System.out.println("请输入新性别：");
			String gender = sc.nextLine();
			//创建学生对象
			Student s = new Student();
			s.setStdId(stuId);
			s.setName(changeName);
			s.setBirDate(birDate);
			s.setGender(gender);
			//修改学生对象
			arry.set(index,s);
			System.out.println("修改学生成功！！！");
		}
	}
}
