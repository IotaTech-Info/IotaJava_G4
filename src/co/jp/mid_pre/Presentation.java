package co.jp.mid_pre;

import java.util.Arrays;
import java.util.Scanner;

enum People { 
    student, teacher; 
} 
  
public class Presentation {

	
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Person[] person = new Person[10];
		
		//choosing
		for (;;) {
			System.out.println("choosing an operation: 1 Searching people, 2 Adding people, 3 Deleting people, 4 exit");
			Scanner sc3 = new Scanner(System.in);
			String input = sc3.nextLine();
			
			//check for stopping
			try {
				if (4 == Integer.valueOf(input)) {
					System.out.println("----- end -----");
					break;
				}
			} catch (Exception e)  {
                System.out.println("no such operations, try again");
				continue;
			}
			
			switch (Integer.valueOf(input)) {
				//Adding people
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
								
								person[i].setName(input_array[0]);
								person[i].setAge(Integer.valueOf(input_array[1]));
								person[i].setGender(input_array[2]);
								person[i].setID(Integer.valueOf(input_array[3]));
								
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
					        System.out.println("NAME: " + person[j].getName() + "， AGE: " + person[j].getAge(0) + "  GENDER: " + person[j].getGender());
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
