package co.jp.part3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import co.jp.part3.Pet.Type;

public class Data {
	public static List<Pet> petList = new ArrayList<Pet>();
	public static List<Client> clientList = new ArrayList<Client>();
	public static List<Employee> employeeList = new ArrayList<Employee>();
	public static List<Order> orderList = new ArrayList<Order>();
	
	

	// Pet
	public static void readPetCSVFile(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}
				String[] values = line.split(",");
				Pet pet = null;
				switch (values[2]) {
				case "DOG":
					pet = new Dog();
					break;
				case "CAT":
					pet = new Cat();
					break;
				case "BIRD":
					pet = new Bird();
					break;
				default:
					System.out.println("TYPE範囲外のため、ペットを追加出来ません。");
					break;
				}
				pet.code = Integer.parseInt(values[0]);
				pet.name = values[1];
				pet.type = Type.valueOf(values[2]);
				pet.masterCode = Integer.parseInt(values[3]);
				pet.age = Integer.parseInt(values[4]);
				pet.health = values[5].equals("T");
				petList.add(pet);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Petファイルの読み込みに失敗した " + filePath);
		}
	}

	public static void writePetCSVFile(String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("#,name,type,masterCode,age,health");
			bw.newLine();
			
			for (Pet pet : petList) {
				String h=pet.health?"T":"F";
				bw.write(pet.code + "," + pet.name + "," + pet.type + "," + pet.masterCode + "," + pet.age + ","
						+ h);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Petファイルの書き込みに失敗した " + filePath);
		}
	}

	// Client
	public static void readClientCSVFile(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}
				String[] values = line.split(",");
				Client client = new Client();
				client.code = Integer.parseInt(values[0]);
				client.name = values[1];
				client.telephone = values[2];
				client.petsCode[0] = Integer.parseInt(values[3]);
				client.petsCode[1] = Integer.parseInt(values[4]);
				client.petsCode[2] = Integer.parseInt(values[5]);
				clientList.add(client);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Clientファイルの書き込みに失敗した " + filePath);
		}
	}

	public static void writeClientCSVFile(String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("#,name,telephone,petsCode1,petsCode2,petsCode3");
			bw.newLine();
			for (Client client : clientList) {
				bw.write(client.code + "," + client.name + "," + client.telephone + "," + client.petsCode[0] + ","
						+ client.petsCode[1] + "," + client.petsCode[2]);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Clientファイルの書き込みに失敗した " + filePath);
		}
	}

	// Employee
	public static void readEmployeeCSVFile(String filePath) {
		List<String[]> schedule=new ArrayList<String[]>();
		try (BufferedReader br = new BufferedReader(new FileReader("src\\co\\jp\\part3\\Schedule.CSV"))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (!line.startsWith("#")) {
                    schedule.add(line.split(","));
                }
            }
            br.close();
        
        } catch (IOException e) {
            e.printStackTrace();
        }

		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}
				String[] values = line.split(",");
				Employee employee=new Employee();
				employee.code = Integer.parseInt(values[0]);
				employee.name = values[1];
				employee.skill = Integer.parseInt(values[2]);
				employee.max = Integer.parseInt(values[3]);
				employee.cost = Integer.parseInt(values[4]);	
				employee.hold =schedule.get(employee.code-1);
				employeeList.add(employee);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Employeeファイルの読み込みに失敗した " + filePath);
		}
	}

	public static void writeEmployeeCSVFile(String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("#,name,skill,max,cost");
			bw.newLine();
			for (Employee employee : employeeList) {
				bw.write(employee.code + "," + employee.name + "," + employee.skill + "," + employee.max + ","
						+ employee.cost);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Employeeファイルの書き込みに失敗した " + filePath);
		}
	}
	
	//Schedule
	public static void writeScheduleCSVFile(String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("#,1日,2日,3日,4日,5日,6日,7日,8日,9日,10日,11日,12日,13日,14日,15日,16日,17日,18日,19日,20日,21日,22日,23日,24日,25日,26日,27日,28日,29日,30日,31日");
			bw.newLine();
			for (Employee employee : employeeList) {
				bw.write(employee.code+ ",");
				for (int i = 0; i < employee.hold.length; i++) {
					bw.write(employee.hold[i]);
					if (i < employee.hold.length - 1) {
					bw.write(",");
					}
				}
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Scheduleファイルの書き込みに失敗した " + filePath);
		}
	}

	// Order
	public static void readOrderCSVFile(String filePath) {
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
			String line;
			while ((line = br.readLine()) != null) {
				if (line.startsWith("#")) {
					continue;
				}
				String[] values = line.split(",");
				Order order = new Order();
				order.code = Integer.parseInt(values[0]);
				order.beginDay = Integer.parseInt(values[1]);
				order.outDay = Integer.parseInt(values[2]);
				order.petCode = Integer.parseInt(values[3]);
				order.employeeCode = Integer.parseInt(values[4]);
				order.cost = Integer.parseInt(values[5]);
				orderList.add(order);
			}
			br.close();
		} catch (IOException e) {
			System.out.println("Orderファイルの読み込みに失敗した " + filePath);
		}
	}

	public static void writeOrderCSVFile(String filePath) {
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
			bw.write("#,code,beginDay,outDay,petCode,employeeCode,cost");
			bw.newLine();
			for (Order order : orderList) {
				bw.write(order.code + "," + order.beginDay + "," + order.outDay + "," + order.petCode + ","
						+ order.employeeCode + "," + order.cost);
				bw.newLine();
			}
			bw.close();
		} catch (IOException e) {
			System.out.println("Orderファイルの書き込みに失敗した " + filePath);
		}
	}

}
