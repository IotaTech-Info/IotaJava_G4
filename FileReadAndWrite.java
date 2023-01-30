package part3;



	import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

	public class FileReadAndWrite {

	    public static ArrayList<Room> getInfo(String path){
	        ArrayList<Room> info = new ArrayList<>();
	        BufferedReader bufferedReader = null;
	        try {
	            bufferedReader = new BufferedReader(new FileReader(path));
	            String line = "";
	            while ((line = bufferedReader.readLine()) != null) {
	                String[] split = line.split(",");
	                String[] split1 = split[1].split("#");
	                Pet pet = null;
	                if (split1[0].equals("cat")){
	                    pet = new Cat(split1[1],Integer.parseInt(split1[2]));
	                }
	                if (split1[0].equals("dog")){
	                    pet = new Dog(split1[1],Integer.parseInt(split1[2]));
	                }
	                if (split1[0].equals("bird")){
	                    pet = new Bird(split1[1],Integer.parseInt(split1[2]));
	                }
	                Room room = new Room(Integer.parseInt(split[0]),pet,Integer.parseInt(split[2]),split[3]);
	                info.add(room);
	            }
	            bufferedReader.close();
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	        return info;
	    }

	    public static void saveInfo(String path, ArrayList<Room> info){
	        try {
	            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
	            for (Room room : info){
	                writer.write(String.valueOf(room));
	                writer.newLine();
	            }
	            if(writer != null){
	                writer.close();
	            }
	        } catch (Exception e) {
	            throw new RuntimeException(e);
	        }
	    }

	}
