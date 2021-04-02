
/*
	学生类
*/
public class Student{
	//学号
	public String sid;
	//姓名
	public String sname;
	//年龄
	public int age;
	//地址
	public String address;
	public void Student()
	{

	}
	public void Student(String sid,String sname,int age,String address)
	{
		this.sid = sid;
		this.sname = sname;
		this.age = age;
		this.address = address;
	}
	public void setsid(String sid)
	{
		this.sid = sid;
	}
	public void setsname(String sname)
	{
		this.sname = sname;
	}
	public void setage(int age)
	{
		this.age = age;
	}
	public void setaddress(String address)
	{
		this.address = address;
	}
	public String getid()
	{
		return sid;
	}
	public String getname()
	{
		return sname;
	}
	public int getage()
	{
		return age;
	}
	public String getaddress()
	{
		return address;
	}
}