package co.jp.part3;

import java.util.Calendar;

import co.jp.part3.Employee.Skill;
import co.jp.part3.Pet.Type;

public class Manager {
	

	// ADD petを追加する
	public static Pet Add(int masterCode, String name, int age, Type type, Boolean health) {
		// 新しいコード取得
		int code =Data.petList.size() + 1;
		Pet pet = PetFactory.createPet(type, name, masterCode, age, health, code);
		Data.petList.add(pet);
		return pet;

	}

	// ADD Clientを追加する
	public static Client Add(String name, String telephone) {
		int code = Data.clientList.size() + 1;
		Client client = new Client(name, telephone, code);
		Data.clientList.add(client);
		return client;

	}

	// ADD Employeeを追加する
	public static Employee Add(String name, int cost, int max, Skill skill) {
		int code = Data.employeeList.size() + 1;
		Employee employee = new Employee();
		employee.name = name;
		employee.cost = cost;
		employee.max = max;
		employee.skill = skill.ordinal();
		employee.code = code;
		Data.employeeList.add(employee);
		return employee;

	}

	public static Client SearchClient(String code) {
		 try {
		        Client client = Data.clientList.get(Integer.parseInt(code)-1);
		        System.out.println("＜お帰りなさい！" + client.name + "　様！＞");
		        return client;
		    } catch (NumberFormatException e) {
		        System.out.println("入力されたお客様番号が不正です。");
		        return null;
		    }
	}

	public static void ViewMyPet(Client client) {

		for (int i = 0; i < client.petsCode.length; i++) {
			
			System.out.print("[" + (i+1) + "]");
			if (client.petsCode[i] != 0) {
				int code = client.petsCode[i];
				View(Data.petList.get(code-1));
			} else {
				System.out.println("データなし");
			}
		}
	}

	public static void View(Order order) {

	/*	System.out.println("番号:" + formatNumber(order.code, 6) + "\t" + "開始日:" +order.beginDay + "\t" + "退去日:" +order.outDay + "\t"
				+ "飼い主:[ NO." + formatNumber(order.clientCode, 4) + " ]" + Data.clientList.get(order.clientCode - 1).name + "\t"
				+ "ペット名前:" + Data.petList.get(order.petCode - 1).name
				+ "\t" + "スタッフ：" + Data.employeeList.get(order.employeeCode - 1).name
				+ "\t" + "料金：" + order.cost);
				*/
	}

	public static void View(Pet pet) {
		String petType = PetFactory.getPetTypeString(pet);

		String health = pet.health ? "健康" : "病気";

		System.out.println("番号:" + formatNumber(pet.code, 4) + "\t" + "お名前:" + pet.name + "\t" + "種類:" + petType + "\t"
				+ "飼い主:[ NO." + formatNumber(pet.masterCode, 4) + " ]" + Data.clientList.get(pet.masterCode - 1).name + "\t" + "年齢:" + pet.age
				+ "\t" + "健康状況：" + health);
	}

	public static void View(Client client) {

		System.out.println(
				"番号:" + formatNumber(client.code, 4) + "\t" + "お名前:" + client.name + "\t" + "電話番号：" + client.telephone);
		System.out.print("ペット:");
		for (int code : client.petsCode) {
			if (code != 0) {
				System.out.print(Data.petList.get(code - 1).name + "\t");
			}

		}
		System.out.println("");
	}

	public static void View(Employee employee) {
		
		Calendar calendar = Calendar.getInstance();
		int today = calendar.get(Calendar.DAY_OF_MONTH);
		
		
		String status=employee.hold[today-1];
		status=status.equals("x")?"お休み": "お世話中ペッド:" + employee.hold[today-1]+ "/" + employee.max;
		String position = Employee.getEmployeeTypeString(employee);
		System.out.println("番号:" + formatNumber(employee.code, 4) + "\t" + "名前:" + employee.name + "\t" + "職種:"
				+ position + "\t" + status+ "\t" + "指名料：" + employee.cost);
	}

	public static void ViewList(String type) {
		switch (type) {
		case "Pet":
			System.out.println("＜ペットリスト＞");
			for (Pet p : Data.petList) {
				View(p);
				System.out.println("---------------");
			}
			break;
		case "Client":
			System.out.println("＜お客様リスト＞");
			for (Client c : Data.clientList) {
				View(c);
				System.out.println("---------------");
			}
			break;
		case "Employee":
			System.out.println("＜スタッフリスト＞");
			for (Employee e : Data.employeeList) {
				View(e);
				System.out.println("---------------");
			}
			break;
			/*
		case "Order":
			System.out.println("＜オーダーリスト＞");
			for (Order o  : Data.orderList) {
				View(o);
				System.out.println("---------------");
			}
			break;
			*/
		default:
			System.out.println("TYPE範囲外のため、リスト表示できません。");
		}
	}

	public static String formatNumber(int number, int n) {
		return String.format("%0" + n + "d", number);
	}

}
