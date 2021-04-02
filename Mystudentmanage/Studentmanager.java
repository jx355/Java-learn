
/*
	主函数 
	2021。3.31
*/
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Studentmanager{
	public static void main(String[] args){
		ArrayList<Student> St = new ArrayList<Student> ();
		while(true){
		System.out.println("welcome");
		System.out.println("1.添加");
		System.out.println("2.修改");
		System.out.println("3.查看");
		System.out.println("4.查找");
		System.out.println("5.删除");
		System.out.println("6.退出");
		Scanner sc = new Scanner(System.in);
		String Line = sc.nextLine();
			switch(Line){
				case "1": Studentadd(St);
						break;
				case "2": Studentupadte(St);
						break;
				case "3": Studentshow(St);
						break;
				case "4": Studentsearch(St);
						break;
				case "5": Studentremove(St);
						break;
				case "6": System.out.println("6.退出");
						//break;
						System.exit(0); //JVM退出
			}
		}
	}
	public static void Studentadd( ArrayList <Student> St)
	{

		Scanner sc = new Scanner(System.in);
	
		System.out.println("请输入学号");
		String sid = sc.nextLine();
		System.out.println("请输入姓名");
		String sname = sc.nextLine(); 
		System.out.println("请输入年龄");
		int age = Integer.parseInt(sc.nextLine());
		System.out.println("请输入地址");
		String address = sc.nextLine();
		Student s = new Student();
		s.sid = sid;
		s.sname = sname;
		s.age = age;
		s.address = address;
		St.add(s);
		System.out.println("添加成功");
	}
	public static void Studentupadte(ArrayList<Student> St)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		Student student = new Student();
		System.out.println("请输入要修改的学生的学号");
		String sid = sc.nextLine();

		//Iterator<Student> iterator = St.iterator();
		//while()
		for(i=0;i<St.size();i++)
		{
			Student s = St.get(i);
			if(s.getid().equals(sid))
				break;
		}
		if( i == St.size())
		{	
			System.out.println("修改失败");
			return ;
		}
		System.out.println("请输入学号");
		sid = sc.nextLine();
		student.setsid(sid);
		System.out.println("请输入姓名");
		String sname = sc.nextLine(); 
		student.setsname(sname);
		System.out.println("请输入年龄");
		int age = Integer.parseInt(sc.nextLine());
		student.setage(age);
		System.out.println("请输入地址");
		String address = sc.nextLine();
		student.setaddress(address);

		St.set(i,student);
		System.out.println("修改成功");
	}
	public static void Studentshow(ArrayList<Student> St)
	{
		St.forEach(stu-> {System.out.println("学号: "+stu.getid()+"姓名: "+
			stu.getname()+"年龄: "+stu.getage()+"地址: "+stu.getaddress());} );
	}
	public static void Studentsearch(ArrayList<Student> St)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("请输入要查找的学生的学号");
		String sid = sc.nextLine();

		//Iterator<Student> iterator = St.iterator();
		//while()
		for(i=0;i<St.size();i++)
		{
			Student s = St.get(i);
			if(s.getid().equals(sid))
				break;
		}
		if( i == St.size())
			System.out.println("查找失败");
		else
			System.out.println("学号: "+St.get(i).getid()+"姓名: "+
			St.get(i).getname()+"年龄: "+St.get(i).getage()+"地址: "+St.get(i).getaddress());
	}
	public static void Studentremove(ArrayList<Student> St)
	{
		Scanner sc = new Scanner(System.in);
		int i;
		System.out.println("请输入要查找的学生的学号");
		String sid = sc.nextLine();

		//Iterator<Student> iterator = St.iterator();
		//while()
		for(i=0;i<St.size();i++)
		{
			Student s = St.get(i);
			if(s.getid().equals(sid))
				break;
		}
		if( i == St.size())
			System.out.println("没有该学生");
		else
			St.remove(i);
		System.out.println("删除成功");
	}


}