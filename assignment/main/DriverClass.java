package com.assignment.main;

import com.assignment.departments.*;

public class DriverClass {

	public static void main(String[] args) {

		AdminDepartment adminDeparment = new AdminDepartment();

		System.out.println("Welcome to " + adminDeparment.deparmentName());
		System.out.println(adminDeparment.getTodaysWork());
		System.out.println(adminDeparment.getWorkDeadline());
		System.out.println(adminDeparment.isTodayAHoliday());
		System.out.println();

		HrDepartment hrDeparment = new HrDepartment();

		System.out.println("Welcome to " + hrDeparment.deparmentName());
		System.out.println(hrDeparment.doActivity());
		System.out.println(hrDeparment.getTodaysWork());
		System.out.println(hrDeparment.getWorkDeadline());
		System.out.println(hrDeparment.isTodayAHoliday());
		System.out.println();

		TechDepartment techDeparment = new TechDepartment();

		System.out.println("Welcome to " + techDeparment.deparmentName());
		System.out.println(techDeparment.getTodaysWork());
		System.out.println(techDeparment.getWorkDeadline());
		System.out.println(techDeparment.getTechStackInformation());
		System.out.println(techDeparment.isTodayAHoliday());
		System.out.println();

	}

}