package StudentJavaSE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentManager {
	static ArrayList<Student> array = new ArrayList<Student>();
	//4������SMTest��App()����
	public static void App() {
		while(true) {
			//4�����ǳɼ�����ϵͳ��������
			System.out.println("��ѡ�������");
			System.out.println("***************************");
			System.out.println("*          1.����                            *");
			System.out.println("*          2.����                            *");
			System.out.println("*          3.ɾ��                            *");
			System.out.println("*          4.�޸�                            *");
			System.out.println("*          5.���                            *");
			System.out.println("*          6.�˳�                            *");
			System.out.println("***************************");
			//26��Scanner sc =new Scanner(System.in);
			@SuppressWarnings("resource")
			Scanner sc =new Scanner(System.in);
			System.out.println("���������ѡ����Ӧ�Ĺ��ܣ�");
			String stufunction = sc.nextLine();
			switch (stufunction) {
			case "1":
				//8������ѧ��
				//26��StudentManager studentManager=new StudentManager();
				//26��studentManager.addstudent(array);
				StudentManager.addstudent(array);
				break;
			case "2":
				//8������ѧ��
				//26��StudentManager studentManager1=new StudentManager();
				StudentManager.findstudent(array);
				break;
			case "3":
				//8��ɾ��ѧ��
				//26:StudentManager studentManager2=new StudentManager();
				StudentManager.deletestudent(array);
				break;
			case "4":
				//8���޸�ѧ��
				//26:StudentManager studentManager3=new StudentManager();
				StudentManager.changestudent(array);
				break;
			case "5":
				//8�����ѧ��
				//26:StudentManager studentManager4=new StudentManager();
				StudentManager.printstudent(array);
				break;
			case "6":
				//8���˳�
				//37��ÿ��switch-case��䶼�����һ��default��ȷ��������ȫ��
			default:
				System.out.println("лл���ʹ��.");
				System.exit(0);//9���˳�JVM
				break;
			}
		}
		
	}
	//4:������
	public static void findstudent(ArrayList<Student> arry) {
		//26:Scanner sc= new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		if(arry.size()==0) {
			System.out.println("������˼��Ŀǰ��û��ѧ������Ϣ�ɹ���ѯ���뷵�����²�����");
			//59�����ز˵�
			return;
		}
		Collections.sort(arry);
		int count = 0;
		System.out.println("������������");
		String selectName = sc.nextLine();
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getName().equals(selectName)) {
				//15:System.out.println(s.getStdId()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+s.getGender());
				System.out.println(s.getStdId()+"\t"+s.getName()+
						"\t"+s.getBirDate()+"\t"+s.getGender());
				count++;
			}
		}
		if(count == 0){
			System.out.println("δ�ҵ����ѧ��,���֤������!");
		}		
	}
	//4:�����
	public static void printstudent(ArrayList<Student> arry) {
		if(arry.size()==0) {
			System.out.println("������˼��Ŀǰ��û��ѧ������Ϣ�ɹ���ѯ���뷵�����²�����");
			//59�����ز˵�
			return;
		}
		Collections.sort(arry);
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			//15:System.out.println(s.getStdId()+"\t"+s.getName()+"\t"+s.getBirDate()+"\t"+s.getGender());
			System.out.println(s.getStdId()+"\t"+s.getName()+
					"\t"+s.getBirDate()+"\t"+s.getGender());
		}
	}
	//4:�����
	public static void addstudent(ArrayList<Student> arry) {
		//��������¼�����
		//26:Scanner sc= new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		String stuId;
		while(true) {
			System.out.println("������ѧ�ţ�");
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
				System.out.println("��������˺ű�ռ�ã�����");
			}//16:else {
				//break;
			//}
			else {
				break;
			}
		}//6:while(true)
		System.out.println("������������");
		String name = sc.nextLine();
		System.out.println("������������ڣ�");
		String birDate = sc.nextLine();
		System.out.println("�������Ա�");
		String gender = sc.nextLine();
		//����ѧ������
		Student s = new Student();
		s.setStdId(stuId);
		s.setName(name);
		s.setBirDate(birDate);
		s.setGender(gender);
		//��ѧ��������ӵ�����
		arry.add(s);
		System.out.println("���ѧ���ɹ���");
	}//6�����
	//4:ɾ����
	public static void deletestudent(ArrayList<Student> arry) {
		//26:Scanner sc= new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("������Ҫɾ����������");
		String deleName = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getName().equals(deleName)) {		
				index=i;					
			}			
			if (index == -1) {
				System.out.println("��Ҫɾ����ѧ�������ڣ�������ѡ��");
			} 
			else {
				arry.remove(index);
				System.out.println("ɾ��ѧ���ɹ�����");
			}
		} 
	}
	//4:�޸���
	public static void changestudent(ArrayList<Student> arry) {
		//26:Scanner sc= new Scanner(System.in);
		@SuppressWarnings("resource")
		Scanner sc= new Scanner(System.in);
		System.out.print("������Ҫ�ı��������");
		String changeName = sc.nextLine();
		int index = -1;
		for(int i=0;i<arry.size();i++) {
			Student s = arry.get(i);
			if(s.getName().equals(changeName)) {		
				index = i;				
			}
		}
		if (index == -1) {
			System.out.println("��Ҫ�ı��ѧ�������ڣ������²�����");
		} 
		else {
			System.out.println("��������ѧ�ţ�");
			String stuId = sc.nextLine();
			System.out.println("�������³������ڣ�");
			String birDate = sc.nextLine();
			System.out.println("���������Ա�");
			String gender = sc.nextLine();
			//4:����ѧ������
			Student s = new Student();
			s.setStdId(stuId);
			s.setName(changeName);
			s.setBirDate(birDate);
			s.setGender(gender);
			//4:�޸�ѧ������
			arry.set(index,s);
			System.out.println("�޸�ѧ���ɹ�������");
		}
	}
}//6��class StudentManager
