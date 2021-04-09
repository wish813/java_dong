package com.ict07.IO;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

// 오버라이드한 메소드안에 객체 직렬화할 멤버를 넣어준다.
public class Ex26_VO implements Externalizable{
	private String name;
	private int age;
	private double weigh;
	private boolean gender;
	
	// 생성자
	public Ex26_VO() {}
	
	public Ex26_VO(String name, int age, double weigh, boolean gender) {
		super();
		this.name = name;
		this.age = age;
		this.weigh = weigh;
		this.gender = gender;
	}

	// 직렬화
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		// 직렬화 대상을 입력한다.
		out.writeObject(name);
		out.writeObject(age);
		out.writeObject(weigh);
		out.writeObject(gender);
	}
	
	// 역직렬화
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = (String)in.readObject();
		age = (int)in.readObject();
		weigh = (double)in.readObject();
		gender = (boolean)in.readObject();
	}
	
	// getter, setter

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeigh() {
		return weigh;
	}

	public void setWeigh(double weigh) {
		this.weigh = weigh;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
}
