package com.icode.interview.designpattern.builder;

/**
 * builder模式
 * 
 * @author Jim
 *
 */
public class Contact {
	private String name;
	private String sex;
	private int age;
	
	public Contact(Builder builder) {
		this.name = builder.name;
		this.sex = builder.sex;
		this.age = builder.age;
	}
	
	public static class Builder {
		private String name;
		private String sex;
		private int age;
		
		public Builder() {
		}
		
		public Builder setName(String name) {
			this.name = name;
			return this;
		}
		
		public Builder setSex(String sex) {
			this.sex = sex;
			return this;
		}
		
		public Builder setAge(int age) {
			this.age = age;
			return this;
		}
		
		public Contact build() {
			return new Contact(this);
		}
	}
	
	@Override
	public String toString() {
		return "Contact [name=" + name + ", sex=" + sex + ", age=" + age + "]";
	}

	public static void main(String[] args) {
		Contact contact = new Builder()
				.setName("Jim")
				.setSex("male")
				.setAge(18)
				.build();
		System.out.println(contact);
	}
}
