package StudentJavaSE;

import java.util.ArrayList;
import java.util.Scanner;

public class SMTest{
	static Scanner sc = new Scanner(System.in);
	//让所有方法都操作这一个集合
	
	public static void main(String[] args) {
	    StudentManager studentManager=new StudentManager();
	    studentManager.App();
	}

}
