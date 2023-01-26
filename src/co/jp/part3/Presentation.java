package co.jp.part3;

import  java.util.*;
import java.text.*;
import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.util.HashSet;

enum People { 
    student, teacher; 
} 
  
public class Presentation {

	
	public static void main(String[] args) throws IOException {
		// TODO 自動生成されたメソッド・スタブ
		Person[] person = new Person[10];
		
		HashSet<Integer> IDs = new HashSet<Integer>();
		
		
		
		//building a BufferedWriter for file I/O
		BufferedWriter out = null;
		try {
			File writename = new File("/Users/hong/Downloads/school.txt"); 
			writename.createNewFile(); // 创建新文件
			out = new BufferedWriter(new FileWriter(writename));
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		//choosing
		for (;;) {
			//File IO
			System.out.println("choosing an operation: 1 Searching people, 2 Adding people, 3 Deleting people, 4 Listing all people, 5 exit,");
			Scanner sc3 = new Scanner(System.in);
			String input = sc3.nextLine();
			
			//check for stopping 例外
			try {
				if (5 == Integer.valueOf(input)) {
					System.out.println("----- end -----");
					break;
				}
			} catch (Exception e)  {
                System.out.println("no such operations, try again");
				continue;
			}
			
			switch (Integer.valueOf(input)) {
				//listing all people
				case 4: 
	                System.out.println("The all people are listign below: ");
					try {		            
			            String pathname = "/Users/hong/Downloads/school.txt"; // 绝对路径或相对路径都可以，这里是绝对路径，写入文件时演示相对路径
						File filename = new File(pathname); // 要读取以上路径的文件
						InputStreamReader reader = new InputStreamReader(new FileInputStream(filename)); // 建立一个输入流对象reader
						BufferedReader br = new BufferedReader(reader); // 建立一个对象，它把文件内容转成计算机能读懂的语言
						String line = "";
//						line = br.readLine();
						while ((line = br.readLine()) != null) {
			                System.out.println(line);
			            }
						
//						System.out.println(line);
						
					} catch (IOException e) {
			        }
					break;
				//Adding people to files
				case 2:
					System.out.println("person now: " + Arrays.toString(person));
					Scanner sc1 = new Scanner(System.in);
					//					
					for (int i = 0;i<person.length;i++) {
						
						System.out.println("----- input starting -----");
						System.out.println("Selecting student or teacher or exit");
						String input3 = sc1.nextLine();
						//check for stopping
						if ("exit".equals(input3)) {
							out.flush();
							out.close();
							System.out.println("----- end -----");
							break;
						} else {
							// catching "type" error
							try {
								People p = People.valueOf(input3);
								System.out.println("input name, age, gender, id");
								Scanner sc2 = new Scanner(System.in);
								String input2 = sc2.nextLine();
								String[] input_array = input2.split(" ");
								
								switch (p) {
									case teacher:
										person[i] = new Teacher();
										break;
									case student:
										person[i] = new Student();						
										break;
								}
							//note check in time
							Date dNow = new Date( );
							SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
							person[i].SetCheckInData(ft.format(dNow));
							//collection    
							IDs.add(Integer.valueOf(input_array[3]));
							//if there is duplicate element
							if (IDs.size() == i) {
								System.out.println(i);
								i -= 1;
								System.out.println("there is duplicate element, try again");
								continue;
							}
							
							person[i].setName(input_array[0]);
							person[i].setAge(Integer.valueOf(input_array[1]));
							person[i].setGender(input_array[2]);
							person[i].setID(Integer.valueOf(input_array[3]));
							
							// write into file
							out.append("Create time: " + ft.format(dNow) + ", Identity: " + input3 + ", Name: " + input_array[0] + "， Age: " + input_array[1] + "  Gender: " + input_array[2]+ "  ID: " + input_array[3]);
							out.newLine();
						
							System.out.println("written successfully");
				         } catch (Exception e) {
				                System.out.println("no such classification, try again");
				                i = i - 1;
								continue;
				         }
					
						}
						
						System.out.println("person: " + Arrays.toString(person));
					
					}
					
					
					break;
				//Searching people
				case 1:
					System.out.println("Typing a student ID or teacher ID");
					Scanner sc4 = new Scanner(System.in);
					String input4 = sc4.nextLine();
					
					for (int j = 0; j < person.length;j++ ) {
						if ( person[j] != null && person[j].getID() == Integer.valueOf(input4)) {
					        System.out.println("Check in data: " + person[j].getCheckInData() + ", NAME: " + person[j].getName() + "， AGE: " + person[j].getAge(0) + "  GENDER: " + person[j].getGender());
						}
					}
					break;
				case 3:
					System.out.println("Typing a ID for deleting");
					Scanner sc5 = new Scanner(System.in);
					String input5 = sc5.nextLine();
					for (int j = 0; j < person.length;j++ ) {
						if ( person[j] != null && person[j].getID() == Integer.valueOf(input5)) {
					        System.out.println(person[j] + " is deleted");
							person[j] = null;
						}
					}
					break;	
			}

		}
		
	}

}
