package JavaBasic;

import java.util.ArrayList;
import java.util.List;

public class SheepMissing {

	public static void main(String[] args) {

		List<String> sheepsList = new ArrayList<>();

		sheepsList.add("sheep");
		sheepsList.add("wolf");
		sheepsList.add("sheep");
		sheepsList.add("sheep");
		sheepsList.add("sheep");
		sheepsList.add("sheep");
		sheepsList.add("wolf");
		sheepsList.add("sheep");
		sheepsList.add("sheep");
		sheepsList.add("sheep");
		sheepsList.add("wolf");
		sheepsList.add("sheep");
		sheepsList.add("wolf");
		
		int contador = 0;

		for (int i = 0; i < sheepsList.size(); i++) {			
			if(sheepsList.get(i) != null) {
				if(sheepsList.get(i).equals("sheep")) {
					contador = contador + 1;
				}
			}
		}
		
		System.out.println(contador);

	}

}
