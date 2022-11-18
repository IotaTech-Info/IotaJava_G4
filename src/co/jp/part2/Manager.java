package co.jp.part2;

import java.util.ArrayList;
import java.util.List;

import co.jp.part2.Employee.Skill;
import co.jp.part2.Pet.Type;

public class Manager {
	List<Pet> petList= new ArrayList<Pet>();
	List<Client> clientList= new ArrayList<Client>();
	List<Employee> employeeList= new ArrayList<Employee>();
	
	//ADD petを追加する
	public Pet Add(String master,String name,int age,Type type,Boolean health)
	{
		int code=petList.size()+10000;
		switch (type) {
		case DOG:
			Dog dog=new Dog();
			dog.name=name;
			dog.master=master;
			dog.age=age;
			dog.size=3;
			dog.health=health;
			dog.code=code;
			dog.type=Type.DOG;
			petList.add(dog);
			return dog;
			
		case CAT:
			Cat cat=new Cat();
			cat.name=name;
			cat.master=master;
			cat.age=age;
			cat.size=2;
			cat.health=health;
			cat.code=code;
			cat.type=Type.CAT;
			petList.add(cat);
			return cat;
		case BIRD:
			Bird bird=new Bird();
			bird.name=name;
			bird.master=master;
			bird.age=age;
			bird.size=1;
			bird.health=health;
			bird.code=code;
			bird.type=Type.BIRD;
			petList.add(bird);
			return bird;
		default:
			System.out.println("TYPE範囲外のため、ペットを追加出来ません。");
			return null;
		}
		
	}
	//ADD Clientを追加する
	public Client Add(String name,String telephone)
	{
		int code=clientList.size()+1000;
		Client client=new Client();
		client.name=name;
		client.telephone=telephone;
		client.code=code;
		clientList.add(client);
		return client;
		
	}
	//ADD Employeeを追加する
	public Employee Add(String name,int cost,int max,Skill skill)
	{
		int code=employeeList.size()+100;
		Employee employee=new Employee();
		employee.name=name;
		employee.cost=cost;
		employee.max=max;
		employee.skill=skill;
		employee.code=code;
		employeeList.add(employee);
		return employee;
		
	}
	
	public Client SearchClient(int code)
	{
		int listCode=code-1000;
		Client client=clientList.get(listCode);
		System.out.println("＜お帰りなさい！"+client.name+"　様！＞");
		return client;
	}
	
	public void View(Order order)
	{
		
	}
	
	public void View(Pet pet)
	{
		String petType = null;
		switch (pet.type) {
		case DOG:
			petType="犬";
			break;
		case CAT:
			petType="猫";
			break;
		case BIRD:
			petType="鳥";
			break;
		default:
			petType="-";
			break;
		}

		String health=pet.health?"健康":"病気";
		
		System.out.println("番号:"+pet.code+"\t"
	+"お名前:"+pet.name+"\t"
	+"種類:"+petType+"\t"
	+"飼い主:"+pet.master+"\t"
	+"年齢:"+pet.age+"\t"
	+"健康状況："+health);
	}
	
	public void View(Client client)
	{
		
		System.out.println("番号:"+client.code+"\t"
		+"お名前:"+client.name+"\t"
	+"電話番号："+client.telephone);
		System.out.print("ペット:");
		for(Pet pet:client.pets) {
			if(pet!=null)
			{
				System.out.print(pet.name+"\t");
			}
			
		}
		System.out.println("");
	}

	public void View(Employee employee)
	{
		int count=0;
		String position = null;
		switch (employee.skill) {
		case BASE:
			position="一般スタッフ";
			break;
		case BEAUTY:
			position="美容師";
			break;
		case DOCTOR:
			position="医者";
			break;
		case DOG_COACH:
			position="犬の訓練士";
			break;
		default:
			break;
		
		}
		for(Pet pet:employee.pets) {
			if(pet!=null)
			{
				count++;
			}
			
		}
		System.out.println("番号:"+employee.code+"\t"
	+"名前:"+employee.name+"\t"
	+"職種:"+position+"\t"
	+"お世話中ペッド:"+count+"/"+employee.max+"\t"
	+"指名料："+employee.cost);
	}
	
	public void ViewList(String type)
	{
		switch (type) {
		case "Pet":
			System.out.println("＜ペットリスト＞");
			for(Pet p:petList)
			{
				View(p);
				System.out.println("---------------");
			}
			break;
		case "Client":
			System.out.println("＜お客様リスト＞");
			for(Client c:clientList)
			{
				View(c);
				System.out.println("---------------");
			}
			break;
		case "Employee":
			System.out.println("＜スタッフリスト＞");
			for(Employee e:employeeList)
			{
				View(e);
				System.out.println("---------------");
			}
			break;
		default:
			System.out.println("TYPE範囲外のため、リスト表示できません。");
		}
	}
	
}
